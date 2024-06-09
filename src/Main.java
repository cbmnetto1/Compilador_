import antlr.glcLexer;
import antlr.glcParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.filechooser.FileSystemView;

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

        // Use ANTLR to create a lexer and parser
        CharStream input = CharStreams.fromString(sb.toString());
        glcLexer lexer = new glcLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        glcParser parser = new glcParser(tokens);

        // Parse the input
        ParseTree tree = parser.programa();
        System.out.println("Análise sintática concluída com sucesso.");

        // Optional: You can use a visitor or listener to walk through the tree if needed
        // ParseTreeWalker walker = new ParseTreeWalker();
        // MyCustomListener listener = new MyCustomListener();
        // walker.walk(listener, tree);

        generateFiles(lexer);
    }

    private static void generateFiles(ProgramaLexer lexer) throws IOException {
        File desktop = new File(FileSystemView.getFileSystemView().getHomeDirectory().toString());
        File folder = new File(desktop, "Compilador");
        createFolder(folder);

        String time = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yy HH-mm-ss"));

        File tokensFile = new File(folder, "Tokens " + time + ".txt");
        File simbolosFile = new File(folder, "Simbolos " + time + ".txt");
        // File arvoreFile = new File(folder, "ArvoreSintatica " + time + ".txt");

        writeToFile(tokensFile, lexer.getAllTokens());
        // Simbolos would need to be captured separately if required
    }

    private static void createFolder(File folder) {
        if (!folder.exists()) {
            boolean created = folder.mkdirs();
            if (created) {
                System.out.println("Pasta criada.");
            } else {
                System.err.println("Não foi possível criar a pasta.");
            }
        } else {
            System.out.println("A pasta já existe.");
        }
    }

    private static void writeToFile(File file, Iterable<Token> data) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(file));
        for (Token token : data) {
            writer.write(token.toString());
            writer.write("\n");
        }
        writer.close();
    }

    private static void writeToFile(File file, String data) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write(data);
        }
    }
}