package AlgoPlayground.GFG.LinkedList;

public class CircularDoublyLinkedList {
    static DNode insertFirst(DNode head, int x) {
        DNode node = new DNode(x);
        if (head == null) {
            node.next = node;
            node.prev = node;
            return node;
        }
        node.prev = head.prev;
        node.next=head;
        head.prev.next=node;
        head.prev = node;
        return node;
    }
}
