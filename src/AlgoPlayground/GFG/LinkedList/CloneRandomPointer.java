package AlgoPlayground.GFG.LinkedList;

import java.util.HashMap;

class RNode {
    RNode next, random;
    int data;

    RNode(int data) {
        this.data = data;
    }
}

public class CloneRandomPointer {
    RNode cloneHashing(RNode head) {
        HashMap<RNode, RNode> hm = new HashMap<>();
        for (RNode curr = head; curr != null; curr = curr.next) {
            hm.put(curr, new RNode(curr.data));
        }
        for (RNode curr = head; curr != null; curr = curr.next) {
            RNode cloneCurr = hm.get(curr);
            cloneCurr.next = hm.get(curr.next);
            cloneCurr.random = hm.get(curr.random);
        }
        return hm.get(head);
    }

    RNode clone(RNode head) {
        for (RNode curr = head; curr != null; ) {
            RNode next = curr.next;
            curr.next = new RNode(curr.data);
            curr.next.next = next;
            curr = next;
        }
        for (RNode curr = head; curr != null; curr = curr.next.next) {
            curr.next.random = curr.random != null ? curr.random.next : null;
        }
        return head.next;
    }
}
