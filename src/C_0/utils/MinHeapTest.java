package C_0.utils;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

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
        assertEquals(2, heap.getLeftChild(0));
        assertEquals(3, heap.getRightChild(0));
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

    @Test
    public void testIfInsertOfGreaterElementWorks()
    {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        MinHeap heap = new MinHeap(list);
        heap.insert(4);
        assertTrue(heap.hasLeftChild(1));
        assertEquals(4, heap.getLeftChild(1));
    }

    @Test
    public void testIfInsertOfLesserElementWorks()
    {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(4);
        MinHeap heap = new MinHeap(list);
        heap.insert(2);
        assertTrue(heap.hasLeftChild(1));
        assertEquals(3, heap.getLeftChild(1));
    }

    @Test
    public void testIfInsertOfLesserElementToRightChildWorks()
    {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(5);
        MinHeap heap = new MinHeap(list);
        heap.insert(2);
        assertTrue(heap.hasRightChild(1));
        assertEquals(5, heap.getLeftChild(1));
        assertEquals(3, heap.getRightChild(1));
    }

    @Test
    public void testIfGetMiniWorksCorrectly()
    {
        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(3);
        list.add(7);
        list.add(5);
        MinHeap heap = new MinHeap(list);
        heap.insert(2);
        assertEquals(2, heap.getMini());
    }

    @Test
    public void testIfExtractMinWorksCorrectly()
    {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(3);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        MinHeap heap = new MinHeap(list);
        assertEquals(1, heap.getMini());
        assertEquals(1, heap.extractMini());
        assertEquals(3, heap.getMini());
    }


}
