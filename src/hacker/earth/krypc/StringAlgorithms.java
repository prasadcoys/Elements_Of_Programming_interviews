package hacker.earth.krypc;

import java.util.HashMap;
import java.util.Map;

public class StringAlgorithms {
    public static int FindLengthOfLargestSubstring(String wholeString) {
        int startPos = 0;
        int endPos = -1;
        int maxLength = (endPos - startPos) + 1;
        char[] characters = wholeString.toCharArray();
        Map<Character, Integer> nonRepeatingCharacters = new HashMap<>();
        for (char c : characters) {
            if (nonRepeatingCharacters.containsKey(c)) {
                startPos = nonRepeatingCharacters.get(c) + 1;
            }
            nonRepeatingCharacters.put(c, ++endPos);
            if (maxLength < (endPos - startPos) + 1) {
                maxLength = (endPos - startPos) + 1;
            }
        }
        return maxLength;
    }


}
