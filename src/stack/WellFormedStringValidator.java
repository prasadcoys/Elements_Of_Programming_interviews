package stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class WellFormedStringValidator {

    private static final Map<String, String> openingAndClosingTokens = new HashMap<>();

    static {
        openingAndClosingTokens.put("{", "}");
        openingAndClosingTokens.put("(", ")");
    }

    public static boolean isWellFormedString(String expression) {
        String[] tokens = expression.split(",");
        Stack stackWithOpeningStatementes = new Stack();
        for (String token : tokens) {
            if (openingAndClosingTokens.containsKey(token)) {
                stackWithOpeningStatementes.push(token);
            } else {
                if (stackWithOpeningStatementes.empty()) {
                    return false;
                }
                String pop = String.valueOf(stackWithOpeningStatementes.pop());
                if (!openingAndClosingTokens.get(pop).equals(token)) {
                    return false;
                }
            }
        }
        return stackWithOpeningStatementes.empty();
    }
}
