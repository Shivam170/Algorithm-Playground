package AlgoPlayground.GFG.LinkedList;

public class SortedInsert {
    static Node sortedInsert(Node head, int x) {
        Node node = new Node(x);
        if (head == null) {
            return node;
        }
        if (x < head.data) {
            node.next = head;
            return node;
        }
        Node curr = head;
        while (curr.next != null && curr.next.data < x)
            curr = curr.next;
        node.next = curr.next;
        curr.next = node;
        return head;
    }
}
