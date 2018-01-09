package C_0;

import C_0.utils.LinkedListNode;
import C_0.utils.MyLinkedList;

import java.util.List;
import java.util.ListIterator;

public class SortedListsMerger
{
    public static void merge(MyLinkedList listA, MyLinkedList listB)
    {
        LinkedListNode listACurrentNode = listA.getHead();
        LinkedListNode listBCurrentNode = listB.getHead();
        LinkedListNode listAPrevNode = listACurrentNode;
        LinkedListNode listBPrevNode = listBCurrentNode;
        while (true)
        {
            if(listBCurrentNode != null && listACurrentNode==null)
            {
               listAPrevNode.setNextNode(listBCurrentNode);
               break;
            }
            else if(listACurrentNode!=null && listBCurrentNode == null)
            {
                break;
            }
            else if(listACurrentNode == null && listBCurrentNode
                    ==null)
            {
                break;
            }
            if(listACurrentNode.getValue()<listBCurrentNode.getValue())
            {
                listAPrevNode = listACurrentNode;
                listACurrentNode = listACurrentNode.getNextNode();
            }
            else
            {
                listAPrevNode.setNextNode(listBCurrentNode);
                listBCurrentNode = listBCurrentNode.getNextNode();
                listAPrevNode.getNextNode().setNextNode(listACurrentNode);
            }

        }

    }
}
