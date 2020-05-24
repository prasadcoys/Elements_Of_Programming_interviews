package leetcodemay;

import java.util.Arrays;

public class IntervalListIntersection {
    public int[] getInterval(int[] a, int[] b) {
        int[] intersection = new int[]{Math.max(a[0],b[0]),Math.min(a[1]
                ,b[1])};

        return intersection;
    }

    public int[][] intervalIntersection(int[][] a, int[][] b) {
        int[][] intersectios = new int[a.length+b.length][2];
        int i = 0;
        for (int acounter = 0,bcounter = 0; acounter < a.length&& bcounter<b.length; ) {
            int localmin = Math.max(a[acounter][0],b[bcounter][0]);
            int localMax;
            if ( b[bcounter][1]<a[acounter][1]){
                localMax = b[bcounter++][1];
            } else {
                localMax = a[acounter++][1];
            }
            if ( localmin<= localMax)
            intersectios[i++] = new int[]{localmin,localMax};
        }
        int[][] intersections = new int[i][2];

        System.arraycopy(intersectios,0,intersections,0,i);

        return intersections;
    }
}
