package C_0;

import C_0.utils.LinkedListNode;
import C_0.utils.MyLinkedList;

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

    public static List mergeMultipleHeaps(List<List> collectionOfAllHeaps)
    {
        for(List list : collectionOfAllHeaps)
        {

        }

        return null;
    }
}
