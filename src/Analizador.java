import antlr.glcBaseListener;
import antlr.glcParser;

import java.util.HashMap;
import java.util.Map;

public class SemanticAnalyzer extends glcBaseListener {
    private final Map<String, String> symbolTable = new HashMap<>();

    @Override
    public void exitDeclaracaoVariavel(glcParser.DeclaracaoVariavelContext ctx) {
        String varName = ctx.ID().getText();
        String varType = ctx.tipo().getText();

        // Adiciona a variável à tabela de símbolos
        symbolTable.put(varName, varType);
    }

    @Override
    public void exitExpressao(glcParser.ExpressaoContext ctx) {
        // Verificação de tipos para expressões
        if (ctx instanceof glcParser.AtribuicaoContext) {
            glcParser.AtribuicaoContext atribuicaoContext = (glcParser.AtribuicaoContext) ctx;
            String varName = atribuicaoContext.ID(0).getText();
            String varType = symbolTable.get(varName);

            // Adicione verificações adicionais se necessário
        }
    }

    @Override
    public void exitAtribuicao(glcParser.AtribuicaoContext ctx) {
        String varName = ctx.ID(0).getText();
        String exprType = inferExpressionType(ctx.expressao());

        // Verifica se o tipo inferido é compatível com o tipo da variável
        if (symbolTable.containsKey(varName)) {
            String varType = symbolTable.get(varName);
            if (!varType.equals(exprType)) {
                System.err.println("Erro de tipo: variável '" + varName + "' do tipo '" + varType + "' atribuída a uma expressão do tipo '" + exprType + "'");
            }
        } else {
            // Adiciona a variável à tabela de símbolos com o tipo inferido
            symbolTable.put(varName, exprType);
        }
    }

    private String inferExpressionType(glcParser.ExpressaoContext ctx) {
        // Implemente a lógica para inferir o tipo da expressão
        if (ctx instanceof glcParser.PrimariaContext) {
            glcParser.PrimariaContext primariaContext = (glcParser.PrimariaContext) ctx;
            if (primariaContext.NUM_INT() != null) {
                return "int";
            } else if (primariaContext.NUM_DEC() != null) {
                return "double";
            } else if (primariaContext.TEXTO() != null) {
                return "String";
            } else if (primariaContext.ID() != null) {
                return symbolTable.getOrDefault(primariaContext.ID().getText(), "unknown");
            }
        }
        // Adicione outras inferências conforme necessário
        return "unknown";
    }
}