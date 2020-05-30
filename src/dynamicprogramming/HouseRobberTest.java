package dynamicprogramming;

import org.junit.Assert;
import org.junit.Test;

public class HouseRobberTest {

    @Test
    public void testIfHouseRobberCanGetZeroLootInZeroHouses(){
        Assert.assertEquals(0,new HouseRobber().rob(new int[]{}));
    }

    @Test
    public void testIfHouseRobberGetsFullLootWhenThereAreNoAdjacentHouses(){
        Assert.assertEquals(1,new HouseRobber().rob(new int[]{1}));
    }

    @Test
    public void testIfHouseRobberGetsMaximumLootWhenThereAreOnlyTwoHouses(){
        Assert.assertEquals(2,new HouseRobber().rob(new int[]{1,2}));
    }

    @Test
    public void TestIfHouseRobberCanGetMaximumLootWhenHeAlternatesFromHouse1(){
        Assert.assertEquals(4,new HouseRobber().rob(new int[]{1,2,3,1}));
    }

    @Test
    public void testIfHouseRobberGetsMaximumLootWhenHeAlternatesFromHouse1WithOddNumb3erOfHouses(){
        Assert.assertEquals(12,new HouseRobber().rob(new int[]{2,7,9,3,
                1}));
    }

    @Test
    public void testIfHouseRobberGetsMaximumLootWhenHeHasToSkipTwoHouses(){
        Assert.assertEquals(6,new HouseRobber().rob(new int[]{2,1,1,4}));
    }
}
