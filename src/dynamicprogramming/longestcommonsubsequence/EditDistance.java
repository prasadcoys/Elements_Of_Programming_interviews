package dynamicprogramming.longestcommonsubsequence;

public class EditDistance {
    public int minDistance(String word1, String word2) {
        int[][] dpMap = new int[ word2.length() + 1 ][ word1.length() + 1 ];

        //populate the first row
        for (int column = 0; column < dpMap[0].length; column++) {
            dpMap[0][column] = column;
        }
        // populate the first column
        for (int row = 0;row<dpMap.length;row++){
            dpMap[row][0] = row;
        }

        for (int row = 1; row < dpMap.length; row++) {
            for (int column = 1; column < dpMap[ row ].length; column++) {
                if (word1.charAt(column - 1) == word2.charAt(row - 1)) {
                    dpMap[ row ][ column ] = dpMap[ row - 1 ][ column - 1 ];
                } else {
                    dpMap[ row ][ column ] += 1 + Math.min(Math.min(dpMap[ row - 1 ][ column ], dpMap[ row ][ column - 1 ]), dpMap[ row - 1 ][ column - 1 ]);
                }
            }
        }


        return dpMap[ word2.length() ][ word1.length() ];
    }
}
