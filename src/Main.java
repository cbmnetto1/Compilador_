import antlr.glcBaseListener;
import antlr.glcLexer;
import antlr.glcParser;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Alterar filepath se for testar outro código
        String filePath = "C:/programacao/compilador/Compilador/novo.txt";
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

        // Parse o input
        ParseTree tree = parser.programa();

        // Análise semântica
        SemanticAnalyzer semanticAnalyzer = new SemanticAnalyzer();
        semanticAnalyzer.visit(tree);
        System.out.println("Análise semântica concluída com sucesso.");
    }
}