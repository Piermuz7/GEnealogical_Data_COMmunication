package it.unicam.cs.lc.lc2122.gedcom.generatedsources;

import it.unicam.cs.lc.lc2122.gedcom.FamilyTree;
import it.unicam.cs.lc.lc2122.gedcom.IllegalCodeException;
import it.unicam.cs.lc.lc2122.gedcom.Individual;
import it.unicam.cs.lc.lc2122.gedcom.RepeatedTagException;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.*;

/**
 * GEDCOM Listener to apply Walker pattern for ancestors/descendants computing.
 *
 * @author Piermichele Rosati
 */
public class MyGEDCOMListener extends GEDCOMBaseListener {
    private final FamilyTree familityTree;
    private String husb, wife;                          // CODE of visiting husband and wife
    private final List<String> childs;                  // All childs CODE of the visiting family
    private final List<String> tags;                    // For repeated TAG checking
    private final Map<String, String> indiTags;         // TAG for individual data
    private final Map<String, GregorianCalendar> dates; // TAG for individual birth and deat
    private final Set<String> individualCodeExistence;   // For existing individual code checking
    private final Set<String> familyCodeExistence;      // For existing family code checking: storing family code
    private final Set<String> fams_famcCodes;           // For existing family code checking: storing fams and fams

    /**
     * Creates a GEDCOM Listener.
     */
    public MyGEDCOMListener() {
        this.familityTree = new FamilyTree();
        this.childs = new ArrayList<>();
        this.tags = new ArrayList<>();
        this.indiTags = new HashMap<>();
        this.dates = new HashMap<>();
        this.individualCodeExistence = new HashSet<>();
        this.familyCodeExistence = new HashSet<>();
        this.fams_famcCodes = new HashSet<>();
    }

    @Override
    public void enterHead(GEDCOMParser.HeadContext ctx) {
        this.tags.add(ctx.HEAD().getText());    // Adding for repeated tag checking
    }

    @Override
    public void enterHead_tag(GEDCOMParser.Head_tagContext ctx) {
        this.tags.add(ctx.getText());   // Adding for repeated tag checking
    }

    @Override
    public void exitHead(GEDCOMParser.HeadContext ctx) {
        this.tags.forEach(t -> {    // Repeated head tags checking
            if (!this.checkAtMostOneTAG(t, this.tags))
                throw new RepeatedTagException(t);
        });
    }

    @Override
    public void exitHead_tag(GEDCOMParser.Head_tagContext ctx) {
        this.tags.clear();
    }

    @Override
    public void enterTrlr(GEDCOMParser.TrlrContext ctx) {
        // individual tags existence checking
        this.familityTree.getCodes().forEach(c -> {
            if (!this.individualCodeExistence.contains(c))
                throw new IllegalCodeException(c);
        });
        // family tags existence checking
        this.familyCodeExistence.forEach(c -> {
            if (!this.fams_famcCodes.contains(c))
                throw new IllegalCodeException(c);
        });
    }

    @Override
    public void enterIndividual(GEDCOMParser.IndividualContext ctx) {
        this.individualCodeExistence.add(this.getCleanCode(ctx.CODE().getText()));
        this.familityTree.addIndividual(new Individual(this.getCleanCode(ctx.CODE().getText())));
        this.tags.clear();
        this.indiTags.clear();
        this.dates.clear();
    }

    @Override
    public void exitIndividual(GEDCOMParser.IndividualContext ctx) {
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
    public void exitBirt(GEDCOMParser.BirtContext ctx) {
        int[] day_month_year;
        if (ctx.date2() != null) {
            if (ctx.date2().period == null) {
                day_month_year = this.convertDateFormatToDate(ctx.date2().day.getText(), ctx.date2().month.getText(), ctx.date2().YEAR().getText());
                if (this.dates.containsKey("birthDate"))
                    throw new RepeatedTagException(ctx.date2().DATE2().getText());
                this.dates.put("birthDate", new GregorianCalendar(day_month_year[2], day_month_year[1], day_month_year[1]));
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
    public void exitDeat(GEDCOMParser.DeatContext ctx) {
        int[] day_month_year = new int[3];
        if (ctx.date2() != null) {
            if (ctx.date2().period == null) {
                day_month_year = this.convertDateFormatToDate(ctx.date2().day.getText(), ctx.date2().month.getText(), ctx.date2().YEAR().getText());
                if (this.dates.containsKey("deathDate"))
                    throw new RepeatedTagException(ctx.date2().DATE2().getText());
                this.dates.put("deathDate", new GregorianCalendar(day_month_year[2], day_month_year[1], day_month_year[1]));
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
        this.fams_famcCodes.add(this.getCleanCode(ctx.CODE().getText()));   // For family code existence checking
    }

    @Override
    public void enterFamc(GEDCOMParser.FamcContext ctx) {
        this.fams_famcCodes.add(this.getCleanCode(ctx.CODE().getText()));   // For family code existence checking
        this.indiTags.put("famChild", ctx.FAMC().getText());    // Necessary for repeated tag checking
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

    private Individual initParentFamily(String parent) {
        Individual ind = null;
        if (parent != null) {
            if (this.familityTree.isPresent(parent))
                ind = this.familityTree.getIndividual(parent);
            else {
                this.familityTree.addIndividual(new Individual(parent));
                ind = this.familityTree.getIndividual(parent);
            }
            if (!this.childs.isEmpty())
                this.addChilds(ind, this.childs);
        }
        return ind;
    }

    private void addChilds(Individual i, List<String> childs) {
        childs.forEach(c -> {
            if (this.familityTree.isPresent(c))
                i.addChild(this.familityTree.getIndividual(c));
        });
    }

    // TODO : controllare FAM definita prima di INDI
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
            System.out.println(this.familityTree.getAncestorsOf(this.getCleanCode(ctx.CODE().getText())));
        else if (ctx.REQ().getText().contains("DESC"))
            System.out.println(this.familityTree.getDescendantsOf(this.getCleanCode(ctx.CODE().getText())));
    }

    private boolean checkAtMostOneTAG(String tag, List<String> s) {
        return s.stream().filter(t -> t.equals(tag)).count() == 1;
    }

    public String getCleanCode(String code) {
        return code.substring(code.indexOf('@') + 1, code.lastIndexOf('@'));
    }

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
