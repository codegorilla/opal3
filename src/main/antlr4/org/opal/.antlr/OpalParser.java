// Generated from /Users/matthewcleary/workspace/delta-sprint1/opal3/src/main/antlr4/org/opal/OpalParser.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class OpalParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		AS=1, CAST=2, DELETE=3, FALSE=4, IMPORT=5, NEW=6, PACKAGE=7, THIS=8, TRUE=9, 
		USE=10, VAR=11, BOOL=12, DOUBLE=13, FLOAT=14, FLOAT32=15, FLOAT64=16, 
		INT=17, INT8=18, INT16=19, INT32=20, INT64=21, LONG=22, NULL_T=23, SHORT=24, 
		UINT=25, UINT8=26, UINT16=27, UINT32=28, UINT64=29, VOID=30, AMPERSAND=31, 
		ASTERISK=32, BAR=33, CARAT=34, COMMA=35, COLON=36, DASH=37, EQUAL=38, 
		LESS=39, GREATER=40, PERIOD=41, PLUS=42, SEMICOLON=43, SLASH=44, AMPERSAND_X2=45, 
		BAR_X2=46, EQUAL_X2=47, NOT_EQUAL=48, GREATER_EQUAL=49, LESS_EQUAL=50, 
		GREATER_X2=51, LESS_X2=52, DASH_GREATER=53, L_BRACE=54, L_BRACKET=55, 
		L_PARENTHESIS=56, R_BRACE=57, R_BRACKET=58, R_PARENTHESIS=59, NEWLINE=60, 
		WHITESPACE=61, IDENTIFIER=62, INT_LITERAL=63;
	public static final int
		RULE_translationUnit = 0, RULE_packageDeclaration = 1, RULE_importDeclarations = 2, 
		RULE_importDeclaration = 3, RULE_importQualifiedName = 4, RULE_importName = 5, 
		RULE_useDeclarations = 6, RULE_useDeclaration = 7, RULE_useQualifiedName = 8, 
		RULE_useQualifiedNameTail = 9, RULE_useNameGroup = 10, RULE_useNameWildcard = 11, 
		RULE_otherDeclarations = 12, RULE_variableDeclaration = 13, RULE_initializer = 14, 
		RULE_expression = 15, RULE_assignmentExpression = 16, RULE_logicalOrExpression = 17, 
		RULE_logicalAndExpression = 18, RULE_inclusiveOrExpression = 19, RULE_exclusiveOrExpression = 20, 
		RULE_andExpression = 21, RULE_equalityExpression = 22, RULE_relationalExpression = 23, 
		RULE_shiftExpression = 24, RULE_additiveExpression = 25, RULE_multiplicativeExpression = 26, 
		RULE_unaryExpression = 27, RULE_castExpression = 28, RULE_deleteExpression = 29, 
		RULE_newExpression = 30, RULE_newPlacement = 31, RULE_newInitializer = 32, 
		RULE_postfixExpression = 33, RULE_arraySubscript = 34, RULE_dereferencingMemberAccess = 35, 
		RULE_memberAccess = 36, RULE_routineCall = 37, RULE_routineArguments = 38, 
		RULE_routineArgument = 39, RULE_primaryExpression = 40, RULE_parenthesizedExpression = 41, 
		RULE_literal = 42, RULE_booleanLiteral = 43, RULE_integerLiteral = 44, 
		RULE_typeSpecifier = 45, RULE_type = 46, RULE_pointerGroup = 47, RULE_arrayGroup = 48, 
		RULE_directType = 49, RULE_nominalType = 50, RULE_primitiveType = 51;
	private static String[] makeRuleNames() {
		return new String[] {
			"translationUnit", "packageDeclaration", "importDeclarations", "importDeclaration", 
			"importQualifiedName", "importName", "useDeclarations", "useDeclaration", 
			"useQualifiedName", "useQualifiedNameTail", "useNameGroup", "useNameWildcard", 
			"otherDeclarations", "variableDeclaration", "initializer", "expression", 
			"assignmentExpression", "logicalOrExpression", "logicalAndExpression", 
			"inclusiveOrExpression", "exclusiveOrExpression", "andExpression", "equalityExpression", 
			"relationalExpression", "shiftExpression", "additiveExpression", "multiplicativeExpression", 
			"unaryExpression", "castExpression", "deleteExpression", "newExpression", 
			"newPlacement", "newInitializer", "postfixExpression", "arraySubscript", 
			"dereferencingMemberAccess", "memberAccess", "routineCall", "routineArguments", 
			"routineArgument", "primaryExpression", "parenthesizedExpression", "literal", 
			"booleanLiteral", "integerLiteral", "typeSpecifier", "type", "pointerGroup", 
			"arrayGroup", "directType", "nominalType", "primitiveType"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'as'", "'cast'", "'delete'", "'false'", "'import'", "'new'", "'package'", 
			"'this'", "'true'", "'use'", "'var'", "'bool'", "'double'", "'float'", 
			"'float32'", "'float64'", "'int'", "'int8'", "'int16'", "'int32'", "'int64'", 
			"'long'", "'null_t'", "'short'", "'uint'", "'uint8'", "'uint16'", "'uint32'", 
			"'uint64'", "'void'", "'&'", "'*'", "'|'", "'^'", "','", "':'", "'-'", 
			"'='", "'<'", "'>'", "'.'", "'+'", "';'", "'/'", "'&&'", "'||'", "'=='", 
			"'!='", "'>='", "'<='", "'>>'", "'<<'", "'->'", "'['", "'{'", "'('", 
			"']'", "'}'", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "AS", "CAST", "DELETE", "FALSE", "IMPORT", "NEW", "PACKAGE", "THIS", 
			"TRUE", "USE", "VAR", "BOOL", "DOUBLE", "FLOAT", "FLOAT32", "FLOAT64", 
			"INT", "INT8", "INT16", "INT32", "INT64", "LONG", "NULL_T", "SHORT", 
			"UINT", "UINT8", "UINT16", "UINT32", "UINT64", "VOID", "AMPERSAND", "ASTERISK", 
			"BAR", "CARAT", "COMMA", "COLON", "DASH", "EQUAL", "LESS", "GREATER", 
			"PERIOD", "PLUS", "SEMICOLON", "SLASH", "AMPERSAND_X2", "BAR_X2", "EQUAL_X2", 
			"NOT_EQUAL", "GREATER_EQUAL", "LESS_EQUAL", "GREATER_X2", "LESS_X2", 
			"DASH_GREATER", "L_BRACE", "L_BRACKET", "L_PARENTHESIS", "R_BRACE", "R_BRACKET", 
			"R_PARENTHESIS", "NEWLINE", "WHITESPACE", "IDENTIFIER", "INT_LITERAL"
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
	public String getGrammarFileName() { return "OpalParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public OpalParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TranslationUnitContext extends ParserRuleContext {
		public PackageDeclarationContext packageDeclaration() {
			return getRuleContext(PackageDeclarationContext.class,0);
		}
		public TerminalNode EOF() { return getToken(OpalParser.EOF, 0); }
		public ImportDeclarationsContext importDeclarations() {
			return getRuleContext(ImportDeclarationsContext.class,0);
		}
		public UseDeclarationsContext useDeclarations() {
			return getRuleContext(UseDeclarationsContext.class,0);
		}
		public OtherDeclarationsContext otherDeclarations() {
			return getRuleContext(OtherDeclarationsContext.class,0);
		}
		public TranslationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_translationUnit; }
	}

	public final TranslationUnitContext translationUnit() throws RecognitionException {
		TranslationUnitContext _localctx = new TranslationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_translationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			packageDeclaration();
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPORT) {
				{
				setState(105);
				importDeclarations();
				}
			}

			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==USE) {
				{
				setState(108);
				useDeclarations();
				}
			}

			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(111);
				otherDeclarations();
				}
			}

			setState(114);
			match(EOF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PackageDeclarationContext extends ParserRuleContext {
		public TerminalNode PACKAGE() { return getToken(OpalParser.PACKAGE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(OpalParser.IDENTIFIER, 0); }
		public TerminalNode SEMICOLON() { return getToken(OpalParser.SEMICOLON, 0); }
		public PackageDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageDeclaration; }
	}

	public final PackageDeclarationContext packageDeclaration() throws RecognitionException {
		PackageDeclarationContext _localctx = new PackageDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_packageDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(PACKAGE);
			setState(117);
			match(IDENTIFIER);
			setState(118);
			match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ImportDeclarationsContext extends ParserRuleContext {
		public List<ImportDeclarationContext> importDeclaration() {
			return getRuleContexts(ImportDeclarationContext.class);
		}
		public ImportDeclarationContext importDeclaration(int i) {
			return getRuleContext(ImportDeclarationContext.class,i);
		}
		public ImportDeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclarations; }
	}

	public final ImportDeclarationsContext importDeclarations() throws RecognitionException {
		ImportDeclarationsContext _localctx = new ImportDeclarationsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importDeclarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(120);
				importDeclaration();
				}
				}
				setState(123); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IMPORT );
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

	@SuppressWarnings("CheckReturnValue")
	public static class ImportDeclarationContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(OpalParser.IMPORT, 0); }
		public ImportQualifiedNameContext importQualifiedName() {
			return getRuleContext(ImportQualifiedNameContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(OpalParser.SEMICOLON, 0); }
		public TerminalNode AS() { return getToken(OpalParser.AS, 0); }
		public ImportNameContext importName() {
			return getRuleContext(ImportNameContext.class,0);
		}
		public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclaration; }
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_importDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(IMPORT);
			setState(126);
			importQualifiedName();
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(127);
				match(AS);
				setState(128);
				importName();
				}
			}

			setState(131);
			match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ImportQualifiedNameContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(OpalParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(OpalParser.IDENTIFIER, i);
		}
		public List<TerminalNode> PERIOD() { return getTokens(OpalParser.PERIOD); }
		public TerminalNode PERIOD(int i) {
			return getToken(OpalParser.PERIOD, i);
		}
		public ImportQualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importQualifiedName; }
	}

	public final ImportQualifiedNameContext importQualifiedName() throws RecognitionException {
		ImportQualifiedNameContext _localctx = new ImportQualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_importQualifiedName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(IDENTIFIER);
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PERIOD) {
				{
				{
				setState(134);
				match(PERIOD);
				setState(135);
				match(IDENTIFIER);
				}
				}
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ImportNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(OpalParser.IDENTIFIER, 0); }
		public ImportNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importName; }
	}

	public final ImportNameContext importName() throws RecognitionException {
		ImportNameContext _localctx = new ImportNameContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_importName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(IDENTIFIER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class UseDeclarationsContext extends ParserRuleContext {
		public List<UseDeclarationContext> useDeclaration() {
			return getRuleContexts(UseDeclarationContext.class);
		}
		public UseDeclarationContext useDeclaration(int i) {
			return getRuleContext(UseDeclarationContext.class,i);
		}
		public UseDeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_useDeclarations; }
	}

	public final UseDeclarationsContext useDeclarations() throws RecognitionException {
		UseDeclarationsContext _localctx = new UseDeclarationsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_useDeclarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(143);
				useDeclaration();
				}
				}
				setState(146); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==USE );
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

	@SuppressWarnings("CheckReturnValue")
	public static class UseDeclarationContext extends ParserRuleContext {
		public TerminalNode USE() { return getToken(OpalParser.USE, 0); }
		public UseQualifiedNameContext useQualifiedName() {
			return getRuleContext(UseQualifiedNameContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(OpalParser.SEMICOLON, 0); }
		public UseDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_useDeclaration; }
	}

	public final UseDeclarationContext useDeclaration() throws RecognitionException {
		UseDeclarationContext _localctx = new UseDeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_useDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(USE);
			setState(149);
			useQualifiedName();
			setState(150);
			match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class UseQualifiedNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(OpalParser.IDENTIFIER, 0); }
		public TerminalNode PERIOD() { return getToken(OpalParser.PERIOD, 0); }
		public UseQualifiedNameTailContext useQualifiedNameTail() {
			return getRuleContext(UseQualifiedNameTailContext.class,0);
		}
		public UseQualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_useQualifiedName; }
	}

	public final UseQualifiedNameContext useQualifiedName() throws RecognitionException {
		UseQualifiedNameContext _localctx = new UseQualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_useQualifiedName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(IDENTIFIER);
			setState(153);
			match(PERIOD);
			setState(154);
			useQualifiedNameTail();
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

	@SuppressWarnings("CheckReturnValue")
	public static class UseQualifiedNameTailContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(OpalParser.IDENTIFIER, 0); }
		public TerminalNode PERIOD() { return getToken(OpalParser.PERIOD, 0); }
		public UseQualifiedNameTailContext useQualifiedNameTail() {
			return getRuleContext(UseQualifiedNameTailContext.class,0);
		}
		public UseNameGroupContext useNameGroup() {
			return getRuleContext(UseNameGroupContext.class,0);
		}
		public UseNameWildcardContext useNameWildcard() {
			return getRuleContext(UseNameWildcardContext.class,0);
		}
		public UseQualifiedNameTailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_useQualifiedNameTail; }
	}

	public final UseQualifiedNameTailContext useQualifiedNameTail() throws RecognitionException {
		UseQualifiedNameTailContext _localctx = new UseQualifiedNameTailContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_useQualifiedNameTail);
		int _la;
		try {
			setState(163);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(156);
				match(IDENTIFIER);
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PERIOD) {
					{
					setState(157);
					match(PERIOD);
					setState(158);
					useQualifiedNameTail();
					}
				}

				}
				break;
			case L_BRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(161);
				useNameGroup();
				}
				break;
			case ASTERISK:
				enterOuterAlt(_localctx, 3);
				{
				setState(162);
				useNameWildcard();
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

	@SuppressWarnings("CheckReturnValue")
	public static class UseNameGroupContext extends ParserRuleContext {
		public TerminalNode L_BRACKET() { return getToken(OpalParser.L_BRACKET, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(OpalParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(OpalParser.IDENTIFIER, i);
		}
		public TerminalNode R_BRACKET() { return getToken(OpalParser.R_BRACKET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(OpalParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(OpalParser.COMMA, i);
		}
		public UseNameGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_useNameGroup; }
	}

	public final UseNameGroupContext useNameGroup() throws RecognitionException {
		UseNameGroupContext _localctx = new UseNameGroupContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_useNameGroup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(L_BRACKET);
			setState(166);
			match(IDENTIFIER);
			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(167);
				match(COMMA);
				setState(168);
				match(IDENTIFIER);
				}
				}
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(174);
			match(R_BRACKET);
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

	@SuppressWarnings("CheckReturnValue")
	public static class UseNameWildcardContext extends ParserRuleContext {
		public TerminalNode ASTERISK() { return getToken(OpalParser.ASTERISK, 0); }
		public UseNameWildcardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_useNameWildcard; }
	}

	public final UseNameWildcardContext useNameWildcard() throws RecognitionException {
		UseNameWildcardContext _localctx = new UseNameWildcardContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_useNameWildcard);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(ASTERISK);
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

	@SuppressWarnings("CheckReturnValue")
	public static class OtherDeclarationsContext extends ParserRuleContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public OtherDeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_otherDeclarations; }
	}

	public final OtherDeclarationsContext otherDeclarations() throws RecognitionException {
		OtherDeclarationsContext _localctx = new OtherDeclarationsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_otherDeclarations);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			variableDeclaration();
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

	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclarationContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(OpalParser.VAR, 0); }
		public TerminalNode IDENTIFIER() { return getToken(OpalParser.IDENTIFIER, 0); }
		public TerminalNode SEMICOLON() { return getToken(OpalParser.SEMICOLON, 0); }
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(VAR);
			setState(181);
			match(IDENTIFIER);
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(182);
				typeSpecifier();
				}
			}

			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUAL) {
				{
				setState(185);
				initializer();
				}
			}

			setState(188);
			match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class InitializerContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(OpalParser.EQUAL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public InitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer; }
	}

	public final InitializerContext initializer() throws RecognitionException {
		InitializerContext _localctx = new InitializerContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_initializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			match(EQUAL);
			setState(191);
			expression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			assignmentExpression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentExpressionContext extends ParserRuleContext {
		public List<LogicalOrExpressionContext> logicalOrExpression() {
			return getRuleContexts(LogicalOrExpressionContext.class);
		}
		public LogicalOrExpressionContext logicalOrExpression(int i) {
			return getRuleContext(LogicalOrExpressionContext.class,i);
		}
		public List<TerminalNode> EQUAL() { return getTokens(OpalParser.EQUAL); }
		public TerminalNode EQUAL(int i) {
			return getToken(OpalParser.EQUAL, i);
		}
		public AssignmentExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentExpression; }
	}

	public final AssignmentExpressionContext assignmentExpression() throws RecognitionException {
		AssignmentExpressionContext _localctx = new AssignmentExpressionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_assignmentExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			logicalOrExpression();
			setState(200);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(196);
					match(EQUAL);
					setState(197);
					logicalOrExpression();
					}
					} 
				}
				setState(202);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LogicalOrExpressionContext extends ParserRuleContext {
		public List<LogicalAndExpressionContext> logicalAndExpression() {
			return getRuleContexts(LogicalAndExpressionContext.class);
		}
		public LogicalAndExpressionContext logicalAndExpression(int i) {
			return getRuleContext(LogicalAndExpressionContext.class,i);
		}
		public List<TerminalNode> BAR_X2() { return getTokens(OpalParser.BAR_X2); }
		public TerminalNode BAR_X2(int i) {
			return getToken(OpalParser.BAR_X2, i);
		}
		public LogicalOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOrExpression; }
	}

	public final LogicalOrExpressionContext logicalOrExpression() throws RecognitionException {
		LogicalOrExpressionContext _localctx = new LogicalOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_logicalOrExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			logicalAndExpression();
			setState(208);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(204);
					match(BAR_X2);
					setState(205);
					logicalAndExpression();
					}
					} 
				}
				setState(210);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LogicalAndExpressionContext extends ParserRuleContext {
		public List<InclusiveOrExpressionContext> inclusiveOrExpression() {
			return getRuleContexts(InclusiveOrExpressionContext.class);
		}
		public InclusiveOrExpressionContext inclusiveOrExpression(int i) {
			return getRuleContext(InclusiveOrExpressionContext.class,i);
		}
		public List<TerminalNode> AMPERSAND_X2() { return getTokens(OpalParser.AMPERSAND_X2); }
		public TerminalNode AMPERSAND_X2(int i) {
			return getToken(OpalParser.AMPERSAND_X2, i);
		}
		public LogicalAndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalAndExpression; }
	}

	public final LogicalAndExpressionContext logicalAndExpression() throws RecognitionException {
		LogicalAndExpressionContext _localctx = new LogicalAndExpressionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_logicalAndExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			inclusiveOrExpression();
			setState(216);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(212);
					match(AMPERSAND_X2);
					setState(213);
					inclusiveOrExpression();
					}
					} 
				}
				setState(218);
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

	@SuppressWarnings("CheckReturnValue")
	public static class InclusiveOrExpressionContext extends ParserRuleContext {
		public List<ExclusiveOrExpressionContext> exclusiveOrExpression() {
			return getRuleContexts(ExclusiveOrExpressionContext.class);
		}
		public ExclusiveOrExpressionContext exclusiveOrExpression(int i) {
			return getRuleContext(ExclusiveOrExpressionContext.class,i);
		}
		public List<TerminalNode> BAR() { return getTokens(OpalParser.BAR); }
		public TerminalNode BAR(int i) {
			return getToken(OpalParser.BAR, i);
		}
		public InclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inclusiveOrExpression; }
	}

	public final InclusiveOrExpressionContext inclusiveOrExpression() throws RecognitionException {
		InclusiveOrExpressionContext _localctx = new InclusiveOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_inclusiveOrExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			exclusiveOrExpression();
			setState(224);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(220);
					match(BAR);
					setState(221);
					exclusiveOrExpression();
					}
					} 
				}
				setState(226);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExclusiveOrExpressionContext extends ParserRuleContext {
		public List<AndExpressionContext> andExpression() {
			return getRuleContexts(AndExpressionContext.class);
		}
		public AndExpressionContext andExpression(int i) {
			return getRuleContext(AndExpressionContext.class,i);
		}
		public List<TerminalNode> CARAT() { return getTokens(OpalParser.CARAT); }
		public TerminalNode CARAT(int i) {
			return getToken(OpalParser.CARAT, i);
		}
		public ExclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exclusiveOrExpression; }
	}

	public final ExclusiveOrExpressionContext exclusiveOrExpression() throws RecognitionException {
		ExclusiveOrExpressionContext _localctx = new ExclusiveOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_exclusiveOrExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			andExpression();
			setState(232);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(228);
					match(CARAT);
					setState(229);
					andExpression();
					}
					} 
				}
				setState(234);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AndExpressionContext extends ParserRuleContext {
		public List<EqualityExpressionContext> equalityExpression() {
			return getRuleContexts(EqualityExpressionContext.class);
		}
		public EqualityExpressionContext equalityExpression(int i) {
			return getRuleContext(EqualityExpressionContext.class,i);
		}
		public List<TerminalNode> AMPERSAND() { return getTokens(OpalParser.AMPERSAND); }
		public TerminalNode AMPERSAND(int i) {
			return getToken(OpalParser.AMPERSAND, i);
		}
		public AndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpression; }
	}

	public final AndExpressionContext andExpression() throws RecognitionException {
		AndExpressionContext _localctx = new AndExpressionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_andExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			equalityExpression();
			setState(240);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(236);
					match(AMPERSAND);
					setState(237);
					equalityExpression();
					}
					} 
				}
				setState(242);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class EqualityExpressionContext extends ParserRuleContext {
		public List<RelationalExpressionContext> relationalExpression() {
			return getRuleContexts(RelationalExpressionContext.class);
		}
		public RelationalExpressionContext relationalExpression(int i) {
			return getRuleContext(RelationalExpressionContext.class,i);
		}
		public List<TerminalNode> EQUAL_X2() { return getTokens(OpalParser.EQUAL_X2); }
		public TerminalNode EQUAL_X2(int i) {
			return getToken(OpalParser.EQUAL_X2, i);
		}
		public List<TerminalNode> NOT_EQUAL() { return getTokens(OpalParser.NOT_EQUAL); }
		public TerminalNode NOT_EQUAL(int i) {
			return getToken(OpalParser.NOT_EQUAL, i);
		}
		public EqualityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExpression; }
	}

	public final EqualityExpressionContext equalityExpression() throws RecognitionException {
		EqualityExpressionContext _localctx = new EqualityExpressionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_equalityExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			relationalExpression();
			setState(248);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(244);
					_la = _input.LA(1);
					if ( !(_la==EQUAL_X2 || _la==NOT_EQUAL) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(245);
					relationalExpression();
					}
					} 
				}
				setState(250);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class RelationalExpressionContext extends ParserRuleContext {
		public List<ShiftExpressionContext> shiftExpression() {
			return getRuleContexts(ShiftExpressionContext.class);
		}
		public ShiftExpressionContext shiftExpression(int i) {
			return getRuleContext(ShiftExpressionContext.class,i);
		}
		public List<TerminalNode> GREATER() { return getTokens(OpalParser.GREATER); }
		public TerminalNode GREATER(int i) {
			return getToken(OpalParser.GREATER, i);
		}
		public List<TerminalNode> LESS() { return getTokens(OpalParser.LESS); }
		public TerminalNode LESS(int i) {
			return getToken(OpalParser.LESS, i);
		}
		public List<TerminalNode> GREATER_EQUAL() { return getTokens(OpalParser.GREATER_EQUAL); }
		public TerminalNode GREATER_EQUAL(int i) {
			return getToken(OpalParser.GREATER_EQUAL, i);
		}
		public List<TerminalNode> LESS_EQUAL() { return getTokens(OpalParser.LESS_EQUAL); }
		public TerminalNode LESS_EQUAL(int i) {
			return getToken(OpalParser.LESS_EQUAL, i);
		}
		public RelationalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpression; }
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_relationalExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			shiftExpression();
			setState(256);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(252);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1690499127705600L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(253);
					shiftExpression();
					}
					} 
				}
				setState(258);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ShiftExpressionContext extends ParserRuleContext {
		public List<AdditiveExpressionContext> additiveExpression() {
			return getRuleContexts(AdditiveExpressionContext.class);
		}
		public AdditiveExpressionContext additiveExpression(int i) {
			return getRuleContext(AdditiveExpressionContext.class,i);
		}
		public List<TerminalNode> GREATER_X2() { return getTokens(OpalParser.GREATER_X2); }
		public TerminalNode GREATER_X2(int i) {
			return getToken(OpalParser.GREATER_X2, i);
		}
		public List<TerminalNode> LESS_X2() { return getTokens(OpalParser.LESS_X2); }
		public TerminalNode LESS_X2(int i) {
			return getToken(OpalParser.LESS_X2, i);
		}
		public ShiftExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shiftExpression; }
	}

	public final ShiftExpressionContext shiftExpression() throws RecognitionException {
		ShiftExpressionContext _localctx = new ShiftExpressionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_shiftExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			additiveExpression();
			setState(264);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(260);
					_la = _input.LA(1);
					if ( !(_la==GREATER_X2 || _la==LESS_X2) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(261);
					additiveExpression();
					}
					} 
				}
				setState(266);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AdditiveExpressionContext extends ParserRuleContext {
		public List<MultiplicativeExpressionContext> multiplicativeExpression() {
			return getRuleContexts(MultiplicativeExpressionContext.class);
		}
		public MultiplicativeExpressionContext multiplicativeExpression(int i) {
			return getRuleContext(MultiplicativeExpressionContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(OpalParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(OpalParser.PLUS, i);
		}
		public List<TerminalNode> DASH() { return getTokens(OpalParser.DASH); }
		public TerminalNode DASH(int i) {
			return getToken(OpalParser.DASH, i);
		}
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_additiveExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			multiplicativeExpression();
			setState(272);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(268);
					_la = _input.LA(1);
					if ( !(_la==DASH || _la==PLUS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(269);
					multiplicativeExpression();
					}
					} 
				}
				setState(274);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public List<UnaryExpressionContext> unaryExpression() {
			return getRuleContexts(UnaryExpressionContext.class);
		}
		public UnaryExpressionContext unaryExpression(int i) {
			return getRuleContext(UnaryExpressionContext.class,i);
		}
		public List<TerminalNode> ASTERISK() { return getTokens(OpalParser.ASTERISK); }
		public TerminalNode ASTERISK(int i) {
			return getToken(OpalParser.ASTERISK, i);
		}
		public List<TerminalNode> SLASH() { return getTokens(OpalParser.SLASH); }
		public TerminalNode SLASH(int i) {
			return getToken(OpalParser.SLASH, i);
		}
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_multiplicativeExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			unaryExpression();
			setState(280);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(276);
					_la = _input.LA(1);
					if ( !(_la==ASTERISK || _la==SLASH) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(277);
					unaryExpression();
					}
					} 
				}
				setState(282);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class UnaryExpressionContext extends ParserRuleContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode DASH() { return getToken(OpalParser.DASH, 0); }
		public TerminalNode ASTERISK() { return getToken(OpalParser.ASTERISK, 0); }
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public DeleteExpressionContext deleteExpression() {
			return getRuleContext(DeleteExpressionContext.class,0);
		}
		public NewExpressionContext newExpression() {
			return getRuleContext(NewExpressionContext.class,0);
		}
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_unaryExpression);
		int _la;
		try {
			setState(289);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASTERISK:
			case DASH:
				enterOuterAlt(_localctx, 1);
				{
				setState(283);
				_la = _input.LA(1);
				if ( !(_la==ASTERISK || _la==DASH) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(284);
				unaryExpression();
				}
				break;
			case CAST:
				enterOuterAlt(_localctx, 2);
				{
				setState(285);
				castExpression();
				}
				break;
			case DELETE:
				enterOuterAlt(_localctx, 3);
				{
				setState(286);
				deleteExpression();
				}
				break;
			case NEW:
				enterOuterAlt(_localctx, 4);
				{
				setState(287);
				newExpression();
				}
				break;
			case FALSE:
			case THIS:
			case TRUE:
			case L_BRACE:
			case L_PARENTHESIS:
			case IDENTIFIER:
			case INT_LITERAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(288);
				postfixExpression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class CastExpressionContext extends ParserRuleContext {
		public TerminalNode CAST() { return getToken(OpalParser.CAST, 0); }
		public TerminalNode LESS() { return getToken(OpalParser.LESS, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode GREATER() { return getToken(OpalParser.GREATER, 0); }
		public CastExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castExpression; }
	}

	public final CastExpressionContext castExpression() throws RecognitionException {
		CastExpressionContext _localctx = new CastExpressionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_castExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			match(CAST);
			setState(292);
			match(LESS);
			setState(293);
			type();
			setState(294);
			match(GREATER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeleteExpressionContext extends ParserRuleContext {
		public TerminalNode DELETE() { return getToken(OpalParser.DELETE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode L_BRACE() { return getToken(OpalParser.L_BRACE, 0); }
		public TerminalNode R_BRACE() { return getToken(OpalParser.R_BRACE, 0); }
		public DeleteExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deleteExpression; }
	}

	public final DeleteExpressionContext deleteExpression() throws RecognitionException {
		DeleteExpressionContext _localctx = new DeleteExpressionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_deleteExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			match(DELETE);
			setState(299);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(297);
				match(L_BRACE);
				setState(298);
				match(R_BRACE);
				}
				break;
			}
			setState(301);
			expression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class NewExpressionContext extends ParserRuleContext {
		public TerminalNode NEW() { return getToken(OpalParser.NEW, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public NewPlacementContext newPlacement() {
			return getRuleContext(NewPlacementContext.class,0);
		}
		public NewInitializerContext newInitializer() {
			return getRuleContext(NewInitializerContext.class,0);
		}
		public NewExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newExpression; }
	}

	public final NewExpressionContext newExpression() throws RecognitionException {
		NewExpressionContext _localctx = new NewExpressionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_newExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			match(NEW);
			setState(304);
			type();
			setState(306);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==L_BRACE) {
				{
				setState(305);
				newPlacement();
				}
			}

			setState(309);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==L_PARENTHESIS) {
				{
				setState(308);
				newInitializer();
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

	@SuppressWarnings("CheckReturnValue")
	public static class NewPlacementContext extends ParserRuleContext {
		public TerminalNode L_BRACE() { return getToken(OpalParser.L_BRACE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode R_BRACE() { return getToken(OpalParser.R_BRACE, 0); }
		public NewPlacementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newPlacement; }
	}

	public final NewPlacementContext newPlacement() throws RecognitionException {
		NewPlacementContext _localctx = new NewPlacementContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_newPlacement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			match(L_BRACE);
			setState(312);
			expression();
			setState(313);
			match(R_BRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class NewInitializerContext extends ParserRuleContext {
		public TerminalNode L_PARENTHESIS() { return getToken(OpalParser.L_PARENTHESIS, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode R_PARENTHESIS() { return getToken(OpalParser.R_PARENTHESIS, 0); }
		public List<TerminalNode> COMMA() { return getTokens(OpalParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(OpalParser.COMMA, i);
		}
		public NewInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newInitializer; }
	}

	public final NewInitializerContext newInitializer() throws RecognitionException {
		NewInitializerContext _localctx = new NewInitializerContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_newInitializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			match(L_PARENTHESIS);
			setState(316);
			expression();
			setState(321);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(317);
				match(COMMA);
				setState(318);
				expression();
				}
				}
				setState(323);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(324);
			match(R_PARENTHESIS);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PostfixExpressionContext extends ParserRuleContext {
		public ArraySubscriptContext arraySubscript() {
			return getRuleContext(ArraySubscriptContext.class,0);
		}
		public DereferencingMemberAccessContext dereferencingMemberAccess() {
			return getRuleContext(DereferencingMemberAccessContext.class,0);
		}
		public MemberAccessContext memberAccess() {
			return getRuleContext(MemberAccessContext.class,0);
		}
		public RoutineCallContext routineCall() {
			return getRuleContext(RoutineCallContext.class,0);
		}
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public PostfixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixExpression; }
	}

	public final PostfixExpressionContext postfixExpression() throws RecognitionException {
		PostfixExpressionContext _localctx = new PostfixExpressionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_postfixExpression);
		try {
			setState(331);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(326);
				arraySubscript();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(327);
				dereferencingMemberAccess();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(328);
				memberAccess();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(329);
				routineCall();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(330);
				primaryExpression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArraySubscriptContext extends ParserRuleContext {
		public TerminalNode L_BRACE() { return getToken(OpalParser.L_BRACE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode R_BRACE() { return getToken(OpalParser.R_BRACE, 0); }
		public ArraySubscriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arraySubscript; }
	}

	public final ArraySubscriptContext arraySubscript() throws RecognitionException {
		ArraySubscriptContext _localctx = new ArraySubscriptContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_arraySubscript);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			match(L_BRACE);
			setState(334);
			expression();
			setState(335);
			match(R_BRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DereferencingMemberAccessContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(OpalParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(OpalParser.IDENTIFIER, i);
		}
		public TerminalNode DASH_GREATER() { return getToken(OpalParser.DASH_GREATER, 0); }
		public DereferencingMemberAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dereferencingMemberAccess; }
	}

	public final DereferencingMemberAccessContext dereferencingMemberAccess() throws RecognitionException {
		DereferencingMemberAccessContext _localctx = new DereferencingMemberAccessContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_dereferencingMemberAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			match(IDENTIFIER);
			setState(338);
			match(DASH_GREATER);
			setState(339);
			match(IDENTIFIER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MemberAccessContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(OpalParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(OpalParser.IDENTIFIER, i);
		}
		public TerminalNode PERIOD() { return getToken(OpalParser.PERIOD, 0); }
		public MemberAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberAccess; }
	}

	public final MemberAccessContext memberAccess() throws RecognitionException {
		MemberAccessContext _localctx = new MemberAccessContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_memberAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			match(IDENTIFIER);
			setState(342);
			match(PERIOD);
			setState(343);
			match(IDENTIFIER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class RoutineCallContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(OpalParser.IDENTIFIER, 0); }
		public RoutineArgumentsContext routineArguments() {
			return getRuleContext(RoutineArgumentsContext.class,0);
		}
		public RoutineCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_routineCall; }
	}

	public final RoutineCallContext routineCall() throws RecognitionException {
		RoutineCallContext _localctx = new RoutineCallContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_routineCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			match(IDENTIFIER);
			setState(346);
			routineArguments();
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

	@SuppressWarnings("CheckReturnValue")
	public static class RoutineArgumentsContext extends ParserRuleContext {
		public TerminalNode L_PARENTHESIS() { return getToken(OpalParser.L_PARENTHESIS, 0); }
		public List<RoutineArgumentContext> routineArgument() {
			return getRuleContexts(RoutineArgumentContext.class);
		}
		public RoutineArgumentContext routineArgument(int i) {
			return getRuleContext(RoutineArgumentContext.class,i);
		}
		public TerminalNode R_PARENTHESIS() { return getToken(OpalParser.R_PARENTHESIS, 0); }
		public List<TerminalNode> COMMA() { return getTokens(OpalParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(OpalParser.COMMA, i);
		}
		public RoutineArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_routineArguments; }
	}

	public final RoutineArgumentsContext routineArguments() throws RecognitionException {
		RoutineArgumentsContext _localctx = new RoutineArgumentsContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_routineArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			match(L_PARENTHESIS);
			setState(349);
			routineArgument();
			setState(354);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(350);
				match(COMMA);
				setState(351);
				routineArgument();
				}
				}
				setState(356);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(357);
			match(R_PARENTHESIS);
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

	@SuppressWarnings("CheckReturnValue")
	public static class RoutineArgumentContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public RoutineArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_routineArgument; }
	}

	public final RoutineArgumentContext routineArgument() throws RecognitionException {
		RoutineArgumentContext _localctx = new RoutineArgumentContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_routineArgument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			expression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryExpressionContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(OpalParser.IDENTIFIER, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ParenthesizedExpressionContext parenthesizedExpression() {
			return getRuleContext(ParenthesizedExpressionContext.class,0);
		}
		public TerminalNode THIS() { return getToken(OpalParser.THIS, 0); }
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_primaryExpression);
		try {
			setState(365);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(361);
				match(IDENTIFIER);
				}
				break;
			case FALSE:
			case TRUE:
			case INT_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(362);
				literal();
				}
				break;
			case L_PARENTHESIS:
				enterOuterAlt(_localctx, 3);
				{
				setState(363);
				parenthesizedExpression();
				}
				break;
			case THIS:
				enterOuterAlt(_localctx, 4);
				{
				setState(364);
				match(THIS);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParenthesizedExpressionContext extends ParserRuleContext {
		public TerminalNode L_PARENTHESIS() { return getToken(OpalParser.L_PARENTHESIS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode R_PARENTHESIS() { return getToken(OpalParser.R_PARENTHESIS, 0); }
		public ParenthesizedExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parenthesizedExpression; }
	}

	public final ParenthesizedExpressionContext parenthesizedExpression() throws RecognitionException {
		ParenthesizedExpressionContext _localctx = new ParenthesizedExpressionContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_parenthesizedExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			match(L_PARENTHESIS);
			setState(368);
			expression();
			setState(369);
			match(R_PARENTHESIS);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LiteralContext extends ParserRuleContext {
		public BooleanLiteralContext booleanLiteral() {
			return getRuleContext(BooleanLiteralContext.class,0);
		}
		public IntegerLiteralContext integerLiteral() {
			return getRuleContext(IntegerLiteralContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_literal);
		try {
			setState(373);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FALSE:
			case TRUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(371);
				booleanLiteral();
				}
				break;
			case INT_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(372);
				integerLiteral();
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

	@SuppressWarnings("CheckReturnValue")
	public static class BooleanLiteralContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(OpalParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(OpalParser.FALSE, 0); }
		public BooleanLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanLiteral; }
	}

	public final BooleanLiteralContext booleanLiteral() throws RecognitionException {
		BooleanLiteralContext _localctx = new BooleanLiteralContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_booleanLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			_la = _input.LA(1);
			if ( !(_la==FALSE || _la==TRUE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class IntegerLiteralContext extends ParserRuleContext {
		public TerminalNode INT_LITERAL() { return getToken(OpalParser.INT_LITERAL, 0); }
		public IntegerLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerLiteral; }
	}

	public final IntegerLiteralContext integerLiteral() throws RecognitionException {
		IntegerLiteralContext _localctx = new IntegerLiteralContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_integerLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			match(INT_LITERAL);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeSpecifierContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(OpalParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSpecifier; }
	}

	public final TypeSpecifierContext typeSpecifier() throws RecognitionException {
		TypeSpecifierContext _localctx = new TypeSpecifierContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_typeSpecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			match(COLON);
			setState(380);
			type();
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public DirectTypeContext directType() {
			return getRuleContext(DirectTypeContext.class,0);
		}
		public PointerGroupContext pointerGroup() {
			return getRuleContext(PointerGroupContext.class,0);
		}
		public ArrayGroupContext arrayGroup() {
			return getRuleContext(ArrayGroupContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASTERISK) {
				{
				setState(382);
				pointerGroup();
				}
			}

			setState(385);
			directType();
			setState(387);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(386);
				arrayGroup();
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

	@SuppressWarnings("CheckReturnValue")
	public static class PointerGroupContext extends ParserRuleContext {
		public List<TerminalNode> ASTERISK() { return getTokens(OpalParser.ASTERISK); }
		public TerminalNode ASTERISK(int i) {
			return getToken(OpalParser.ASTERISK, i);
		}
		public PointerGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointerGroup; }
	}

	public final PointerGroupContext pointerGroup() throws RecognitionException {
		PointerGroupContext _localctx = new PointerGroupContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_pointerGroup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(389);
				match(ASTERISK);
				}
				}
				setState(392); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ASTERISK );
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayGroupContext extends ParserRuleContext {
		public List<TerminalNode> L_BRACE() { return getTokens(OpalParser.L_BRACE); }
		public TerminalNode L_BRACE(int i) {
			return getToken(OpalParser.L_BRACE, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> R_BRACE() { return getTokens(OpalParser.R_BRACE); }
		public TerminalNode R_BRACE(int i) {
			return getToken(OpalParser.R_BRACE, i);
		}
		public ArrayGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayGroup; }
	}

	public final ArrayGroupContext arrayGroup() throws RecognitionException {
		ArrayGroupContext _localctx = new ArrayGroupContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_arrayGroup);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(398); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(394);
					match(L_BRACE);
					setState(395);
					expression();
					setState(396);
					match(R_BRACE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(400); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	@SuppressWarnings("CheckReturnValue")
	public static class DirectTypeContext extends ParserRuleContext {
		public NominalTypeContext nominalType() {
			return getRuleContext(NominalTypeContext.class,0);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public DirectTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directType; }
	}

	public final DirectTypeContext directType() throws RecognitionException {
		DirectTypeContext _localctx = new DirectTypeContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_directType);
		try {
			setState(404);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(402);
				nominalType();
				}
				break;
			case BOOL:
			case DOUBLE:
			case FLOAT:
			case FLOAT32:
			case FLOAT64:
			case INT:
			case INT8:
			case INT16:
			case INT32:
			case INT64:
			case LONG:
			case NULL_T:
			case SHORT:
			case UINT:
			case UINT8:
			case UINT16:
			case UINT32:
			case UINT64:
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(403);
				primitiveType();
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

	@SuppressWarnings("CheckReturnValue")
	public static class NominalTypeContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(OpalParser.IDENTIFIER, 0); }
		public NominalTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nominalType; }
	}

	public final NominalTypeContext nominalType() throws RecognitionException {
		NominalTypeContext _localctx = new NominalTypeContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_nominalType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(406);
			match(IDENTIFIER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PrimitiveTypeContext extends ParserRuleContext {
		public TerminalNode BOOL() { return getToken(OpalParser.BOOL, 0); }
		public TerminalNode DOUBLE() { return getToken(OpalParser.DOUBLE, 0); }
		public TerminalNode FLOAT() { return getToken(OpalParser.FLOAT, 0); }
		public TerminalNode FLOAT32() { return getToken(OpalParser.FLOAT32, 0); }
		public TerminalNode FLOAT64() { return getToken(OpalParser.FLOAT64, 0); }
		public TerminalNode INT() { return getToken(OpalParser.INT, 0); }
		public TerminalNode INT8() { return getToken(OpalParser.INT8, 0); }
		public TerminalNode INT16() { return getToken(OpalParser.INT16, 0); }
		public TerminalNode INT32() { return getToken(OpalParser.INT32, 0); }
		public TerminalNode INT64() { return getToken(OpalParser.INT64, 0); }
		public TerminalNode LONG() { return getToken(OpalParser.LONG, 0); }
		public TerminalNode NULL_T() { return getToken(OpalParser.NULL_T, 0); }
		public TerminalNode SHORT() { return getToken(OpalParser.SHORT, 0); }
		public TerminalNode UINT() { return getToken(OpalParser.UINT, 0); }
		public TerminalNode UINT8() { return getToken(OpalParser.UINT8, 0); }
		public TerminalNode UINT16() { return getToken(OpalParser.UINT16, 0); }
		public TerminalNode UINT32() { return getToken(OpalParser.UINT32, 0); }
		public TerminalNode UINT64() { return getToken(OpalParser.UINT64, 0); }
		public TerminalNode VOID() { return getToken(OpalParser.VOID, 0); }
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 2147479552L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static final String _serializedATN =
		"\u0004\u0001?\u019b\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u0001\u0000\u0001\u0000\u0003\u0000k\b\u0000\u0001"+
		"\u0000\u0003\u0000n\b\u0000\u0001\u0000\u0003\u0000q\b\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0004\u0002z\b\u0002\u000b\u0002\f\u0002{\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0003\u0003\u0082\b\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0005\u0004\u0089\b\u0004\n\u0004\f\u0004"+
		"\u008c\t\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0004\u0006\u0091\b"+
		"\u0006\u000b\u0006\f\u0006\u0092\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0003\t"+
		"\u00a0\b\t\u0001\t\u0001\t\u0003\t\u00a4\b\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0005\n\u00aa\b\n\n\n\f\n\u00ad\t\n\u0001\n\u0001\n\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0003\r\u00b8\b\r\u0001"+
		"\r\u0003\r\u00bb\b\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010"+
		"\u00c7\b\u0010\n\u0010\f\u0010\u00ca\t\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0005\u0011\u00cf\b\u0011\n\u0011\f\u0011\u00d2\t\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0005\u0012\u00d7\b\u0012\n\u0012\f\u0012\u00da"+
		"\t\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u00df\b\u0013"+
		"\n\u0013\f\u0013\u00e2\t\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0005"+
		"\u0014\u00e7\b\u0014\n\u0014\f\u0014\u00ea\t\u0014\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0005\u0015\u00ef\b\u0015\n\u0015\f\u0015\u00f2\t\u0015\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0005\u0016\u00f7\b\u0016\n\u0016\f\u0016"+
		"\u00fa\t\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0005\u0017\u00ff\b"+
		"\u0017\n\u0017\f\u0017\u0102\t\u0017\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0005\u0018\u0107\b\u0018\n\u0018\f\u0018\u010a\t\u0018\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0005\u0019\u010f\b\u0019\n\u0019\f\u0019\u0112\t\u0019"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0005\u001a\u0117\b\u001a\n\u001a"+
		"\f\u001a\u011a\t\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0003\u001b\u0122\b\u001b\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0003\u001d\u012c\b\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0003\u001e\u0133\b\u001e\u0001\u001e\u0003\u001e\u0136\b"+
		"\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001"+
		" \u0001 \u0005 \u0140\b \n \f \u0143\t \u0001 \u0001 \u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0003!\u014c\b!\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"#\u0001#\u0001#\u0001#\u0001$\u0001$\u0001$\u0001$\u0001%\u0001%\u0001"+
		"%\u0001&\u0001&\u0001&\u0001&\u0005&\u0161\b&\n&\f&\u0164\t&\u0001&\u0001"+
		"&\u0001\'\u0001\'\u0001(\u0001(\u0001(\u0001(\u0003(\u016e\b(\u0001)\u0001"+
		")\u0001)\u0001)\u0001*\u0001*\u0003*\u0176\b*\u0001+\u0001+\u0001,\u0001"+
		",\u0001-\u0001-\u0001-\u0001.\u0003.\u0180\b.\u0001.\u0001.\u0003.\u0184"+
		"\b.\u0001/\u0004/\u0187\b/\u000b/\f/\u0188\u00010\u00010\u00010\u0001"+
		"0\u00040\u018f\b0\u000b0\f0\u0190\u00011\u00011\u00031\u0195\b1\u0001"+
		"2\u00012\u00013\u00013\u00013\u0000\u00004\u0000\u0002\u0004\u0006\b\n"+
		"\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.0246"+
		"8:<>@BDFHJLNPRTVXZ\\^`bdf\u0000\b\u0001\u0000/0\u0002\u0000\'(12\u0001"+
		"\u000034\u0002\u0000%%**\u0002\u0000  ,,\u0002\u0000  %%\u0002\u0000\u0004"+
		"\u0004\t\t\u0001\u0000\f\u001e\u0194\u0000h\u0001\u0000\u0000\u0000\u0002"+
		"t\u0001\u0000\u0000\u0000\u0004y\u0001\u0000\u0000\u0000\u0006}\u0001"+
		"\u0000\u0000\u0000\b\u0085\u0001\u0000\u0000\u0000\n\u008d\u0001\u0000"+
		"\u0000\u0000\f\u0090\u0001\u0000\u0000\u0000\u000e\u0094\u0001\u0000\u0000"+
		"\u0000\u0010\u0098\u0001\u0000\u0000\u0000\u0012\u00a3\u0001\u0000\u0000"+
		"\u0000\u0014\u00a5\u0001\u0000\u0000\u0000\u0016\u00b0\u0001\u0000\u0000"+
		"\u0000\u0018\u00b2\u0001\u0000\u0000\u0000\u001a\u00b4\u0001\u0000\u0000"+
		"\u0000\u001c\u00be\u0001\u0000\u0000\u0000\u001e\u00c1\u0001\u0000\u0000"+
		"\u0000 \u00c3\u0001\u0000\u0000\u0000\"\u00cb\u0001\u0000\u0000\u0000"+
		"$\u00d3\u0001\u0000\u0000\u0000&\u00db\u0001\u0000\u0000\u0000(\u00e3"+
		"\u0001\u0000\u0000\u0000*\u00eb\u0001\u0000\u0000\u0000,\u00f3\u0001\u0000"+
		"\u0000\u0000.\u00fb\u0001\u0000\u0000\u00000\u0103\u0001\u0000\u0000\u0000"+
		"2\u010b\u0001\u0000\u0000\u00004\u0113\u0001\u0000\u0000\u00006\u0121"+
		"\u0001\u0000\u0000\u00008\u0123\u0001\u0000\u0000\u0000:\u0128\u0001\u0000"+
		"\u0000\u0000<\u012f\u0001\u0000\u0000\u0000>\u0137\u0001\u0000\u0000\u0000"+
		"@\u013b\u0001\u0000\u0000\u0000B\u014b\u0001\u0000\u0000\u0000D\u014d"+
		"\u0001\u0000\u0000\u0000F\u0151\u0001\u0000\u0000\u0000H\u0155\u0001\u0000"+
		"\u0000\u0000J\u0159\u0001\u0000\u0000\u0000L\u015c\u0001\u0000\u0000\u0000"+
		"N\u0167\u0001\u0000\u0000\u0000P\u016d\u0001\u0000\u0000\u0000R\u016f"+
		"\u0001\u0000\u0000\u0000T\u0175\u0001\u0000\u0000\u0000V\u0177\u0001\u0000"+
		"\u0000\u0000X\u0179\u0001\u0000\u0000\u0000Z\u017b\u0001\u0000\u0000\u0000"+
		"\\\u017f\u0001\u0000\u0000\u0000^\u0186\u0001\u0000\u0000\u0000`\u018e"+
		"\u0001\u0000\u0000\u0000b\u0194\u0001\u0000\u0000\u0000d\u0196\u0001\u0000"+
		"\u0000\u0000f\u0198\u0001\u0000\u0000\u0000hj\u0003\u0002\u0001\u0000"+
		"ik\u0003\u0004\u0002\u0000ji\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000"+
		"\u0000km\u0001\u0000\u0000\u0000ln\u0003\f\u0006\u0000ml\u0001\u0000\u0000"+
		"\u0000mn\u0001\u0000\u0000\u0000np\u0001\u0000\u0000\u0000oq\u0003\u0018"+
		"\f\u0000po\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000qr\u0001\u0000"+
		"\u0000\u0000rs\u0005\u0000\u0000\u0001s\u0001\u0001\u0000\u0000\u0000"+
		"tu\u0005\u0007\u0000\u0000uv\u0005>\u0000\u0000vw\u0005+\u0000\u0000w"+
		"\u0003\u0001\u0000\u0000\u0000xz\u0003\u0006\u0003\u0000yx\u0001\u0000"+
		"\u0000\u0000z{\u0001\u0000\u0000\u0000{y\u0001\u0000\u0000\u0000{|\u0001"+
		"\u0000\u0000\u0000|\u0005\u0001\u0000\u0000\u0000}~\u0005\u0005\u0000"+
		"\u0000~\u0081\u0003\b\u0004\u0000\u007f\u0080\u0005\u0001\u0000\u0000"+
		"\u0080\u0082\u0003\n\u0005\u0000\u0081\u007f\u0001\u0000\u0000\u0000\u0081"+
		"\u0082\u0001\u0000\u0000\u0000\u0082\u0083\u0001\u0000\u0000\u0000\u0083"+
		"\u0084\u0005+\u0000\u0000\u0084\u0007\u0001\u0000\u0000\u0000\u0085\u008a"+
		"\u0005>\u0000\u0000\u0086\u0087\u0005)\u0000\u0000\u0087\u0089\u0005>"+
		"\u0000\u0000\u0088\u0086\u0001\u0000\u0000\u0000\u0089\u008c\u0001\u0000"+
		"\u0000\u0000\u008a\u0088\u0001\u0000\u0000\u0000\u008a\u008b\u0001\u0000"+
		"\u0000\u0000\u008b\t\u0001\u0000\u0000\u0000\u008c\u008a\u0001\u0000\u0000"+
		"\u0000\u008d\u008e\u0005>\u0000\u0000\u008e\u000b\u0001\u0000\u0000\u0000"+
		"\u008f\u0091\u0003\u000e\u0007\u0000\u0090\u008f\u0001\u0000\u0000\u0000"+
		"\u0091\u0092\u0001\u0000\u0000\u0000\u0092\u0090\u0001\u0000\u0000\u0000"+
		"\u0092\u0093\u0001\u0000\u0000\u0000\u0093\r\u0001\u0000\u0000\u0000\u0094"+
		"\u0095\u0005\n\u0000\u0000\u0095\u0096\u0003\u0010\b\u0000\u0096\u0097"+
		"\u0005+\u0000\u0000\u0097\u000f\u0001\u0000\u0000\u0000\u0098\u0099\u0005"+
		">\u0000\u0000\u0099\u009a\u0005)\u0000\u0000\u009a\u009b\u0003\u0012\t"+
		"\u0000\u009b\u0011\u0001\u0000\u0000\u0000\u009c\u009f\u0005>\u0000\u0000"+
		"\u009d\u009e\u0005)\u0000\u0000\u009e\u00a0\u0003\u0012\t\u0000\u009f"+
		"\u009d\u0001\u0000\u0000\u0000\u009f\u00a0\u0001\u0000\u0000\u0000\u00a0"+
		"\u00a4\u0001\u0000\u0000\u0000\u00a1\u00a4\u0003\u0014\n\u0000\u00a2\u00a4"+
		"\u0003\u0016\u000b\u0000\u00a3\u009c\u0001\u0000\u0000\u0000\u00a3\u00a1"+
		"\u0001\u0000\u0000\u0000\u00a3\u00a2\u0001\u0000\u0000\u0000\u00a4\u0013"+
		"\u0001\u0000\u0000\u0000\u00a5\u00a6\u00057\u0000\u0000\u00a6\u00ab\u0005"+
		">\u0000\u0000\u00a7\u00a8\u0005#\u0000\u0000\u00a8\u00aa\u0005>\u0000"+
		"\u0000\u00a9\u00a7\u0001\u0000\u0000\u0000\u00aa\u00ad\u0001\u0000\u0000"+
		"\u0000\u00ab\u00a9\u0001\u0000\u0000\u0000\u00ab\u00ac\u0001\u0000\u0000"+
		"\u0000\u00ac\u00ae\u0001\u0000\u0000\u0000\u00ad\u00ab\u0001\u0000\u0000"+
		"\u0000\u00ae\u00af\u0005:\u0000\u0000\u00af\u0015\u0001\u0000\u0000\u0000"+
		"\u00b0\u00b1\u0005 \u0000\u0000\u00b1\u0017\u0001\u0000\u0000\u0000\u00b2"+
		"\u00b3\u0003\u001a\r\u0000\u00b3\u0019\u0001\u0000\u0000\u0000\u00b4\u00b5"+
		"\u0005\u000b\u0000\u0000\u00b5\u00b7\u0005>\u0000\u0000\u00b6\u00b8\u0003"+
		"Z-\u0000\u00b7\u00b6\u0001\u0000\u0000\u0000\u00b7\u00b8\u0001\u0000\u0000"+
		"\u0000\u00b8\u00ba\u0001\u0000\u0000\u0000\u00b9\u00bb\u0003\u001c\u000e"+
		"\u0000\u00ba\u00b9\u0001\u0000\u0000\u0000\u00ba\u00bb\u0001\u0000\u0000"+
		"\u0000\u00bb\u00bc\u0001\u0000\u0000\u0000\u00bc\u00bd\u0005+\u0000\u0000"+
		"\u00bd\u001b\u0001\u0000\u0000\u0000\u00be\u00bf\u0005&\u0000\u0000\u00bf"+
		"\u00c0\u0003\u001e\u000f\u0000\u00c0\u001d\u0001\u0000\u0000\u0000\u00c1"+
		"\u00c2\u0003 \u0010\u0000\u00c2\u001f\u0001\u0000\u0000\u0000\u00c3\u00c8"+
		"\u0003\"\u0011\u0000\u00c4\u00c5\u0005&\u0000\u0000\u00c5\u00c7\u0003"+
		"\"\u0011\u0000\u00c6\u00c4\u0001\u0000\u0000\u0000\u00c7\u00ca\u0001\u0000"+
		"\u0000\u0000\u00c8\u00c6\u0001\u0000\u0000\u0000\u00c8\u00c9\u0001\u0000"+
		"\u0000\u0000\u00c9!\u0001\u0000\u0000\u0000\u00ca\u00c8\u0001\u0000\u0000"+
		"\u0000\u00cb\u00d0\u0003$\u0012\u0000\u00cc\u00cd\u0005.\u0000\u0000\u00cd"+
		"\u00cf\u0003$\u0012\u0000\u00ce\u00cc\u0001\u0000\u0000\u0000\u00cf\u00d2"+
		"\u0001\u0000\u0000\u0000\u00d0\u00ce\u0001\u0000\u0000\u0000\u00d0\u00d1"+
		"\u0001\u0000\u0000\u0000\u00d1#\u0001\u0000\u0000\u0000\u00d2\u00d0\u0001"+
		"\u0000\u0000\u0000\u00d3\u00d8\u0003&\u0013\u0000\u00d4\u00d5\u0005-\u0000"+
		"\u0000\u00d5\u00d7\u0003&\u0013\u0000\u00d6\u00d4\u0001\u0000\u0000\u0000"+
		"\u00d7\u00da\u0001\u0000\u0000\u0000\u00d8\u00d6\u0001\u0000\u0000\u0000"+
		"\u00d8\u00d9\u0001\u0000\u0000\u0000\u00d9%\u0001\u0000\u0000\u0000\u00da"+
		"\u00d8\u0001\u0000\u0000\u0000\u00db\u00e0\u0003(\u0014\u0000\u00dc\u00dd"+
		"\u0005!\u0000\u0000\u00dd\u00df\u0003(\u0014\u0000\u00de\u00dc\u0001\u0000"+
		"\u0000\u0000\u00df\u00e2\u0001\u0000\u0000\u0000\u00e0\u00de\u0001\u0000"+
		"\u0000\u0000\u00e0\u00e1\u0001\u0000\u0000\u0000\u00e1\'\u0001\u0000\u0000"+
		"\u0000\u00e2\u00e0\u0001\u0000\u0000\u0000\u00e3\u00e8\u0003*\u0015\u0000"+
		"\u00e4\u00e5\u0005\"\u0000\u0000\u00e5\u00e7\u0003*\u0015\u0000\u00e6"+
		"\u00e4\u0001\u0000\u0000\u0000\u00e7\u00ea\u0001\u0000\u0000\u0000\u00e8"+
		"\u00e6\u0001\u0000\u0000\u0000\u00e8\u00e9\u0001\u0000\u0000\u0000\u00e9"+
		")\u0001\u0000\u0000\u0000\u00ea\u00e8\u0001\u0000\u0000\u0000\u00eb\u00f0"+
		"\u0003,\u0016\u0000\u00ec\u00ed\u0005\u001f\u0000\u0000\u00ed\u00ef\u0003"+
		",\u0016\u0000\u00ee\u00ec\u0001\u0000\u0000\u0000\u00ef\u00f2\u0001\u0000"+
		"\u0000\u0000\u00f0\u00ee\u0001\u0000\u0000\u0000\u00f0\u00f1\u0001\u0000"+
		"\u0000\u0000\u00f1+\u0001\u0000\u0000\u0000\u00f2\u00f0\u0001\u0000\u0000"+
		"\u0000\u00f3\u00f8\u0003.\u0017\u0000\u00f4\u00f5\u0007\u0000\u0000\u0000"+
		"\u00f5\u00f7\u0003.\u0017\u0000\u00f6\u00f4\u0001\u0000\u0000\u0000\u00f7"+
		"\u00fa\u0001\u0000\u0000\u0000\u00f8\u00f6\u0001\u0000\u0000\u0000\u00f8"+
		"\u00f9\u0001\u0000\u0000\u0000\u00f9-\u0001\u0000\u0000\u0000\u00fa\u00f8"+
		"\u0001\u0000\u0000\u0000\u00fb\u0100\u00030\u0018\u0000\u00fc\u00fd\u0007"+
		"\u0001\u0000\u0000\u00fd\u00ff\u00030\u0018\u0000\u00fe\u00fc\u0001\u0000"+
		"\u0000\u0000\u00ff\u0102\u0001\u0000\u0000\u0000\u0100\u00fe\u0001\u0000"+
		"\u0000\u0000\u0100\u0101\u0001\u0000\u0000\u0000\u0101/\u0001\u0000\u0000"+
		"\u0000\u0102\u0100\u0001\u0000\u0000\u0000\u0103\u0108\u00032\u0019\u0000"+
		"\u0104\u0105\u0007\u0002\u0000\u0000\u0105\u0107\u00032\u0019\u0000\u0106"+
		"\u0104\u0001\u0000\u0000\u0000\u0107\u010a\u0001\u0000\u0000\u0000\u0108"+
		"\u0106\u0001\u0000\u0000\u0000\u0108\u0109\u0001\u0000\u0000\u0000\u0109"+
		"1\u0001\u0000\u0000\u0000\u010a\u0108\u0001\u0000\u0000\u0000\u010b\u0110"+
		"\u00034\u001a\u0000\u010c\u010d\u0007\u0003\u0000\u0000\u010d\u010f\u0003"+
		"4\u001a\u0000\u010e\u010c\u0001\u0000\u0000\u0000\u010f\u0112\u0001\u0000"+
		"\u0000\u0000\u0110\u010e\u0001\u0000\u0000\u0000\u0110\u0111\u0001\u0000"+
		"\u0000\u0000\u01113\u0001\u0000\u0000\u0000\u0112\u0110\u0001\u0000\u0000"+
		"\u0000\u0113\u0118\u00036\u001b\u0000\u0114\u0115\u0007\u0004\u0000\u0000"+
		"\u0115\u0117\u00036\u001b\u0000\u0116\u0114\u0001\u0000\u0000\u0000\u0117"+
		"\u011a\u0001\u0000\u0000\u0000\u0118\u0116\u0001\u0000\u0000\u0000\u0118"+
		"\u0119\u0001\u0000\u0000\u0000\u01195\u0001\u0000\u0000\u0000\u011a\u0118"+
		"\u0001\u0000\u0000\u0000\u011b\u011c\u0007\u0005\u0000\u0000\u011c\u0122"+
		"\u00036\u001b\u0000\u011d\u0122\u00038\u001c\u0000\u011e\u0122\u0003:"+
		"\u001d\u0000\u011f\u0122\u0003<\u001e\u0000\u0120\u0122\u0003B!\u0000"+
		"\u0121\u011b\u0001\u0000\u0000\u0000\u0121\u011d\u0001\u0000\u0000\u0000"+
		"\u0121\u011e\u0001\u0000\u0000\u0000\u0121\u011f\u0001\u0000\u0000\u0000"+
		"\u0121\u0120\u0001\u0000\u0000\u0000\u01227\u0001\u0000\u0000\u0000\u0123"+
		"\u0124\u0005\u0002\u0000\u0000\u0124\u0125\u0005\'\u0000\u0000\u0125\u0126"+
		"\u0003\\.\u0000\u0126\u0127\u0005(\u0000\u0000\u01279\u0001\u0000\u0000"+
		"\u0000\u0128\u012b\u0005\u0003\u0000\u0000\u0129\u012a\u00056\u0000\u0000"+
		"\u012a\u012c\u00059\u0000\u0000\u012b\u0129\u0001\u0000\u0000\u0000\u012b"+
		"\u012c\u0001\u0000\u0000\u0000\u012c\u012d\u0001\u0000\u0000\u0000\u012d"+
		"\u012e\u0003\u001e\u000f\u0000\u012e;\u0001\u0000\u0000\u0000\u012f\u0130"+
		"\u0005\u0006\u0000\u0000\u0130\u0132\u0003\\.\u0000\u0131\u0133\u0003"+
		">\u001f\u0000\u0132\u0131\u0001\u0000\u0000\u0000\u0132\u0133\u0001\u0000"+
		"\u0000\u0000\u0133\u0135\u0001\u0000\u0000\u0000\u0134\u0136\u0003@ \u0000"+
		"\u0135\u0134\u0001\u0000\u0000\u0000\u0135\u0136\u0001\u0000\u0000\u0000"+
		"\u0136=\u0001\u0000\u0000\u0000\u0137\u0138\u00056\u0000\u0000\u0138\u0139"+
		"\u0003\u001e\u000f\u0000\u0139\u013a\u00059\u0000\u0000\u013a?\u0001\u0000"+
		"\u0000\u0000\u013b\u013c\u00058\u0000\u0000\u013c\u0141\u0003\u001e\u000f"+
		"\u0000\u013d\u013e\u0005#\u0000\u0000\u013e\u0140\u0003\u001e\u000f\u0000"+
		"\u013f\u013d\u0001\u0000\u0000\u0000\u0140\u0143\u0001\u0000\u0000\u0000"+
		"\u0141\u013f\u0001\u0000\u0000\u0000\u0141\u0142\u0001\u0000\u0000\u0000"+
		"\u0142\u0144\u0001\u0000\u0000\u0000\u0143\u0141\u0001\u0000\u0000\u0000"+
		"\u0144\u0145\u0005;\u0000\u0000\u0145A\u0001\u0000\u0000\u0000\u0146\u014c"+
		"\u0003D\"\u0000\u0147\u014c\u0003F#\u0000\u0148\u014c\u0003H$\u0000\u0149"+
		"\u014c\u0003J%\u0000\u014a\u014c\u0003P(\u0000\u014b\u0146\u0001\u0000"+
		"\u0000\u0000\u014b\u0147\u0001\u0000\u0000\u0000\u014b\u0148\u0001\u0000"+
		"\u0000\u0000\u014b\u0149\u0001\u0000\u0000\u0000\u014b\u014a\u0001\u0000"+
		"\u0000\u0000\u014cC\u0001\u0000\u0000\u0000\u014d\u014e\u00056\u0000\u0000"+
		"\u014e\u014f\u0003\u001e\u000f\u0000\u014f\u0150\u00059\u0000\u0000\u0150"+
		"E\u0001\u0000\u0000\u0000\u0151\u0152\u0005>\u0000\u0000\u0152\u0153\u0005"+
		"5\u0000\u0000\u0153\u0154\u0005>\u0000\u0000\u0154G\u0001\u0000\u0000"+
		"\u0000\u0155\u0156\u0005>\u0000\u0000\u0156\u0157\u0005)\u0000\u0000\u0157"+
		"\u0158\u0005>\u0000\u0000\u0158I\u0001\u0000\u0000\u0000\u0159\u015a\u0005"+
		">\u0000\u0000\u015a\u015b\u0003L&\u0000\u015bK\u0001\u0000\u0000\u0000"+
		"\u015c\u015d\u00058\u0000\u0000\u015d\u0162\u0003N\'\u0000\u015e\u015f"+
		"\u0005#\u0000\u0000\u015f\u0161\u0003N\'\u0000\u0160\u015e\u0001\u0000"+
		"\u0000\u0000\u0161\u0164\u0001\u0000\u0000\u0000\u0162\u0160\u0001\u0000"+
		"\u0000\u0000\u0162\u0163\u0001\u0000\u0000\u0000\u0163\u0165\u0001\u0000"+
		"\u0000\u0000\u0164\u0162\u0001\u0000\u0000\u0000\u0165\u0166\u0005;\u0000"+
		"\u0000\u0166M\u0001\u0000\u0000\u0000\u0167\u0168\u0003\u001e\u000f\u0000"+
		"\u0168O\u0001\u0000\u0000\u0000\u0169\u016e\u0005>\u0000\u0000\u016a\u016e"+
		"\u0003T*\u0000\u016b\u016e\u0003R)\u0000\u016c\u016e\u0005\b\u0000\u0000"+
		"\u016d\u0169\u0001\u0000\u0000\u0000\u016d\u016a\u0001\u0000\u0000\u0000"+
		"\u016d\u016b\u0001\u0000\u0000\u0000\u016d\u016c\u0001\u0000\u0000\u0000"+
		"\u016eQ\u0001\u0000\u0000\u0000\u016f\u0170\u00058\u0000\u0000\u0170\u0171"+
		"\u0003\u001e\u000f\u0000\u0171\u0172\u0005;\u0000\u0000\u0172S\u0001\u0000"+
		"\u0000\u0000\u0173\u0176\u0003V+\u0000\u0174\u0176\u0003X,\u0000\u0175"+
		"\u0173\u0001\u0000\u0000\u0000\u0175\u0174\u0001\u0000\u0000\u0000\u0176"+
		"U\u0001\u0000\u0000\u0000\u0177\u0178\u0007\u0006\u0000\u0000\u0178W\u0001"+
		"\u0000\u0000\u0000\u0179\u017a\u0005?\u0000\u0000\u017aY\u0001\u0000\u0000"+
		"\u0000\u017b\u017c\u0005$\u0000\u0000\u017c\u017d\u0003\\.\u0000\u017d"+
		"[\u0001\u0000\u0000\u0000\u017e\u0180\u0003^/\u0000\u017f\u017e\u0001"+
		"\u0000\u0000\u0000\u017f\u0180\u0001\u0000\u0000\u0000\u0180\u0181\u0001"+
		"\u0000\u0000\u0000\u0181\u0183\u0003b1\u0000\u0182\u0184\u0003`0\u0000"+
		"\u0183\u0182\u0001\u0000\u0000\u0000\u0183\u0184\u0001\u0000\u0000\u0000"+
		"\u0184]\u0001\u0000\u0000\u0000\u0185\u0187\u0005 \u0000\u0000\u0186\u0185"+
		"\u0001\u0000\u0000\u0000\u0187\u0188\u0001\u0000\u0000\u0000\u0188\u0186"+
		"\u0001\u0000\u0000\u0000\u0188\u0189\u0001\u0000\u0000\u0000\u0189_\u0001"+
		"\u0000\u0000\u0000\u018a\u018b\u00056\u0000\u0000\u018b\u018c\u0003\u001e"+
		"\u000f\u0000\u018c\u018d\u00059\u0000\u0000\u018d\u018f\u0001\u0000\u0000"+
		"\u0000\u018e\u018a\u0001\u0000\u0000\u0000\u018f\u0190\u0001\u0000\u0000"+
		"\u0000\u0190\u018e\u0001\u0000\u0000\u0000\u0190\u0191\u0001\u0000\u0000"+
		"\u0000\u0191a\u0001\u0000\u0000\u0000\u0192\u0195\u0003d2\u0000\u0193"+
		"\u0195\u0003f3\u0000\u0194\u0192\u0001\u0000\u0000\u0000\u0194\u0193\u0001"+
		"\u0000\u0000\u0000\u0195c\u0001\u0000\u0000\u0000\u0196\u0197\u0005>\u0000"+
		"\u0000\u0197e\u0001\u0000\u0000\u0000\u0198\u0199\u0007\u0007\u0000\u0000"+
		"\u0199g\u0001\u0000\u0000\u0000%jmp{\u0081\u008a\u0092\u009f\u00a3\u00ab"+
		"\u00b7\u00ba\u00c8\u00d0\u00d8\u00e0\u00e8\u00f0\u00f8\u0100\u0108\u0110"+
		"\u0118\u0121\u012b\u0132\u0135\u0141\u014b\u0162\u016d\u0175\u017f\u0183"+
		"\u0188\u0190\u0194";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}