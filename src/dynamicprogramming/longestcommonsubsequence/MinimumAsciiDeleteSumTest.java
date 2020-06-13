package dynamicprogramming.longestcommonsubsequence;

import org.junit.Assert;
import org.junit.Test;

public class MinimumAsciiDeleteSumTest {

    @Test
    public void testIfWeGet231WhenTryingToEquifySeaAndEat(){
        Assert.assertEquals(231,
                new MinimumAsciiDeleteSum().minimumDeleteSum("eat","sea"));
    }
    @Test
    public void testIfWeGetLeastSumWhenThereAreMultiplePossibilities(){
        Assert.assertEquals(403,
            new MinimumAsciiDeleteSum().minimumDeleteSum("delete","leet"));

    }

    @Test
    public void testIf1178IsTheMinimumForCaabcccacccccaAndcacbaaac(){
        Assert.assertEquals(1178,
                new MinimumAsciiDeleteSum().minimumDeleteSum("caabcccaccccca","cacbaaac"));
    }

    @Test
    public void testIfLongStringsCanBeProcessed(){
        String s =
                "igijekdtywibepwonjbwykkqmrgmtybwhwjiqudxmnniskqjfbkpcxukrablqmwjndlhblxflgehddrvwfacarwkcpmcfqnajqfxyqwiugztocqzuikamtvmbjrypfqvzqiwooewpzcpwhdejmuahqtukistxgfafrymoaodtluaexucnndlnpeszdfsvfofdylcicrrevjggasrgdhwdgjwcchyanodmzmuqeupnpnsmdkcfszznklqjhjqaboikughrnxxggbfyjriuvdsusvmhiaszicfa";
        String t =
                "ikhuivqorirphlzqgcruwirpewbjgrjtugwpnkbrdfufjsmgzzjespzdcdjcoioaqybciofdzbdieegetnogoibbwfielwungehetanktjqjrddkrnsxvdmehaeyrpzxrxkhlepdgpwhgpnaatkzbxbnopecfkxoekcdntjyrmmvppcxcgquhomcsltiqzqzmkloomvfayxhawlyqxnsbyskjtzxiyrsaobbnjpgzmetpqvscyycutdkpjpzfokvi";
        Assert.assertEquals(41731,
                new MinimumAsciiDeleteSum().minimumDeleteSum(s,t));
    }
}




