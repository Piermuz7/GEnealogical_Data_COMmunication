package it.unicam.cs.lc.lc2122.gedcom;

import it.unicam.cs.lc.lc2122.gedcom.exceptions.DuplicateCodeException;
import it.unicam.cs.lc.lc2122.gedcom.exceptions.IllegalCodeException;
import it.unicam.cs.lc.lc2122.gedcom.exceptions.RepeatedTagException;
import it.unicam.cs.lc.lc2122.gedcom.generatedsources.GEDCOMBaseListener;
import it.unicam.cs.lc.lc2122.gedcom.generatedsources.GEDCOMParser;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.*;

/**
 * GEDCOM Listener to apply Walker pattern for ancestors/descendants computing.
 *
 * @author Piermichele Rosati
 */
public class MyGEDCOMListener extends GEDCOMBaseListener {
    private FamilyTree familityTree;
    private String husb, wife;                          // CODE of visiting husband and wife
    private String fams, famc;                          // CODE for not equality checking
    private final List<String> childs;                  // All childs CODE of the visiting family
    private final List<String> tags;                    // For repeated TAG checking
    private final Map<String, String> indiTags;         // TAG for individual data
    private final Map<String, GregorianCalendar> dates; // TAG for individual birth and deat
    private final List<String> individualCodeExistence;   // For existing individual code checking
    private final List<String> familyCodeExistence;      // For existing family code checking: storing family code
    private final Set<String> fams_famcCodes;           // For existing family code checking: storing fams and fams
    private final Set<String> result;                   // Result set of REQ (ancestors or descendants)

    /**
     * Creates a GEDCOM Listener.
     */
    public MyGEDCOMListener() {
        this.familityTree = new FamilyTree();
        this.childs = new ArrayList<>();
        this.tags = new ArrayList<>();
        this.indiTags = new HashMap<>();
        this.dates = new HashMap<>();
        this.individualCodeExistence = new ArrayList<>();
        this.familyCodeExistence = new ArrayList<>();
        this.fams_famcCodes = new HashSet<>();
        result = new HashSet<>();
    }

    /**
     * Returns a result, in according to the REQ tag, of ancestors or descendants of an {@link Individual}.
     *
     * @return the result set of the request.
     */
    public Set<String> getResult() {
        return this.result;
    }

    @Override
    public void enterS(GEDCOMParser.SContext ctx) {
        this.clearAll();
    }

    /**
     * Convenient method used to clear all data structures.
     * Useful when more than one parsing with this Listener is executed.
     */
    private void clearAll() {
        this.familityTree = new FamilyTree();
        this.husb = null;
        this.wife = null;
        this.fams = null;
        this.famc = null;
        this.childs.clear();
        this.tags.clear();
        this.indiTags.clear();
        this.dates.clear();
        this.individualCodeExistence.clear();
        this.familyCodeExistence.clear();
        this.fams_famcCodes.clear();
        this.result.clear();
    }

    @Override
    public void enterHead_tag(GEDCOMParser.Head_tagContext ctx) {
        this.tags.add(ctx.getText());   // Adding for repeated tag checking
        this.tags.forEach(t -> {    // Repeated head tags checking
            if (!this.checkAtMostOneTAG(t, this.tags))
                throw new RepeatedTagException(t);
        });
    }

