package dynamicprogramming.longestincreasingsubsequence;

import java.util.Arrays;
import java.util.Comparator;

public class RussianDollEnvelopes {

    public int maxEnvelopes(int[][] envelopes) {
        Arrays.sort(envelopes, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });
        int[] dpTable = new int[envelopes.length];
        int max = 0;
        for (int i = 0; i < envelopes.length; i++) {
            if (dpTable[i]>0){
                max = Math.max(max,dpTable[i]);
                continue;
            }
            dpTable[i] = 1 + recursivelyFindMaxEnvelopes(envelopes,
                    dpTable,i);
            max = Math.max(max,dpTable[i]);
        }
        return max;
    }

    private int recursivelyFindMaxEnvelopes(int[][] envelopes,
                                          int[] dpTable,int currentPos) {
        int maxEnvelopes = 0;
        for (int i = 0; i < currentPos; i++) {

            if (envelopes[currentPos][0]>envelopes[i][0] && envelopes[currentPos][1]>envelopes[i][1]){
                if (dpTable[i]>0){
                    // we need not recursively calculate
                    maxEnvelopes = Math.max(dpTable[i],maxEnvelopes);
                    continue;
                }
                dpTable[i] =  1 + recursivelyFindMaxEnvelopes(envelopes,
                    dpTable
                        ,i);
                maxEnvelopes = Math.max(dpTable[i],maxEnvelopes);
            }
        }
        return maxEnvelopes;
    }
}
