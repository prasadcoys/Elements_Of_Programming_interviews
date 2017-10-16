package stack;

import java.util.Stack;

public class EquivalentPathFinder {
    public static String getShortestEquivalentPath(String inputPath) {
        Stack<String> returnPath = new Stack<>();
        if (inputPath.startsWith("/")) {
            returnPath.push("/");
        }
        String[] pathTokens = inputPath.split("/");
        for (String token : pathTokens) {
            if (token.isEmpty() || token.equals(".")) {
                continue;
            } else if (token.equals("..")) {
                returnPath.pop();
                continue;
            }
            returnPath.push(token + "/");

        }
        String returnString = "";
        while (!returnPath.empty()) {
            returnString = returnPath.pop() + returnString;
        }
        return returnString.substring(0, returnString.length() - 1);
    }
}
