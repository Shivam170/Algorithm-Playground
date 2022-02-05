package AlgoPlayground.GFG.LinkedList;

import java.util.ArrayList;

public class ReverseLinkedList {
    static Node reverseNaive(Node head) {
        ArrayList<Integer> list = new ArrayList<>();
        Node temp = head;
        while (temp != null) {
            list.add(temp.data);
            temp = temp.next;
        }
        temp = head;
        while (temp != null) {
            temp.data = list.remove(list.size() - 1);
            temp = temp.next;
        }
        return head;
    }

    static Node reverseIterative(Node head) {
        Node curr = head;
        Node prev = null;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    static Node reverseRec(Node head) {
        if (head == null || head.next == null) return head;
        Node restHead = reverseRec(head.next);
        Node restTail = head.next;
        restTail.next = head;
        head.next = null;
        return restHead;
    }

    static Node reverseRecII(Node curr, Node prev) {
        if (curr == null) return prev;
        Node next = curr.next;
        curr.next = prev;
        return reverseRecII(next, curr);
    }
}
