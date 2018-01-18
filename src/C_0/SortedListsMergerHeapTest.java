package C_0;

import C_0.utils.MinHeap;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SortedListsMergerHeapTest
{
    @Test
    public void testIfmerging3SortedListsWorksCorrectly()
    {
        List listA = new ArrayList();
        listA.add(1);
        listA.add(3);
        listA.add(5);
        MinHeap heapA = new MinHeap(listA);

        List listB = new ArrayList();
        listB.add(2);
        listB.add(4);
        listB.add(6);
        MinHeap heapB = new MinHeap(listB);
        List listC = new ArrayList();
        listC.add(7);
        listC.add(9);
        MinHeap heapC = new MinHeap(listC);

        List collectionOfAllHeaps = new ArrayList();
        collectionOfAllHeaps.add(heapA);
        collectionOfAllHeaps.add(heapB);
        collectionOfAllHeaps.add(heapC);
        List mergedList = new ArrayList();
        mergedList.add(1);
        mergedList.add(2);
        mergedList.add(3);
        mergedList.add(4);
        mergedList.add(5);
        mergedList.add(6);
        mergedList.add(7);
        mergedList.add(9);
        assertEquals(mergedList,SortedListsMerger.mergeMultipleHeaps
                (collectionOfAllHeaps));

    }
}
