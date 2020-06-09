package dynamicprogramming.longestcommonsubsequence;

import java.util.Arrays;

public class DistinctSubsequence {
    public int numDistinct(String S, String T) {
        int[][] dpMap = new int[S.length()+1][T.length()+1];
        dpMap[0][0] = 1;
        for (int i = 0; i < dpMap.length; i++) {
            dpMap[i][0] = 1;
        }
        char[] sChars = S.toCharArray();
        char[] tChars = T.toCharArray();
        for (int row = 1; row <= sChars.length; row++) {
            for (int column = 1; column <= tChars.length; column++) {
                if ( sChars[row-1]==tChars[column-1]){
                        dpMap[ row ][ column ] =
                                dpMap[ row - 1 ][ column - 1 ] + dpMap[ row - 1 ][ column ];
                        continue;
                }
                dpMap[row][column] = dpMap[row-1][column];

            }

        }
        return dpMap[sChars.length][tChars.length];
    }
}
