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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		AT=10, DATE1=11, DATE2=12, CODE=13, HEAD=14, GEDC=15, VERS=16, TIME=17, 
		FILE=18, FILENAME=19, LANG=20, CHARR=21, TRLR=22, FAM=23, MARR=24, HUSB=25, 
		WIFE=26, CHIL=27, INDI=28, COMPLETE_NAME=29, SURN=30, NAME=31, SEX=32, 
		BIRT=33, DEAT=34, BURI=35, PLAC=36, FAMS=37, FAMC=38, REQ=39, DAY_MONTH=40, 
		DAYS=41, YEAR=42, F_STR_MONTHS=43, NEWLINE=44, WS=45, STR=46;
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
			null, "'BEF'", "'AFT'", "'ABT'", "'EST '", "'/'", "'-'", "' '", "'0 '", 
			"','", "'@'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "AT", "DATE1", 
			"DATE2", "CODE", "HEAD", "GEDC", "VERS", "TIME", "FILE", "FILENAME", 
			"LANG", "CHARR", "TRLR", "FAM", "MARR", "HUSB", "WIFE", "CHIL", "INDI", 
			"COMPLETE_NAME", "SURN", "NAME", "SEX", "BIRT", "DEAT", "BURI", "PLAC", 
			"FAMS", "FAMC", "REQ", "DAY_MONTH", "DAYS", "YEAR", "F_STR_MONTHS", "NEWLINE", 
			"WS", "STR"
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
		public TerminalNode STR() { return getToken(GEDCOMParser.STR, 0); }
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
			setState(84);
			match(STR);
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
		public Token period;
		public Token day;
		public Token month;
		public TerminalNode DATE1() { return getToken(GEDCOMParser.DATE1, 0); }
		public TerminalNode YEAR() { return getToken(GEDCOMParser.YEAR, 0); }
		public TerminalNode NEWLINE() { return getToken(GEDCOMParser.NEWLINE, 0); }
		public TerminalNode TIME() { return getToken(GEDCOMParser.TIME, 0); }
		public List<TerminalNode> DAY_MONTH() { return getTokens(GEDCOMParser.DAY_MONTH); }
		public TerminalNode DAY_MONTH(int i) {
			return getToken(GEDCOMParser.DAY_MONTH, i);
		}
		public TerminalNode DAYS() { return getToken(GEDCOMParser.DAYS, 0); }
		public TerminalNode F_STR_MONTHS() { return getToken(GEDCOMParser.F_STR_MONTHS, 0); }
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(DATE1);
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3))) != 0)) {
				{
				setState(87);
				((Date1Context)_localctx).period = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3))) != 0)) ) {
					((Date1Context)_localctx).period = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(92);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(90);
				((Date1Context)_localctx).day = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==DAY_MONTH || _la==DAYS) ) {
					((Date1Context)_localctx).day = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(91);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << DAY_MONTH) | (1L << F_STR_MONTHS))) != 0)) {
				{
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DAY_MONTH || _la==F_STR_MONTHS) {
					{
					setState(94);
					((Date1Context)_localctx).month = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==DAY_MONTH || _la==F_STR_MONTHS) ) {
						((Date1Context)_localctx).month = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(97);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(100);
			match(YEAR);
			setState(103);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(101);
				match(NEWLINE);
				setState(102);
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
		public Token period;
		public Token day;
		public Token month;
		public TerminalNode DATE2() { return getToken(GEDCOMParser.DATE2, 0); }
		public TerminalNode YEAR() { return getToken(GEDCOMParser.YEAR, 0); }
		public List<TerminalNode> DAY_MONTH() { return getTokens(GEDCOMParser.DAY_MONTH); }
		public TerminalNode DAY_MONTH(int i) {
			return getToken(GEDCOMParser.DAY_MONTH, i);
		}
		public TerminalNode DAYS() { return getToken(GEDCOMParser.DAYS, 0); }
		public TerminalNode F_STR_MONTHS() { return getToken(GEDCOMParser.F_STR_MONTHS, 0); }
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(DATE2);
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3))) != 0)) {
				{
				setState(106);
				((Date2Context)_localctx).period = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3))) != 0)) ) {
					((Date2Context)_localctx).period = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(111);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(109);
				((Date2Context)_localctx).day = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==DAY_MONTH || _la==DAYS) ) {
					((Date2Context)_localctx).day = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(110);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << DAY_MONTH) | (1L << F_STR_MONTHS))) != 0)) {
				{
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DAY_MONTH || _la==F_STR_MONTHS) {
					{
					setState(113);
					((Date2Context)_localctx).month = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==DAY_MONTH || _la==F_STR_MONTHS) ) {
						((Date2Context)_localctx).month = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(116);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(119);
			match(YEAR);
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
		public TerminalNode FILENAME() { return getToken(GEDCOMParser.FILENAME, 0); }
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
			setState(121);
			match(FILE);
			setState(122);
			match(FILENAME);
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
		public TerminalNode STR() { return getToken(GEDCOMParser.STR, 0); }
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
			setState(124);
			match(LANG);
			setState(125);
			match(STR);
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
			setState(129);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				individual();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
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
			setState(131);
			match(T__7);
			setState(132);
			match(CODE);
			setState(133);
			match(INDI);
			setState(138);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(134);
					match(NEWLINE);
					setState(135);
					indi_tag();
					}
					} 
				}
				setState(140);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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
			setState(148);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMPLETE_NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(141);
				complete_name();
				}
				break;
			case SEX:
				enterOuterAlt(_localctx, 2);
				{
				setState(142);
				match(SEX);
				}
				break;
			case BIRT:
				enterOuterAlt(_localctx, 3);
				{
				setState(143);
				birt();
				}
				break;
			case DEAT:
				enterOuterAlt(_localctx, 4);
				{
				setState(144);
				deat();
				}
				break;
			case BURI:
				enterOuterAlt(_localctx, 5);
				{
				setState(145);
				buri();
				}
				break;
			case FAMS:
				enterOuterAlt(_localctx, 6);
				{
				setState(146);
				fams();
				}
				break;
			case FAMC:
				enterOuterAlt(_localctx, 7);
				{
				setState(147);
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
		public Token nam;
		public Token surn;
		public TerminalNode COMPLETE_NAME() { return getToken(GEDCOMParser.COMPLETE_NAME, 0); }
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
		public List<TerminalNode> STR() { return getTokens(GEDCOMParser.STR); }
		public TerminalNode STR(int i) {
			return getToken(GEDCOMParser.STR, i);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(COMPLETE_NAME);
			setState(152); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(151);
				((Complete_nameContext)_localctx).nam = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__6 || _la==STR) ) {
					((Complete_nameContext)_localctx).nam = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(154); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__6 || _la==STR );
			setState(156);
			match(T__4);
			setState(158); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(157);
				((Complete_nameContext)_localctx).surn = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__6 || _la==STR) ) {
					((Complete_nameContext)_localctx).surn = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(160); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__6 || _la==STR );
			setState(162);
			match(T__4);
			setState(173);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				{
				setState(163);
				match(NEWLINE);
				setState(164);
				surname();
				setState(165);
				match(NEWLINE);
				setState(166);
				name();
				}
				}
				break;
			case 2:
				{
				{
				setState(168);
				match(NEWLINE);
				setState(169);
				name();
				setState(170);
				match(NEWLINE);
				setState(171);
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
		public List<TerminalNode> STR() { return getTokens(GEDCOMParser.STR); }
		public TerminalNode STR(int i) {
			return getToken(GEDCOMParser.STR, i);
		}
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(SURN);
			setState(177); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(176);
				_la = _input.LA(1);
				if ( !(_la==T__6 || _la==STR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(179); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__6 || _la==STR );
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
		public List<TerminalNode> STR() { return getTokens(GEDCOMParser.STR); }
		public TerminalNode STR(int i) {
			return getToken(GEDCOMParser.STR, i);
		}
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(NAME);
			setState(183); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(182);
				_la = _input.LA(1);
				if ( !(_la==T__6 || _la==STR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(185); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__6 || _la==STR );
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
			setState(187);
			match(BIRT);
			setState(190);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(188);
				match(NEWLINE);
				setState(189);
				date2();
				}
				break;
			}
			setState(194);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(192);
				match(NEWLINE);
				setState(193);
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
		public List<TerminalNode> STR() { return getTokens(GEDCOMParser.STR); }
		public TerminalNode STR(int i) {
			return getToken(GEDCOMParser.STR, i);
		}
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(PLAC);
			setState(198); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(197);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__8) | (1L << STR))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(200); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__8) | (1L << STR))) != 0) );
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
			setState(202);
			match(DEAT);
			setState(205);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(203);
				match(NEWLINE);
				setState(204);
				date2();
				}
				break;
			}
			setState(209);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(207);
				match(NEWLINE);
				setState(208);
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
			setState(211);
			match(BURI);
			setState(214);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(212);
				match(NEWLINE);
				setState(213);
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
		public TerminalNode FAMS() { return getToken(GEDCOMParser.FAMS, 0); }
		public TerminalNode CODE() { return getToken(GEDCOMParser.CODE, 0); }
		public List<FamsContext> fams() {
			return getRuleContexts(FamsContext.class);
		}
		public FamsContext fams(int i) {
			return getRuleContext(FamsContext.class,i);
		}
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(FAMS);
			setState(217);
			match(CODE);
			setState(221);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(218);
					fams();
					}
					} 
				}
				setState(223);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
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
		public TerminalNode FAMC() { return getToken(GEDCOMParser.FAMC, 0); }
		public TerminalNode CODE() { return getToken(GEDCOMParser.CODE, 0); }
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
			setState(224);
			match(FAMC);
			setState(225);
			match(CODE);
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
			setState(227);
			match(T__7);
			setState(228);
			match(CODE);
			setState(229);
			match(FAM);
			setState(234);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(230);
					match(NEWLINE);
					setState(231);
					fam_tag();
					}
					} 
				}
				setState(236);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
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
			setState(240);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HUSB:
			case WIFE:
			case CHIL:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(237);
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
				setState(238);
				match(CODE);
				}
				}
				break;
			case MARR:
				enterOuterAlt(_localctx, 2);
				{
				setState(239);
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
			setState(242);
			match(MARR);
			setState(249);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(247);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
					case 1:
						{
						setState(243);
						match(NEWLINE);
						setState(244);
						date2();
						}
						break;
					case 2:
						{
						setState(245);
						match(NEWLINE);
						setState(246);
						plac();
						}
						break;
					}
					} 
				}
				setState(251);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
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
			setState(252);
			match(TRLR);
			setState(255);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(253);
				match(NEWLINE);
				setState(254);
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
			setState(257);
			match(REQ);
			setState(258);
			match(CODE);
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
		"\u0004\u0001.\u0105\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"R\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0003\u0005Y\b\u0005\u0001\u0005\u0001\u0005\u0003\u0005]\b\u0005\u0001"+
		"\u0005\u0003\u0005`\b\u0005\u0001\u0005\u0003\u0005c\b\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0003\u0005h\b\u0005\u0001\u0006\u0001\u0006"+
		"\u0003\u0006l\b\u0006\u0001\u0006\u0001\u0006\u0003\u0006p\b\u0006\u0001"+
		"\u0006\u0003\u0006s\b\u0006\u0001\u0006\u0003\u0006v\b\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0003\t\u0082\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0005\n\u0089\b\n\n\n\f\n\u008c\t\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u0095\b\u000b"+
		"\u0001\f\u0001\f\u0004\f\u0099\b\f\u000b\f\f\f\u009a\u0001\f\u0001\f\u0004"+
		"\f\u009f\b\f\u000b\f\f\f\u00a0\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00ae\b\f\u0001"+
		"\r\u0001\r\u0004\r\u00b2\b\r\u000b\r\f\r\u00b3\u0001\u000e\u0001\u000e"+
		"\u0004\u000e\u00b8\b\u000e\u000b\u000e\f\u000e\u00b9\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0003\u000f\u00bf\b\u000f\u0001\u000f\u0001\u000f\u0003"+
		"\u000f\u00c3\b\u000f\u0001\u0010\u0001\u0010\u0004\u0010\u00c7\b\u0010"+
		"\u000b\u0010\f\u0010\u00c8\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011"+
		"\u00ce\b\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u00d2\b\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u00d7\b\u0012\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0005\u0013\u00dc\b\u0013\n\u0013\f\u0013\u00df\t\u0013"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0005\u0015\u00e9\b\u0015\n\u0015\f\u0015\u00ec"+
		"\t\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u00f1\b\u0016"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0005\u0017"+
		"\u00f8\b\u0017\n\u0017\f\u0017\u00fb\t\u0017\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0003\u0018\u0100\b\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0000\u0000\u001a\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02\u0000\u0007\u0001\u0000"+
		"\u0001\u0004\u0001\u0000()\u0001\u0000\u0005\u0007\u0002\u0000((++\u0002"+
		"\u0000\u0007\u0007..\u0003\u0000\u0007\u0007\t\t..\u0001\u0000\u0019\u001b"+
		"\u0113\u00004\u0001\u0000\u0000\u0000\u00028\u0001\u0000\u0000\u0000\u0004"+
		"L\u0001\u0000\u0000\u0000\u0006N\u0001\u0000\u0000\u0000\bS\u0001\u0000"+
		"\u0000\u0000\nV\u0001\u0000\u0000\u0000\fi\u0001\u0000\u0000\u0000\u000e"+
		"y\u0001\u0000\u0000\u0000\u0010|\u0001\u0000\u0000\u0000\u0012\u0081\u0001"+
		"\u0000\u0000\u0000\u0014\u0083\u0001\u0000\u0000\u0000\u0016\u0094\u0001"+
		"\u0000\u0000\u0000\u0018\u0096\u0001\u0000\u0000\u0000\u001a\u00af\u0001"+
		"\u0000\u0000\u0000\u001c\u00b5\u0001\u0000\u0000\u0000\u001e\u00bb\u0001"+
		"\u0000\u0000\u0000 \u00c4\u0001\u0000\u0000\u0000\"\u00ca\u0001\u0000"+
		"\u0000\u0000$\u00d3\u0001\u0000\u0000\u0000&\u00d8\u0001\u0000\u0000\u0000"+
		"(\u00e0\u0001\u0000\u0000\u0000*\u00e3\u0001\u0000\u0000\u0000,\u00f0"+
		"\u0001\u0000\u0000\u0000.\u00f2\u0001\u0000\u0000\u00000\u00fc\u0001\u0000"+
		"\u0000\u00002\u0101\u0001\u0000\u0000\u000045\u0003\u0002\u0001\u0000"+
		"56\u0005,\u0000\u000067\u00030\u0018\u00007\u0001\u0001\u0000\u0000\u0000"+
		"8=\u0005\u000e\u0000\u00009:\u0005,\u0000\u0000:<\u0003\u0004\u0002\u0000"+
		";9\u0001\u0000\u0000\u0000<?\u0001\u0000\u0000\u0000=;\u0001\u0000\u0000"+
		"\u0000=>\u0001\u0000\u0000\u0000>D\u0001\u0000\u0000\u0000?=\u0001\u0000"+
		"\u0000\u0000@A\u0005,\u0000\u0000AC\u0003\u0012\t\u0000B@\u0001\u0000"+
		"\u0000\u0000CF\u0001\u0000\u0000\u0000DB\u0001\u0000\u0000\u0000DE\u0001"+
		"\u0000\u0000\u0000E\u0003\u0001\u0000\u0000\u0000FD\u0001\u0000\u0000"+
		"\u0000GM\u0003\u0006\u0003\u0000HM\u0003\b\u0004\u0000IM\u0003\n\u0005"+
		"\u0000JM\u0003\u000e\u0007\u0000KM\u0003\u0010\b\u0000LG\u0001\u0000\u0000"+
		"\u0000LH\u0001\u0000\u0000\u0000LI\u0001\u0000\u0000\u0000LJ\u0001\u0000"+
		"\u0000\u0000LK\u0001\u0000\u0000\u0000M\u0005\u0001\u0000\u0000\u0000"+
		"NQ\u0005\u000f\u0000\u0000OP\u0005,\u0000\u0000PR\u0005\u0010\u0000\u0000"+
		"QO\u0001\u0000\u0000\u0000QR\u0001\u0000\u0000\u0000R\u0007\u0001\u0000"+
		"\u0000\u0000ST\u0005\u0015\u0000\u0000TU\u0005.\u0000\u0000U\t\u0001\u0000"+
		"\u0000\u0000VX\u0005\u000b\u0000\u0000WY\u0007\u0000\u0000\u0000XW\u0001"+
		"\u0000\u0000\u0000XY\u0001\u0000\u0000\u0000Y\\\u0001\u0000\u0000\u0000"+
		"Z[\u0007\u0001\u0000\u0000[]\u0007\u0002\u0000\u0000\\Z\u0001\u0000\u0000"+
		"\u0000\\]\u0001\u0000\u0000\u0000]b\u0001\u0000\u0000\u0000^`\u0007\u0003"+
		"\u0000\u0000_^\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000`a\u0001"+
		"\u0000\u0000\u0000ac\u0007\u0002\u0000\u0000b_\u0001\u0000\u0000\u0000"+
		"bc\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000dg\u0005*\u0000\u0000"+
		"ef\u0005,\u0000\u0000fh\u0005\u0011\u0000\u0000ge\u0001\u0000\u0000\u0000"+
		"gh\u0001\u0000\u0000\u0000h\u000b\u0001\u0000\u0000\u0000ik\u0005\f\u0000"+
		"\u0000jl\u0007\u0000\u0000\u0000kj\u0001\u0000\u0000\u0000kl\u0001\u0000"+
		"\u0000\u0000lo\u0001\u0000\u0000\u0000mn\u0007\u0001\u0000\u0000np\u0007"+
		"\u0002\u0000\u0000om\u0001\u0000\u0000\u0000op\u0001\u0000\u0000\u0000"+
		"pu\u0001\u0000\u0000\u0000qs\u0007\u0003\u0000\u0000rq\u0001\u0000\u0000"+
		"\u0000rs\u0001\u0000\u0000\u0000st\u0001\u0000\u0000\u0000tv\u0007\u0002"+
		"\u0000\u0000ur\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000vw\u0001"+
		"\u0000\u0000\u0000wx\u0005*\u0000\u0000x\r\u0001\u0000\u0000\u0000yz\u0005"+
		"\u0012\u0000\u0000z{\u0005\u0013\u0000\u0000{\u000f\u0001\u0000\u0000"+
		"\u0000|}\u0005\u0014\u0000\u0000}~\u0005.\u0000\u0000~\u0011\u0001\u0000"+
		"\u0000\u0000\u007f\u0082\u0003\u0014\n\u0000\u0080\u0082\u0003*\u0015"+
		"\u0000\u0081\u007f\u0001\u0000\u0000\u0000\u0081\u0080\u0001\u0000\u0000"+
		"\u0000\u0082\u0013\u0001\u0000\u0000\u0000\u0083\u0084\u0005\b\u0000\u0000"+
		"\u0084\u0085\u0005\r\u0000\u0000\u0085\u008a\u0005\u001c\u0000\u0000\u0086"+
		"\u0087\u0005,\u0000\u0000\u0087\u0089\u0003\u0016\u000b\u0000\u0088\u0086"+
		"\u0001\u0000\u0000\u0000\u0089\u008c\u0001\u0000\u0000\u0000\u008a\u0088"+
		"\u0001\u0000\u0000\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008b\u0015"+
		"\u0001\u0000\u0000\u0000\u008c\u008a\u0001\u0000\u0000\u0000\u008d\u0095"+
		"\u0003\u0018\f\u0000\u008e\u0095\u0005 \u0000\u0000\u008f\u0095\u0003"+
		"\u001e\u000f\u0000\u0090\u0095\u0003\"\u0011\u0000\u0091\u0095\u0003$"+
		"\u0012\u0000\u0092\u0095\u0003&\u0013\u0000\u0093\u0095\u0003(\u0014\u0000"+
		"\u0094\u008d\u0001\u0000\u0000\u0000\u0094\u008e\u0001\u0000\u0000\u0000"+
		"\u0094\u008f\u0001\u0000\u0000\u0000\u0094\u0090\u0001\u0000\u0000\u0000"+
		"\u0094\u0091\u0001\u0000\u0000\u0000\u0094\u0092\u0001\u0000\u0000\u0000"+
		"\u0094\u0093\u0001\u0000\u0000\u0000\u0095\u0017\u0001\u0000\u0000\u0000"+
		"\u0096\u0098\u0005\u001d\u0000\u0000\u0097\u0099\u0007\u0004\u0000\u0000"+
		"\u0098\u0097\u0001\u0000\u0000\u0000\u0099\u009a\u0001\u0000\u0000\u0000"+
		"\u009a\u0098\u0001\u0000\u0000\u0000\u009a\u009b\u0001\u0000\u0000\u0000"+
		"\u009b\u009c\u0001\u0000\u0000\u0000\u009c\u009e\u0005\u0005\u0000\u0000"+
		"\u009d\u009f\u0007\u0004\u0000\u0000\u009e\u009d\u0001\u0000\u0000\u0000"+
		"\u009f\u00a0\u0001\u0000\u0000\u0000\u00a0\u009e\u0001\u0000\u0000\u0000"+
		"\u00a0\u00a1\u0001\u0000\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000"+
		"\u00a2\u00ad\u0005\u0005\u0000\u0000\u00a3\u00a4\u0005,\u0000\u0000\u00a4"+
		"\u00a5\u0003\u001a\r\u0000\u00a5\u00a6\u0005,\u0000\u0000\u00a6\u00a7"+
		"\u0003\u001c\u000e\u0000\u00a7\u00ae\u0001\u0000\u0000\u0000\u00a8\u00a9"+
		"\u0005,\u0000\u0000\u00a9\u00aa\u0003\u001c\u000e\u0000\u00aa\u00ab\u0005"+
		",\u0000\u0000\u00ab\u00ac\u0003\u001a\r\u0000\u00ac\u00ae\u0001\u0000"+
		"\u0000\u0000\u00ad\u00a3\u0001\u0000\u0000\u0000\u00ad\u00a8\u0001\u0000"+
		"\u0000\u0000\u00ae\u0019\u0001\u0000\u0000\u0000\u00af\u00b1\u0005\u001e"+
		"\u0000\u0000\u00b0\u00b2\u0007\u0004\u0000\u0000\u00b1\u00b0\u0001\u0000"+
		"\u0000\u0000\u00b2\u00b3\u0001\u0000\u0000\u0000\u00b3\u00b1\u0001\u0000"+
		"\u0000\u0000\u00b3\u00b4\u0001\u0000\u0000\u0000\u00b4\u001b\u0001\u0000"+
		"\u0000\u0000\u00b5\u00b7\u0005\u001f\u0000\u0000\u00b6\u00b8\u0007\u0004"+
		"\u0000\u0000\u00b7\u00b6\u0001\u0000\u0000\u0000\u00b8\u00b9\u0001\u0000"+
		"\u0000\u0000\u00b9\u00b7\u0001\u0000\u0000\u0000\u00b9\u00ba\u0001\u0000"+
		"\u0000\u0000\u00ba\u001d\u0001\u0000\u0000\u0000\u00bb\u00be\u0005!\u0000"+
		"\u0000\u00bc\u00bd\u0005,\u0000\u0000\u00bd\u00bf\u0003\f\u0006\u0000"+
		"\u00be\u00bc\u0001\u0000\u0000\u0000\u00be\u00bf\u0001\u0000\u0000\u0000"+
		"\u00bf\u00c2\u0001\u0000\u0000\u0000\u00c0\u00c1\u0005,\u0000\u0000\u00c1"+
		"\u00c3\u0003 \u0010\u0000\u00c2\u00c0\u0001\u0000\u0000\u0000\u00c2\u00c3"+
		"\u0001\u0000\u0000\u0000\u00c3\u001f\u0001\u0000\u0000\u0000\u00c4\u00c6"+
		"\u0005$\u0000\u0000\u00c5\u00c7\u0007\u0005\u0000\u0000\u00c6\u00c5\u0001"+
		"\u0000\u0000\u0000\u00c7\u00c8\u0001\u0000\u0000\u0000\u00c8\u00c6\u0001"+
		"\u0000\u0000\u0000\u00c8\u00c9\u0001\u0000\u0000\u0000\u00c9!\u0001\u0000"+
		"\u0000\u0000\u00ca\u00cd\u0005\"\u0000\u0000\u00cb\u00cc\u0005,\u0000"+
		"\u0000\u00cc\u00ce\u0003\f\u0006\u0000\u00cd\u00cb\u0001\u0000\u0000\u0000"+
		"\u00cd\u00ce\u0001\u0000\u0000\u0000\u00ce\u00d1\u0001\u0000\u0000\u0000"+
		"\u00cf\u00d0\u0005,\u0000\u0000\u00d0\u00d2\u0003 \u0010\u0000\u00d1\u00cf"+
		"\u0001\u0000\u0000\u0000\u00d1\u00d2\u0001\u0000\u0000\u0000\u00d2#\u0001"+
		"\u0000\u0000\u0000\u00d3\u00d6\u0005#\u0000\u0000\u00d4\u00d5\u0005,\u0000"+
		"\u0000\u00d5\u00d7\u0003 \u0010\u0000\u00d6\u00d4\u0001\u0000\u0000\u0000"+
		"\u00d6\u00d7\u0001\u0000\u0000\u0000\u00d7%\u0001\u0000\u0000\u0000\u00d8"+
		"\u00d9\u0005%\u0000\u0000\u00d9\u00dd\u0005\r\u0000\u0000\u00da\u00dc"+
		"\u0003&\u0013\u0000\u00db\u00da\u0001\u0000\u0000\u0000\u00dc\u00df\u0001"+
		"\u0000\u0000\u0000\u00dd\u00db\u0001\u0000\u0000\u0000\u00dd\u00de\u0001"+
		"\u0000\u0000\u0000\u00de\'\u0001\u0000\u0000\u0000\u00df\u00dd\u0001\u0000"+
		"\u0000\u0000\u00e0\u00e1\u0005&\u0000\u0000\u00e1\u00e2\u0005\r\u0000"+
		"\u0000\u00e2)\u0001\u0000\u0000\u0000\u00e3\u00e4\u0005\b\u0000\u0000"+
		"\u00e4\u00e5\u0005\r\u0000\u0000\u00e5\u00ea\u0005\u0017\u0000\u0000\u00e6"+
		"\u00e7\u0005,\u0000\u0000\u00e7\u00e9\u0003,\u0016\u0000\u00e8\u00e6\u0001"+
		"\u0000\u0000\u0000\u00e9\u00ec\u0001\u0000\u0000\u0000\u00ea\u00e8\u0001"+
		"\u0000\u0000\u0000\u00ea\u00eb\u0001\u0000\u0000\u0000\u00eb+\u0001\u0000"+
		"\u0000\u0000\u00ec\u00ea\u0001\u0000\u0000\u0000\u00ed\u00ee\u0007\u0006"+
		"\u0000\u0000\u00ee\u00f1\u0005\r\u0000\u0000\u00ef\u00f1\u0003.\u0017"+
		"\u0000\u00f0\u00ed\u0001\u0000\u0000\u0000\u00f0\u00ef\u0001\u0000\u0000"+
		"\u0000\u00f1-\u0001\u0000\u0000\u0000\u00f2\u00f9\u0005\u0018\u0000\u0000"+
		"\u00f3\u00f4\u0005,\u0000\u0000\u00f4\u00f8\u0003\f\u0006\u0000\u00f5"+
		"\u00f6\u0005,\u0000\u0000\u00f6\u00f8\u0003 \u0010\u0000\u00f7\u00f3\u0001"+
		"\u0000\u0000\u0000\u00f7\u00f5\u0001\u0000\u0000\u0000\u00f8\u00fb\u0001"+
		"\u0000\u0000\u0000\u00f9\u00f7\u0001\u0000\u0000\u0000\u00f9\u00fa\u0001"+
		"\u0000\u0000\u0000\u00fa/\u0001\u0000\u0000\u0000\u00fb\u00f9\u0001\u0000"+
		"\u0000\u0000\u00fc\u00ff\u0005\u0016\u0000\u0000\u00fd\u00fe\u0005,\u0000"+
		"\u0000\u00fe\u0100\u00032\u0019\u0000\u00ff\u00fd\u0001\u0000\u0000\u0000"+
		"\u00ff\u0100\u0001\u0000\u0000\u0000\u01001\u0001\u0000\u0000\u0000\u0101"+
		"\u0102\u0005\'\u0000\u0000\u0102\u0103\u0005\r\u0000\u0000\u01033\u0001"+
		"\u0000\u0000\u0000!=DLQX\\_bgkoru\u0081\u008a\u0094\u009a\u00a0\u00ad"+
		"\u00b3\u00b9\u00be\u00c2\u00c8\u00cd\u00d1\u00d6\u00dd\u00ea\u00f0\u00f7"+
		"\u00f9\u00ff";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}