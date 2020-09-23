package string;

import org.junit.Assert;
import org.junit.Test;

public class IPAddressDefangerTest {
    @Test
    public void testIfIpAddressCanBeDefanged(){
        Assert.assertEquals("1[.]1[.]1[.]1",
                new IPAddressDefanger().defangIPaddr("1.1.1.1"));
    }
}
