package AlgoPlayground.GFG.LinkedList;


// Test Implementation

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
public class SinglyLinkedList {

    static Node insertBegin(Node head, int x) {
        Node node = new Node(x);
        node.next = head;
        return node;
    }

    static Node deleteFirst(Node head) {
        if (head == null) {
            return null;
        }
        return head.next;
    }

    static Node deleteLast(Node head) {
        if (head == null || head.next == null) {
            return null;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }

    static Node insertAtPos(Node head, int pos, int x) {
        Node node = new Node(x);
        if (pos == 1) {
            node.next = head;
            return node;
        }
        Node temp = head;
        for (int i = 1; i <= pos - 2 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null) {
            return head;
        }
        node.next = temp.next;
        temp.next = node;
        return head;
    }

    static Node insertEnd(Node head, int x) {
        if (head == null) {
            head = new Node(x);
            return head;
        }
        Node temp = head;
        Node node = new Node(x);
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
        return head;
    }

    public static int search(Node head, int key) {
        Node temp = head;
        int pos = 1;
        while (temp != null) {
            if (temp.data == key) {
                return pos;
            }
            pos++;
            temp = temp.next;
        }
        return -1;
    }

    public static int recSearch(Node head, int key) {
        if (head == null) return -1;
        if (head.data == key) {
            return 1;
        } else {
            int res = search(head.next, key);
            if (res == -1) return -1;
            else return res + 1;
        }
    }

    public static void main(String[] args) {
        Node head = null;
        head = insertBegin(head, 10);
        head = insertBegin(head, 20);
        head = insertBegin(head, 50);
        head = insertEnd(head, 100);
//        head = deleteFirst(head);
//        head = deleteLast(head);
        head = insertAtPos(head, 5, 78);
        System.out.println(search(head, 100));
        traverse(head);
        System.out.println();
        recPrint(head);
    }

    static void traverse(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    // Traversal using recursion
    static void recPrint(Node head) {
        if (head != null) {
            System.out.print(head.data + " ");
            recPrint(head.next);
        }
    }
}
