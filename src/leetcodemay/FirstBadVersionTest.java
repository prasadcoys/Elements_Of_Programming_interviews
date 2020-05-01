package leetcodemay;

import org.junit.Assert;
import org.junit.Test;

public class FirstBadVersionTest {

    @Test
    public void testIfBadVersionWorks(){

        FirstBadVersion badVersion = new FirstBadVersion();
        badVersion.setFirstBadVersion(1);
        Assert.assertTrue(badVersion.isBadVersion(1));
        Assert.assertTrue(badVersion.isBadVersion(25));

    }

    @Test
    public void testIfGetFirstBadVersionWorksWhenFirstVersionisTheFirstBad(){
        FirstBadVersion badVersion = new FirstBadVersion();
        badVersion.setFirstBadVersion(1);
        Assert.assertEquals(1,badVersion.firstBadVersion(30));
    }

    @Test
    public void testIfGetFirstBadVersionWorksWhenLastElementIsTheFirstBadVersion(){
        FirstBadVersion badVersion = new FirstBadVersion();
        badVersion.setFirstBadVersion(30);
        Assert.assertEquals(30,badVersion.firstBadVersion(30));
    }

    @Test
    public void testIfGetFirstBadVersionWorksWhenMiddleElementIsTheFirstBadVersion(){
        FirstBadVersion badVersion = new FirstBadVersion();
        badVersion.setFirstBadVersion(15000);
        Assert.assertEquals(15000,badVersion.firstBadVersion(30000));
    }

    @Test
    public void testIfGetFirstBadVersionWorksWhenRandomElementIsTheFirstBadVersion(){
        FirstBadVersion badVersion = new FirstBadVersion();
        badVersion.setFirstBadVersion(1702766719);
        Assert.assertEquals(1702766719,badVersion.firstBadVersion(2126753390));
    }

    @Test
    public void testIfLeftShiftDividesBytwo(){
        int num = 12;
        System.out.println(12>>1);
    }
}



