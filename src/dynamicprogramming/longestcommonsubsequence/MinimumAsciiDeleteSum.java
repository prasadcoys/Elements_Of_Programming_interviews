package dynamicprogramming.longestcommonsubsequence;

public class MinimumAsciiDeleteSum {
    public int minimumDeleteSum(String s1, String s2) {
        int s1Length = s1.length();
        int s2Length = s2.length();
        int[][] dpMap = new int[ s1Length + 1 ][ s2Length + 1 ];
        for (int i = 1; i < dpMap[ 0 ].length; i++) {
            dpMap[ 0 ][ i ] = s2.codePointAt(i-1) + dpMap[ 0 ][ i - 1 ];
        }
        for (int i = 1; i < dpMap.length; i++) {
            dpMap[ i ][ 0 ] = s1.codePointAt(i-1) + dpMap[ i - 1 ][ 0 ];
        }

        for (int column = 1; column < dpMap[ 0 ].length; column++) {
            for (int row = 1; row < dpMap.length; row++) {
                if (s1.codePointAt(row-1) == s2.codePointAt(column-1)) {
                    dpMap[ row ][ column ] = dpMap[ row - 1 ][ column - 1 ];
                    continue;
                }
                dpMap[ row ][ column ] =
                        Math.min(dpMap[ row - 1 ][ column ] + s1.codePointAt(row-1),
                                dpMap[ row ][ column - 1 ] + s2.codePointAt(column-1));

            }

        }
        return dpMap[ s1Length ][ s2Length ];
    }
}

