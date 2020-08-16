package Array;


import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

public class ExtraCandiesTest {
    @Test
    public void testIfExtraCandiesWorksForCase1(){
        int[] candies = new int[]{2,3,5,1,3};
        int extraCandies = 3;
        Boolean[] output = new Boolean[]{true,true,true,false,true};
        assertIterableEquals(Arrays.asList(output),
                new ExtraCandies().kidsWithCandies(candies,extraCandies));
    }

    @Test
    public void testIfExtraCandiesWorksForCase2(){
        int[] candies = new int[]{4,2,1,1,2};
        int extraCandies = 1;
        Boolean[] output = new Boolean[]{true,false,false,false,false};
        assertIterableEquals(Arrays.asList(output),
                new ExtraCandies().kidsWithCandies(candies,extraCandies));
    }

    @Test
    public void testIfExtraCandiesWorksForCase3(){
        int[] candies = new int[]{12,1,12};
        int extraCandies = 10;
        Boolean[] output = new Boolean[]{true,false,true};
        assertIterableEquals(Arrays.asList(output),
                new ExtraCandies().kidsWithCandies(candies,extraCandies));
    }
}
