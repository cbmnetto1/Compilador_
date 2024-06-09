// Generated from C:/programacao/compilador/Compilador/src/glc.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link glcParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface glcVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link glcParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(glcParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link glcParser#declaracao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracao(glcParser.DeclaracaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link glcParser#declaracaoVariavel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracaoVariavel(glcParser.DeclaracaoVariavelContext ctx);
	/**
	 * Visit a parse tree produced by {@link glcParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(glcParser.TipoContext ctx);
	/**
	 * Visit a parse tree produced by {@link glcParser#declaracaoFuncao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracaoFuncao(glcParser.DeclaracaoFuncaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link glcParser#parametros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametros(glcParser.ParametrosContext ctx);
	/**
	 * Visit a parse tree produced by {@link glcParser#parametro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametro(glcParser.ParametroContext ctx);
	/**
	 * Visit a parse tree produced by {@link glcParser#bloco}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloco(glcParser.BlocoContext ctx);
	/**
	 * Visit a parse tree produced by {@link glcParser#comentario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComentario(glcParser.ComentarioContext ctx);
	/**
	 * Visit a parse tree produced by {@link glcParser#expressao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressao(glcParser.ExpressaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link glcParser#atribuicao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtribuicao(glcParser.AtribuicaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link glcParser#estruturaControle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEstruturaControle(glcParser.EstruturaControleContext ctx);
	/**
	 * Visit a parse tree produced by {@link glcParser#caseLista}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseLista(glcParser.CaseListaContext ctx);
	/**
	 * Visit a parse tree produced by {@link glcParser#caseDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseDecl(glcParser.CaseDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link glcParser#declaracaoEstrutura}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracaoEstrutura(glcParser.DeclaracaoEstruturaContext ctx);
	/**
	 * Visit a parse tree produced by {@link glcParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(glcParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link glcParser#arrayInicializacao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayInicializacao(glcParser.ArrayInicializacaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link glcParser#expressaoLista}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressaoLista(glcParser.ExpressaoListaContext ctx);
	/**
	 * Visit a parse tree produced by {@link glcParser#expressaoLogica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressaoLogica(glcParser.ExpressaoLogicaContext ctx);
	/**
	 * Visit a parse tree produced by {@link glcParser#expressaoRelacional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressaoRelacional(glcParser.ExpressaoRelacionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link glcParser#expressaoAritmetica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressaoAritmetica(glcParser.ExpressaoAritmeticaContext ctx);
	/**
	 * Visit a parse tree produced by {@link glcParser#expressaoMultiplicativa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressaoMultiplicativa(glcParser.ExpressaoMultiplicativaContext ctx);
	/**
	 * Visit a parse tree produced by {@link glcParser#expressaoUnaria}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressaoUnaria(glcParser.ExpressaoUnariaContext ctx);
	/**
	 * Visit a parse tree produced by {@link glcParser#expressaoPostfix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressaoPostfix(glcParser.ExpressaoPostfixContext ctx);
	/**
	 * Visit a parse tree produced by {@link glcParser#argumentos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentos(glcParser.ArgumentosContext ctx);
	/**
	 * Visit a parse tree produced by {@link glcParser#primaria}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaria(glcParser.PrimariaContext ctx);
}