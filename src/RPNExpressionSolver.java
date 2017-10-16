import stack.Stack;

import java.util.HashMap;
import java.util.Map;

public class RPNExpressionSolver {
    private String expression;
    private String[] tokens;
    private Map<String, ArithmeticOperation> operators;

    public RPNExpressionSolver(String rpnExpression) {
        this.expression = rpnExpression;
        addValidOperators();
        parseExpressionIntoTokens();
    }

    private void addValidOperators() {
        operators = new HashMap<>();
        operators.put("+", new Addition());
        operators.put("-", new Subtraction());
        operators.put("*", null);
        operators.put("/", null);

    }

    private void parseExpressionIntoTokens() {
        tokens = expression.split(",");

    }

    public String[] getTokens() {

        return this.tokens;
    }

    public int solvePrefixExpression() {

        Stack expressionStack = new Stack();
        for (int i = tokens.length - 1; i > -1; i--) {
            String token = tokens[i];
            if (isTokenOperator(token)) {
                parseSubExpression(expressionStack, token);
            } else {
                expressionStack.push(Integer.parseInt(token));
            }
        }
        return expressionStack.pop();
    }

    private void parseSubExpression(Stack expressionStack, String token) {
        int operandA = expressionStack.pop();
        int operandB = expressionStack.pop();
        ArithmeticOperation artithmeticOperation = operators.get(token);
        expressionStack.push(artithmeticOperation.performOperation(operandA, operandB));
    }

    private boolean isTokenOperator(String token) {
        return operators.containsKey(token);
    }

    public int solveExpression() {
        Stack expressionStack = new Stack();
        for (String token : tokens) {
            if (isTokenOperator(token)) {
                parseSubExpression(expressionStack, token);
            } else {
                expressionStack.push(Integer.parseInt(token));
            }
        }
        return expressionStack.pop();
    }
}
