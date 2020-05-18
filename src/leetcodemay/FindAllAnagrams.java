package leetcodemay;

import java.util.*;

public class FindAllAnagrams {
    public List<Integer> findAnagrams(String s, String p) {
        if (s.length()<p.length()){
            return Collections.EMPTY_LIST;
        }
        char[] pChars = p.toCharArray();
        char[] sChars = s.toCharArray();
        int[] map = new int[123];
        for (char pChar : pChars) {
            map[ pChar]++;
        }
        List<Integer> anagramsInS = new ArrayList<>();
        int lastIndexToCheck = s.length() - p.length();
        outer:
        for (int i = 0; i <= lastIndexToCheck; i++) {
            int[] candidate = new int[123];
            for (int j = i; j <i+p.length() ; j++) {
                candidate[sChars[j]]++;
            }
            for (int j = i; j < i +p.length(); j++) {
                if ( candidate[sChars[j]]!= map[sChars[j]]){
                    continue outer;

                }
            }
            System.out.println("adding to list "+i);
            anagramsInS.add(i);

        }
        return anagramsInS;
    }
}
