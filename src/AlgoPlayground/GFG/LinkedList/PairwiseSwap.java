package AlgoPlayground.GFG.LinkedList;

public class PairwiseSwap {
    void swapData(Node head) {
        Node curr = head;
        while (curr != null && curr.next != null) {
            int temp = curr.data;
            curr.data = curr.next.data;
            curr.next.data = temp;
            curr = curr.next.next;
        }
    }

    Node swapLinks(Node head) {
        if (head == null || head.next == null)
            return head;
        Node curr = head.next.next;
        Node prev = head;
        head = head.next;
        head.next = prev;
        while (curr != null && curr.next != null) {
            prev.next = curr.next;
            prev = curr;
            Node next = curr.next.next;
            curr.next.next = curr;
            curr = next;
        }
        prev.next = curr;
        return head;

    }
}
