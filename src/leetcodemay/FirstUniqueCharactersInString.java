package leetcodemay;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharactersInString {
    public int firstUniqChar(String s) {
        char[] chars = s.toCharArray();
        int[] mappingChars = new int[123];
        for (char aChar : chars) {
            mappingChars[aChar]++;
        }

        for (int i = 0; i < chars.length; i++) {
            if (mappingChars[chars[i]] == 1){
                return i;
            }
        }

        return -1;
    }
}
