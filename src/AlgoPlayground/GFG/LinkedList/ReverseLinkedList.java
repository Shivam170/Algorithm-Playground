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
}