    @Override
    public void enterTrlr(GEDCOMParser.TrlrContext ctx) {
        // individual tags existence checking
        this.familityTree.getCodes().forEach(c -> {
            if (!this.individualCodeExistence.contains(c))
                throw new IllegalCodeException(c);
        });
        // family tags existence checking
        this.fams_famcCodes.forEach(c -> {
            if (!this.familyCodeExistence.contains(c))
                throw new IllegalCodeException(c);
        });
        // duplicate codes between individuals
        this.individualCodeExistence.forEach(c -> {
            if (this.individualCodeExistence.stream().filter(code -> code.equals(c)).count() != 1 || this.familyCodeExistence.stream().filter(code -> code.equals(c)).count() != 1)
                throw new DuplicateCodeException("An individual with code : " + c + " already exists");
        });
        // duplicate codes between families
        this.familyCodeExistence.forEach(c -> {
            if (this.familyCodeExistence.stream().filter(code -> code.equals(c)).count() != 1)
                throw new DuplicateCodeException("A family with code : " + c + " already exists");
        });
        // family, fams, famc, code equal to individual code
        this.fams_famcCodes.forEach(c -> this.familityTree.getCodes().forEach(code -> {
            if (code.equals(c))
                throw new DuplicateCodeException("Code : " + c + " already used for another individual or family");
        }));
    }

    @Override
    public void enterIndividual(GEDCOMParser.IndividualContext ctx) {
        this.individualCodeExistence.add(this.getCleanCode(ctx.CODE().getText()));
        this.familityTree.addIndividual(new Individual(this.getCleanCode(ctx.CODE().getText())));
        this.tags.clear();
        this.indiTags.clear();
        this.dates.clear();
        this.fams = null;
        this.famc = null;
    }

    @Override
    public void exitIndividual(GEDCOMParser.IndividualContext ctx) {
        // unique code between FAMS and FAMC tags
        if (this.fams != null && this.fams.equals(this.famc))
            throw new DuplicateCodeException("A FAMC or FAMS tag with code : " + this.fams + " already exists");
        this.indiTags.keySet().forEach(t -> this.checkAtMostOneTAG(t, new ArrayList<>(this.indiTags.keySet())));  // Repeated individual tags checking
        Individual ind = this.familityTree.getIndividual(this.getCleanCode(ctx.CODE().getText()));
        ind.setSurname(this.indiTags.get("surname"));
        ind.setGivenName(this.indiTags.get("name"));
        ind.setBirthDate(this.dates.get("birthDate"));
        ind.setBirthPlace(this.indiTags.get("birthPlace"));
        ind.setDeathDate(this.dates.get("deathDate"));
        ind.setDeathPlace(this.indiTags.get("deathPlace"));
        ind.setBuryPlace(this.indiTags.get("buryPlace"));
    }

    @Override
    public void exitSurname(GEDCOMParser.SurnameContext ctx) {
        // Concats all strings corresponding at surname
        StringBuilder s = new StringBuilder();
        for (TerminalNode n : ctx.STR())
            s.append(n.getText()).append(" ");
        this.indiTags.put("surname", s.toString().trim());
    }

    @Override
    public void exitName(GEDCOMParser.NameContext ctx) {
        // Concats all strings corresponding at name
        StringBuilder s = new StringBuilder();
        for (TerminalNode n : ctx.STR())
            s.append(n.getText()).append(" ");
        this.indiTags.put("name", s.toString().trim());
    }

    @Override
    @SuppressWarnings("All")
    public void exitBirt(GEDCOMParser.BirtContext ctx) {
        int[] day_month_year;
        if (ctx.date2() != null) {
            if (ctx.date2().period == null) {
                day_month_year = this.convertDateFormatToDate(ctx.date2().day.getText(), ctx.date2().month.getText(), ctx.date2().YEAR().getText());
                if (this.dates.containsKey("birthDate"))
                    throw new RepeatedTagException(ctx.date2().DATE2().getText());
                this.dates.put("birthDate", new GregorianCalendar(day_month_year[2], day_month_year[1], day_month_year[0]));
            }
        }
        if (ctx.plac() != null) {
            StringBuilder s = new StringBuilder();
            for (TerminalNode n : ctx.plac().STR())
                s.append(n.getText()).append(" ");
            this.indiTags.put("birthPlace", s.toString().trim());
        }
    }

