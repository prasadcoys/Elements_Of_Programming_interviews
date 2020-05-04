package leetcodemay;

import org.junit.Assert;
import org.junit.Test;

public class NumberComplementTest {

    @Test
    public void testIfWeCanConvertIntoItsComplement(){
        Assert.assertEquals(2,new NumberComplement().findComplement(5));
    }

    @Test
    public void testIfWeCanConvert8ntoItsComplement(){
        Assert.assertEquals(7,new NumberComplement().findComplement(8));
    }
}
