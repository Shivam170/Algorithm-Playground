package AlgoPlayground.GFG.LinkedList;

import java.util.ArrayDeque;
import java.util.Deque;

public class PalindromeLinkedList {
    boolean isPalindrome(Node head) {
        Deque<Character> stack = new ArrayDeque<>();
        for (Node curr = head; curr != null; curr = curr.next) {
            stack.push((char) curr.data);
        }
        for (Node curr = head; curr != null; curr = curr.next) {
            if (stack.pop() != curr.data) {
                return false;
            }
        }
        return true;
    }

    boolean isPalindromeEff(Node head) {
        if (head == null) return true;
        Node slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node rev = ReverseLinkedList.reverseIterative(slow.next);
        Node curr = head;
        while (rev != null) {
            if (rev.data != curr.data) {
                return false;
            }
        }
        return true;
    }
}
