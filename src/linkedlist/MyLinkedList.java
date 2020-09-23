package linkedlist;

public class MyLinkedList {
    private Node head;
    private int length;

    public MyLinkedList() {
        head = null;
        length = 0;
    }

    public void addAtHead(int val) {
        Node node = new Node(val);
        node.next = this.head;
        this.head = node;
        this.length++;
    }

    public int get(int index) {
        if (!(index < this.length)) {
            return -1;
        }
        int i = 0;
        Node currentNode = this.head;
        while (i < index) {
            currentNode = currentNode.next;
            i++;
        }
        return currentNode.val;
    }

    public void addAtTail(int val) {
        Node node = new Node(val);
        Node currentNode = this.head;
        if (currentNode == null) {
            this.head = node;
            this.length++;
            return;
        }
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = node;
        this.length++;
    }

    public void addAtIndex(int index, int val) {
        if (index == 0) {
            addAtHead(val);
            return;
        }
        if (index > this.length) {
            return;
        }
        Node node = new Node(val);
        int i = 0;
        Node currentNode = this.head;
        while (i < index - 1) {
            currentNode = currentNode.next;
            i++;
        }
        Node temp = currentNode.next;
        currentNode.next = node;
        node.next = temp;
        this.length++;
    }

    public void deleteAtIndex(int index) {
        if ( !(index < this.length)){
            return;
        }
        if (index == 0){
            this.head = this.head.next;
            this.length--;
            return;
        }
        int i = 0;
        Node currentNode = this.head;
        while (i < index - 1) {
            currentNode = currentNode.next;
            i++;
        }

        currentNode.next = currentNode.next.next;
        this.length--;


    }
}

class Node {
    int val;
    Node next;

    public Node(int val) {
        this.val = val;
    }
}
