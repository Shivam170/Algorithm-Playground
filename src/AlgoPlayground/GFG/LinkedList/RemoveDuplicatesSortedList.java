package AlgoPlayground.GFG.LinkedList;

public class RemoveDuplicatesSortedList {
    void remDup(Node head) {
        Node curr = head;
        while (curr != null && curr.next != null) {
            if (curr.data == curr.next.data) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }
    }
}
