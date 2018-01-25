package C_0.utils;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NodeMinHeapTest
{

    @Test
    public void testIfMergingTwoNodesIntoAMinHeapworksCorrectly()
    {
        MergeHeapNode node1 = new MergeHeapNode(1,0);
        MergeHeapNode node2 = new MergeHeapNode(2,1);
        NodeMinHeap nodeMinHeap = new NodeMinHeap();
        nodeMinHeap.insert(node1);
        nodeMinHeap.insert(node2);
        MergeHeapNode node = nodeMinHeap.getMini();
        assertEquals( 1,node.getValue());
        assertEquals(0,node.getArrayNumber());

    }

    @Test
    public void testIfMergingTwoNodesInReverseIntoAMinHeapworksCorrectly()
    {
        MergeHeapNode node1 = new MergeHeapNode(2,0);
        MergeHeapNode node2 = new MergeHeapNode(1,1);
        NodeMinHeap nodeMinHeap = new NodeMinHeap();
        nodeMinHeap.insert(node1);
        nodeMinHeap.insert(node2);
        MergeHeapNode node = nodeMinHeap.getMini();
        assertEquals( 1,node.getValue());
        assertEquals(1,node.getArrayNumber());

    }

    @Test
    public void
    testIfMergingThreeNodesInReverseIntoAMinHeapworksCorrectly()
    {
        MergeHeapNode node1 = new MergeHeapNode(2,0);
        MergeHeapNode node2 = new MergeHeapNode(1,1);
        MergeHeapNode node3 = new MergeHeapNode(3,3);
        NodeMinHeap nodeMinHeap = new NodeMinHeap();
        nodeMinHeap.insert(node1);
        nodeMinHeap.insert(node2);
        nodeMinHeap.insert(node3);
        MergeHeapNode node = nodeMinHeap.getMini();
        assertEquals( 1,node.getValue());
        assertEquals(1,node.getArrayNumber());
        assertEquals(2,nodeMinHeap.getLeftChild(0).getValue());
        assertEquals(3,nodeMinHeap.getRightChild(0).getValue());

    }

    @Test
    public void testIfExtractWorksCorrectly()
    {
        MergeHeapNode node1 = new MergeHeapNode(2,0);
        MergeHeapNode node2 = new MergeHeapNode(1,1);
        MergeHeapNode node3 = new MergeHeapNode(3,3);
        NodeMinHeap nodeMinHeap = new NodeMinHeap();
        nodeMinHeap.insert(node1);
        nodeMinHeap.insert(node2);
        nodeMinHeap.insert(node3);
        MergeHeapNode node = nodeMinHeap.extractMini();
        assertEquals(1,node.getValue());
        assertEquals(1,node.getArrayNumber());
        node = nodeMinHeap.extractMini();
        assertEquals(2,node.getValue());
        assertEquals(0,node.getArrayNumber());
        node = nodeMinHeap.getMini();
        assertEquals(3,node.getValue());
        assertEquals(3,node.getArrayNumber());

    }

}
