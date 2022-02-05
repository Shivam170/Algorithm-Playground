package AlgoPlayground.GFG.LinkedList;

import java.util.HashSet;

public class DetectLoop {
    // TC - O(n^2)
    // For every node check if next is already seen before

    // TC - O(n)
    // Modify the Node by adding extra entry of boolean visited

    // TC - O(n)
    // This method modifies the whole Linked List
    static boolean detectLoopModify(Node head) {
        Node temp = new Node(0);
        Node curr = head;
        while (curr != null) {
            if (curr.next == null) return false;
            if (curr.next == temp) return true;
            Node currNext = curr.next;
            curr.next = temp;
            curr = currNext;
        }
        return false;
    }

    // This method uses Hashing
    boolean detectLoopHashing(Node head) {
        HashSet<Node> set = new HashSet<>();
        Node temp = head;
        while (temp != null) {
            if (set.contains(temp)) {
                return true;
            }
            set.add(temp);
            temp = temp.next;
        }
        return false;
    }

    // Using Floyd cycle detection method
    boolean detectLoop(Node head) {
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }
}
