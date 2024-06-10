// Generated from C:/programacao/compilador/Compilador/src/antlr/glc.g4 by ANTLR 4.13.1
package antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class glcParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, ID=59, NUM_INT=60, 
		NUM_DEC=61, CARACTERE=62, BOOLEANO=63, TEXTO=64, WS=65, COMMENT=66, MULTILINE_COMMENT=67, 
		KEYWORD=68, OPERADOR=69, SIMBOLO=70;
	public static final int
		RULE_programa = 0, RULE_declaracao = 1, RULE_declaracaoVariavel = 2, RULE_tipo = 3, 
		RULE_declaracaoFuncao = 4, RULE_parametros = 5, RULE_parametro = 6, RULE_bloco = 7, 
		RULE_comentario = 8, RULE_expressao = 9, RULE_atribuicao = 10, RULE_estruturaControle = 11, 
		RULE_caseLista = 12, RULE_caseDecl = 13, RULE_declaracaoEstrutura = 14, 
		RULE_array = 15, RULE_arrayInicializacao = 16, RULE_expressaoLista = 17, 
		RULE_expressaoLogica = 18, RULE_expressaoRelacional = 19, RULE_expressaoAritmetica = 20, 
		RULE_expressaoMultiplicativa = 21, RULE_expressaoUnaria = 22, RULE_expressaoPostfix = 23, 
		RULE_argumentos = 24, RULE_primaria = 25;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "declaracao", "declaracaoVariavel", "tipo", "declaracaoFuncao", 
			"parametros", "parametro", "bloco", "comentario", "expressao", "atribuicao", 
			"estruturaControle", "caseLista", "caseDecl", "declaracaoEstrutura", 
			"array", "arrayInicializacao", "expressaoLista", "expressaoLogica", "expressaoRelacional", 
			"expressaoAritmetica", "expressaoMultiplicativa", "expressaoUnaria", 
			"expressaoPostfix", "argumentos", "primaria"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'='", "'int'", "'float'", "'double'", "'char'", "'boolean'", 
			"'('", "')'", "','", "'[]'", "'...'", "'{'", "'}'", "'//'", "'\\r'", 
			"'\\n'", "'/*'", "'*/'", "'+='", "'-='", "'*='", "'/='", "'%='", "'&&='", 
			"'||='", "'if'", "'else'", "'while'", "'for'", "'switch'", "'break'", 
			"'continue'", "'return'", "'case'", "':'", "'default'", "'struct'", "'['", 
			"']'", "'&&'", "'||'", "'!'", "'>'", "'>='", "'<'", "'<='", "'!='", "'=='", 
			"'+'", "'-'", "'*'", "'/'", "'%'", "'++'", "'--'", "'.'", "'->'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, "ID", 
			"NUM_INT", "NUM_DEC", "CARACTERE", "BOOLEANO", "TEXTO", "WS", "COMMENT", 
			"MULTILINE_COMMENT", "KEYWORD", "OPERADOR", "SIMBOLO"
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
	public String getGrammarFileName() { return "glc.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public glcParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(glcParser.EOF, 0); }
		public List<DeclaracaoContext> declaracao() {
			return getRuleContexts(DeclaracaoContext.class);
		}
		public DeclaracaoContext declaracao(int i) {
			return getRuleContext(DeclaracaoContext.class,i);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof glcListener ) ((glcListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof glcListener ) ((glcListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof glcVisitor ) return ((glcVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 308835287288L) != 0)) {
				{
				{
				setState(52);
				declaracao();
				}
				}
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(58);
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
	public static class DeclaracaoContext extends ParserRuleContext {
		public DeclaracaoVariavelContext declaracaoVariavel() {
			return getRuleContext(DeclaracaoVariavelContext.class,0);
		}
		public DeclaracaoFuncaoContext declaracaoFuncao() {
			return getRuleContext(DeclaracaoFuncaoContext.class,0);
		}
		public DeclaracaoEstruturaContext declaracaoEstrutura() {
			return getRuleContext(DeclaracaoEstruturaContext.class,0);
		}
		public EstruturaControleContext estruturaControle() {
			return getRuleContext(EstruturaControleContext.class,0);
		}
		public ComentarioContext comentario() {
			return getRuleContext(ComentarioContext.class,0);
		}
		public DeclaracaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof glcListener ) ((glcListener)listener).enterDeclaracao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof glcListener ) ((glcListener)listener).exitDeclaracao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof glcVisitor ) return ((glcVisitor<? extends T>)visitor).visitDeclaracao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracaoContext declaracao() throws RecognitionException {
		DeclaracaoContext _localctx = new DeclaracaoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaracao);
		try {
			setState(65);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(60);
				declaracaoVariavel();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				declaracaoFuncao();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(62);
				declaracaoEstrutura();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(63);
				estruturaControle();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(64);
				comentario();
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
	public static class DeclaracaoVariavelContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ID() { return getToken(glcParser.ID, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public DeclaracaoVariavelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracaoVariavel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof glcListener ) ((glcListener)listener).enterDeclaracaoVariavel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof glcListener ) ((glcListener)listener).exitDeclaracaoVariavel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof glcVisitor ) return ((glcVisitor<? extends T>)visitor).visitDeclaracaoVariavel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracaoVariavelContext declaracaoVariavel() throws RecognitionException {
		DeclaracaoVariavelContext _localctx = new DeclaracaoVariavelContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaracaoVariavel);
		try {
			setState(77);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(67);
				tipo();
				setState(68);
				match(ID);
				setState(69);
				match(T__0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(71);
				tipo();
				setState(72);
				match(ID);
				setState(73);
				match(T__1);
				setState(74);
				expressao();
				setState(75);
				match(T__0);
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
	public static class TipoContext extends ParserRuleContext {
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof glcListener ) ((glcListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof glcListener ) ((glcListener)listener).exitTipo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof glcVisitor ) return ((glcVisitor<? extends T>)visitor).visitTipo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 248L) != 0)) ) {
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
	public static class DeclaracaoFuncaoContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ID() { return getToken(glcParser.ID, 0); }
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public DeclaracaoFuncaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracaoFuncao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof glcListener ) ((glcListener)listener).enterDeclaracaoFuncao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof glcListener ) ((glcListener)listener).exitDeclaracaoFuncao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof glcVisitor ) return ((glcVisitor<? extends T>)visitor).visitDeclaracaoFuncao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracaoFuncaoContext declaracaoFuncao() throws RecognitionException {
		DeclaracaoFuncaoContext _localctx = new DeclaracaoFuncaoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declaracaoFuncao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			tipo();
			setState(82);
			match(ID);
			setState(83);
			match(T__7);
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 248L) != 0)) {
				{
				setState(84);
				parametros();
				}
			}

			setState(87);
			match(T__8);
			setState(88);
			bloco();
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
	public static class ParametrosContext extends ParserRuleContext {
		public List<ParametroContext> parametro() {
			return getRuleContexts(ParametroContext.class);
		}
		public ParametroContext parametro(int i) {
			return getRuleContext(ParametroContext.class,i);
		}
		public ParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof glcListener ) ((glcListener)listener).enterParametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof glcListener ) ((glcListener)listener).exitParametros(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof glcVisitor ) return ((glcVisitor<? extends T>)visitor).visitParametros(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametrosContext parametros() throws RecognitionException {
		ParametrosContext _localctx = new ParametrosContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_parametros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			parametro();
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(91);
				match(T__9);
				setState(92);
				parametro();
				}
				}
				setState(97);
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
	public static class ParametroContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ID() { return getToken(glcParser.ID, 0); }
		public ParametroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof glcListener ) ((glcListener)listener).enterParametro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof glcListener ) ((glcListener)listener).exitParametro(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof glcVisitor ) return ((glcVisitor<? extends T>)visitor).visitParametro(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametroContext parametro() throws RecognitionException {
		ParametroContext _localctx = new ParametroContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_parametro);
		try {
			setState(109);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(98);
				tipo();
				setState(99);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(101);
				tipo();
				setState(102);
				match(ID);
				setState(103);
				match(T__10);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(105);
				tipo();
				setState(106);
				match(T__11);
				setState(107);
				match(ID);
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
	public static class BlocoContext extends ParserRuleContext {
		public List<DeclaracaoContext> declaracao() {
			return getRuleContexts(DeclaracaoContext.class);
		}
		public DeclaracaoContext declaracao(int i) {
			return getRuleContext(DeclaracaoContext.class,i);
		}
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public BlocoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloco; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof glcListener ) ((glcListener)listener).enterBloco(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof glcListener ) ((glcListener)listener).exitBloco(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof glcVisitor ) return ((glcVisitor<? extends T>)visitor).visitBloco(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlocoContext bloco() throws RecognitionException {
		BlocoContext _localctx = new BlocoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_bloco);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(T__12);
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & 4553421836364320831L) != 0)) {
				{
				setState(114);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__2:
				case T__3:
				case T__4:
				case T__5:
				case T__6:
				case T__14:
				case T__17:
				case T__26:
				case T__28:
				case T__29:
				case T__30:
				case T__31:
				case T__32:
				case T__33:
				case T__37:
					{
					setState(112);
					declaracao();
					}
					break;
				case T__7:
				case T__42:
				case T__50:
				case T__54:
				case T__55:
				case ID:
				case NUM_INT:
				case NUM_DEC:
				case CARACTERE:
				case BOOLEANO:
				case TEXTO:
					{
					setState(113);
					expressao();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(119);
			match(T__13);
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
	public static class ComentarioContext extends ParserRuleContext {
		public ComentarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comentario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof glcListener ) ((glcListener)listener).enterComentario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof glcListener ) ((glcListener)listener).exitComentario(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof glcVisitor ) return ((glcVisitor<? extends T>)visitor).visitComentario(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComentarioContext comentario() throws RecognitionException {
		ComentarioContext _localctx = new ComentarioContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_comentario);
		int _la;
		try {
			int _alt;
			setState(142);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
				enterOuterAlt(_localctx, 1);
				{
				setState(121);
				match(T__14);
				setState(125);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(122);
						_la = _input.LA(1);
						if ( _la <= 0 || (_la==T__15 || _la==T__16) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						} 
					}
					setState(127);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				}
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__15 || _la==T__16) {
					{
					setState(129);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__15) {
						{
						setState(128);
						match(T__15);
						}
					}

					setState(131);
					match(T__16);
					}
				}

				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 2);
				{
				setState(134);
				match(T__17);
				setState(138);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(135);
						matchWildcard();
						}
						} 
					}
					setState(140);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				}
				setState(141);
				match(T__18);
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
	public static class ExpressaoContext extends ParserRuleContext {
		public AtribuicaoContext atribuicao() {
			return getRuleContext(AtribuicaoContext.class,0);
		}
		public ExpressaoLogicaContext expressaoLogica() {
			return getRuleContext(ExpressaoLogicaContext.class,0);
		}
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof glcListener ) ((glcListener)listener).enterExpressao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof glcListener ) ((glcListener)listener).exitExpressao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof glcVisitor ) return ((glcVisitor<? extends T>)visitor).visitExpressao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_expressao);
		try {
			setState(146);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
				atribuicao();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(145);
				expressaoLogica(0);
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
	public static class AtribuicaoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(glcParser.ID, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public AtribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof glcListener ) ((glcListener)listener).enterAtribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof glcListener ) ((glcListener)listener).exitAtribuicao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof glcVisitor ) return ((glcVisitor<? extends T>)visitor).visitAtribuicao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtribuicaoContext atribuicao() throws RecognitionException {
		AtribuicaoContext _localctx = new AtribuicaoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_atribuicao);
		try {
			setState(172);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(148);
				match(ID);
				setState(149);
				match(T__1);
				setState(150);
				expressao();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(151);
				match(ID);
				setState(152);
				match(T__19);
				setState(153);
				expressao();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(154);
				match(ID);
				setState(155);
				match(T__20);
				setState(156);
				expressao();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(157);
				match(ID);
				setState(158);
				match(T__21);
				setState(159);
				expressao();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(160);
				match(ID);
				setState(161);
				match(T__22);
				setState(162);
				expressao();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(163);
				match(ID);
				setState(164);
				match(T__23);
				setState(165);
				expressao();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(166);
				match(ID);
				setState(167);
				match(T__24);
				setState(168);
				expressao();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(169);
				match(ID);
				setState(170);
				match(T__25);
				setState(171);
				expressao();
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
	public static class EstruturaControleContext extends ParserRuleContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public List<BlocoContext> bloco() {
			return getRuleContexts(BlocoContext.class);
		}
		public BlocoContext bloco(int i) {
			return getRuleContext(BlocoContext.class,i);
		}
		public DeclaracaoVariavelContext declaracaoVariavel() {
			return getRuleContext(DeclaracaoVariavelContext.class,0);
		}
		public CaseListaContext caseLista() {
			return getRuleContext(CaseListaContext.class,0);
		}
		public EstruturaControleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_estruturaControle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof glcListener ) ((glcListener)listener).enterEstruturaControle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof glcListener ) ((glcListener)listener).exitEstruturaControle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof glcVisitor ) return ((glcVisitor<? extends T>)visitor).visitEstruturaControle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EstruturaControleContext estruturaControle() throws RecognitionException {
		EstruturaControleContext _localctx = new EstruturaControleContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_estruturaControle);
		int _la;
		try {
			setState(223);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(174);
				match(T__26);
				setState(175);
				match(T__7);
				setState(176);
				expressao();
				setState(177);
				match(T__8);
				setState(178);
				bloco();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(180);
				match(T__26);
				setState(181);
				match(T__7);
				setState(182);
				expressao();
				setState(183);
				match(T__8);
				setState(184);
				bloco();
				setState(185);
				match(T__27);
				setState(186);
				bloco();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(188);
				match(T__28);
				setState(189);
				match(T__7);
				setState(190);
				expressao();
				setState(191);
				match(T__8);
				setState(192);
				bloco();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(194);
				match(T__29);
				setState(195);
				match(T__7);
				setState(197);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 248L) != 0)) {
					{
					setState(196);
					declaracaoVariavel();
					}
				}

				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 8)) & ~0x3f) == 0 && ((1L << (_la - 8)) & 142294431179997185L) != 0)) {
					{
					setState(199);
					expressao();
					}
				}

				setState(202);
				match(T__0);
				setState(204);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 8)) & ~0x3f) == 0 && ((1L << (_la - 8)) & 142294431179997185L) != 0)) {
					{
					setState(203);
					expressao();
					}
				}

				setState(206);
				match(T__8);
				setState(207);
				bloco();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(208);
				match(T__30);
				setState(209);
				match(T__7);
				setState(210);
				expressao();
				setState(211);
				match(T__8);
				setState(212);
				caseLista();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(214);
				match(T__31);
				setState(215);
				match(T__0);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(216);
				match(T__32);
				setState(217);
				match(T__0);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(218);
				match(T__33);
				setState(220);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 8)) & ~0x3f) == 0 && ((1L << (_la - 8)) & 142294431179997185L) != 0)) {
					{
					setState(219);
					expressao();
					}
				}

				setState(222);
				match(T__0);
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
	public static class CaseListaContext extends ParserRuleContext {
		public List<CaseDeclContext> caseDecl() {
			return getRuleContexts(CaseDeclContext.class);
		}
		public CaseDeclContext caseDecl(int i) {
			return getRuleContext(CaseDeclContext.class,i);
		}
		public CaseListaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseLista; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof glcListener ) ((glcListener)listener).enterCaseLista(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof glcListener ) ((glcListener)listener).exitCaseLista(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof glcVisitor ) return ((glcVisitor<? extends T>)visitor).visitCaseLista(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseListaContext caseLista() throws RecognitionException {
		CaseListaContext _localctx = new CaseListaContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_caseLista);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__34 || _la==T__36) {
				{
				{
				setState(225);
				caseDecl();
				}
				}
				setState(230);
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
	public static class CaseDeclContext extends ParserRuleContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public CaseDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof glcListener ) ((glcListener)listener).enterCaseDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof glcListener ) ((glcListener)listener).exitCaseDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof glcVisitor ) return ((glcVisitor<? extends T>)visitor).visitCaseDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseDeclContext caseDecl() throws RecognitionException {
		CaseDeclContext _localctx = new CaseDeclContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_caseDecl);
		try {
			setState(239);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__34:
				enterOuterAlt(_localctx, 1);
				{
				setState(231);
				match(T__34);
				setState(232);
				expressao();
				setState(233);
				match(T__35);
				setState(234);
				bloco();
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 2);
				{
				setState(236);
				match(T__36);
				setState(237);
				match(T__35);
				setState(238);
				bloco();
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
	public static class DeclaracaoEstruturaContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(glcParser.ID, 0); }
		public List<DeclaracaoVariavelContext> declaracaoVariavel() {
			return getRuleContexts(DeclaracaoVariavelContext.class);
		}
		public DeclaracaoVariavelContext declaracaoVariavel(int i) {
			return getRuleContext(DeclaracaoVariavelContext.class,i);
		}
		public DeclaracaoEstruturaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracaoEstrutura; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof glcListener ) ((glcListener)listener).enterDeclaracaoEstrutura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof glcListener ) ((glcListener)listener).exitDeclaracaoEstrutura(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof glcVisitor ) return ((glcVisitor<? extends T>)visitor).visitDeclaracaoEstrutura(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracaoEstruturaContext declaracaoEstrutura() throws RecognitionException {
		DeclaracaoEstruturaContext _localctx = new DeclaracaoEstruturaContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_declaracaoEstrutura);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			match(T__37);
			setState(242);
			match(ID);
			setState(243);
			match(T__12);
			setState(247);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 248L) != 0)) {
				{
				{
				setState(244);
				declaracaoVariavel();
				}
				}
				setState(249);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(250);
			match(T__13);
			setState(251);
			match(T__0);
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
	public static class ArrayContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(glcParser.ID, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof glcListener ) ((glcListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof glcListener ) ((glcListener)listener).exitArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof glcVisitor ) return ((glcVisitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_array);
		try {
			setState(261);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(253);
				match(ID);
				setState(254);
				match(T__38);
				setState(255);
				expressao();
				setState(256);
				match(T__39);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(258);
				match(ID);
				setState(259);
				match(T__38);
				setState(260);
				match(T__39);
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
	public static class ArrayInicializacaoContext extends ParserRuleContext {
		public ExpressaoListaContext expressaoLista() {
			return getRuleContext(ExpressaoListaContext.class,0);
		}
		public ArrayInicializacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInicializacao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof glcListener ) ((glcListener)listener).enterArrayInicializacao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof glcListener ) ((glcListener)listener).exitArrayInicializacao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof glcVisitor ) return ((glcVisitor<? extends T>)visitor).visitArrayInicializacao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayInicializacaoContext arrayInicializacao() throws RecognitionException {
		ArrayInicializacaoContext _localctx = new ArrayInicializacaoContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_arrayInicializacao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			match(T__12);
			setState(264);
			expressaoLista();
			setState(265);
			match(T__13);
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
	public static class ExpressaoListaContext extends ParserRuleContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public ExpressaoListaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoLista; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof glcListener ) ((glcListener)listener).enterExpressaoLista(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof glcListener ) ((glcListener)listener).exitExpressaoLista(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof glcVisitor ) return ((glcVisitor<? extends T>)visitor).visitExpressaoLista(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressaoListaContext expressaoLista() throws RecognitionException {
		ExpressaoListaContext _localctx = new ExpressaoListaContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_expressaoLista);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			expressao();
			setState(272);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(268);
				match(T__9);
				setState(269);
				expressao();
				}
				}
				setState(274);
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
	public static class ExpressaoLogicaContext extends ParserRuleContext {
		public ExpressaoRelacionalContext expressaoRelacional() {
			return getRuleContext(ExpressaoRelacionalContext.class,0);
		}
		public ExpressaoLogicaContext expressaoLogica() {
			return getRuleContext(ExpressaoLogicaContext.class,0);
		}
		public ExpressaoLogicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoLogica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof glcListener ) ((glcListener)listener).enterExpressaoLogica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof glcListener ) ((glcListener)listener).exitExpressaoLogica(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof glcVisitor ) return ((glcVisitor<? extends T>)visitor).visitExpressaoLogica(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressaoLogicaContext expressaoLogica() throws RecognitionException {
		return expressaoLogica(0);
	}

	private ExpressaoLogicaContext expressaoLogica(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressaoLogicaContext _localctx = new ExpressaoLogicaContext(_ctx, _parentState);
		ExpressaoLogicaContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_expressaoLogica, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
			case T__50:
			case T__54:
			case T__55:
			case ID:
			case NUM_INT:
			case NUM_DEC:
			case CARACTERE:
			case BOOLEANO:
			case TEXTO:
				{
				setState(276);
				expressaoRelacional();
				}
				break;
			case T__42:
				{
				setState(277);
				match(T__42);
				setState(278);
				expressaoRelacional();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(289);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(287);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressaoLogicaContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressaoLogica);
						setState(281);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(282);
						match(T__40);
						setState(283);
						expressaoRelacional();
						}
						break;
					case 2:
						{
						_localctx = new ExpressaoLogicaContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressaoLogica);
						setState(284);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(285);
						match(T__41);
						setState(286);
						expressaoRelacional();
						}
						break;
					}
					} 
				}
				setState(291);
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
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressaoRelacionalContext extends ParserRuleContext {
		public List<ExpressaoAritmeticaContext> expressaoAritmetica() {
			return getRuleContexts(ExpressaoAritmeticaContext.class);
		}
		public ExpressaoAritmeticaContext expressaoAritmetica(int i) {
			return getRuleContext(ExpressaoAritmeticaContext.class,i);
		}
		public ExpressaoRelacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoRelacional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof glcListener ) ((glcListener)listener).enterExpressaoRelacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof glcListener ) ((glcListener)listener).exitExpressaoRelacional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof glcVisitor ) return ((glcVisitor<? extends T>)visitor).visitExpressaoRelacional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressaoRelacionalContext expressaoRelacional() throws RecognitionException {
		ExpressaoRelacionalContext _localctx = new ExpressaoRelacionalContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_expressaoRelacional);
		try {
			setState(317);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(292);
				expressaoAritmetica(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(293);
				expressaoAritmetica(0);
				setState(294);
				match(T__43);
				setState(295);
				expressaoAritmetica(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(297);
				expressaoAritmetica(0);
				setState(298);
				match(T__44);
				setState(299);
				expressaoAritmetica(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(301);
				expressaoAritmetica(0);
				setState(302);
				match(T__45);
				setState(303);
				expressaoAritmetica(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(305);
				expressaoAritmetica(0);
				setState(306);
				match(T__46);
				setState(307);
				expressaoAritmetica(0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(309);
				expressaoAritmetica(0);
				setState(310);
				match(T__47);
				setState(311);
				expressaoAritmetica(0);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(313);
				expressaoAritmetica(0);
				setState(314);
				match(T__48);
				setState(315);
				expressaoAritmetica(0);
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
	public static class ExpressaoAritmeticaContext extends ParserRuleContext {
		public ExpressaoMultiplicativaContext expressaoMultiplicativa() {
			return getRuleContext(ExpressaoMultiplicativaContext.class,0);
		}
		public ExpressaoAritmeticaContext expressaoAritmetica() {
			return getRuleContext(ExpressaoAritmeticaContext.class,0);
		}
		public ExpressaoAritmeticaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoAritmetica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof glcListener ) ((glcListener)listener).enterExpressaoAritmetica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof glcListener ) ((glcListener)listener).exitExpressaoAritmetica(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof glcVisitor ) return ((glcVisitor<? extends T>)visitor).visitExpressaoAritmetica(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressaoAritmeticaContext expressaoAritmetica() throws RecognitionException {
		return expressaoAritmetica(0);
	}

	private ExpressaoAritmeticaContext expressaoAritmetica(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressaoAritmeticaContext _localctx = new ExpressaoAritmeticaContext(_ctx, _parentState);
		ExpressaoAritmeticaContext _prevctx = _localctx;
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_expressaoAritmetica, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(320);
			expressaoMultiplicativa(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(330);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(328);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressaoAritmeticaContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressaoAritmetica);
						setState(322);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(323);
						match(T__49);
						setState(324);
						expressaoMultiplicativa(0);
						}
						break;
					case 2:
						{
						_localctx = new ExpressaoAritmeticaContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressaoAritmetica);
						setState(325);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(326);
						match(T__50);
						setState(327);
						expressaoMultiplicativa(0);
						}
						break;
					}
					} 
				}
				setState(332);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressaoMultiplicativaContext extends ParserRuleContext {
		public ExpressaoUnariaContext expressaoUnaria() {
			return getRuleContext(ExpressaoUnariaContext.class,0);
		}
		public ExpressaoMultiplicativaContext expressaoMultiplicativa() {
			return getRuleContext(ExpressaoMultiplicativaContext.class,0);
		}
		public ExpressaoMultiplicativaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoMultiplicativa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof glcListener ) ((glcListener)listener).enterExpressaoMultiplicativa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof glcListener ) ((glcListener)listener).exitExpressaoMultiplicativa(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof glcVisitor ) return ((glcVisitor<? extends T>)visitor).visitExpressaoMultiplicativa(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressaoMultiplicativaContext expressaoMultiplicativa() throws RecognitionException {
		return expressaoMultiplicativa(0);
	}

	private ExpressaoMultiplicativaContext expressaoMultiplicativa(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressaoMultiplicativaContext _localctx = new ExpressaoMultiplicativaContext(_ctx, _parentState);
		ExpressaoMultiplicativaContext _prevctx = _localctx;
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_expressaoMultiplicativa, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(334);
			expressaoUnaria();
			}
			_ctx.stop = _input.LT(-1);
			setState(347);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(345);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressaoMultiplicativaContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressaoMultiplicativa);
						setState(336);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(337);
						match(T__51);
						setState(338);
						expressaoUnaria();
						}
						break;
					case 2:
						{
						_localctx = new ExpressaoMultiplicativaContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressaoMultiplicativa);
						setState(339);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(340);
						match(T__52);
						setState(341);
						expressaoUnaria();
						}
						break;
					case 3:
						{
						_localctx = new ExpressaoMultiplicativaContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressaoMultiplicativa);
						setState(342);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(343);
						match(T__53);
						setState(344);
						expressaoUnaria();
						}
						break;
					}
					} 
				}
				setState(349);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressaoUnariaContext extends ParserRuleContext {
		public ExpressaoPostfixContext expressaoPostfix() {
			return getRuleContext(ExpressaoPostfixContext.class,0);
		}
		public ExpressaoUnariaContext expressaoUnaria() {
			return getRuleContext(ExpressaoUnariaContext.class,0);
		}
		public ExpressaoUnariaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoUnaria; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof glcListener ) ((glcListener)listener).enterExpressaoUnaria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof glcListener ) ((glcListener)listener).exitExpressaoUnaria(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof glcVisitor ) return ((glcVisitor<? extends T>)visitor).visitExpressaoUnaria(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressaoUnariaContext expressaoUnaria() throws RecognitionException {
		ExpressaoUnariaContext _localctx = new ExpressaoUnariaContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_expressaoUnaria);
		try {
			setState(357);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
			case ID:
			case NUM_INT:
			case NUM_DEC:
			case CARACTERE:
			case BOOLEANO:
			case TEXTO:
				enterOuterAlt(_localctx, 1);
				{
				setState(350);
				expressaoPostfix();
				}
				break;
			case T__50:
				enterOuterAlt(_localctx, 2);
				{
				setState(351);
				match(T__50);
				setState(352);
				expressaoUnaria();
				}
				break;
			case T__54:
				enterOuterAlt(_localctx, 3);
				{
				setState(353);
				match(T__54);
				setState(354);
				expressaoPostfix();
				}
				break;
			case T__55:
				enterOuterAlt(_localctx, 4);
				{
				setState(355);
				match(T__55);
				setState(356);
				expressaoPostfix();
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
	public static class ExpressaoPostfixContext extends ParserRuleContext {
		public PrimariaContext primaria() {
			return getRuleContext(PrimariaContext.class,0);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public ArgumentosContext argumentos() {
			return getRuleContext(ArgumentosContext.class,0);
		}
		public TerminalNode ID() { return getToken(glcParser.ID, 0); }
		public ExpressaoPostfixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoPostfix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof glcListener ) ((glcListener)listener).enterExpressaoPostfix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof glcListener ) ((glcListener)listener).exitExpressaoPostfix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof glcVisitor ) return ((glcVisitor<? extends T>)visitor).visitExpressaoPostfix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressaoPostfixContext expressaoPostfix() throws RecognitionException {
		ExpressaoPostfixContext _localctx = new ExpressaoPostfixContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_expressaoPostfix);
		try {
			setState(378);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(359);
				primaria();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(360);
				primaria();
				setState(361);
				match(T__38);
				setState(362);
				expressao();
				setState(363);
				match(T__39);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(365);
				primaria();
				setState(366);
				match(T__7);
				setState(367);
				argumentos();
				setState(368);
				match(T__8);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(370);
				primaria();
				setState(371);
				match(T__56);
				setState(372);
				match(ID);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(374);
				primaria();
				setState(375);
				match(T__57);
				setState(376);
				match(ID);
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
	public static class ArgumentosContext extends ParserRuleContext {
		public ExpressaoListaContext expressaoLista() {
			return getRuleContext(ExpressaoListaContext.class,0);
		}
		public ArgumentosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof glcListener ) ((glcListener)listener).enterArgumentos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof glcListener ) ((glcListener)listener).exitArgumentos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof glcVisitor ) return ((glcVisitor<? extends T>)visitor).visitArgumentos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentosContext argumentos() throws RecognitionException {
		ArgumentosContext _localctx = new ArgumentosContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_argumentos);
		try {
			setState(382);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
			case T__42:
			case T__50:
			case T__54:
			case T__55:
			case ID:
			case NUM_INT:
			case NUM_DEC:
			case CARACTERE:
			case BOOLEANO:
			case TEXTO:
				enterOuterAlt(_localctx, 1);
				{
				setState(380);
				expressaoLista();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
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
	public static class PrimariaContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(glcParser.ID, 0); }
		public TerminalNode NUM_INT() { return getToken(glcParser.NUM_INT, 0); }
		public TerminalNode NUM_DEC() { return getToken(glcParser.NUM_DEC, 0); }
		public TerminalNode CARACTERE() { return getToken(glcParser.CARACTERE, 0); }
		public TerminalNode BOOLEANO() { return getToken(glcParser.BOOLEANO, 0); }
		public TerminalNode TEXTO() { return getToken(glcParser.TEXTO, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public PrimariaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaria; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof glcListener ) ((glcListener)listener).enterPrimaria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof glcListener ) ((glcListener)listener).exitPrimaria(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof glcVisitor ) return ((glcVisitor<? extends T>)visitor).visitPrimaria(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimariaContext primaria() throws RecognitionException {
		PrimariaContext _localctx = new PrimariaContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_primaria);
		try {
			setState(394);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(384);
				match(ID);
				}
				break;
			case NUM_INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(385);
				match(NUM_INT);
				}
				break;
			case NUM_DEC:
				enterOuterAlt(_localctx, 3);
				{
				setState(386);
				match(NUM_DEC);
				}
				break;
			case CARACTERE:
				enterOuterAlt(_localctx, 4);
				{
				setState(387);
				match(CARACTERE);
				}
				break;
			case BOOLEANO:
				enterOuterAlt(_localctx, 5);
				{
				setState(388);
				match(BOOLEANO);
				}
				break;
			case TEXTO:
				enterOuterAlt(_localctx, 6);
				{
				setState(389);
				match(TEXTO);
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 7);
				{
				setState(390);
				match(T__7);
				setState(391);
				expressao();
				setState(392);
				match(T__8);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 18:
			return expressaoLogica_sempred((ExpressaoLogicaContext)_localctx, predIndex);
		case 20:
			return expressaoAritmetica_sempred((ExpressaoAritmeticaContext)_localctx, predIndex);
		case 21:
			return expressaoMultiplicativa_sempred((ExpressaoMultiplicativaContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expressaoLogica_sempred(ExpressaoLogicaContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expressaoAritmetica_sempred(ExpressaoAritmeticaContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expressaoMultiplicativa_sempred(ExpressaoMultiplicativaContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 3);
		case 5:
			return precpred(_ctx, 2);
		case 6:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001F\u018d\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0001\u0000\u0005\u00006\b\u0000\n\u0000\f\u0000"+
		"9\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001B\b\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002N\b\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004V\b\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0005\u0005^\b\u0005\n\u0005\f\u0005a\t\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006n\b\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0005\u0007s\b\u0007\n\u0007\f\u0007v\t\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0005\b|\b\b\n\b\f\b\u007f\t"+
		"\b\u0001\b\u0003\b\u0082\b\b\u0001\b\u0003\b\u0085\b\b\u0001\b\u0001\b"+
		"\u0005\b\u0089\b\b\n\b\f\b\u008c\t\b\u0001\b\u0003\b\u008f\b\b\u0001\t"+
		"\u0001\t\u0003\t\u0093\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0003\n\u00ad\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0003\u000b\u00c6\b\u000b\u0001\u000b\u0003\u000b\u00c9\b\u000b"+
		"\u0001\u000b\u0001\u000b\u0003\u000b\u00cd\b\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0003\u000b\u00dd\b\u000b\u0001\u000b\u0003\u000b\u00e0\b\u000b\u0001"+
		"\f\u0005\f\u00e3\b\f\n\f\f\f\u00e6\t\f\u0001\r\u0001\r\u0001\r\u0001\r"+
		"\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00f0\b\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0005\u000e\u00f6\b\u000e\n\u000e\f\u000e\u00f9"+
		"\t\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003"+
		"\u000f\u0106\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u010f\b\u0011\n\u0011\f\u0011"+
		"\u0112\t\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012"+
		"\u0118\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0005\u0012\u0120\b\u0012\n\u0012\f\u0012\u0123\t\u0012\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0003\u0013\u013e\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0005"+
		"\u0014\u0149\b\u0014\n\u0014\f\u0014\u014c\t\u0014\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0005\u0015\u015a\b\u0015"+
		"\n\u0015\f\u0015\u015d\t\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u0166\b\u0016\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0003\u0017\u017b\b\u0017\u0001\u0018\u0001\u0018\u0003\u0018\u017f"+
		"\b\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u018b"+
		"\b\u0019\u0001\u0019\u0001\u008a\u0003$(*\u001a\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,."+
		"02\u0000\u0002\u0001\u0000\u0003\u0007\u0001\u0000\u0010\u0011\u01b7\u0000"+
		"7\u0001\u0000\u0000\u0000\u0002A\u0001\u0000\u0000\u0000\u0004M\u0001"+
		"\u0000\u0000\u0000\u0006O\u0001\u0000\u0000\u0000\bQ\u0001\u0000\u0000"+
		"\u0000\nZ\u0001\u0000\u0000\u0000\fm\u0001\u0000\u0000\u0000\u000eo\u0001"+
		"\u0000\u0000\u0000\u0010\u008e\u0001\u0000\u0000\u0000\u0012\u0092\u0001"+
		"\u0000\u0000\u0000\u0014\u00ac\u0001\u0000\u0000\u0000\u0016\u00df\u0001"+
		"\u0000\u0000\u0000\u0018\u00e4\u0001\u0000\u0000\u0000\u001a\u00ef\u0001"+
		"\u0000\u0000\u0000\u001c\u00f1\u0001\u0000\u0000\u0000\u001e\u0105\u0001"+
		"\u0000\u0000\u0000 \u0107\u0001\u0000\u0000\u0000\"\u010b\u0001\u0000"+
		"\u0000\u0000$\u0117\u0001\u0000\u0000\u0000&\u013d\u0001\u0000\u0000\u0000"+
		"(\u013f\u0001\u0000\u0000\u0000*\u014d\u0001\u0000\u0000\u0000,\u0165"+
		"\u0001\u0000\u0000\u0000.\u017a\u0001\u0000\u0000\u00000\u017e\u0001\u0000"+
		"\u0000\u00002\u018a\u0001\u0000\u0000\u000046\u0003\u0002\u0001\u0000"+
		"54\u0001\u0000\u0000\u000069\u0001\u0000\u0000\u000075\u0001\u0000\u0000"+
		"\u000078\u0001\u0000\u0000\u00008:\u0001\u0000\u0000\u000097\u0001\u0000"+
		"\u0000\u0000:;\u0005\u0000\u0000\u0001;\u0001\u0001\u0000\u0000\u0000"+
		"<B\u0003\u0004\u0002\u0000=B\u0003\b\u0004\u0000>B\u0003\u001c\u000e\u0000"+
		"?B\u0003\u0016\u000b\u0000@B\u0003\u0010\b\u0000A<\u0001\u0000\u0000\u0000"+
		"A=\u0001\u0000\u0000\u0000A>\u0001\u0000\u0000\u0000A?\u0001\u0000\u0000"+
		"\u0000A@\u0001\u0000\u0000\u0000B\u0003\u0001\u0000\u0000\u0000CD\u0003"+
		"\u0006\u0003\u0000DE\u0005;\u0000\u0000EF\u0005\u0001\u0000\u0000FN\u0001"+
		"\u0000\u0000\u0000GH\u0003\u0006\u0003\u0000HI\u0005;\u0000\u0000IJ\u0005"+
		"\u0002\u0000\u0000JK\u0003\u0012\t\u0000KL\u0005\u0001\u0000\u0000LN\u0001"+
		"\u0000\u0000\u0000MC\u0001\u0000\u0000\u0000MG\u0001\u0000\u0000\u0000"+
		"N\u0005\u0001\u0000\u0000\u0000OP\u0007\u0000\u0000\u0000P\u0007\u0001"+
		"\u0000\u0000\u0000QR\u0003\u0006\u0003\u0000RS\u0005;\u0000\u0000SU\u0005"+
		"\b\u0000\u0000TV\u0003\n\u0005\u0000UT\u0001\u0000\u0000\u0000UV\u0001"+
		"\u0000\u0000\u0000VW\u0001\u0000\u0000\u0000WX\u0005\t\u0000\u0000XY\u0003"+
		"\u000e\u0007\u0000Y\t\u0001\u0000\u0000\u0000Z_\u0003\f\u0006\u0000[\\"+
		"\u0005\n\u0000\u0000\\^\u0003\f\u0006\u0000][\u0001\u0000\u0000\u0000"+
		"^a\u0001\u0000\u0000\u0000_]\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000"+
		"\u0000`\u000b\u0001\u0000\u0000\u0000a_\u0001\u0000\u0000\u0000bc\u0003"+
		"\u0006\u0003\u0000cd\u0005;\u0000\u0000dn\u0001\u0000\u0000\u0000ef\u0003"+
		"\u0006\u0003\u0000fg\u0005;\u0000\u0000gh\u0005\u000b\u0000\u0000hn\u0001"+
		"\u0000\u0000\u0000ij\u0003\u0006\u0003\u0000jk\u0005\f\u0000\u0000kl\u0005"+
		";\u0000\u0000ln\u0001\u0000\u0000\u0000mb\u0001\u0000\u0000\u0000me\u0001"+
		"\u0000\u0000\u0000mi\u0001\u0000\u0000\u0000n\r\u0001\u0000\u0000\u0000"+
		"ot\u0005\r\u0000\u0000ps\u0003\u0002\u0001\u0000qs\u0003\u0012\t\u0000"+
		"rp\u0001\u0000\u0000\u0000rq\u0001\u0000\u0000\u0000sv\u0001\u0000\u0000"+
		"\u0000tr\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000uw\u0001\u0000"+
		"\u0000\u0000vt\u0001\u0000\u0000\u0000wx\u0005\u000e\u0000\u0000x\u000f"+
		"\u0001\u0000\u0000\u0000y}\u0005\u000f\u0000\u0000z|\b\u0001\u0000\u0000"+
		"{z\u0001\u0000\u0000\u0000|\u007f\u0001\u0000\u0000\u0000}{\u0001\u0000"+
		"\u0000\u0000}~\u0001\u0000\u0000\u0000~\u0084\u0001\u0000\u0000\u0000"+
		"\u007f}\u0001\u0000\u0000\u0000\u0080\u0082\u0005\u0010\u0000\u0000\u0081"+
		"\u0080\u0001\u0000\u0000\u0000\u0081\u0082\u0001\u0000\u0000\u0000\u0082"+
		"\u0083\u0001\u0000\u0000\u0000\u0083\u0085\u0005\u0011\u0000\u0000\u0084"+
		"\u0081\u0001\u0000\u0000\u0000\u0084\u0085\u0001\u0000\u0000\u0000\u0085"+
		"\u008f\u0001\u0000\u0000\u0000\u0086\u008a\u0005\u0012\u0000\u0000\u0087"+
		"\u0089\t\u0000\u0000\u0000\u0088\u0087\u0001\u0000\u0000\u0000\u0089\u008c"+
		"\u0001\u0000\u0000\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008a\u0088"+
		"\u0001\u0000\u0000\u0000\u008b\u008d\u0001\u0000\u0000\u0000\u008c\u008a"+
		"\u0001\u0000\u0000\u0000\u008d\u008f\u0005\u0013\u0000\u0000\u008ey\u0001"+
		"\u0000\u0000\u0000\u008e\u0086\u0001\u0000\u0000\u0000\u008f\u0011\u0001"+
		"\u0000\u0000\u0000\u0090\u0093\u0003\u0014\n\u0000\u0091\u0093\u0003$"+
		"\u0012\u0000\u0092\u0090\u0001\u0000\u0000\u0000\u0092\u0091\u0001\u0000"+
		"\u0000\u0000\u0093\u0013\u0001\u0000\u0000\u0000\u0094\u0095\u0005;\u0000"+
		"\u0000\u0095\u0096\u0005\u0002\u0000\u0000\u0096\u00ad\u0003\u0012\t\u0000"+
		"\u0097\u0098\u0005;\u0000\u0000\u0098\u0099\u0005\u0014\u0000\u0000\u0099"+
		"\u00ad\u0003\u0012\t\u0000\u009a\u009b\u0005;\u0000\u0000\u009b\u009c"+
		"\u0005\u0015\u0000\u0000\u009c\u00ad\u0003\u0012\t\u0000\u009d\u009e\u0005"+
		";\u0000\u0000\u009e\u009f\u0005\u0016\u0000\u0000\u009f\u00ad\u0003\u0012"+
		"\t\u0000\u00a0\u00a1\u0005;\u0000\u0000\u00a1\u00a2\u0005\u0017\u0000"+
		"\u0000\u00a2\u00ad\u0003\u0012\t\u0000\u00a3\u00a4\u0005;\u0000\u0000"+
		"\u00a4\u00a5\u0005\u0018\u0000\u0000\u00a5\u00ad\u0003\u0012\t\u0000\u00a6"+
		"\u00a7\u0005;\u0000\u0000\u00a7\u00a8\u0005\u0019\u0000\u0000\u00a8\u00ad"+
		"\u0003\u0012\t\u0000\u00a9\u00aa\u0005;\u0000\u0000\u00aa\u00ab\u0005"+
		"\u001a\u0000\u0000\u00ab\u00ad\u0003\u0012\t\u0000\u00ac\u0094\u0001\u0000"+
		"\u0000\u0000\u00ac\u0097\u0001\u0000\u0000\u0000\u00ac\u009a\u0001\u0000"+
		"\u0000\u0000\u00ac\u009d\u0001\u0000\u0000\u0000\u00ac\u00a0\u0001\u0000"+
		"\u0000\u0000\u00ac\u00a3\u0001\u0000\u0000\u0000\u00ac\u00a6\u0001\u0000"+
		"\u0000\u0000\u00ac\u00a9\u0001\u0000\u0000\u0000\u00ad\u0015\u0001\u0000"+
		"\u0000\u0000\u00ae\u00af\u0005\u001b\u0000\u0000\u00af\u00b0\u0005\b\u0000"+
		"\u0000\u00b0\u00b1\u0003\u0012\t\u0000\u00b1\u00b2\u0005\t\u0000\u0000"+
		"\u00b2\u00b3\u0003\u000e\u0007\u0000\u00b3\u00e0\u0001\u0000\u0000\u0000"+
		"\u00b4\u00b5\u0005\u001b\u0000\u0000\u00b5\u00b6\u0005\b\u0000\u0000\u00b6"+
		"\u00b7\u0003\u0012\t\u0000\u00b7\u00b8\u0005\t\u0000\u0000\u00b8\u00b9"+
		"\u0003\u000e\u0007\u0000\u00b9\u00ba\u0005\u001c\u0000\u0000\u00ba\u00bb"+
		"\u0003\u000e\u0007\u0000\u00bb\u00e0\u0001\u0000\u0000\u0000\u00bc\u00bd"+
		"\u0005\u001d\u0000\u0000\u00bd\u00be\u0005\b\u0000\u0000\u00be\u00bf\u0003"+
		"\u0012\t\u0000\u00bf\u00c0\u0005\t\u0000\u0000\u00c0\u00c1\u0003\u000e"+
		"\u0007\u0000\u00c1\u00e0\u0001\u0000\u0000\u0000\u00c2\u00c3\u0005\u001e"+
		"\u0000\u0000\u00c3\u00c5\u0005\b\u0000\u0000\u00c4\u00c6\u0003\u0004\u0002"+
		"\u0000\u00c5\u00c4\u0001\u0000\u0000\u0000\u00c5\u00c6\u0001\u0000\u0000"+
		"\u0000\u00c6\u00c8\u0001\u0000\u0000\u0000\u00c7\u00c9\u0003\u0012\t\u0000"+
		"\u00c8\u00c7\u0001\u0000\u0000\u0000\u00c8\u00c9\u0001\u0000\u0000\u0000"+
		"\u00c9\u00ca\u0001\u0000\u0000\u0000\u00ca\u00cc\u0005\u0001\u0000\u0000"+
		"\u00cb\u00cd\u0003\u0012\t\u0000\u00cc\u00cb\u0001\u0000\u0000\u0000\u00cc"+
		"\u00cd\u0001\u0000\u0000\u0000\u00cd\u00ce\u0001\u0000\u0000\u0000\u00ce"+
		"\u00cf\u0005\t\u0000\u0000\u00cf\u00e0\u0003\u000e\u0007\u0000\u00d0\u00d1"+
		"\u0005\u001f\u0000\u0000\u00d1\u00d2\u0005\b\u0000\u0000\u00d2\u00d3\u0003"+
		"\u0012\t\u0000\u00d3\u00d4\u0005\t\u0000\u0000\u00d4\u00d5\u0003\u0018"+
		"\f\u0000\u00d5\u00e0\u0001\u0000\u0000\u0000\u00d6\u00d7\u0005 \u0000"+
		"\u0000\u00d7\u00e0\u0005\u0001\u0000\u0000\u00d8\u00d9\u0005!\u0000\u0000"+
		"\u00d9\u00e0\u0005\u0001\u0000\u0000\u00da\u00dc\u0005\"\u0000\u0000\u00db"+
		"\u00dd\u0003\u0012\t\u0000\u00dc\u00db\u0001\u0000\u0000\u0000\u00dc\u00dd"+
		"\u0001\u0000\u0000\u0000\u00dd\u00de\u0001\u0000\u0000\u0000\u00de\u00e0"+
		"\u0005\u0001\u0000\u0000\u00df\u00ae\u0001\u0000\u0000\u0000\u00df\u00b4"+
		"\u0001\u0000\u0000\u0000\u00df\u00bc\u0001\u0000\u0000\u0000\u00df\u00c2"+
		"\u0001\u0000\u0000\u0000\u00df\u00d0\u0001\u0000\u0000\u0000\u00df\u00d6"+
		"\u0001\u0000\u0000\u0000\u00df\u00d8\u0001\u0000\u0000\u0000\u00df\u00da"+
		"\u0001\u0000\u0000\u0000\u00e0\u0017\u0001\u0000\u0000\u0000\u00e1\u00e3"+
		"\u0003\u001a\r\u0000\u00e2\u00e1\u0001\u0000\u0000\u0000\u00e3\u00e6\u0001"+
		"\u0000\u0000\u0000\u00e4\u00e2\u0001\u0000\u0000\u0000\u00e4\u00e5\u0001"+
		"\u0000\u0000\u0000\u00e5\u0019\u0001\u0000\u0000\u0000\u00e6\u00e4\u0001"+
		"\u0000\u0000\u0000\u00e7\u00e8\u0005#\u0000\u0000\u00e8\u00e9\u0003\u0012"+
		"\t\u0000\u00e9\u00ea\u0005$\u0000\u0000\u00ea\u00eb\u0003\u000e\u0007"+
		"\u0000\u00eb\u00f0\u0001\u0000\u0000\u0000\u00ec\u00ed\u0005%\u0000\u0000"+
		"\u00ed\u00ee\u0005$\u0000\u0000\u00ee\u00f0\u0003\u000e\u0007\u0000\u00ef"+
		"\u00e7\u0001\u0000\u0000\u0000\u00ef\u00ec\u0001\u0000\u0000\u0000\u00f0"+
		"\u001b\u0001\u0000\u0000\u0000\u00f1\u00f2\u0005&\u0000\u0000\u00f2\u00f3"+
		"\u0005;\u0000\u0000\u00f3\u00f7\u0005\r\u0000\u0000\u00f4\u00f6\u0003"+
		"\u0004\u0002\u0000\u00f5\u00f4\u0001\u0000\u0000\u0000\u00f6\u00f9\u0001"+
		"\u0000\u0000\u0000\u00f7\u00f5\u0001\u0000\u0000\u0000\u00f7\u00f8\u0001"+
		"\u0000\u0000\u0000\u00f8\u00fa\u0001\u0000\u0000\u0000\u00f9\u00f7\u0001"+
		"\u0000\u0000\u0000\u00fa\u00fb\u0005\u000e\u0000\u0000\u00fb\u00fc\u0005"+
		"\u0001\u0000\u0000\u00fc\u001d\u0001\u0000\u0000\u0000\u00fd\u00fe\u0005"+
		";\u0000\u0000\u00fe\u00ff\u0005\'\u0000\u0000\u00ff\u0100\u0003\u0012"+
		"\t\u0000\u0100\u0101\u0005(\u0000\u0000\u0101\u0106\u0001\u0000\u0000"+
		"\u0000\u0102\u0103\u0005;\u0000\u0000\u0103\u0104\u0005\'\u0000\u0000"+
		"\u0104\u0106\u0005(\u0000\u0000\u0105\u00fd\u0001\u0000\u0000\u0000\u0105"+
		"\u0102\u0001\u0000\u0000\u0000\u0106\u001f\u0001\u0000\u0000\u0000\u0107"+
		"\u0108\u0005\r\u0000\u0000\u0108\u0109\u0003\"\u0011\u0000\u0109\u010a"+
		"\u0005\u000e\u0000\u0000\u010a!\u0001\u0000\u0000\u0000\u010b\u0110\u0003"+
		"\u0012\t\u0000\u010c\u010d\u0005\n\u0000\u0000\u010d\u010f\u0003\u0012"+
		"\t\u0000\u010e\u010c\u0001\u0000\u0000\u0000\u010f\u0112\u0001\u0000\u0000"+
		"\u0000\u0110\u010e\u0001\u0000\u0000\u0000\u0110\u0111\u0001\u0000\u0000"+
		"\u0000\u0111#\u0001\u0000\u0000\u0000\u0112\u0110\u0001\u0000\u0000\u0000"+
		"\u0113\u0114\u0006\u0012\uffff\uffff\u0000\u0114\u0118\u0003&\u0013\u0000"+
		"\u0115\u0116\u0005+\u0000\u0000\u0116\u0118\u0003&\u0013\u0000\u0117\u0113"+
		"\u0001\u0000\u0000\u0000\u0117\u0115\u0001\u0000\u0000\u0000\u0118\u0121"+
		"\u0001\u0000\u0000\u0000\u0119\u011a\n\u0003\u0000\u0000\u011a\u011b\u0005"+
		")\u0000\u0000\u011b\u0120\u0003&\u0013\u0000\u011c\u011d\n\u0002\u0000"+
		"\u0000\u011d\u011e\u0005*\u0000\u0000\u011e\u0120\u0003&\u0013\u0000\u011f"+
		"\u0119\u0001\u0000\u0000\u0000\u011f\u011c\u0001\u0000\u0000\u0000\u0120"+
		"\u0123\u0001\u0000\u0000\u0000\u0121\u011f\u0001\u0000\u0000\u0000\u0121"+
		"\u0122\u0001\u0000\u0000\u0000\u0122%\u0001\u0000\u0000\u0000\u0123\u0121"+
		"\u0001\u0000\u0000\u0000\u0124\u013e\u0003(\u0014\u0000\u0125\u0126\u0003"+
		"(\u0014\u0000\u0126\u0127\u0005,\u0000\u0000\u0127\u0128\u0003(\u0014"+
		"\u0000\u0128\u013e\u0001\u0000\u0000\u0000\u0129\u012a\u0003(\u0014\u0000"+
		"\u012a\u012b\u0005-\u0000\u0000\u012b\u012c\u0003(\u0014\u0000\u012c\u013e"+
		"\u0001\u0000\u0000\u0000\u012d\u012e\u0003(\u0014\u0000\u012e\u012f\u0005"+
		".\u0000\u0000\u012f\u0130\u0003(\u0014\u0000\u0130\u013e\u0001\u0000\u0000"+
		"\u0000\u0131\u0132\u0003(\u0014\u0000\u0132\u0133\u0005/\u0000\u0000\u0133"+
		"\u0134\u0003(\u0014\u0000\u0134\u013e\u0001\u0000\u0000\u0000\u0135\u0136"+
		"\u0003(\u0014\u0000\u0136\u0137\u00050\u0000\u0000\u0137\u0138\u0003("+
		"\u0014\u0000\u0138\u013e\u0001\u0000\u0000\u0000\u0139\u013a\u0003(\u0014"+
		"\u0000\u013a\u013b\u00051\u0000\u0000\u013b\u013c\u0003(\u0014\u0000\u013c"+
		"\u013e\u0001\u0000\u0000\u0000\u013d\u0124\u0001\u0000\u0000\u0000\u013d"+
		"\u0125\u0001\u0000\u0000\u0000\u013d\u0129\u0001\u0000\u0000\u0000\u013d"+
		"\u012d\u0001\u0000\u0000\u0000\u013d\u0131\u0001\u0000\u0000\u0000\u013d"+
		"\u0135\u0001\u0000\u0000\u0000\u013d\u0139\u0001\u0000\u0000\u0000\u013e"+
		"\'\u0001\u0000\u0000\u0000\u013f\u0140\u0006\u0014\uffff\uffff\u0000\u0140"+
		"\u0141\u0003*\u0015\u0000\u0141\u014a\u0001\u0000\u0000\u0000\u0142\u0143"+
		"\n\u0002\u0000\u0000\u0143\u0144\u00052\u0000\u0000\u0144\u0149\u0003"+
		"*\u0015\u0000\u0145\u0146\n\u0001\u0000\u0000\u0146\u0147\u00053\u0000"+
		"\u0000\u0147\u0149\u0003*\u0015\u0000\u0148\u0142\u0001\u0000\u0000\u0000"+
		"\u0148\u0145\u0001\u0000\u0000\u0000\u0149\u014c\u0001\u0000\u0000\u0000"+
		"\u014a\u0148\u0001\u0000\u0000\u0000\u014a\u014b\u0001\u0000\u0000\u0000"+
		"\u014b)\u0001\u0000\u0000\u0000\u014c\u014a\u0001\u0000\u0000\u0000\u014d"+
		"\u014e\u0006\u0015\uffff\uffff\u0000\u014e\u014f\u0003,\u0016\u0000\u014f"+
		"\u015b\u0001\u0000\u0000\u0000\u0150\u0151\n\u0003\u0000\u0000\u0151\u0152"+
		"\u00054\u0000\u0000\u0152\u015a\u0003,\u0016\u0000\u0153\u0154\n\u0002"+
		"\u0000\u0000\u0154\u0155\u00055\u0000\u0000\u0155\u015a\u0003,\u0016\u0000"+
		"\u0156\u0157\n\u0001\u0000\u0000\u0157\u0158\u00056\u0000\u0000\u0158"+
		"\u015a\u0003,\u0016\u0000\u0159\u0150\u0001\u0000\u0000\u0000\u0159\u0153"+
		"\u0001\u0000\u0000\u0000\u0159\u0156\u0001\u0000\u0000\u0000\u015a\u015d"+
		"\u0001\u0000\u0000\u0000\u015b\u0159\u0001\u0000\u0000\u0000\u015b\u015c"+
		"\u0001\u0000\u0000\u0000\u015c+\u0001\u0000\u0000\u0000\u015d\u015b\u0001"+
		"\u0000\u0000\u0000\u015e\u0166\u0003.\u0017\u0000\u015f\u0160\u00053\u0000"+
		"\u0000\u0160\u0166\u0003,\u0016\u0000\u0161\u0162\u00057\u0000\u0000\u0162"+
		"\u0166\u0003.\u0017\u0000\u0163\u0164\u00058\u0000\u0000\u0164\u0166\u0003"+
		".\u0017\u0000\u0165\u015e\u0001\u0000\u0000\u0000\u0165\u015f\u0001\u0000"+
		"\u0000\u0000\u0165\u0161\u0001\u0000\u0000\u0000\u0165\u0163\u0001\u0000"+
		"\u0000\u0000\u0166-\u0001\u0000\u0000\u0000\u0167\u017b\u00032\u0019\u0000"+
		"\u0168\u0169\u00032\u0019\u0000\u0169\u016a\u0005\'\u0000\u0000\u016a"+
		"\u016b\u0003\u0012\t\u0000\u016b\u016c\u0005(\u0000\u0000\u016c\u017b"+
		"\u0001\u0000\u0000\u0000\u016d\u016e\u00032\u0019\u0000\u016e\u016f\u0005"+
		"\b\u0000\u0000\u016f\u0170\u00030\u0018\u0000\u0170\u0171\u0005\t\u0000"+
		"\u0000\u0171\u017b\u0001\u0000\u0000\u0000\u0172\u0173\u00032\u0019\u0000"+
		"\u0173\u0174\u00059\u0000\u0000\u0174\u0175\u0005;\u0000\u0000\u0175\u017b"+
		"\u0001\u0000\u0000\u0000\u0176\u0177\u00032\u0019\u0000\u0177\u0178\u0005"+
		":\u0000\u0000\u0178\u0179\u0005;\u0000\u0000\u0179\u017b\u0001\u0000\u0000"+
		"\u0000\u017a\u0167\u0001\u0000\u0000\u0000\u017a\u0168\u0001\u0000\u0000"+
		"\u0000\u017a\u016d\u0001\u0000\u0000\u0000\u017a\u0172\u0001\u0000\u0000"+
		"\u0000\u017a\u0176\u0001\u0000\u0000\u0000\u017b/\u0001\u0000\u0000\u0000"+
		"\u017c\u017f\u0003\"\u0011\u0000\u017d\u017f\u0001\u0000\u0000\u0000\u017e"+
		"\u017c\u0001\u0000\u0000\u0000\u017e\u017d\u0001\u0000\u0000\u0000\u017f"+
		"1\u0001\u0000\u0000\u0000\u0180\u018b\u0005;\u0000\u0000\u0181\u018b\u0005"+
		"<\u0000\u0000\u0182\u018b\u0005=\u0000\u0000\u0183\u018b\u0005>\u0000"+
		"\u0000\u0184\u018b\u0005?\u0000\u0000\u0185\u018b\u0005@\u0000\u0000\u0186"+
		"\u0187\u0005\b\u0000\u0000\u0187\u0188\u0003\u0012\t\u0000\u0188\u0189"+
		"\u0005\t\u0000\u0000\u0189\u018b\u0001\u0000\u0000\u0000\u018a\u0180\u0001"+
		"\u0000\u0000\u0000\u018a\u0181\u0001\u0000\u0000\u0000\u018a\u0182\u0001"+
		"\u0000\u0000\u0000\u018a\u0183\u0001\u0000\u0000\u0000\u018a\u0184\u0001"+
		"\u0000\u0000\u0000\u018a\u0185\u0001\u0000\u0000\u0000\u018a\u0186\u0001"+
		"\u0000\u0000\u0000\u018b3\u0001\u0000\u0000\u0000%7AMU_mrt}\u0081\u0084"+
		"\u008a\u008e\u0092\u00ac\u00c5\u00c8\u00cc\u00dc\u00df\u00e4\u00ef\u00f7"+
		"\u0105\u0110\u0117\u011f\u0121\u013d\u0148\u014a\u0159\u015b\u0165\u017a"+
		"\u017e\u018a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}