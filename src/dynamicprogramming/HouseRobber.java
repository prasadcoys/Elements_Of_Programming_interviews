package dynamicprogramming;

public class HouseRobber {
    public int rob(int[] houses) {

        int maxLoot0 = 0;
        int maxLoot1 = 0;
        for (int i = 0; i < houses.length; i++) {
            if ( i == 0){
                maxLoot1 = houses[i];
                continue;
            }
            int temp = maxLoot1;
            maxLoot1 = Math.max(houses[i]+maxLoot0,maxLoot1);
            maxLoot0 = temp;
        }
        return Math.max(maxLoot0,maxLoot1);
    }
}
