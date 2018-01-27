package C_0;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SortedListsMergerHeapTest
{
    @Test
    public void testIfmerging3SortedListsWorksCorrectly()
    {
        List<Integer> listA = new ArrayList<>();
        listA.add(1);
        listA.add(3);
        listA.add(5);

        List<Integer> listB = new ArrayList<>();
        listB.add(2);
        listB.add(4);
        listB.add(6);
        List<Integer> listC = new ArrayList<>();
        listC.add(7);
        listC.add(9);

        List<List<Integer>> collectionOfLists = new ArrayList<>();
        collectionOfLists.add(listA);
        collectionOfLists.add(listB);
        collectionOfLists.add(listC);
        List mergedList = new ArrayList();
        mergedList.add(1);
        mergedList.add(2);
        mergedList.add(3);
        mergedList.add(4);
        mergedList.add(5);
        mergedList.add(6);
        mergedList.add(7);
        mergedList.add(9);
        assertEquals(mergedList, SortedListsMerger.mergeMultipleLists
                (collectionOfLists));

    }
}
