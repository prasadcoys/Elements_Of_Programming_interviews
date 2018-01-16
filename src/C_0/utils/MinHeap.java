package C_0.utils;

import java.util.List;

public class MinHeap
{
    private List<Integer> list;

    public MinHeap(List<Integer> list)
    {
        this.list = list;
    }

    public int getLeftChild(int i)
    {
        return list.get((i * 2) + 1);
    }

    public int getRightChild(int i)
    {
        return list.get((i * 2) + 2);
    }

    public boolean hasLeftChild(int i)
    {
        return (((i * 2) + 1) < list.size());
    }

    public boolean hasRightChild(int i)
    {
        return (((i * 2) + 2) < list.size());
    }

    public void insert(int i)
    {
        list.add(i);
        int currentIndex = list.size() - 1;
        int parentIndex = getParentIndex(currentIndex);
        while (parentIndex >= 0)
        {
            Integer parentValue = list.get(parentIndex);
            if (i < parentValue)
            {
                list.set(parentIndex, i);
                list.set(currentIndex, parentValue);
                currentIndex = parentIndex;
                parentIndex = getParentIndex(currentIndex);
            }
            else
            {
                break;
            }
        }
    }

    public int getParentIndex(int currentIndex)
    {
        int parentIndex = 0;
        if (currentIndex % 2 == 0)
        {
            parentIndex = ((currentIndex) / 2) - 1;
        } else
        {
            parentIndex = (currentIndex) / 2;

        }
        return parentIndex;
    }
}
