package leetcodemay;

public class StraightLine {
    public boolean checkStraightLine(int[][] coordinates) {

        float m;
        boolean isInfiniteSlope = false;
        if (coordinates.length == 2) {
            return true;
        }

        int x2x1 = coordinates[ 1 ][ 0 ] - coordinates[ 0 ][ 0 ];
        if (x2x1 == 0) {
            m = 0;
            isInfiniteSlope = true;
        } else {
            m =
                    (coordinates[ 1 ][ 1 ] - coordinates[ 0 ][ 1 ]) / x2x1;
        }

        int c = (int) (coordinates[ 0 ][ 1 ] - (m * coordinates[ 0 ][ 0 ]));

        for (int i = 2; i < coordinates.length; i++) {
            if(isInfiniteSlope){
                if (coordinates[i][0]!= coordinates[i-1][0] ){
                    return false;
                }

            }
            else if (coordinates[ i ][ 1 ] != (m * (coordinates[ i ][ 0 ]) + c)) {
                return false;
            }
        }

        return true;
    }
}
