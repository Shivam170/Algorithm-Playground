package AlgoPlayground.GFG.LinkedList;

public class MiddleNode {
    // Require 2 traversal
    static Node middleNode(Node head) {
        if (head == null) return null;
        int count = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            count++;
        }
        temp = head;
        for (int i = 0; i < count / 2; i++) {
            temp = temp.next;
        }
        return temp;
    }

    static Node middleNodeFast(Node head) {
        if (head == null) return null;
        Node slow, fast;
        slow = fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
