package leetcodemay;

import org.junit.Assert;
import org.junit.Test;

public class UncrossedLinesTest {
    @Test
    public void testIfWeCanCalculateMaxCrossingsFor3MemberArrays(){
        int[] a = new int[]{1,2,4};
        int[] b = new int[]{1,4,2};
        Assert.assertEquals(2,new UncrossedLines().maxUncrossedLines(a,b));
    }

    @Test
    public void testIfWeCanCalculateMaxCrossingsFor5MemberArrays(){
        int[] a = new int[]{2,5,1,2,5};
        int[] b = new int[]{10,5,2,1,5,2};
        Assert.assertEquals(2,new UncrossedLines().maxUncrossedLines(a,b));
    }
}
