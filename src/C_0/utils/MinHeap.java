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
        return list.get((i*2)+1);
    }

    public int getRightChild(int i)
    {
        return list.get((i*2)+2);
    }

    public boolean hasLeftChild(int i)
    {
        return (((i*2)+1)<list.size());
    }

    public boolean hasRightChild(int i)
    {
        return (((i*2)+2)<list.size());
    }
}
