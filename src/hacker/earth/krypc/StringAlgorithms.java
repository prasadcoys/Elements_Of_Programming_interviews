package hacker.earth.krypc;

import java.util.LinkedHashSet;
import java.util.Set;

public class StringAlgorithms {
    public static int FindLengthOfLargestSubstring(String wholeString) {
        int maxLength = 0;
        char[] characters = wholeString.toCharArray();
        LinkedHashSet<Character> repeatingCharacters = new LinkedHashSet<>();
        for (char c : characters) {
            if (!repeatingCharacters.add(c)){

                maxLength = setMaxLengthIfNewMaxIsFound(maxLength, repeatingCharacters);
                repeatingCharacters = new LinkedHashSet<>();
                repeatingCharacters.add(c);
            }
        }
        maxLength = setMaxLengthIfNewMaxIsFound(maxLength, repeatingCharacters);
        return maxLength;
    }

    private static int setMaxLengthIfNewMaxIsFound(int maxLength, Set<Character> repeatingCharacters) {
        if (repeatingCharacters.size() > maxLength) {
            maxLength = repeatingCharacters.size();
        }
        return maxLength;
    }
}
