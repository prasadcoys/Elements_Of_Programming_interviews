package C_0.utils;

import java.util.ArrayList;

public class NodeMinHeap
{
    private ArrayList<MergeHeapNode> list;

    public NodeMinHeap()
    {
        this.list = new ArrayList<>();
    }

    public void insert(MergeHeapNode node)
    {
        list.add(node);
        int currentIndex = list.size() - 1;
        int parentIndex = MinHeap.getParentIndex(currentIndex);
        while (parentIndex >= 0)
        {
            MergeHeapNode parentValue = list.get(parentIndex);
            if (node.getValue() < parentValue.getValue())
            {
                list.set(parentIndex, node);
                list.set(currentIndex, parentValue);
                currentIndex = parentIndex;
                parentIndex = MinHeap.getParentIndex(currentIndex);
            } else
            {
                break;
            }
        }

    }

    public void insert(int i)
    {
    }

    public MergeHeapNode getMini()
    {
        return list.get(0);
    }

    public MergeHeapNode getLeftChild(int i)
    {
        return list.get(MinHeap.getLeftIndex(i));
    }

    public MergeHeapNode getRightChild(int i)
    {
        return list.get(MinHeap.getRightIndex(i));
    }
}
