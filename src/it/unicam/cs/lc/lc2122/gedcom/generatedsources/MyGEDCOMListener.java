package it.unicam.cs.lc.lc2122.gedcom.generatedsources;

import it.unicam.cs.lc.lc2122.gedcom.FamilyTree;
import it.unicam.cs.lc.lc2122.gedcom.Individual;

import java.util.ArrayList;
import java.util.List;

public class MyGEDCOMListener extends GEDCOMBaseListener {
    private FamilyTree familityTree;
    private String husb, wife;      // CODE of visiting husband and wife
    private List<String> childs;    // CODE of all childs of the visiting family

    private List<String> tags;       // TAG for count checking

    public MyGEDCOMListener() {
        this.familityTree = new FamilyTree();
        this.childs = new ArrayList<>();
        this.tags = new ArrayList<>();
    }

    @Override
    public void enterHead(GEDCOMParser.HeadContext ctx) {
        this.tags.add(ctx.HEAD().getText());
    }

    @Override
    public void enterHead_tag(GEDCOMParser.Head_tagContext ctx) {
        System.out.println("add head_tag");
        this.tags.add(ctx.getText());
    }

    @Override
    public void exitHead(GEDCOMParser.HeadContext ctx) {
        this.tags.forEach(t -> System.out.println(this.checkAtMostOneTAG(t, this.tags)));
    }

    @Override
    public void exitS(GEDCOMParser.SContext ctx) {
        super.exitS(ctx);
    }

    @Override
    public void enterIndividual(GEDCOMParser.IndividualContext ctx) {
        this.familityTree.addIndividual(new Individual(ctx.CODE().getText()));
        this.tags.clear();
    }

    @Override
    public void enterFamily(GEDCOMParser.FamilyContext ctx) {
        this.husb = null;
        this.wife = null;
        this.childs.clear();
        this.tags.clear();
    }

    @Override
    public void exitFamily(GEDCOMParser.FamilyContext ctx) {
        Individual iHusb = this.initParentFamily(this.husb);
        Individual iWife = this.initParentFamily(this.wife);
        if (!this.childs.isEmpty())
            this.childs.forEach(c -> {
                Individual in;
                if (this.familityTree.isPresent(c))
                    in = this.familityTree.getIndividual(c);
                else {
                    this.familityTree.addIndividual(new Individual(c));
                    in = this.familityTree.getIndividual(c);
                }
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
            if (this.familityTree.isPresent(c)) {
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
                        this.husb = ctx.CODE().getText();
                    // else ERROR
                    break;
                }
                case "1 WIFE ": {
                    if (this.wife == null)
                        this.wife = ctx.CODE().getText();
                    // else ERROR
                    break;
                }
                case "1 CHIL ": {
                    this.childs.add(ctx.CODE().getText());
                    break;
                }
            }
        }

    }

    @Override
    public void enterTrlr(GEDCOMParser.TrlrContext ctx) {
        super.enterTrlr(ctx);
    }

    @Override
    public void exitTrlr(GEDCOMParser.TrlrContext ctx) {
        super.exitTrlr(ctx);
    }

    @Override
    public void enterReq(GEDCOMParser.ReqContext ctx) {
        super.enterReq(ctx);
    }

    @Override
    public void exitReq(GEDCOMParser.ReqContext ctx) {
        if (ctx.REQ().getText().contains("ANCE"))
            System.out.println(this.familityTree.getAncestorsOf(ctx.CODE().getText()));
        else if (ctx.REQ().getText().contains("DESC"))
            System.out.println(this.familityTree.getDescendantsOf(ctx.CODE().getText()));
        //else ERROR
    }

    private boolean checkAtMostOneTAG(String tag, List<String> s) {
        System.out.println("***************");
        System.out.println("tag:"+tag);
        System.out.println("***************");
        System.out.println("--------");
        s.forEach(System.out::println);
        System.out.println("--------");
        return s.stream().filter(t -> t.equals(tag)).count() == 1;
    }


}
