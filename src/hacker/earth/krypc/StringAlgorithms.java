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
        int i = 0;
        for (char c : characters) {
            if (nonRepeatingCharacters.containsKey(c)) {
                int startPos1 = nonRepeatingCharacters.get(c) + 1;
                startPos = startPos1 > startPos?startPos1:startPos;
            }
            nonRepeatingCharacters.put(c, i++);
            endPos++;
            if (maxLength < (endPos - startPos) + 1) {
                maxLength = (endPos - startPos) + 1;
            }
            System.out.println(maxLength+":"+startPos+":"+endPos);
        }
        return maxLength;
    }


}
