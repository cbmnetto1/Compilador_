public class Token {
    private tipoToken tipo;
    private String lexema;

    public Token(tipoToken tipo, String lexema) {
        this.tipo = tipo;
        this.lexema = lexema;
    }

    enum tipoToken {
        NUM,
        NUM_DEC,
        ID,
        KEYWORD,
        TXT,
        OPERADOR,
        SIMBOLO_ESPECIAL,
        COMENTARIO,
        INVALIDO,
        EOF
    }

    @Override
    public String toString() {
        return tipo + ": " + lexema;
    }

    public tipoToken getTipo() {
        return tipo;
    }

    public String getLexema() {
        return lexema;
    }
}