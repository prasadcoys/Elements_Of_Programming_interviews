package leetcodemay;

import org.junit.Assert;
import org.junit.Test;

public class StockSpannerTest {
    @Test
    public void testIfStockSpannerWorks() {
        StockSpanner s = new StockSpanner();
        Assert.assertEquals(1, s.next(100));
        Assert.assertEquals(1, s.next(80));
        Assert.assertEquals(1, s.next(60));
        Assert.assertEquals(2, s.next(70));
        Assert.assertEquals(1, s.next(60));
        Assert.assertEquals(4, s.next(75));
        Assert.assertEquals(6, s.next(85));


        System.out.println(s.spans.toString());

    }
}
