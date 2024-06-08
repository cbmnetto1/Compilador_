import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lexer {
    private ArrayList<Token> tokens;
    private ArrayList<Token> simbolos;
    private int currentIndex;

    public Lexer(String input) {
        tokens = new ArrayList<>();
        simbolos = new ArrayList<>();
        tokenize(input);
    }

    private void tokenize(String input) {
        Pattern pattern = Pattern.compile(
                "\\b(int|float|double|char|boolean|void|if|else|for|while|switch|case|default|break|continue|return|main|scanf|println)\\b" +
                        "[a-zA-Z]+[a-zA-Z0-9_-]*" +
                        "|\\b\\d+\\.\\d+\\b|\\b\\d+\\b" +
                        "|\"(\\\\.|[^\\\\\"])*\"" +
                        "|==|!=|<=|>=|&&|\\|\\||[+\\-*/%=!<>&|^]=?" +
                        "|[\\[\\]{}(),;]" +
                        "|//.*|/\\*[^*]*\\*+(?:[^/*][^*]*\\*+)*/"
        );
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            String lexema = matcher.group();
            Token.tipoToken tipo;

            if (lexema.matches("\\b(int|float|double|char|boolean|void|if|else|for|while|switch|case|default|break|continue|return|main|scanf|println)\\b")) {
                tipo = Token.tipoToken.KEYWORD;
            } else if (lexema.matches("[a-zA-Z]+[a-zA-Z0-9_-]*")) {//o codigo não esta pegando ID
                tipo = Token.tipoToken.ID;
                simbolos.add(new Token(tipo, lexema)); //adiciona na tabela de simbolos
            } else if (lexema.matches("\\b\\d+\\.\\d+\\b")) {
                tipo = Token.tipoToken.NUM_DEC;
            } else if (lexema.matches("\\b\\d+\\b")) {
                tipo = Token.tipoToken.NUM;
            } else if (lexema.matches("\"(\\\\.|[^\\\\\"])*\"")) {
                tipo = Token.tipoToken.TXT;
                simbolos.add(new Token(tipo, lexema)); //adiciona na tabela de simbolos
            } else if (lexema.matches("==|!=|<=|>=|&&|\\|\\||[+\\-*/%=!<>&|^]=?")) {
                tipo = Token.tipoToken.OPERADOR;
            } else if (lexema.matches("[\\[\\]{}(),;]")) {
                tipo = Token.tipoToken.SIMBOLO_ESPECIAL;
            } else if (lexema.matches("//.*|/\\*[^*]*\\*+(?:[^/*][^*]*\\*+)*/")) {
                tipo = Token.tipoToken.COMENTARIO;
            } else {
                tipo = Token.tipoToken.INVALIDO;
            }
            tokens.add(new Token(tipo, lexema));
        }
        tokens.add(new Token(Token.tipoToken.EOF, "")); //saber quando a entrada acabou
    }

    public Token nextToken() {
        if (currentIndex < tokens.size()) {
            return tokens.get(currentIndex++);
        }
        return new Token(Token.tipoToken.EOF, "");
    }

    public Token peekToken() {
        if (currentIndex < tokens.size()) {
            return tokens.get(currentIndex);
        }
        return new Token(Token.tipoToken.EOF, "");
    }

    public ArrayList<Token> getTokens() {
        return tokens;
    }

    public ArrayList<Token> getSimbolos() {
        return simbolos;
    }
}