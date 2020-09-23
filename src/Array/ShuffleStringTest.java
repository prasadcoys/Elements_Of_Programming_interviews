package Array;

import org.junit.Assert;
import org.junit.Test;

public class ShuffleStringTest {
    @Test
    public void testIfWeCanRestoreString() {
        Assert.assertEquals("leetcode",
                new ShuffleString().restoreString("codeleet", new int[]{4,
                        5, 6, 7, 0, 2, 1, 3
                }));
        Assert.assertEquals("abc",
                new ShuffleString().restoreString("abc", new int[]{0,1,
                        2}));

    }
}
