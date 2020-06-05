package dynamicprogramming.longestcommonsubsequence;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LongestCommonSubsequence {
    private int[][] memo;
    public int longestCommonSubsequence(String text1, String text2) {
        memo = new int[text1.length()][text2.length()];
        for (int i = 0; i < text1.length(); i++) {
            for (int j = 0; j < text2.length(); j++) {
                memo[i][j] = -1;
            }
        }

        int lengthOfLongestCommonSubsequence = 0;
        if (text1.equals(text2)) {
            return text1.length();
        }

        lengthOfLongestCommonSubsequence =
                recursivelyCalculateLongestCommonSubsequence(text1, text2
                        , 0, 0);
        return lengthOfLongestCommonSubsequence;
    }

    private int recursivelyCalculateLongestCommonSubsequence(String text1, String text2, int i, int j) {
        if ( i >= text1.length()||j >= text2.length()){
            return 0;
        }
        Integer integer = memo[i][j];
        if (integer != -1){
            return integer;
        }
        int longestLength = 0;
        if (text1.charAt(i) == text2.charAt(j)) {
            longestLength +=
                    1 + recursivelyCalculateLongestCommonSubsequence(text1, text2, i + 1, j + 1);
        } else {
            longestLength += Math.max(recursivelyCalculateLongestCommonSubsequence(text1, text2, i + 1, j), recursivelyCalculateLongestCommonSubsequence(text1, text2, i, j + 1));
        }
        memo[i][j] = longestLength;
        return longestLength;
    }

    public int longestCommonSubsequenceDP(String text1, String text2) {

        int[][] dpTable = new int[text2.length()+1][text1.length()+1];
        
        for (int column = 1; column <= text1.length(); column++) {
            for (int row = 1; row <= text2.length(); row++) {

                if (text1.charAt(column-1) == text2.charAt(row-1)){
                    dpTable[row][column] = dpTable[row-1][column-1]+1;
                }
                else {
                    dpTable[row][column] = Math.max(dpTable[row-1][column],
                            dpTable[row][column-1]);
                }
            }
        }

        /*for (int i = 0; i < dpTable.length; i++) {
            System.out.println(Arrays.toString(dpTable[i]));
        }*/
        return dpTable[text2.length()][text1.length()];
    }
}
