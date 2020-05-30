package dynamicprogramming;

public class MinCostClimbingStairs {
    public int minCostClimbingStairs(final int[] cost) {

        int mincost0 = cost[0];
        int mincost1 = cost[1];
        for (int i = 2; i < cost.length; i++) {
            final int temp = mincost1;
            mincost1 = cost[i]+Math.min(mincost0,mincost1);
            mincost0 = temp;
        }

        return Math.min(mincost0,
                mincost1);

    }
}
