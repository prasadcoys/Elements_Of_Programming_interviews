package C_0.utils;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class MinHeapTest
{
    @Test
    public void testIfHeapsLeftAndRightChildGetterWorkProperly()
    {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        MinHeap heap = new MinHeap(list);
        assertEquals(2,heap.getLeftChild(0));
        assertEquals(3,heap.getRightChild(0));
    }
    @Test
    public void testIfLeafHasChildren()
    {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        MinHeap heap = new MinHeap(list);
        assertFalse(heap.hasLeftChild(2));
        assertTrue(heap.hasLeftChild(0));
        assertFalse(heap.hasRightChild(1));
        assertTrue(heap.hasRightChild(0));
    }
}
