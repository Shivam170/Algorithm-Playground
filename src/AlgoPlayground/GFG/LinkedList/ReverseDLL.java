package AlgoPlayground.GFG.LinkedList;

public class ReverseDLL {
    static DNode reverse(DNode head) {
        if (head == null || head.next == null) return head;
        DNode temp = head;
        DNode prev = null;
        while (temp != null) {
            prev = temp.prev;
            temp.prev = temp.next;
            temp.next = prev;
            temp = temp.prev;
        }
        return prev.prev;
    }
}
