package AlgoPlayground.GFG.LinkedList;

public class CircularLinkedList {
    static void traverse(Node head) {
        if (head == null) return;
        System.out.print(head.data + " ");
        for (Node r = head.next; r != head; r = r.next) {
            System.out.print(r.data + " ");
        }

        // Other Way
        Node temp = head;
        do {
            System.out.println(temp.data);
            temp = temp.next;
        } while (temp != head);

    }

    static Node insertBegin(Node head, int x) {
        Node node = new Node(x);
        if (head == null) {
            node.next = node;
        } else {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = node;
            node.next = head;
            return node;
        }
        return node;
    }

    static Node insertBeginFast(Node head, int x) {
        Node node = new Node(x);
        if (head == null) {
            node.next = node;
            return node;
        }

        node.next = head.next;
        head.next = node;
        int t = head.data;
        head.data = node.data;
        node.data = t;
        return head;
    }

    public static void main(String[] args) {

    }
}
