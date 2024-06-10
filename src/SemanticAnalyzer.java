import antlr.glcBaseVisitor;
import antlr.glcParser;
import java.util.HashMap;
import java.util.Map;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;


public class SemanticAnalyzer extends glcBaseVisitor<String> {
    private SymbolTable symbolTable = new SymbolTable();
    //tabela de símbolos usadada para rastrear variaveis e seus tipos
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
        //sobrecarga de operadores
        operatorTypeRules.put("+stringstring", "string");
        operatorTypeRules.put("+intstring", "string");
        operatorTypeRules.put("+stringint", "string");
    }

    // Tipagem de funções e verificação de tipos de parâmetros e retornos
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
        symbolTable.declare(new SymbolTable.Symbol(name, type));
        return null;
    }

    // Verificação de tipos para atribuição
    @Override
    public String visitAtribuicao(glcParser.AtribuicaoContext ctx) {
        String varName = ctx.ID(0).getText();
        SymbolTable.Symbol varSymbol = symbolTable.lookup(varName);
        if (varSymbol == null) {
            throw new RuntimeException("Variável não declarada: " + varName);
        }
        String exprType = visit(ctx.expressao());
        if (!isAssignable(varSymbol.type, exprType)) {
            throw new RuntimeException("Incompatibilidade: Não pode atribuir " + exprType + " para " + varSymbol.type);
        }
        return varSymbol.type;
    }

    // Implementação de tipos básicos (inteiros, booleanos, strings)
    @Override
    public String visitPrimaria(glcParser.PrimariaContext ctx) {
        if (ctx.NUM_INT() != null) {
            return "int";
        }
        //não consegue pegar booleano
        /* if (ctx.BOOLEANO() != null) {
            return "boolean";
        } */
        if (ctx.TEXTO() != null) {
            return "string";
        }
        if (ctx.ID() != null) {
            String varName = ctx.ID().getText();
            SymbolTable.Symbol varSymbol = symbolTable.lookup(varName);
            if (varSymbol == null) {
                throw new RuntimeException("Undeclared variable: " + varName);
            }
            return varSymbol.type;
        }
        return visit(ctx.expressao());
    }

    //visita expressoes gerais e programas
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

    // Inferência de tipos e sobrecarga de operadores
    private boolean isAssignable(String targetType, String sourceType) {
        if (targetType.equals(sourceType)) {
            return true;
        }
        if (targetType.equals("float") && sourceType.equals("double")) {
            return true;
        }
        return false;
    }
}
