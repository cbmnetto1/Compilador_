import antlr.glcBaseVisitor;
import antlr.glcParser;
import org.antlr.v4.runtime.tree.ParseTree;
import java.util.HashMap;
import java.util.Map;

public class SemanticAnalyzer extends glcBaseVisitor<String> {
    private SymbolTable symbolTable = new SymbolTable();
    private Map<String, String> operatorTypeRules;

    public SemanticAnalyzer() {
        operatorTypeRules = new HashMap<>();
        // Define regras de tipagem para operadores aritméticos e lógicos
        operatorTypeRules.put("+intint", "int");
        operatorTypeRules.put("-intint", "int");
        operatorTypeRules.put("*intint", "int");
        operatorTypeRules.put("/intint", "int");
        operatorTypeRules.put("%intint", "int");
        operatorTypeRules.put("&&booleanboolean", "boolean");
        operatorTypeRules.put("||booleanboolean", "boolean");
        operatorTypeRules.put("==intint", "boolean");
        operatorTypeRules.put("!=intint", "boolean");
        operatorTypeRules.put("<=intint", "boolean");
        operatorTypeRules.put(">=intint", "boolean");
        operatorTypeRules.put("<intint", "boolean");
        operatorTypeRules.put(">intint", "boolean");
        // Adicione outras regras conforme necessário
    }

    @Override
    public String visitDeclaracaoVariavel(glcParser.DeclaracaoVariavelContext ctx) {
        String type = ctx.tipo().getText();
        String name = ctx.ID().getText();
        symbolTable.declare(new SymbolTable.Symbol(name, type));

        if (ctx.expressao() != null) {
            String exprType = visit(ctx.expressao());
            if (!type.equals(exprType)) {
                throw new RuntimeException("Type mismatch: cannot assign " + exprType + " to " + type);
            }
        }
        return null;
    }

    @Override
    public String visitDeclaracaoFuncao(glcParser.DeclaracaoFuncaoContext ctx) {
        String returnType = ctx.tipo().getText();
        String name = ctx.ID().getText();
        symbolTable.declare(new SymbolTable.Symbol(name, returnType));

        symbolTable.pushScope();
        visit(ctx.parametros());
        String blockReturnType = visit(ctx.bloco());
        if (blockReturnType != null && !returnType.equals(blockReturnType)) {
            throw new RuntimeException("Type mismatch: function " + name + " returns " + blockReturnType + " instead of " + returnType);
        }
        symbolTable.popScope();
        return null;
    }

    @Override
    public String visitParametro(glcParser.ParametroContext ctx) {
        String type = ctx.tipo().getText();
        String name = ctx.ID().getText();
        symbolTable.declare(new SymbolTable.Symbol(name, type));
        return null;
    }

    @Override
    public String visitAtribuicao(glcParser.AtribuicaoContext ctx) {
        String varName = ctx.ID(0).getText();
        SymbolTable.Symbol varSymbol = symbolTable.lookup(varName);
        if (varSymbol == null) {
            throw new RuntimeException("Undeclared variable: " + varName);
        }
        String exprType = visit(ctx.expressao());
        if (!varSymbol.type.equals(exprType)) {
            throw new RuntimeException("Type mismatch: cannot assign " + exprType + " to " + varSymbol.type);
        }
        return varSymbol.type;
    }

    @Override
    public String visitExpressao(glcParser.ExpressaoContext ctx) {
        if (ctx.atribuicao() != null) {
            return visit(ctx.atribuicao());
        }
        return visit(ctx.expressaoLogica());
    }

    @Override
    public String visitExpressaoPostfix(glcParser.ExpressaoPostfixContext ctx) {
        String type = visit(ctx.primaria());
        if (ctx.argumentos() != null) {
            visit(ctx.argumentos());
            // Verifique tipos de função aqui se necessário
        }
        return type;
    }

    @Override
    public String visitPrimaria(glcParser.PrimariaContext ctx) {
        if (ctx.ID() != null) {
            String varName = ctx.ID().getText();
            SymbolTable.Symbol varSymbol = symbolTable.lookup(varName);
            if (varSymbol == null) {
                throw new RuntimeException("Undeclared variable: " + varName);
            }
            return varSymbol.type;
        }
        if (ctx.NUM_INT() != null) {
            return "int";
        }
        if (ctx.NUM_DEC() != null) {
            return "double";
        }
        if (ctx.TEXTO() != null) {
            return "char";
        }
        if (ctx.expressao() != null) {
            return visit(ctx.expressao());
        }
        return null;
    }

    @Override
    public String visitPrograma(glcParser.ProgramaContext ctx) {
        visitChildren(ctx);
        return null;
    }
}
