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
        operatorTypeRules.put("&&booleanboolean", "boolean");
        operatorTypeRules.put("||booleanboolean", "boolean");
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
        if (!returnType.equals(blockReturnType)) {
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
    public String visitExpressao(glcParser.ExpressaoContext ctx) {
        return visitChildren(ctx);
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
    public String visitExpressaoAritmetica(glcParser.ExpressaoAritmeticaContext ctx) {
        String leftType = visit(ctx.expressaoAritmetica());
        String rightType = visit(ctx.expressaoMultiplicativa());
        String operator = ctx.op.getText();
        String resultType = operatorTypeRules.get(operator + leftType + rightType);
        if (resultType == null) {
            throw new RuntimeException("Type mismatch: cannot apply operator " + operator + " to types " + leftType + " and " + rightType);
        }
        return resultType;
    }

    @Override
    public String visitExpressaoLogica(glcParser.ExpressaoLogicaContext ctx) {
        String leftType = visit(ctx.expressaoLogica());
        String rightType = visit(ctx.expressaoRelacional());
        String operator = ctx.op.getText();
        String resultType = operatorTypeRules.get(operator + leftType + rightType);
        if (resultType == null) {
            throw new RuntimeException("Type mismatch: cannot apply operator " + operator + " to types " + leftType + " and " + rightType);
        }
        return resultType;
    }

    @Override
    public String visitBloco(glcParser.BlocoContext ctx) {
        symbolTable.pushScope();
        String returnType = null;
        for (glcParser.DeclaracaoContext declCtx : ctx.declaracao()) {
            String type = visit(declCtx);
            if (declCtx instanceof glcParser.ExpressaoContext) {
                returnType = type;
            }
        }
        symbolTable.popScope();
        return returnType;
    }

    @Override
    public String visitPrograma(glcParser.ProgramaContext ctx) {
        visitChildren(ctx);
        return null;
    }
}
