package AlgoPlayground.GFG.LinkedList;

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

    }
}
