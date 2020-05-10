package leetcodemay;

public class FindTheJudge {
    public int findJudge(int N, int[][] trust) {

        if (N == 1){
            return 1;
        }
        int candidate = -1;
        if ((trust.length) < (N - 1)) {
            return -1;
        }

        int[] trusters = new int[ 1000 ];
        int[] trustees = new int[ 1000 ];


        for (int[] tr : trust
        ) {
            trusters[ tr[ 0 ] ]++;
            trustees[ tr[ 1 ] ]++;
            if (trustees[tr[1]] == N - 1){
                candidate = tr[1];
            }

        }
        if (candidate != -1&& trusters[candidate] > 0){
            return -1;
        }
        return candidate;
    }
}
