package C_0;

import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class SortedListsMergerTest
{

    @Test
    public void testIfMergingSortedListsWorks()
    {
        List<Integer> listA = new LinkedList<>();
        listA.add(2);
        listA.add(5);
        List<Integer> listB = new LinkedList<>();
        listB.add(3);
        listB.add(7);
        SortedListsMerger.merge(listA,listB);
        List<Integer> expectedList = new LinkedList<>();
        expectedList.add(2);
        expectedList.add(3);
        expectedList.add(5);
        expectedList.add(7);
        assertEquals(expectedList,listA);



    }
}
