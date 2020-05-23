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
    }

    @Test
    public void testIfStockSpannerWorksWhenEntriesAreDuplicate() {
        StockSpanner s = new StockSpanner();
        Assert.assertEquals(1, s.next(28));
        Assert.assertEquals(1, s.next(14));
        Assert.assertEquals(3, s.next(28));
        Assert.assertEquals(4, s.next(35));
        Assert.assertEquals(5, s.next(46));
        Assert.assertEquals(6, s.next(53));
        Assert.assertEquals(7, s.next(66));
        Assert.assertEquals(8, s.next(80));
        Assert.assertEquals(9, s.next(87));
        Assert.assertEquals(10, s.next(88));
    }
}
