import antlr.glcBaseVisitor;
import antlr.glcParser;
import java.util.HashMap;
import java.util.Map;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

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
        operatorTypeRules.put("+stringstring", "string");
        operatorTypeRules.put("+intstring", "string");
        operatorTypeRules.put("+stringint", "string");
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
            throw new RuntimeException("Incompatibilidade: Função " + name + " retorna " + blockReturnType + " ao invés de " + returnType);
        }
        symbolTable.popScope();
        return null;
    }

    @Override
    public String visitParametro(glcParser.ParametroContext ctx) {
        String type = ctx.tipo().getText();
        String name = ctx.ID().getText();
        if (symbolTable.lookup(name) != null) {
            throw new RuntimeException("Erro semântico: Parâmetro '" + name + "' já declarado.");
        }
        symbolTable.declare(new SymbolTable.Symbol(name, type));
        return null;
    }

    @Override
    public String visitAtribuicao(glcParser.AtribuicaoContext ctx) {
        String varName = ctx.ID(0).getText();
        SymbolTable.Symbol varSymbol = symbolTable.lookup(varName);
        String exprType = visit(ctx.expressao());

        if (varSymbol == null) {
            // Se a variável não está declarada, inferimos seu tipo baseado na expressão
            symbolTable.declare(new SymbolTable.Symbol(varName, exprType));
        } else {
            if (!isAssignable(varSymbol.type, exprType)) {
                throw new RuntimeException("Incompatibilidade: Não pode atribuir " + exprType + " para " + varSymbol.type);
            }
        }
        return exprType;
    }

    @Override
    public String visitDeclaracaoVariavel(glcParser.DeclaracaoVariavelContext ctx) {
        String type = ctx.tipo().getText();
        String name = ctx.ID().getText();
        if (symbolTable.lookup(name) != null) {
            throw new RuntimeException("Erro semântico: Variável '" + name + "' já declarada.");
        }
        String valueType = visit(ctx.expressao());
        if (!isAssignable(type, valueType)) {
            throw new RuntimeException("Incompatibilidade: Não pode atribuir " + valueType + " para " + type);
        }
        symbolTable.declare(new SymbolTable.Symbol(name, type));  // Corrigido aqui
        return type;
    }

    @Override
    public String visitPrimaria(glcParser.PrimariaContext ctx) {
        if (ctx.NUM_INT() != null) {
            return "int";
        }
        if (ctx.NUM_DEC() != null) {
            return "double";
        }
        /* booleano não consegue rodar
        if (ctx.BOOLEANO() != null) {
            return "boolean";
        } */
        if (ctx.TEXTO() != null) {
            return "String";
        }
        if (ctx.ID() != null) {
            String varName = ctx.ID().getText();
            SymbolTable.Symbol varSymbol = symbolTable.lookup(varName);
            if (varSymbol == null) {
                throw new RuntimeException("Variavel não declarada: " + varName);
            }
            return varSymbol.type;
        }
        if (ctx.expressao() != null) {
            return visit(ctx.expressao());
        } else {
            throw new RuntimeException("Expressão nula encontrada em PrimariaContext");
        }
    }

    @Override
    public String visitExpressaoLogica(glcParser.ExpressaoLogicaContext ctx) {
        if (ctx.getChildCount() == 3) {
            String leftType = visit(ctx.getChild(0));
            String rightType = visit(ctx.getChild(2));
            String operator = ctx.getChild(1).getText();
            String key = operator + leftType + rightType;
            if (!operatorTypeRules.containsKey(key)) {
                throw new RuntimeException("Incompatibilidade: Não consegue aplicar operador " + operator + " para " + leftType + " e " + rightType);
            }
            return operatorTypeRules.get(key);
        }
        // Se não tiver três filhos é uma expressão relacional simples
        return visit(ctx.expressaoRelacional());
    }

    @Override
    public String visitExpressaoAritmetica(glcParser.ExpressaoAritmeticaContext ctx) {
        if (ctx.getChildCount() == 3) {
            String leftType = visit(ctx.getChild(0));
            String rightType = visit(ctx.getChild(2));
            String operator = ctx.getChild(1).getText();
            String key = operator + leftType + rightType;
            if (!operatorTypeRules.containsKey(key)) {
                throw new RuntimeException("Incompatibilidade: Não consegue aplicar operador " + operator + " para " + leftType + " e " + rightType);
            }
            return operatorTypeRules.get(key);
        }
        return visit(ctx.getChild(0));
    }

    @Override
    public String visitPrograma(glcParser.ProgramaContext ctx) {
        visitChildren(ctx);
        return null;
    }

    @Override
    public String visitExpressao(glcParser.ExpressaoContext ctx) {
        if (ctx.atribuicao() != null) {
            return visit(ctx.atribuicao());
        }
        return visit(ctx.expressaoLogica());
    }

    private boolean isAssignable(String targetType, String sourceType) {
        if (targetType.equals(sourceType)) {
            return true;
        }
        if (targetType.equals("double") && (sourceType.equals("float") || sourceType.equals("int"))) {
            return true;
        }
        if (targetType.equals("float") && sourceType.equals("int")) {
            return true;
        }
        return false;
    }
}
