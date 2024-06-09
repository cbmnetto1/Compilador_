// Generated from C:/programacao/compilador/Compilador/src/glc.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link glcParser}.
 */
public interface glcListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link glcParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(glcParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link glcParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(glcParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link glcParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao(glcParser.DeclaracaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link glcParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao(glcParser.DeclaracaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link glcParser#declaracaoVariavel}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracaoVariavel(glcParser.DeclaracaoVariavelContext ctx);
	/**
	 * Exit a parse tree produced by {@link glcParser#declaracaoVariavel}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracaoVariavel(glcParser.DeclaracaoVariavelContext ctx);
	/**
	 * Enter a parse tree produced by {@link glcParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(glcParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link glcParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(glcParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link glcParser#declaracaoFuncao}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracaoFuncao(glcParser.DeclaracaoFuncaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link glcParser#declaracaoFuncao}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracaoFuncao(glcParser.DeclaracaoFuncaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link glcParser#parametros}.
	 * @param ctx the parse tree
	 */
	void enterParametros(glcParser.ParametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link glcParser#parametros}.
	 * @param ctx the parse tree
	 */
	void exitParametros(glcParser.ParametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link glcParser#parametro}.
	 * @param ctx the parse tree
	 */
	void enterParametro(glcParser.ParametroContext ctx);
	/**
	 * Exit a parse tree produced by {@link glcParser#parametro}.
	 * @param ctx the parse tree
	 */
	void exitParametro(glcParser.ParametroContext ctx);
	/**
	 * Enter a parse tree produced by {@link glcParser#bloco}.
	 * @param ctx the parse tree
	 */
	void enterBloco(glcParser.BlocoContext ctx);
	/**
	 * Exit a parse tree produced by {@link glcParser#bloco}.
	 * @param ctx the parse tree
	 */
	void exitBloco(glcParser.BlocoContext ctx);
	/**
	 * Enter a parse tree produced by {@link glcParser#comentario}.
	 * @param ctx the parse tree
	 */
	void enterComentario(glcParser.ComentarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link glcParser#comentario}.
	 * @param ctx the parse tree
	 */
	void exitComentario(glcParser.ComentarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link glcParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExpressao(glcParser.ExpressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link glcParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExpressao(glcParser.ExpressaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link glcParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void enterAtribuicao(glcParser.AtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link glcParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void exitAtribuicao(glcParser.AtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link glcParser#estruturaControle}.
	 * @param ctx the parse tree
	 */
	void enterEstruturaControle(glcParser.EstruturaControleContext ctx);
	/**
	 * Exit a parse tree produced by {@link glcParser#estruturaControle}.
	 * @param ctx the parse tree
	 */
	void exitEstruturaControle(glcParser.EstruturaControleContext ctx);
	/**
	 * Enter a parse tree produced by {@link glcParser#caseLista}.
	 * @param ctx the parse tree
	 */
	void enterCaseLista(glcParser.CaseListaContext ctx);
	/**
	 * Exit a parse tree produced by {@link glcParser#caseLista}.
	 * @param ctx the parse tree
	 */
	void exitCaseLista(glcParser.CaseListaContext ctx);
	/**
	 * Enter a parse tree produced by {@link glcParser#caseDecl}.
	 * @param ctx the parse tree
	 */
	void enterCaseDecl(glcParser.CaseDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link glcParser#caseDecl}.
	 * @param ctx the parse tree
	 */
	void exitCaseDecl(glcParser.CaseDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link glcParser#declaracaoEstrutura}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracaoEstrutura(glcParser.DeclaracaoEstruturaContext ctx);
	/**
	 * Exit a parse tree produced by {@link glcParser#declaracaoEstrutura}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracaoEstrutura(glcParser.DeclaracaoEstruturaContext ctx);
	/**
	 * Enter a parse tree produced by {@link glcParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(glcParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link glcParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(glcParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link glcParser#arrayInicializacao}.
	 * @param ctx the parse tree
	 */
	void enterArrayInicializacao(glcParser.ArrayInicializacaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link glcParser#arrayInicializacao}.
	 * @param ctx the parse tree
	 */
	void exitArrayInicializacao(glcParser.ArrayInicializacaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link glcParser#expressaoLista}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoLista(glcParser.ExpressaoListaContext ctx);
	/**
	 * Exit a parse tree produced by {@link glcParser#expressaoLista}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoLista(glcParser.ExpressaoListaContext ctx);
	/**
	 * Enter a parse tree produced by {@link glcParser#expressaoLogica}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoLogica(glcParser.ExpressaoLogicaContext ctx);
	/**
	 * Exit a parse tree produced by {@link glcParser#expressaoLogica}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoLogica(glcParser.ExpressaoLogicaContext ctx);
	/**
	 * Enter a parse tree produced by {@link glcParser#expressaoRelacional}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoRelacional(glcParser.ExpressaoRelacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link glcParser#expressaoRelacional}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoRelacional(glcParser.ExpressaoRelacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link glcParser#expressaoAritmetica}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoAritmetica(glcParser.ExpressaoAritmeticaContext ctx);
	/**
	 * Exit a parse tree produced by {@link glcParser#expressaoAritmetica}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoAritmetica(glcParser.ExpressaoAritmeticaContext ctx);
	/**
	 * Enter a parse tree produced by {@link glcParser#expressaoMultiplicativa}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoMultiplicativa(glcParser.ExpressaoMultiplicativaContext ctx);
	/**
	 * Exit a parse tree produced by {@link glcParser#expressaoMultiplicativa}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoMultiplicativa(glcParser.ExpressaoMultiplicativaContext ctx);
	/**
	 * Enter a parse tree produced by {@link glcParser#expressaoUnaria}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoUnaria(glcParser.ExpressaoUnariaContext ctx);
	/**
	 * Exit a parse tree produced by {@link glcParser#expressaoUnaria}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoUnaria(glcParser.ExpressaoUnariaContext ctx);
	/**
	 * Enter a parse tree produced by {@link glcParser#expressaoPostfix}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoPostfix(glcParser.ExpressaoPostfixContext ctx);
	/**
	 * Exit a parse tree produced by {@link glcParser#expressaoPostfix}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoPostfix(glcParser.ExpressaoPostfixContext ctx);
	/**
	 * Enter a parse tree produced by {@link glcParser#argumentos}.
	 * @param ctx the parse tree
	 */
	void enterArgumentos(glcParser.ArgumentosContext ctx);
	/**
	 * Exit a parse tree produced by {@link glcParser#argumentos}.
	 * @param ctx the parse tree
	 */
	void exitArgumentos(glcParser.ArgumentosContext ctx);
	/**
	 * Enter a parse tree produced by {@link glcParser#primaria}.
	 * @param ctx the parse tree
	 */
	void enterPrimaria(glcParser.PrimariaContext ctx);
	/**
	 * Exit a parse tree produced by {@link glcParser#primaria}.
	 * @param ctx the parse tree
	 */
	void exitPrimaria(glcParser.PrimariaContext ctx);
}