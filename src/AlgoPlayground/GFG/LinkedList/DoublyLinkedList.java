package AlgoPlayground.GFG.LinkedList;


class DNode {
    int data;
    DNode next;
    DNode prev;

    DNode(int x) {
        data = x;
        next = null;
        prev = null;
    }
}

public class DoublyLinkedList {
    static DNode insertBegin(DNode head, int x) {
        DNode node = new DNode(x);
        node.next = head;
        if (head != null)
            head.prev = node;
        return node;
    }

    static DNode insertEnd(DNode head, int x) {
        DNode node = new DNode(x);
        if (head == null) {
            return node;
        }
        DNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
        node.prev = temp;
        return head;
    }

    public static void main(String[] args) {
        DNode head = null;
        head = insertEnd(head, 10);
        head = insertEnd(head, 20);
    }
}
