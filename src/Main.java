import antlr.glcBaseListener;
import antlr.glcLexer;
import antlr.glcParser;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        // Alterar filepath se for testar outro código
        String filePath = "C:/programacao/compilador/Compilador/teste.txt";
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        StringBuilder sb = new StringBuilder();
        String linha;

        while ((linha = reader.readLine()) != null) {
            sb.append(linha).append("\n");
        }
        reader.close();

        // Use ANTLR para criar lexer e parser
        CharStream input = CharStreams.fromString(sb.toString());
        glcLexer lexer = new glcLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        glcParser parser = new glcParser(tokens);

        // Adiciona um listener para erros de análise léxica e sintática
        lexer.removeErrorListeners();
        lexer.addErrorListener(new BaseErrorListener() {
            @Override
            public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
                System.err.printf("Erro léxico na linha %d:%d - %s%n", line, charPositionInLine, msg);
            }
        });

        parser.removeErrorListeners();
        parser.addErrorListener(new BaseErrorListener() {
            @Override
            public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
                System.err.printf("Erro sintático na linha %d:%d - %s%n", line, charPositionInLine, msg);
            }
        });

        // Parse the input
        ParseTree tree = parser.programa();

        // Análise semântica
        ParseTreeWalker walker = new ParseTreeWalker();
        SemanticAnalyzer semanticAnalyzer = new SemanticAnalyzer();
        walker.walk(semanticAnalyzer, tree);
        System.out.println("Análise semântica concluída com sucesso.");
    }

    public static class SemanticAnalyzer extends glcBaseListener {
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
}