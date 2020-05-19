package leetcodemay;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class StringPermutation {
    public boolean checkInclusion(String s1, String s2) {

        if (s2.length() < s1.length()){
            return false;
        }
        char[] s1chars = s1.toCharArray();
        int[] s1map = new int[124];
        for (char s1char : s1chars) {
            s1map[s1char]++;
        }
        char[] s2chars = s2.toCharArray();
        outer:
        for (int i = 0; i <= s2chars.length- s1.length(); i++) {
            int[] s2map =  new int[124];
            for (int j = i; j < i+ s1.length(); j++) {
                s2map[s2chars[j]]++;
                if (s1map[s2chars[j]] <s2map[s2chars[j]]){
                    continue outer;
                }
            }
            if (Arrays.equals(s2map,s1map)){
                return true;
            }

        }
        return false;
    }
/*
    private boolean areMapsEqual(Map<Character, Integer> s1Map, Map<Character, Integer> s2map) {
        for (Character character : s1Map.keySet()) {
            if (s2map.get(character)!= s1Map.get(character)){
                return false;
            }
        }
        return true;
    }*/
}
