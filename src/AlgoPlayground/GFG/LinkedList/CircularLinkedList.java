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
    static Node insertEnd(Node head, int x) {
        Node node = new Node(x);
        if (head == null) {
            node.next = node;
            return node;
        } else {
            Node temp = head;
            while (temp.next != head) temp = temp.next;
            temp.next = node;
            node.next = head;
            return head;
        }
    }
    static Node insertEndFast(Node head, int x) {
        Node node = new Node(x);
        if (head == null) {
            node.next = node;
            return node;
        } else {
            node.next = head.next;
            head.next = node;
            int t = node.data;
            node.data = head.data;
            head.data = t;
            return node;
        }
    }
    static Node deleteFirst(Node head) {
        if (head == null) {
            return null;
        }
        if (head.next == head) {
            return null;
        }
        Node curr = head;
        while (curr.next != head) {
            curr = curr.next;
        }
        curr.next = head.next;
        return curr.next;
    }
    static Node deleteFirstFast(Node head) {
        if (head == null) return null;
        if (head.next == head) return null;
        head.data = head.next.data;
        head.next = head.next.next;
        return head;
    }
    static Node deleteKthNode(Node head, int k) {
        if (head == null) {
            return null;
        }
        if (k == 1) {
            return deleteFirstFast(head);
        }
        Node curr = head;
        for (int i = 0; i < k - 2; i++) {
            curr = curr.next;
        }
        curr.next = curr.next.next;
        return head;
    }
}
