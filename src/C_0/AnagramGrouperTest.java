package C_0;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class AnagramGrouperTest
{
    @Test
    public void testIfWordsAreGroupedIntoAnagramsCorrectly()
    {
        List<String> listOfWords = new ArrayList<>();
        List<List<String>> anagramsExpected = new ArrayList<>();
        listOfWords.add("silent");
        listOfWords.add("listen");
        listOfWords.add("badcredit");
        listOfWords.add("debitcard");
        listOfWords.add("notananagramword");
        List<String> firstAnagram = new ArrayList<>();
        firstAnagram.add("silent");
        firstAnagram.add("listen");
        List<String> secondAnagram = new ArrayList<>();
        secondAnagram.add("badcredit");
        secondAnagram.add("debitcard");
        anagramsExpected.add(firstAnagram);
        anagramsExpected.add(secondAnagram);
        assertEquals(anagramsExpected,AnagramGrouper.getGroupsOfAnagrams
                (listOfWords))
        ;

    }
}
