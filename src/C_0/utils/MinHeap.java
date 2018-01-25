package C_0.utils;

import java.util.ArrayList;
import java.util.List;

public class MinHeap
{
    private List<Integer> list;

    public MinHeap(List<Integer> list)
    {
        this.list = new ArrayList<>();
        for (Integer i : list)
        {
            insert(i);
        }
    }

    public MinHeap()
    {

    }


    public int getLeftChild(int i)
    {
        return list.get(getLeftIndex(i));
    }

    public int getRightChild(int i)
    {
        return list.get(getRightIndex(i));
    }

    public static int getRightIndex(int i)
    {
        return (i * 2) + 2;
    }

    public boolean hasLeftChild(int i)
    {
        return (getLeftIndex(i) < list.size());
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
            } else
            {
                break;
            }
        }
    }

    public static int getLeftIndex(int i)
    {
        return (i * 2) + 1;
    }

    public boolean hasRightChild(int i)
    {
        return ((getRightIndex(i)) < list.size());
    }

    public static int getParentIndex(int currentIndex)
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

    public int getMini()
    {
        return list.get(0);
    }

    public int extractMini()
    {
        int mini = list.get(0);
        int lastItem = list.remove(list.size() - 1);
        if(list.isEmpty())
        {
            return lastItem;
        }
        list.set(0, lastItem);
        int currentIndex = 0;
        int leftValue = -1, rightValue = -1;
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
                rightIndex = getRightIndex(currentIndex);
                rightValue = getRightChild(currentIndex);
            }
            if ((list.get(currentIndex) <= leftValue && list.get
                    (currentIndex) <= rightValue) || (!hasLeftChild
                    (currentIndex) && !hasRightChild(currentIndex)))
            {
                break;
            }
            if ((hasLeftChild(currentIndex) && hasRightChild
                    (currentIndex)))
            {
                if (leftValue <= rightValue)
                {
                    if (list.get(currentIndex) > leftValue)
                    {
                        int temp = list.get(currentIndex);
                        list.set(currentIndex, leftValue);
                        list.set(leftIndex, temp);
                        currentIndex = leftIndex;
                    } else
                    {
                        break;
                    }
                } else
                {
                    if (list.get(currentIndex) > rightValue)
                    {
                        int temp = list.get(currentIndex);
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
                if (list.get(currentIndex) > leftValue)
                {
                    int temp = list.get(currentIndex);
                    list.set(currentIndex, leftValue);
                    list.set(leftIndex, temp);
                    currentIndex = leftIndex;
                } else
                {
                    break;
                }
            } else if (hasRightChild(currentIndex))
            {
                if (list.get(currentIndex) > rightValue)
                {
                    int temp = list.get(currentIndex);
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
