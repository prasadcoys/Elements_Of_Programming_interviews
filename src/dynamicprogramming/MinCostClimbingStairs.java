package dynamicprogramming;

public class MinCostClimbingStairs {
    public int minCostClimbingStairs(int[] cost) {
        int minCost = 0;

        for (int i = cost.length;i>=0;){
            if (i <= 1){
                break;
            }
            if(cost[i-1]<cost[i-2]){
                minCost+=cost[i-1];
                i = i-1;
            } else {
                minCost+=cost[i-2];
                i = i-2;
            }

        }
        return minCost;
    }
}
