package dynamicprogramming;

public class ClimbingStairs {
    public int climbStairs(int n) {
        if (n == 0){
            return 0;
        }
        int x = 1;
        int y = 1;
        for (int i = 2; i <= n; i++) {
            int temp = y;
            y = x+y;
            x = temp;
        }

        return y;

    }
}
