package BitManipulation;

import org.junit.Assert;
import org.junit.Test;

public class DifferenceFinderTest {
    @Test
    public void testIfDifferenceBetweenStringsCanBeFound(){
        Assert.assertEquals('e',
                new DifferenceFinder().findTheDifference("abcd","abcde"));
        Assert.assertEquals('e',
                new DifferenceFinder().findTheDifference("abcd","abced"));
    }
}