    @Override
    @SuppressWarnings("All")
    public void exitDeat(GEDCOMParser.DeatContext ctx) {
        int[] day_month_year;
        if (ctx.date2() != null) {
            if (ctx.date2().period == null) {
                day_month_year = this.convertDateFormatToDate(ctx.date2().day.getText(), ctx.date2().month.getText(), ctx.date2().YEAR().getText());
                if (this.dates.containsKey("deathDate"))
                    throw new RepeatedTagException(ctx.date2().DATE2().getText());
                this.dates.put("deathDate", new GregorianCalendar(day_month_year[2], day_month_year[1], day_month_year[0]));
            }
        }
        if (ctx.plac() != null) {
            StringBuilder s = new StringBuilder();
            for (TerminalNode n : ctx.plac().STR())
                s.append(n.getText()).append(" ");
            this.indiTags.put("deathPlace", s.toString().trim());
        }
    }

    @Override
    public void exitBuri(GEDCOMParser.BuriContext ctx) {
        if (ctx.plac() != null) {
            StringBuilder s = new StringBuilder();
            for (TerminalNode n : ctx.plac().STR())
                s.append(n.getText()).append(" ");
            this.indiTags.put("buryPlace", s.toString().trim());
        }
    }

    @Override
    public void enterFams(GEDCOMParser.FamsContext ctx) {
        this.fams = this.getCleanCode(ctx.CODE().getText());    // For not equality between FAMS and FAMC
        this.fams_famcCodes.add(this.fams);                     // For family code existence checking
    }

    @Override
    public void enterFamc(GEDCOMParser.FamcContext ctx) {
        this.famc = this.getCleanCode(ctx.CODE().getText());    // For not equality between FAMS and FAMC
        this.fams_famcCodes.add(this.famc);                     // For family code existence checking
    }

    @Override
    public void enterFamily(GEDCOMParser.FamilyContext ctx) {
        this.husb = null;
        this.wife = null;
        this.childs.clear();
        this.tags.clear();
        this.familyCodeExistence.add(this.getCleanCode(ctx.CODE().getText()));
    }

    @Override
    public void exitFamily(GEDCOMParser.FamilyContext ctx) {
        // adding each individual at the family tree
        if (!this.childs.isEmpty())
            this.childs.forEach(c -> {
                if (!this.familityTree.isPresent(c))
                    this.familityTree.addIndividual(new Individual(c));
            });
        // initializing parents with childs and vice versa
        Individual iHusb = this.initParentFamily(this.husb);
        Individual iWife = this.initParentFamily(this.wife);
        this.childs.forEach(c -> {
            Individual in = this.familityTree.getIndividual(c);
            if (iHusb != null)
                in.setFather(this.familityTree.getIndividual(this.husb));
            if (iWife != null)
                in.setMother(this.familityTree.getIndividual(this.wife));
        });

    }

    /**
     * Initializes the parent (husband or wife).
     * Returns an {@link Individual} represents the parent.
     *
     * @param parent the parent code
     * @return an {@code Individual} represents the parent
     */
    private Individual initParentFamily(String parent) {
        Individual ind = null;
        if (parent != null) {
            if (!this.familityTree.isPresent(parent))
                this.familityTree.addIndividual(new Individual(parent));
            ind = this.familityTree.getIndividual(parent);
            if (!this.childs.isEmpty())
                this.addChilds(ind, this.childs);
        }
        return ind;
    }

    /**
     * Adds specified childs at the specified {@link Individual}
     *
     * @param i      the {@code Individual} which to add specified childs
     * @param childs childs to add at the specified {@code Individual}
     */
    private void addChilds(Individual i, List<String> childs) {
        childs.forEach(c -> {
            if (this.familityTree.isPresent(c))
                i.addChild(this.familityTree.getIndividual(c));
        });
    }

