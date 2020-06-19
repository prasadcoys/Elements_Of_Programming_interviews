package dynamicprogramming.longestincreasingsubsequence;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class MaxLengthOfPairChain {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });
        int maxLength = 0;
        int[] dpTable = new int[pairs.length];
        for (int i = 0; i < dpTable.length; i++) {
            dpTable[i] = 1;
        }
        for (int i = 0; i < dpTable.length; i++) {
            for (int j = 0; j < i; j++) {
                if (pairs[j][1]<pairs[i][0]){
                    dpTable[i] = Math.max(dpTable[j]+1,dpTable[i]);
                }
            }
            maxLength = Math.max(dpTable[i],maxLength);
        }
        return maxLength;
    }
}
