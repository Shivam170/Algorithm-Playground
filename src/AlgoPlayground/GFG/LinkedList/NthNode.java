package AlgoPlayground.GFG.LinkedList;

public class NthNode {
    static Node nthNodeNaive(Node head, int n) {
        if (head == null) return null;
        int len = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            len++;
        }
        if (len < n) {
            return null;
        }
        temp = head;
        for (int i = 0; i < len - n + 1; i++) {
            temp = temp.next;
        }
        return temp;
    }

    static Node nthNode(Node head, int n) {
        if (head == null) return null;
        Node first = head;
        for (int i = 0; i < n; i++) {
            if (first == null) return null;
            first = first.next;
        }
        Node second = head;
        while (first != null) {
            first = first.next;
            second = second.next;
        }
        return second;
    }
}