    @Override
    public void enterFam_tag(GEDCOMParser.Fam_tagContext ctx) {
        if (ctx.i != null) {
            switch (ctx.i.getText()) {
                case "1 HUSB ": {
                    if (this.husb == null)
                        this.husb = this.getCleanCode(ctx.CODE().getText());
                    else
                        throw new RepeatedTagException(ctx.i.getText());
                    break;
                }
                case "1 WIFE ": {
                    if (this.wife == null)
                        this.wife = this.getCleanCode(ctx.CODE().getText());
                    else
                        throw new RepeatedTagException(ctx.i.getText());
                    break;
                }
                case "1 CHIL ": {
                    this.childs.add(this.getCleanCode(ctx.CODE().getText()));
                    break;
                }
            }
        }
    }

    @Override
    public void exitReq(GEDCOMParser.ReqContext ctx) {
        if (ctx.REQ().getText().contains("ANCE"))
            this.result.addAll(this.familityTree.getAncestorsOf(this.getCleanCode(ctx.CODE().getText())));
        else if (ctx.REQ().getText().contains("DESC"))
            this.result.addAll(this.familityTree.getDescendantsOf(this.getCleanCode(ctx.CODE().getText())));
    }

    /**
     * Returns {@code true} if the specified tag appears in the specified {@link Set} s only one time.
     * Otherwise, returns {@code false};
     *
     * @param tag  the tag for counting checking
     * @param tags the {@code Set} of tags
     * @return if the specified tag appears only one time {@code true}, otherwise {@code false}
     */
    private boolean checkAtMostOneTAG(String tag, List<String> tags) {
        return tags.stream().filter(t -> t.contains(tag)).count() == 1;
    }

    /**
     * A CODE tag is something like that, @ABCD091DEF@.
     * This method returns the code without '@' symbols.
     *
     * @param code the code to clean
     * @return the clean code without '@' symbols.
     */
    private String getCleanCode(String code) {
        return code.substring(code.indexOf('@') + 1, code.lastIndexOf('@'));
    }

    /**
     * Converts the specified day, month and year strings to an array of int.
     * Returns an array of 3 int corresponding day , month and year respectively as follows:
     * <ul>
     *  <li>array[0] = day</li>
     *  <li>array[1] = month</li>
     *  <li>array[2] = year</li>
     *  </ul>
     *
     * @param day   the day to convert
     * @param month the month to convert
     * @param year  the year to convert
     * @return an array of 3 int corresponding day , month and year respectively
     * @throws NullPointerException if day, month or year is null
     */
    private int[] convertDateFormatToDate(String day, String month, String year) {
        if (day == null || month == null || year == null)
            throw new NullPointerException("day, month and year cannot be null");
        int[] dd_MM_YYYY = new int[3];
        dd_MM_YYYY[0] = Integer.parseInt(day.trim());
        dd_MM_YYYY[2] = Integer.parseInt(year.trim());
        switch (month.trim()) {
            case "Gen":
            case "Jan": {
                break;
            }
            case "Feb": {
                dd_MM_YYYY[1] = 1;
                break;
            }
            case "Mar": {
                dd_MM_YYYY[1] = 2;
                break;
            }
            case "Apr": {
                dd_MM_YYYY[1] = 3;
                break;
            }
            case "Mag":
            case "May": {
                dd_MM_YYYY[1] = 4;
                break;
            }
            case "Giu":
            case "Jun": {
                dd_MM_YYYY[1] = 5;
                break;
            }
            case "Lug":
            case "July": {
                dd_MM_YYYY[1] = 6;
                break;
            }
            case "Ago":
            case "Aug": {
                dd_MM_YYYY[1] = 7;
                break;
            }
            case "Set":
            case "Sept": {
                dd_MM_YYYY[1] = 8;
                break;
            }
            case "Ott":
            case "Oct": {
                dd_MM_YYYY[1] = 9;
                break;
            }
            case "Nov": {
                dd_MM_YYYY[1] = 10;
                break;
            }
            case "Dic":
            case "Dec": {
                dd_MM_YYYY[1] = 11;
                break;
            }
        }
        return dd_MM_YYYY;
    }
}
