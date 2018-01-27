package C_0;

import C_0.utils.LinkedListNode;
import C_0.utils.MergeHeapNode;
import C_0.utils.MyLinkedList;
import C_0.utils.NodeMinHeap;

import java.util.ArrayList;
import java.util.List;

public class SortedListsMerger
{
    public static void merge(MyLinkedList listA, MyLinkedList listB)
    {
        LinkedListNode listACurrentNode = listA.getHead();
        LinkedListNode listBCurrentNode = listB.getHead();
        LinkedListNode listAPrevNode = null;
        while (true)
        {
            if (listBCurrentNode != null && listACurrentNode == null)
            {
                listAPrevNode.setNextNode(listBCurrentNode);
                break;
            } else if (listACurrentNode != null && listBCurrentNode == null)
            {
                break;
            } else if (listACurrentNode == null && listBCurrentNode
                    == null)
            {
                break;
            }
            if (listACurrentNode.getValue() < listBCurrentNode.getValue())
            {
                listAPrevNode = listACurrentNode;
                listACurrentNode = listACurrentNode.getNextNode();
            } else
            {
                if (listAPrevNode == null)
                {

                    LinkedListNode temp = listBCurrentNode;
                    listBCurrentNode = listBCurrentNode.getNextNode();
                    listB.setHead(listBCurrentNode);
                    listA.setHead(temp);
                    temp.setNextNode(listACurrentNode);
                    listAPrevNode = temp;

                } else
                {
                    listAPrevNode.setNextNode(listBCurrentNode);
                    LinkedListNode temp = listBCurrentNode;
                    listBCurrentNode = listBCurrentNode.getNextNode();
                    temp.setNextNode(listACurrentNode);
                    listAPrevNode = temp;
                }

            }

        }

    }

    public static List mergeMultipleLists(
            List<List<Integer>>
                    collectionOfAllSortedLists)
    {
        NodeMinHeap nodeMinHeap = new NodeMinHeap();
        List<Integer> sortedList = new ArrayList<>();
        for (int i = 0; i < collectionOfAllSortedLists.size(); i++)
        {
            nodeMinHeap.insert(new MergeHeapNode
                    ((collectionOfAllSortedLists.get(i).remove(0)), i));

        }
        int i = collectionOfAllSortedLists.size();
        while (i>0)
        {
            MergeHeapNode leastValueNode = nodeMinHeap.extractMini();
            sortedList.add(leastValueNode.getValue());
            int arrayNumber = leastValueNode
                    .getArrayNumber();
            if (collectionOfAllSortedLists.get(arrayNumber).isEmpty())
            {
                i--;
                continue;
            } else
            {
                nodeMinHeap.insert(new MergeHeapNode(collectionOfAllSortedLists.get
                        (arrayNumber).remove(0),arrayNumber));
            }
        }

        return sortedList;
    }
}
