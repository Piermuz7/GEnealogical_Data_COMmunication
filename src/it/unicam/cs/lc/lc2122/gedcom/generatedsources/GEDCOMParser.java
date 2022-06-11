// Generated from C:/Users/Piermuz/Desktop/Genealogical_Data_Communication\GEDCOM.g4 by ANTLR 4.10.1

package it.unicam.cs.lc.lc2122.gedcom.generatedsources;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GEDCOMParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		HEAD=1, GEDC=2, VERS=3, TIME=4, FILE=5, LANG=6, CHARR=7, TRLR=8, FAM=9, 
		MARR=10, HUSB=11, WIFE=12, CHIL=13, INDI=14, COMPLETE_NAME=15, CODE=16, 
		CN=17, F_SURNAME_NAME=18, SURN=19, NAME=20, SEX=21, BIRT=22, DEAT=23, 
		BURI=24, PLAC=25, FAMS=26, FAMC=27, ZERO=28, ONE=29, TWO=30, AT=31, DATEFORMAT=32, 
		DATE1=33, DATE2=34, REQ=35, NEWLINE=36, WS=37;
	public static final int
		RULE_s = 0, RULE_head = 1, RULE_head_tag = 2, RULE_gedc = 3, RULE_charr = 4, 
		RULE_date1 = 5, RULE_date2 = 6, RULE_file = 7, RULE_lang = 8, RULE_block = 9, 
		RULE_individual = 10, RULE_indi_tag = 11, RULE_complete_name = 12, RULE_surname = 13, 
		RULE_name = 14, RULE_birt = 15, RULE_plac = 16, RULE_deat = 17, RULE_buri = 18, 
		RULE_fams = 19, RULE_famc = 20, RULE_family = 21, RULE_fam_tag = 22, RULE_marr = 23, 
		RULE_trlr = 24, RULE_req = 25;
	private static String[] makeRuleNames() {
		return new String[] {
			"s", "head", "head_tag", "gedc", "charr", "date1", "date2", "file", "lang", 
			"block", "individual", "indi_tag", "complete_name", "surname", "name", 
			"birt", "plac", "deat", "buri", "fams", "famc", "family", "fam_tag", 
			"marr", "trlr", "req"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "'@'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "HEAD", "GEDC", "VERS", "TIME", "FILE", "LANG", "CHARR", "TRLR", 
			"FAM", "MARR", "HUSB", "WIFE", "CHIL", "INDI", "COMPLETE_NAME", "CODE", 
			"CN", "F_SURNAME_NAME", "SURN", "NAME", "SEX", "BIRT", "DEAT", "BURI", 
			"PLAC", "FAMS", "FAMC", "ZERO", "ONE", "TWO", "AT", "DATEFORMAT", "DATE1", 
			"DATE2", "REQ", "NEWLINE", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "GEDCOM.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GEDCOMParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class SContext extends ParserRuleContext {
		public HeadContext head() {
			return getRuleContext(HeadContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(GEDCOMParser.NEWLINE, 0); }
		public TrlrContext trlr() {
			return getRuleContext(TrlrContext.class,0);
		}
		public SContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GEDCOMListener ) ((GEDCOMListener)listener).enterS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GEDCOMListener ) ((GEDCOMListener)listener).exitS(this);
		}
	}

	public final SContext s() throws RecognitionException {
		SContext _localctx = new SContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_s);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			head();
			setState(53);
			match(NEWLINE);
			setState(54);
			trlr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HeadContext extends ParserRuleContext {
		public TerminalNode HEAD() { return getToken(GEDCOMParser.HEAD, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(GEDCOMParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(GEDCOMParser.NEWLINE, i);
		}
		public List<Head_tagContext> head_tag() {
			return getRuleContexts(Head_tagContext.class);
		}
		public Head_tagContext head_tag(int i) {
			return getRuleContext(Head_tagContext.class,i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public HeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_head; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GEDCOMListener ) ((GEDCOMListener)listener).enterHead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GEDCOMListener ) ((GEDCOMListener)listener).exitHead(this);
		}
	}

	public final HeadContext head() throws RecognitionException {
		HeadContext _localctx = new HeadContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_head);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(HEAD);
			setState(61);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(57);
					match(NEWLINE);
					setState(58);
					head_tag();
					}
					} 
				}
				setState(63);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(68);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(64);
					match(NEWLINE);
					setState(65);
					block();
					}
					} 
				}
				setState(70);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Head_tagContext extends ParserRuleContext {
		public GedcContext gedc() {
			return getRuleContext(GedcContext.class,0);
		}
		public CharrContext charr() {
			return getRuleContext(CharrContext.class,0);
		}
		public Date1Context date1() {
			return getRuleContext(Date1Context.class,0);
		}
		public FileContext file() {
			return getRuleContext(FileContext.class,0);
		}
		public LangContext lang() {
			return getRuleContext(LangContext.class,0);
		}
		public Head_tagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_head_tag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GEDCOMListener ) ((GEDCOMListener)listener).enterHead_tag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GEDCOMListener ) ((GEDCOMListener)listener).exitHead_tag(this);
		}
	}

	public final Head_tagContext head_tag() throws RecognitionException {
		Head_tagContext _localctx = new Head_tagContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_head_tag);
		try {
			setState(76);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GEDC:
				enterOuterAlt(_localctx, 1);
				{
				setState(71);
				gedc();
				}
				break;
			case CHARR:
				enterOuterAlt(_localctx, 2);
				{
				setState(72);
				charr();
				}
				break;
			case DATE1:
				enterOuterAlt(_localctx, 3);
				{
				setState(73);
				date1();
				}
				break;
			case FILE:
				enterOuterAlt(_localctx, 4);
				{
				setState(74);
				file();
				}
				break;
			case LANG:
				enterOuterAlt(_localctx, 5);
				{
				setState(75);
				lang();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GedcContext extends ParserRuleContext {
		public TerminalNode GEDC() { return getToken(GEDCOMParser.GEDC, 0); }
		public TerminalNode NEWLINE() { return getToken(GEDCOMParser.NEWLINE, 0); }
		public TerminalNode VERS() { return getToken(GEDCOMParser.VERS, 0); }
		public GedcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gedc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GEDCOMListener ) ((GEDCOMListener)listener).enterGedc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GEDCOMListener ) ((GEDCOMListener)listener).exitGedc(this);
		}
	}

	public final GedcContext gedc() throws RecognitionException {
		GedcContext _localctx = new GedcContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_gedc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(GEDC);
			setState(81);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(79);
				match(NEWLINE);
				setState(80);
				match(VERS);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CharrContext extends ParserRuleContext {
		public TerminalNode CHARR() { return getToken(GEDCOMParser.CHARR, 0); }
		public CharrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GEDCOMListener ) ((GEDCOMListener)listener).enterCharr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GEDCOMListener ) ((GEDCOMListener)listener).exitCharr(this);
		}
	}

	public final CharrContext charr() throws RecognitionException {
		CharrContext _localctx = new CharrContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_charr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(CHARR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Date1Context extends ParserRuleContext {
		public TerminalNode DATE1() { return getToken(GEDCOMParser.DATE1, 0); }
		public TerminalNode DATEFORMAT() { return getToken(GEDCOMParser.DATEFORMAT, 0); }
		public TerminalNode NEWLINE() { return getToken(GEDCOMParser.NEWLINE, 0); }
		public TerminalNode TIME() { return getToken(GEDCOMParser.TIME, 0); }
		public Date1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_date1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GEDCOMListener ) ((GEDCOMListener)listener).enterDate1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GEDCOMListener ) ((GEDCOMListener)listener).exitDate1(this);
		}
	}

	public final Date1Context date1() throws RecognitionException {
		Date1Context _localctx = new Date1Context(_ctx, getState());
		enterRule(_localctx, 10, RULE_date1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(DATE1);
			setState(86);
			match(DATEFORMAT);
			setState(89);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(87);
				match(NEWLINE);
				setState(88);
				match(TIME);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Date2Context extends ParserRuleContext {
		public TerminalNode DATE2() { return getToken(GEDCOMParser.DATE2, 0); }
		public TerminalNode DATEFORMAT() { return getToken(GEDCOMParser.DATEFORMAT, 0); }
		public Date2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_date2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GEDCOMListener ) ((GEDCOMListener)listener).enterDate2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GEDCOMListener ) ((GEDCOMListener)listener).exitDate2(this);
		}
	}

	public final Date2Context date2() throws RecognitionException {
		Date2Context _localctx = new Date2Context(_ctx, getState());
		enterRule(_localctx, 12, RULE_date2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(DATE2);
			setState(92);
			match(DATEFORMAT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FileContext extends ParserRuleContext {
		public TerminalNode FILE() { return getToken(GEDCOMParser.FILE, 0); }
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GEDCOMListener ) ((GEDCOMListener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GEDCOMListener ) ((GEDCOMListener)listener).exitFile(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_file);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(FILE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LangContext extends ParserRuleContext {
		public TerminalNode LANG() { return getToken(GEDCOMParser.LANG, 0); }
		public LangContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lang; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GEDCOMListener ) ((GEDCOMListener)listener).enterLang(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GEDCOMListener ) ((GEDCOMListener)listener).exitLang(this);
		}
	}

	public final LangContext lang() throws RecognitionException {
		LangContext _localctx = new LangContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_lang);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(LANG);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public IndividualContext individual() {
			return getRuleContext(IndividualContext.class,0);
		}
		public FamilyContext family() {
			return getRuleContext(FamilyContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GEDCOMListener ) ((GEDCOMListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GEDCOMListener ) ((GEDCOMListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_block);
		try {
			setState(100);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(98);
				individual();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(99);
				family();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IndividualContext extends ParserRuleContext {
		public TerminalNode ZERO() { return getToken(GEDCOMParser.ZERO, 0); }
		public List<TerminalNode> AT() { return getTokens(GEDCOMParser.AT); }
		public TerminalNode AT(int i) {
			return getToken(GEDCOMParser.AT, i);
		}
		public TerminalNode CODE() { return getToken(GEDCOMParser.CODE, 0); }
		public TerminalNode INDI() { return getToken(GEDCOMParser.INDI, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(GEDCOMParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(GEDCOMParser.NEWLINE, i);
		}
		public List<Indi_tagContext> indi_tag() {
			return getRuleContexts(Indi_tagContext.class);
		}
		public Indi_tagContext indi_tag(int i) {
			return getRuleContext(Indi_tagContext.class,i);
		}
		public IndividualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_individual; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GEDCOMListener ) ((GEDCOMListener)listener).enterIndividual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GEDCOMListener ) ((GEDCOMListener)listener).exitIndividual(this);
		}
	}

	public final IndividualContext individual() throws RecognitionException {
		IndividualContext _localctx = new IndividualContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_individual);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(ZERO);
			setState(103);
			match(AT);
			setState(104);
			match(CODE);
			setState(105);
			match(AT);
			setState(106);
			match(INDI);
			setState(111);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(107);
					match(NEWLINE);
					setState(108);
					indi_tag();
					}
					} 
				}
				setState(113);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Indi_tagContext extends ParserRuleContext {
		public Complete_nameContext complete_name() {
			return getRuleContext(Complete_nameContext.class,0);
		}
		public TerminalNode SEX() { return getToken(GEDCOMParser.SEX, 0); }
		public BirtContext birt() {
			return getRuleContext(BirtContext.class,0);
		}
		public DeatContext deat() {
			return getRuleContext(DeatContext.class,0);
		}
		public BuriContext buri() {
			return getRuleContext(BuriContext.class,0);
		}
		public FamsContext fams() {
			return getRuleContext(FamsContext.class,0);
		}
		public FamcContext famc() {
			return getRuleContext(FamcContext.class,0);
		}
		public Indi_tagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indi_tag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GEDCOMListener ) ((GEDCOMListener)listener).enterIndi_tag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GEDCOMListener ) ((GEDCOMListener)listener).exitIndi_tag(this);
		}
	}

	public final Indi_tagContext indi_tag() throws RecognitionException {
		Indi_tagContext _localctx = new Indi_tagContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_indi_tag);
		try {
			setState(121);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMPLETE_NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				complete_name();
				}
				break;
			case SEX:
				enterOuterAlt(_localctx, 2);
				{
				setState(115);
				match(SEX);
				}
				break;
			case BIRT:
				enterOuterAlt(_localctx, 3);
				{
				setState(116);
				birt();
				}
				break;
			case DEAT:
				enterOuterAlt(_localctx, 4);
				{
				setState(117);
				deat();
				}
				break;
			case BURI:
				enterOuterAlt(_localctx, 5);
				{
				setState(118);
				buri();
				}
				break;
			case FAMS:
				enterOuterAlt(_localctx, 6);
				{
				setState(119);
				fams();
				}
				break;
			case FAMC:
				enterOuterAlt(_localctx, 7);
				{
				setState(120);
				famc();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Complete_nameContext extends ParserRuleContext {
		public TerminalNode COMPLETE_NAME() { return getToken(GEDCOMParser.COMPLETE_NAME, 0); }
		public TerminalNode CN() { return getToken(GEDCOMParser.CN, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(GEDCOMParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(GEDCOMParser.NEWLINE, i);
		}
		public SurnameContext surname() {
			return getRuleContext(SurnameContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Complete_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complete_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GEDCOMListener ) ((GEDCOMListener)listener).enterComplete_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GEDCOMListener ) ((GEDCOMListener)listener).exitComplete_name(this);
		}
	}

	public final Complete_nameContext complete_name() throws RecognitionException {
		Complete_nameContext _localctx = new Complete_nameContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_complete_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(COMPLETE_NAME);
			setState(124);
			match(CN);
			setState(135);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				{
				setState(125);
				match(NEWLINE);
				setState(126);
				surname();
				setState(127);
				match(NEWLINE);
				setState(128);
				name();
				}
				}
				break;
			case 2:
				{
				{
				setState(130);
				match(NEWLINE);
				setState(131);
				name();
				setState(132);
				match(NEWLINE);
				setState(133);
				surname();
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SurnameContext extends ParserRuleContext {
		public TerminalNode SURN() { return getToken(GEDCOMParser.SURN, 0); }
		public TerminalNode F_SURNAME_NAME() { return getToken(GEDCOMParser.F_SURNAME_NAME, 0); }
		public SurnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_surname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GEDCOMListener ) ((GEDCOMListener)listener).enterSurname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GEDCOMListener ) ((GEDCOMListener)listener).exitSurname(this);
		}
	}

	public final SurnameContext surname() throws RecognitionException {
		SurnameContext _localctx = new SurnameContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_surname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(SURN);
			setState(138);
			match(F_SURNAME_NAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NameContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(GEDCOMParser.NAME, 0); }
		public TerminalNode F_SURNAME_NAME() { return getToken(GEDCOMParser.F_SURNAME_NAME, 0); }
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GEDCOMListener ) ((GEDCOMListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GEDCOMListener ) ((GEDCOMListener)listener).exitName(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(NAME);
			setState(141);
			match(F_SURNAME_NAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BirtContext extends ParserRuleContext {
		public TerminalNode BIRT() { return getToken(GEDCOMParser.BIRT, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(GEDCOMParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(GEDCOMParser.NEWLINE, i);
		}
		public Date2Context date2() {
			return getRuleContext(Date2Context.class,0);
		}
		public PlacContext plac() {
			return getRuleContext(PlacContext.class,0);
		}
		public BirtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_birt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GEDCOMListener ) ((GEDCOMListener)listener).enterBirt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GEDCOMListener ) ((GEDCOMListener)listener).exitBirt(this);
		}
	}

	public final BirtContext birt() throws RecognitionException {
		BirtContext _localctx = new BirtContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_birt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(BIRT);
			setState(146);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(144);
				match(NEWLINE);
				setState(145);
				date2();
				}
				break;
			}
			setState(150);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(148);
				match(NEWLINE);
				setState(149);
				plac();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PlacContext extends ParserRuleContext {
		public TerminalNode PLAC() { return getToken(GEDCOMParser.PLAC, 0); }
		public PlacContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plac; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GEDCOMListener ) ((GEDCOMListener)listener).enterPlac(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GEDCOMListener ) ((GEDCOMListener)listener).exitPlac(this);
		}
	}

	public final PlacContext plac() throws RecognitionException {
		PlacContext _localctx = new PlacContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_plac);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(PLAC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeatContext extends ParserRuleContext {
		public TerminalNode DEAT() { return getToken(GEDCOMParser.DEAT, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(GEDCOMParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(GEDCOMParser.NEWLINE, i);
		}
		public Date2Context date2() {
			return getRuleContext(Date2Context.class,0);
		}
		public PlacContext plac() {
			return getRuleContext(PlacContext.class,0);
		}
		public DeatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GEDCOMListener ) ((GEDCOMListener)listener).enterDeat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GEDCOMListener ) ((GEDCOMListener)listener).exitDeat(this);
		}
	}

	public final DeatContext deat() throws RecognitionException {
		DeatContext _localctx = new DeatContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_deat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(DEAT);
			setState(157);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(155);
				match(NEWLINE);
				setState(156);
				date2();
				}
				break;
			}
			setState(161);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(159);
				match(NEWLINE);
				setState(160);
				plac();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BuriContext extends ParserRuleContext {
		public TerminalNode BURI() { return getToken(GEDCOMParser.BURI, 0); }
		public TerminalNode NEWLINE() { return getToken(GEDCOMParser.NEWLINE, 0); }
		public PlacContext plac() {
			return getRuleContext(PlacContext.class,0);
		}
		public BuriContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_buri; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GEDCOMListener ) ((GEDCOMListener)listener).enterBuri(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GEDCOMListener ) ((GEDCOMListener)listener).exitBuri(this);
		}
	}

	public final BuriContext buri() throws RecognitionException {
		BuriContext _localctx = new BuriContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_buri);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(BURI);
			setState(166);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(164);
				match(NEWLINE);
				setState(165);
				plac();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FamsContext extends ParserRuleContext {
		public List<TerminalNode> FAMS() { return getTokens(GEDCOMParser.FAMS); }
		public TerminalNode FAMS(int i) {
			return getToken(GEDCOMParser.FAMS, i);
		}
		public List<TerminalNode> AT() { return getTokens(GEDCOMParser.AT); }
		public TerminalNode AT(int i) {
			return getToken(GEDCOMParser.AT, i);
		}
		public TerminalNode CODE() { return getToken(GEDCOMParser.CODE, 0); }
		public TerminalNode NEWLINE() { return getToken(GEDCOMParser.NEWLINE, 0); }
		public FamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GEDCOMListener ) ((GEDCOMListener)listener).enterFams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GEDCOMListener ) ((GEDCOMListener)listener).exitFams(this);
		}
	}

	public final FamsContext fams() throws RecognitionException {
		FamsContext _localctx = new FamsContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_fams);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(FAMS);
			setState(169);
			match(AT);
			setState(170);
			match(CODE);
			setState(171);
			match(AT);
			setState(174);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(172);
				match(NEWLINE);
				setState(173);
				match(FAMS);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FamcContext extends ParserRuleContext {
		public List<TerminalNode> FAMC() { return getTokens(GEDCOMParser.FAMC); }
		public TerminalNode FAMC(int i) {
			return getToken(GEDCOMParser.FAMC, i);
		}
		public List<TerminalNode> AT() { return getTokens(GEDCOMParser.AT); }
		public TerminalNode AT(int i) {
			return getToken(GEDCOMParser.AT, i);
		}
		public TerminalNode CODE() { return getToken(GEDCOMParser.CODE, 0); }
		public TerminalNode NEWLINE() { return getToken(GEDCOMParser.NEWLINE, 0); }
		public FamcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_famc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GEDCOMListener ) ((GEDCOMListener)listener).enterFamc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GEDCOMListener ) ((GEDCOMListener)listener).exitFamc(this);
		}
	}

	public final FamcContext famc() throws RecognitionException {
		FamcContext _localctx = new FamcContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_famc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(FAMC);
			setState(177);
			match(AT);
			setState(178);
			match(CODE);
			setState(179);
			match(AT);
			setState(182);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(180);
				match(NEWLINE);
				setState(181);
				match(FAMC);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FamilyContext extends ParserRuleContext {
		public TerminalNode ZERO() { return getToken(GEDCOMParser.ZERO, 0); }
		public List<TerminalNode> AT() { return getTokens(GEDCOMParser.AT); }
		public TerminalNode AT(int i) {
			return getToken(GEDCOMParser.AT, i);
		}
		public TerminalNode CODE() { return getToken(GEDCOMParser.CODE, 0); }
		public TerminalNode FAM() { return getToken(GEDCOMParser.FAM, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(GEDCOMParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(GEDCOMParser.NEWLINE, i);
		}
		public List<Fam_tagContext> fam_tag() {
			return getRuleContexts(Fam_tagContext.class);
		}
		public Fam_tagContext fam_tag(int i) {
			return getRuleContext(Fam_tagContext.class,i);
		}
		public FamilyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_family; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GEDCOMListener ) ((GEDCOMListener)listener).enterFamily(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GEDCOMListener ) ((GEDCOMListener)listener).exitFamily(this);
		}
	}

	public final FamilyContext family() throws RecognitionException {
		FamilyContext _localctx = new FamilyContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_family);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(ZERO);
			setState(185);
			match(AT);
			setState(186);
			match(CODE);
			setState(187);
			match(AT);
			setState(188);
			match(FAM);
			setState(193);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(189);
					match(NEWLINE);
					setState(190);
					fam_tag();
					}
					} 
				}
				setState(195);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Fam_tagContext extends ParserRuleContext {
		public Token i;
		public List<TerminalNode> AT() { return getTokens(GEDCOMParser.AT); }
		public TerminalNode AT(int i) {
			return getToken(GEDCOMParser.AT, i);
		}
		public TerminalNode CODE() { return getToken(GEDCOMParser.CODE, 0); }
		public TerminalNode HUSB() { return getToken(GEDCOMParser.HUSB, 0); }
		public TerminalNode WIFE() { return getToken(GEDCOMParser.WIFE, 0); }
		public TerminalNode CHIL() { return getToken(GEDCOMParser.CHIL, 0); }
		public MarrContext marr() {
			return getRuleContext(MarrContext.class,0);
		}
		public Fam_tagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fam_tag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GEDCOMListener ) ((GEDCOMListener)listener).enterFam_tag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GEDCOMListener ) ((GEDCOMListener)listener).exitFam_tag(this);
		}
	}

	public final Fam_tagContext fam_tag() throws RecognitionException {
		Fam_tagContext _localctx = new Fam_tagContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_fam_tag);
		int _la;
		try {
			setState(201);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HUSB:
			case WIFE:
			case CHIL:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(196);
				((Fam_tagContext)_localctx).i = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << HUSB) | (1L << WIFE) | (1L << CHIL))) != 0)) ) {
					((Fam_tagContext)_localctx).i = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(197);
				match(AT);
				setState(198);
				match(CODE);
				setState(199);
				match(AT);
				}
				}
				break;
			case MARR:
				enterOuterAlt(_localctx, 2);
				{
				setState(200);
				marr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MarrContext extends ParserRuleContext {
		public TerminalNode MARR() { return getToken(GEDCOMParser.MARR, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(GEDCOMParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(GEDCOMParser.NEWLINE, i);
		}
		public List<Date2Context> date2() {
			return getRuleContexts(Date2Context.class);
		}
		public Date2Context date2(int i) {
			return getRuleContext(Date2Context.class,i);
		}
		public List<PlacContext> plac() {
			return getRuleContexts(PlacContext.class);
		}
		public PlacContext plac(int i) {
			return getRuleContext(PlacContext.class,i);
		}
		public MarrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_marr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GEDCOMListener ) ((GEDCOMListener)listener).enterMarr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GEDCOMListener ) ((GEDCOMListener)listener).exitMarr(this);
		}
	}

	public final MarrContext marr() throws RecognitionException {
		MarrContext _localctx = new MarrContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_marr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			match(MARR);
			setState(210);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(208);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						setState(204);
						match(NEWLINE);
						setState(205);
						date2();
						}
						break;
					case 2:
						{
						setState(206);
						match(NEWLINE);
						setState(207);
						plac();
						}
						break;
					}
					} 
				}
				setState(212);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TrlrContext extends ParserRuleContext {
		public TerminalNode TRLR() { return getToken(GEDCOMParser.TRLR, 0); }
		public TerminalNode NEWLINE() { return getToken(GEDCOMParser.NEWLINE, 0); }
		public ReqContext req() {
			return getRuleContext(ReqContext.class,0);
		}
		public TrlrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trlr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GEDCOMListener ) ((GEDCOMListener)listener).enterTrlr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GEDCOMListener ) ((GEDCOMListener)listener).exitTrlr(this);
		}
	}

	public final TrlrContext trlr() throws RecognitionException {
		TrlrContext _localctx = new TrlrContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_trlr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			match(TRLR);
			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(214);
				match(NEWLINE);
				setState(215);
				req();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReqContext extends ParserRuleContext {
		public TerminalNode REQ() { return getToken(GEDCOMParser.REQ, 0); }
		public List<TerminalNode> AT() { return getTokens(GEDCOMParser.AT); }
		public TerminalNode AT(int i) {
			return getToken(GEDCOMParser.AT, i);
		}
		public TerminalNode CODE() { return getToken(GEDCOMParser.CODE, 0); }
		public ReqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_req; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GEDCOMListener ) ((GEDCOMListener)listener).enterReq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GEDCOMListener ) ((GEDCOMListener)listener).exitReq(this);
		}
	}

	public final ReqContext req() throws RecognitionException {
		ReqContext _localctx = new ReqContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_req);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			match(REQ);
			setState(219);
			match(AT);
			setState(220);
			match(CODE);
			setState(221);
			match(AT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001%\u00e0\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001<\b\u0001\n\u0001\f\u0001"+
		"?\t\u0001\u0001\u0001\u0001\u0001\u0005\u0001C\b\u0001\n\u0001\f\u0001"+
		"F\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002M\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"R\b\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0003\u0005Z\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0003\te\b\t"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\nn\b\n"+
		"\n\n\f\nq\t\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0003\u000bz\b\u000b\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0003\f\u0088\b\f\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u0093\b\u000f\u0001"+
		"\u000f\u0001\u000f\u0003\u000f\u0097\b\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u009e\b\u0011\u0001\u0011\u0001"+
		"\u0011\u0003\u0011\u00a2\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0003"+
		"\u0012\u00a7\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0003\u0013\u00af\b\u0013\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u00b7\b\u0014\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0005\u0015\u00c0\b\u0015\n\u0015\f\u0015\u00c3\t\u0015\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u00ca\b\u0016"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0005\u0017"+
		"\u00d1\b\u0017\n\u0017\f\u0017\u00d4\t\u0017\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0003\u0018\u00d9\b\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0000\u0000\u001a\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,."+
		"02\u0000\u0001\u0001\u0000\u000b\r\u00e2\u00004\u0001\u0000\u0000\u0000"+
		"\u00028\u0001\u0000\u0000\u0000\u0004L\u0001\u0000\u0000\u0000\u0006N"+
		"\u0001\u0000\u0000\u0000\bS\u0001\u0000\u0000\u0000\nU\u0001\u0000\u0000"+
		"\u0000\f[\u0001\u0000\u0000\u0000\u000e^\u0001\u0000\u0000\u0000\u0010"+
		"`\u0001\u0000\u0000\u0000\u0012d\u0001\u0000\u0000\u0000\u0014f\u0001"+
		"\u0000\u0000\u0000\u0016y\u0001\u0000\u0000\u0000\u0018{\u0001\u0000\u0000"+
		"\u0000\u001a\u0089\u0001\u0000\u0000\u0000\u001c\u008c\u0001\u0000\u0000"+
		"\u0000\u001e\u008f\u0001\u0000\u0000\u0000 \u0098\u0001\u0000\u0000\u0000"+
		"\"\u009a\u0001\u0000\u0000\u0000$\u00a3\u0001\u0000\u0000\u0000&\u00a8"+
		"\u0001\u0000\u0000\u0000(\u00b0\u0001\u0000\u0000\u0000*\u00b8\u0001\u0000"+
		"\u0000\u0000,\u00c9\u0001\u0000\u0000\u0000.\u00cb\u0001\u0000\u0000\u0000"+
		"0\u00d5\u0001\u0000\u0000\u00002\u00da\u0001\u0000\u0000\u000045\u0003"+
		"\u0002\u0001\u000056\u0005$\u0000\u000067\u00030\u0018\u00007\u0001\u0001"+
		"\u0000\u0000\u00008=\u0005\u0001\u0000\u00009:\u0005$\u0000\u0000:<\u0003"+
		"\u0004\u0002\u0000;9\u0001\u0000\u0000\u0000<?\u0001\u0000\u0000\u0000"+
		"=;\u0001\u0000\u0000\u0000=>\u0001\u0000\u0000\u0000>D\u0001\u0000\u0000"+
		"\u0000?=\u0001\u0000\u0000\u0000@A\u0005$\u0000\u0000AC\u0003\u0012\t"+
		"\u0000B@\u0001\u0000\u0000\u0000CF\u0001\u0000\u0000\u0000DB\u0001\u0000"+
		"\u0000\u0000DE\u0001\u0000\u0000\u0000E\u0003\u0001\u0000\u0000\u0000"+
		"FD\u0001\u0000\u0000\u0000GM\u0003\u0006\u0003\u0000HM\u0003\b\u0004\u0000"+
		"IM\u0003\n\u0005\u0000JM\u0003\u000e\u0007\u0000KM\u0003\u0010\b\u0000"+
		"LG\u0001\u0000\u0000\u0000LH\u0001\u0000\u0000\u0000LI\u0001\u0000\u0000"+
		"\u0000LJ\u0001\u0000\u0000\u0000LK\u0001\u0000\u0000\u0000M\u0005\u0001"+
		"\u0000\u0000\u0000NQ\u0005\u0002\u0000\u0000OP\u0005$\u0000\u0000PR\u0005"+
		"\u0003\u0000\u0000QO\u0001\u0000\u0000\u0000QR\u0001\u0000\u0000\u0000"+
		"R\u0007\u0001\u0000\u0000\u0000ST\u0005\u0007\u0000\u0000T\t\u0001\u0000"+
		"\u0000\u0000UV\u0005!\u0000\u0000VY\u0005 \u0000\u0000WX\u0005$\u0000"+
		"\u0000XZ\u0005\u0004\u0000\u0000YW\u0001\u0000\u0000\u0000YZ\u0001\u0000"+
		"\u0000\u0000Z\u000b\u0001\u0000\u0000\u0000[\\\u0005\"\u0000\u0000\\]"+
		"\u0005 \u0000\u0000]\r\u0001\u0000\u0000\u0000^_\u0005\u0005\u0000\u0000"+
		"_\u000f\u0001\u0000\u0000\u0000`a\u0005\u0006\u0000\u0000a\u0011\u0001"+
		"\u0000\u0000\u0000be\u0003\u0014\n\u0000ce\u0003*\u0015\u0000db\u0001"+
		"\u0000\u0000\u0000dc\u0001\u0000\u0000\u0000e\u0013\u0001\u0000\u0000"+
		"\u0000fg\u0005\u001c\u0000\u0000gh\u0005\u001f\u0000\u0000hi\u0005\u0010"+
		"\u0000\u0000ij\u0005\u001f\u0000\u0000jo\u0005\u000e\u0000\u0000kl\u0005"+
		"$\u0000\u0000ln\u0003\u0016\u000b\u0000mk\u0001\u0000\u0000\u0000nq\u0001"+
		"\u0000\u0000\u0000om\u0001\u0000\u0000\u0000op\u0001\u0000\u0000\u0000"+
		"p\u0015\u0001\u0000\u0000\u0000qo\u0001\u0000\u0000\u0000rz\u0003\u0018"+
		"\f\u0000sz\u0005\u0015\u0000\u0000tz\u0003\u001e\u000f\u0000uz\u0003\""+
		"\u0011\u0000vz\u0003$\u0012\u0000wz\u0003&\u0013\u0000xz\u0003(\u0014"+
		"\u0000yr\u0001\u0000\u0000\u0000ys\u0001\u0000\u0000\u0000yt\u0001\u0000"+
		"\u0000\u0000yu\u0001\u0000\u0000\u0000yv\u0001\u0000\u0000\u0000yw\u0001"+
		"\u0000\u0000\u0000yx\u0001\u0000\u0000\u0000z\u0017\u0001\u0000\u0000"+
		"\u0000{|\u0005\u000f\u0000\u0000|\u0087\u0005\u0011\u0000\u0000}~\u0005"+
		"$\u0000\u0000~\u007f\u0003\u001a\r\u0000\u007f\u0080\u0005$\u0000\u0000"+
		"\u0080\u0081\u0003\u001c\u000e\u0000\u0081\u0088\u0001\u0000\u0000\u0000"+
		"\u0082\u0083\u0005$\u0000\u0000\u0083\u0084\u0003\u001c\u000e\u0000\u0084"+
		"\u0085\u0005$\u0000\u0000\u0085\u0086\u0003\u001a\r\u0000\u0086\u0088"+
		"\u0001\u0000\u0000\u0000\u0087}\u0001\u0000\u0000\u0000\u0087\u0082\u0001"+
		"\u0000\u0000\u0000\u0088\u0019\u0001\u0000\u0000\u0000\u0089\u008a\u0005"+
		"\u0013\u0000\u0000\u008a\u008b\u0005\u0012\u0000\u0000\u008b\u001b\u0001"+
		"\u0000\u0000\u0000\u008c\u008d\u0005\u0014\u0000\u0000\u008d\u008e\u0005"+
		"\u0012\u0000\u0000\u008e\u001d\u0001\u0000\u0000\u0000\u008f\u0092\u0005"+
		"\u0016\u0000\u0000\u0090\u0091\u0005$\u0000\u0000\u0091\u0093\u0003\f"+
		"\u0006\u0000\u0092\u0090\u0001\u0000\u0000\u0000\u0092\u0093\u0001\u0000"+
		"\u0000\u0000\u0093\u0096\u0001\u0000\u0000\u0000\u0094\u0095\u0005$\u0000"+
		"\u0000\u0095\u0097\u0003 \u0010\u0000\u0096\u0094\u0001\u0000\u0000\u0000"+
		"\u0096\u0097\u0001\u0000\u0000\u0000\u0097\u001f\u0001\u0000\u0000\u0000"+
		"\u0098\u0099\u0005\u0019\u0000\u0000\u0099!\u0001\u0000\u0000\u0000\u009a"+
		"\u009d\u0005\u0017\u0000\u0000\u009b\u009c\u0005$\u0000\u0000\u009c\u009e"+
		"\u0003\f\u0006\u0000\u009d\u009b\u0001\u0000\u0000\u0000\u009d\u009e\u0001"+
		"\u0000\u0000\u0000\u009e\u00a1\u0001\u0000\u0000\u0000\u009f\u00a0\u0005"+
		"$\u0000\u0000\u00a0\u00a2\u0003 \u0010\u0000\u00a1\u009f\u0001\u0000\u0000"+
		"\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2#\u0001\u0000\u0000\u0000"+
		"\u00a3\u00a6\u0005\u0018\u0000\u0000\u00a4\u00a5\u0005$\u0000\u0000\u00a5"+
		"\u00a7\u0003 \u0010\u0000\u00a6\u00a4\u0001\u0000\u0000\u0000\u00a6\u00a7"+
		"\u0001\u0000\u0000\u0000\u00a7%\u0001\u0000\u0000\u0000\u00a8\u00a9\u0005"+
		"\u001a\u0000\u0000\u00a9\u00aa\u0005\u001f\u0000\u0000\u00aa\u00ab\u0005"+
		"\u0010\u0000\u0000\u00ab\u00ae\u0005\u001f\u0000\u0000\u00ac\u00ad\u0005"+
		"$\u0000\u0000\u00ad\u00af\u0005\u001a\u0000\u0000\u00ae\u00ac\u0001\u0000"+
		"\u0000\u0000\u00ae\u00af\u0001\u0000\u0000\u0000\u00af\'\u0001\u0000\u0000"+
		"\u0000\u00b0\u00b1\u0005\u001b\u0000\u0000\u00b1\u00b2\u0005\u001f\u0000"+
		"\u0000\u00b2\u00b3\u0005\u0010\u0000\u0000\u00b3\u00b6\u0005\u001f\u0000"+
		"\u0000\u00b4\u00b5\u0005$\u0000\u0000\u00b5\u00b7\u0005\u001b\u0000\u0000"+
		"\u00b6\u00b4\u0001\u0000\u0000\u0000\u00b6\u00b7\u0001\u0000\u0000\u0000"+
		"\u00b7)\u0001\u0000\u0000\u0000\u00b8\u00b9\u0005\u001c\u0000\u0000\u00b9"+
		"\u00ba\u0005\u001f\u0000\u0000\u00ba\u00bb\u0005\u0010\u0000\u0000\u00bb"+
		"\u00bc\u0005\u001f\u0000\u0000\u00bc\u00c1\u0005\t\u0000\u0000\u00bd\u00be"+
		"\u0005$\u0000\u0000\u00be\u00c0\u0003,\u0016\u0000\u00bf\u00bd\u0001\u0000"+
		"\u0000\u0000\u00c0\u00c3\u0001\u0000\u0000\u0000\u00c1\u00bf\u0001\u0000"+
		"\u0000\u0000\u00c1\u00c2\u0001\u0000\u0000\u0000\u00c2+\u0001\u0000\u0000"+
		"\u0000\u00c3\u00c1\u0001\u0000\u0000\u0000\u00c4\u00c5\u0007\u0000\u0000"+
		"\u0000\u00c5\u00c6\u0005\u001f\u0000\u0000\u00c6\u00c7\u0005\u0010\u0000"+
		"\u0000\u00c7\u00ca\u0005\u001f\u0000\u0000\u00c8\u00ca\u0003.\u0017\u0000"+
		"\u00c9\u00c4\u0001\u0000\u0000\u0000\u00c9\u00c8\u0001\u0000\u0000\u0000"+
		"\u00ca-\u0001\u0000\u0000\u0000\u00cb\u00d2\u0005\n\u0000\u0000\u00cc"+
		"\u00cd\u0005$\u0000\u0000\u00cd\u00d1\u0003\f\u0006\u0000\u00ce\u00cf"+
		"\u0005$\u0000\u0000\u00cf\u00d1\u0003 \u0010\u0000\u00d0\u00cc\u0001\u0000"+
		"\u0000\u0000\u00d0\u00ce\u0001\u0000\u0000\u0000\u00d1\u00d4\u0001\u0000"+
		"\u0000\u0000\u00d2\u00d0\u0001\u0000\u0000\u0000\u00d2\u00d3\u0001\u0000"+
		"\u0000\u0000\u00d3/\u0001\u0000\u0000\u0000\u00d4\u00d2\u0001\u0000\u0000"+
		"\u0000\u00d5\u00d8\u0005\b\u0000\u0000\u00d6\u00d7\u0005$\u0000\u0000"+
		"\u00d7\u00d9\u00032\u0019\u0000\u00d8\u00d6\u0001\u0000\u0000\u0000\u00d8"+
		"\u00d9\u0001\u0000\u0000\u0000\u00d91\u0001\u0000\u0000\u0000\u00da\u00db"+
		"\u0005#\u0000\u0000\u00db\u00dc\u0005\u001f\u0000\u0000\u00dc\u00dd\u0005"+
		"\u0010\u0000\u0000\u00dd\u00de\u0005\u001f\u0000\u0000\u00de3\u0001\u0000"+
		"\u0000\u0000\u0015=DLQYdoy\u0087\u0092\u0096\u009d\u00a1\u00a6\u00ae\u00b6"+
		"\u00c1\u00c9\u00d0\u00d2\u00d8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}