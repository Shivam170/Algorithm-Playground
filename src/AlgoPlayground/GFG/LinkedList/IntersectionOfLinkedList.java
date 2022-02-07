package AlgoPlayground.GFG.LinkedList;

public class IntersectionOfLinkedList {
    int intersection(Node h1, Node h2) {
        Node temp = h1;
        int c1 = 0;
        while (temp != null) {
            temp = temp.next;
            c1++;
        }
        int c2 = 0;
        temp = h2;
        while (temp != null) {
            temp = temp.next;
            c2++;
        }
        Node temp1 = null;
        if (c1 > c2) {
            temp = h1;
            temp1 = h2;
        } else {
            temp = h2;
            temp1 = h1;
        }
        int abs = Math.abs(c1 - c2);
        int i = 0;
        while (i < abs) {
            temp = temp.next;
        }
        while (temp != null && temp1 != null) {
            if (temp.data == temp1.data)
                return temp.data;
            temp = temp.next;
            temp1 = temp1.next;
        }
        return -1;
    }
}
