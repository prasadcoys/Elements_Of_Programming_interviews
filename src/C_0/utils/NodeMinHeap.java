package C_0.utils;

import java.util.ArrayList;

import static C_0.utils.MinHeap.getLeftIndex;

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
        return list.get(getLeftIndex(i));
    }

    public MergeHeapNode getRightChild(int i)
    {
        return list.get(MinHeap.getRightIndex(i));
    }

    public boolean hasLeftChild(int i)
    {
        return (getLeftIndex(i) < list.size());
    }

    public boolean hasRightChild(int i)
    {
        return ((MinHeap.getRightIndex(i)) < list.size());
    }


    public MergeHeapNode extractMini()
    {
        MergeHeapNode mini = list.get(0);
        MergeHeapNode lastItem = list.remove(list.size() - 1);
        if(list.isEmpty())
        {
            return lastItem;
        }
        list.set(0, lastItem);
        int currentIndex = 0;
        MergeHeapNode leftValue = null;
        MergeHeapNode rightValue = null;
        int leftIndex = 0, rightIndex = 0;
        while (true)
        {
            if (hasLeftChild(currentIndex))
            {
                leftIndex = getLeftIndex(currentIndex);
                leftValue = getLeftChild(currentIndex);

            }
            if (hasRightChild(currentIndex))
            {
                rightIndex = MinHeap.getRightIndex(currentIndex);
                rightValue = getRightChild(currentIndex);
            }
            if ((leftValue != null && rightValue != null) && (list.get
                    (currentIndex).getValue()
                    <=
                    leftValue
                            .getValue() && list
                    .get
                            (currentIndex).getValue() <= rightValue.getValue()) ||
                    (!hasLeftChild
                            (currentIndex) && !hasRightChild(currentIndex)))
            {
                break;
            }
            if ((hasLeftChild(currentIndex) && hasRightChild
                    (currentIndex)))
            {
                if (leftValue.getValue() <= rightValue.getValue())
                {
                    if (list.get(currentIndex).getValue() > leftValue.getValue())
                    {
                        MergeHeapNode temp = list.get(currentIndex);
                        list.set(currentIndex, leftValue);
                        list.set(leftIndex, temp);
                        currentIndex = leftIndex;
                    } else
                    {
                        break;
                    }
                } else
                {
                    if (list.get(currentIndex).getValue() > rightValue.getValue())
                    {
                        MergeHeapNode temp = list.get(currentIndex);
                        list.set(currentIndex, rightValue);
                        list.set(rightIndex, temp);
                        currentIndex = rightIndex;
                    } else
                    {
                        break;
                    }
                }
            } else if (hasLeftChild(currentIndex))
            {
                if (list.get(currentIndex).getValue() > leftValue.getValue())
                {
                    MergeHeapNode temp = list.get(currentIndex);
                    list.set(currentIndex, leftValue);
                    list.set(leftIndex, temp);
                    currentIndex = leftIndex;
                } else
                {
                    break;
                }
            } else if (hasRightChild(currentIndex))
            {
                if (list.get(currentIndex).getValue() > rightValue.getValue())
                {
                    MergeHeapNode temp = list.get(currentIndex);
                    list.set(currentIndex, rightValue);
                    list.set(rightIndex, temp);
                    currentIndex = rightIndex;
                } else
                {
                    break;
                }
            }
        }
        return mini;
    }
}
