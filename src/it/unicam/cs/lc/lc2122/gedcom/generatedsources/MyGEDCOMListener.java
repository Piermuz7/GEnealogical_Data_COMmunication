package it.unicam.cs.lc.lc2122.gedcom.generatedsources;

import it.unicam.cs.lc.lc2122.gedcom.FamilyTree;
import it.unicam.cs.lc.lc2122.gedcom.Individual;
import it.unicam.cs.lc.lc2122.gedcom.RepeatedTagException;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.*;

public class MyGEDCOMListener extends GEDCOMBaseListener {
    private final FamilyTree familityTree;
    private String husb, wife;      // CODE of visiting husband and wife
    private final List<String> childs;    // CODE of all childs of the visiting family
    private final List<String> tags;       // TAG for count checking
    private final Map<String, String> indi_tags;   // TAG for individual data
    private final Map<String, GregorianCalendar> dates; // TAG for individual birth and deat

    public MyGEDCOMListener() {
        this.familityTree = new FamilyTree();
        this.childs = new ArrayList<>();
        this.tags = new ArrayList<>();
        indi_tags = new HashMap<>();
        dates = new HashMap<>();
    }

    @Override
    public void enterHead(GEDCOMParser.HeadContext ctx) {
        this.tags.add(ctx.HEAD().getText());
    }

    @Override
    public void enterHead_tag(GEDCOMParser.Head_tagContext ctx) {
        this.tags.add(ctx.getText());
    }

    @Override
    public void exitHead(GEDCOMParser.HeadContext ctx) {
        this.tags.forEach(t -> {
            if (!this.checkAtMostOneTAG(t, this.tags))
                throw new RepeatedTagException(t);
        });
    }

    @Override
    public void exitHead_tag(GEDCOMParser.Head_tagContext ctx) {
        this.tags.clear();
    }

    @Override
    public void enterIndividual(GEDCOMParser.IndividualContext ctx) {
        this.familityTree.addIndividual(new Individual(this.getCleanCode(ctx.CODE().getText())));
        this.tags.clear();
        this.indi_tags.clear();
        this.dates.clear();
    }

    @Override
    public void exitIndividual(GEDCOMParser.IndividualContext ctx) {
        this.indi_tags.keySet().forEach(t -> this.checkAtMostOneTAG(t, new ArrayList<>(this.indi_tags.keySet())));
        Individual ind = this.familityTree.getIndividual(this.getCleanCode(ctx.CODE().getText()));
        ind.setSurname(this.indi_tags.get("surname"));
        ind.setGivenName(this.indi_tags.get("name"));
        ind.setBirthDate(this.dates.get("birthDate"));
        ind.setBirthPlace(this.indi_tags.get("birthPlace"));
        ind.setDeathDate(this.dates.get("deathDate"));
        ind.setDeathPlace(this.indi_tags.get("deathPlace"));
        ind.setBuryPlace(this.indi_tags.get("buryPlace"));
    }

    @Override
    public void enterSurname(GEDCOMParser.SurnameContext ctx) {
        StringBuilder s = new StringBuilder();
        for (TerminalNode n : ctx.STR())
            s.append(n.getText()).append(" ");
        this.indi_tags.put("surname", s.toString().trim());
    }

    @Override
    public void exitName(GEDCOMParser.NameContext ctx) {
        StringBuilder s = new StringBuilder();
        for (TerminalNode n : ctx.STR())
            s.append(n.getText()).append(" ");
        this.indi_tags.put("name", s.toString().trim());
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
            this.indi_tags.put("birthPlace", s.toString().trim());
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
            this.indi_tags.put("deathPlace", s.toString().trim());
        }
    }

    @Override
    public void exitBuri(GEDCOMParser.BuriContext ctx) {
        if (ctx.plac() != null) {
            StringBuilder s = new StringBuilder();
            for (TerminalNode n : ctx.plac().STR())
                s.append(n.getText()).append(" ");
            this.indi_tags.put("buryPlace", s.toString().trim());
        }
    }

    @Override
    public void enterFams(GEDCOMParser.FamsContext ctx) {
        // TODO: fare controllo se appare fams ma non c'è nessuna corrispondenza...
        super.enterFams(ctx);
    }

    @Override
    public void enterFamc(GEDCOMParser.FamcContext ctx) {
        // TODO: stesso controllo di fams
        super.enterFamc(ctx);
    }

    @Override
    public void enterFamily(GEDCOMParser.FamilyContext ctx) {
        System.out.println("enter: " + ctx.CODE().getText());
        this.husb = null;
        this.wife = null;
        this.childs.clear();
        this.tags.clear();
    }

    @Override
    public void exitFamily(GEDCOMParser.FamilyContext ctx) {
        // adding each individual at the family tree
        if (!this.childs.isEmpty())
            this.childs.forEach(c -> {
                Individual in;
                if (this.familityTree.isPresent(c))
                    in = this.familityTree.getIndividual(c);
                else {
                    this.familityTree.addIndividual(new Individual(c));
                    System.out.println("c = " + c + " added? " + this.familityTree.getIndividual(c));
                    in = this.familityTree.getIndividual(c);
                }
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
            System.out.println("ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ");
            this.childs.forEach(System.out::println);
            System.out.println("ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ");
            if (!this.childs.isEmpty())
                this.addChilds(ind, this.childs);
        }
        return ind;
    }

    private void addChilds(Individual i, List<String> childs) {
        childs.forEach(c -> {
            System.out.println("getIndi for: " + c + " -> " + this.familityTree.getIndividual(c));
            if (this.familityTree.isPresent(c)) {
                System.out.println("c:" + c);
                i.addChild(this.familityTree.getIndividual(c));
            }
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
                    System.out.println("switch: " + ctx.CODE().getText());
                    this.childs.add(this.getCleanCode(ctx.CODE().getText()));
                    break;
                }
            }
        }
        this.childs.forEach(System.out::println);
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
