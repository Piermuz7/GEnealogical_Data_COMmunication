// Generated from C:/Users/Piermuz/Desktop/Genealogical_Data_Communication\GEDCOM.g4 by ANTLR 4.10.1

package it.unicam.cs.lc.lc2122.gedcom.generatedsources;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GEDCOMParser}.
 */
public interface GEDCOMListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GEDCOMParser#s}.
	 * @param ctx the parse tree
	 */
	void enterS(GEDCOMParser.SContext ctx);
	/**
	 * Exit a parse tree produced by {@link GEDCOMParser#s}.
	 * @param ctx the parse tree
	 */
	void exitS(GEDCOMParser.SContext ctx);
	/**
	 * Enter a parse tree produced by {@link GEDCOMParser#head}.
	 * @param ctx the parse tree
	 */
	void enterHead(GEDCOMParser.HeadContext ctx);
	/**
	 * Exit a parse tree produced by {@link GEDCOMParser#head}.
	 * @param ctx the parse tree
	 */
	void exitHead(GEDCOMParser.HeadContext ctx);
	/**
	 * Enter a parse tree produced by {@link GEDCOMParser#head_tag}.
	 * @param ctx the parse tree
	 */
	void enterHead_tag(GEDCOMParser.Head_tagContext ctx);
	/**
	 * Exit a parse tree produced by {@link GEDCOMParser#head_tag}.
	 * @param ctx the parse tree
	 */
	void exitHead_tag(GEDCOMParser.Head_tagContext ctx);
	/**
	 * Enter a parse tree produced by {@link GEDCOMParser#gedc}.
	 * @param ctx the parse tree
	 */
	void enterGedc(GEDCOMParser.GedcContext ctx);
	/**
	 * Exit a parse tree produced by {@link GEDCOMParser#gedc}.
	 * @param ctx the parse tree
	 */
	void exitGedc(GEDCOMParser.GedcContext ctx);
	/**
	 * Enter a parse tree produced by {@link GEDCOMParser#charr}.
	 * @param ctx the parse tree
	 */
	void enterCharr(GEDCOMParser.CharrContext ctx);
	/**
	 * Exit a parse tree produced by {@link GEDCOMParser#charr}.
	 * @param ctx the parse tree
	 */
	void exitCharr(GEDCOMParser.CharrContext ctx);
	/**
	 * Enter a parse tree produced by {@link GEDCOMParser#date1}.
	 * @param ctx the parse tree
	 */
	void enterDate1(GEDCOMParser.Date1Context ctx);
	/**
	 * Exit a parse tree produced by {@link GEDCOMParser#date1}.
	 * @param ctx the parse tree
	 */
	void exitDate1(GEDCOMParser.Date1Context ctx);
	/**
	 * Enter a parse tree produced by {@link GEDCOMParser#date2}.
	 * @param ctx the parse tree
	 */
	void enterDate2(GEDCOMParser.Date2Context ctx);
	/**
	 * Exit a parse tree produced by {@link GEDCOMParser#date2}.
	 * @param ctx the parse tree
	 */
	void exitDate2(GEDCOMParser.Date2Context ctx);
	/**
	 * Enter a parse tree produced by {@link GEDCOMParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(GEDCOMParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link GEDCOMParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(GEDCOMParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link GEDCOMParser#lang}.
	 * @param ctx the parse tree
	 */
	void enterLang(GEDCOMParser.LangContext ctx);
	/**
	 * Exit a parse tree produced by {@link GEDCOMParser#lang}.
	 * @param ctx the parse tree
	 */
	void exitLang(GEDCOMParser.LangContext ctx);
	/**
	 * Enter a parse tree produced by {@link GEDCOMParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(GEDCOMParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link GEDCOMParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(GEDCOMParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link GEDCOMParser#individual}.
	 * @param ctx the parse tree
	 */
	void enterIndividual(GEDCOMParser.IndividualContext ctx);
	/**
	 * Exit a parse tree produced by {@link GEDCOMParser#individual}.
	 * @param ctx the parse tree
	 */
	void exitIndividual(GEDCOMParser.IndividualContext ctx);
	/**
	 * Enter a parse tree produced by {@link GEDCOMParser#indi_tag}.
	 * @param ctx the parse tree
	 */
	void enterIndi_tag(GEDCOMParser.Indi_tagContext ctx);
	/**
	 * Exit a parse tree produced by {@link GEDCOMParser#indi_tag}.
	 * @param ctx the parse tree
	 */
	void exitIndi_tag(GEDCOMParser.Indi_tagContext ctx);
	/**
	 * Enter a parse tree produced by {@link GEDCOMParser#complete_name}.
	 * @param ctx the parse tree
	 */
	void enterComplete_name(GEDCOMParser.Complete_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GEDCOMParser#complete_name}.
	 * @param ctx the parse tree
	 */
	void exitComplete_name(GEDCOMParser.Complete_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link GEDCOMParser#surname}.
	 * @param ctx the parse tree
	 */
	void enterSurname(GEDCOMParser.SurnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GEDCOMParser#surname}.
	 * @param ctx the parse tree
	 */
	void exitSurname(GEDCOMParser.SurnameContext ctx);
	/**
	 * Enter a parse tree produced by {@link GEDCOMParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(GEDCOMParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GEDCOMParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(GEDCOMParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link GEDCOMParser#birt}.
	 * @param ctx the parse tree
	 */
	void enterBirt(GEDCOMParser.BirtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GEDCOMParser#birt}.
	 * @param ctx the parse tree
	 */
	void exitBirt(GEDCOMParser.BirtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GEDCOMParser#plac}.
	 * @param ctx the parse tree
	 */
	void enterPlac(GEDCOMParser.PlacContext ctx);
	/**
	 * Exit a parse tree produced by {@link GEDCOMParser#plac}.
	 * @param ctx the parse tree
	 */
	void exitPlac(GEDCOMParser.PlacContext ctx);
	/**
	 * Enter a parse tree produced by {@link GEDCOMParser#deat}.
	 * @param ctx the parse tree
	 */
	void enterDeat(GEDCOMParser.DeatContext ctx);
	/**
	 * Exit a parse tree produced by {@link GEDCOMParser#deat}.
	 * @param ctx the parse tree
	 */
	void exitDeat(GEDCOMParser.DeatContext ctx);
	/**
	 * Enter a parse tree produced by {@link GEDCOMParser#buri}.
	 * @param ctx the parse tree
	 */
	void enterBuri(GEDCOMParser.BuriContext ctx);
	/**
	 * Exit a parse tree produced by {@link GEDCOMParser#buri}.
	 * @param ctx the parse tree
	 */
	void exitBuri(GEDCOMParser.BuriContext ctx);
	/**
	 * Enter a parse tree produced by {@link GEDCOMParser#fams}.
	 * @param ctx the parse tree
	 */
	void enterFams(GEDCOMParser.FamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GEDCOMParser#fams}.
	 * @param ctx the parse tree
	 */
	void exitFams(GEDCOMParser.FamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GEDCOMParser#famc}.
	 * @param ctx the parse tree
	 */
	void enterFamc(GEDCOMParser.FamcContext ctx);
	/**
	 * Exit a parse tree produced by {@link GEDCOMParser#famc}.
	 * @param ctx the parse tree
	 */
	void exitFamc(GEDCOMParser.FamcContext ctx);
	/**
	 * Enter a parse tree produced by {@link GEDCOMParser#family}.
	 * @param ctx the parse tree
	 */
	void enterFamily(GEDCOMParser.FamilyContext ctx);
	/**
	 * Exit a parse tree produced by {@link GEDCOMParser#family}.
	 * @param ctx the parse tree
	 */
	void exitFamily(GEDCOMParser.FamilyContext ctx);
	/**
	 * Enter a parse tree produced by {@link GEDCOMParser#fam_tag}.
	 * @param ctx the parse tree
	 */
	void enterFam_tag(GEDCOMParser.Fam_tagContext ctx);
	/**
	 * Exit a parse tree produced by {@link GEDCOMParser#fam_tag}.
	 * @param ctx the parse tree
	 */
	void exitFam_tag(GEDCOMParser.Fam_tagContext ctx);
	/**
	 * Enter a parse tree produced by {@link GEDCOMParser#marr}.
	 * @param ctx the parse tree
	 */
	void enterMarr(GEDCOMParser.MarrContext ctx);
	/**
	 * Exit a parse tree produced by {@link GEDCOMParser#marr}.
	 * @param ctx the parse tree
	 */
	void exitMarr(GEDCOMParser.MarrContext ctx);
	/**
	 * Enter a parse tree produced by {@link GEDCOMParser#trlr}.
	 * @param ctx the parse tree
	 */
	void enterTrlr(GEDCOMParser.TrlrContext ctx);
	/**
	 * Exit a parse tree produced by {@link GEDCOMParser#trlr}.
	 * @param ctx the parse tree
	 */
	void exitTrlr(GEDCOMParser.TrlrContext ctx);
	/**
	 * Enter a parse tree produced by {@link GEDCOMParser#req}.
	 * @param ctx the parse tree
	 */
	void enterReq(GEDCOMParser.ReqContext ctx);
	/**
	 * Exit a parse tree produced by {@link GEDCOMParser#req}.
	 * @param ctx the parse tree
	 */
	void exitReq(GEDCOMParser.ReqContext ctx);
}