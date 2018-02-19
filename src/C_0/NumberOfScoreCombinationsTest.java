package C_0;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberOfScoreCombinationsTest
{
    @Test
    public void testIfScoreCombinationsForASimpleCombinationWorks()
    {
        int[] validPoints = {2,3,7};
        int score = 12;
        int expectedCombinations = 4;
        assertEquals(expectedCombinations,NumberOfScoreCombinations
                .getValidCombinations(score,validPoints));

    }
}
