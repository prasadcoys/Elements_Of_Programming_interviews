package leetcodemay;

import java.util.*;

public class FindAllAnagrams {
    public List<Integer> findAnagrams(String s, String p) {
        if (s.length()<p.length()){
            return Collections.EMPTY_LIST;
        }
        char[] pChars = p.toCharArray();
        char[] sChars = s.toCharArray();
        int[] map = new int[26];
        for (char pChar : pChars) {
            map[ pChar-97]++;
        }
        List<Integer> anagramsInS = new ArrayList<>();
        int lastIndexToCheck = s.length() - p.length();
        outer:
        for (int i = 0; i <= lastIndexToCheck; i++) {
            int[] candidate = new int[26];
            for (int j = i; j <i+p.length() ; j++) {
                candidate[sChars[j]-97]++;
            }
            for (int j = i; j < i +p.length(); j++) {
                if ( candidate[sChars[j]-97]!= map[sChars[j]-97]){
                    continue outer;

                }
            }
            anagramsInS.add(i);

        }
        return anagramsInS;
    }
}
