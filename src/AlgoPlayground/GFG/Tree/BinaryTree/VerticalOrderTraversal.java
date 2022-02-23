package AlgoPlayground.GFG.Tree.BinaryTree;

import java.util.*;

class Pair {
    TreeNode node;
    int hd;

    Pair(TreeNode n, int h) {
        node = n;
        hd = h;
    }
}

public class VerticalOrderTraversal {
    void verticalOrder(TreeNode root) {
        Queue<Pair> q = new LinkedList<>();
        Map<Integer, ArrayList<Integer>> map = new TreeMap<>();
        q.add(new Pair(root, 0));
        while (!q.isEmpty()) {
            Pair p = q.poll();
            TreeNode curr = p.node;
            int hd = p.hd;
            if (map.containsKey(hd)) {
                map.get(hd).add(curr.data);
            } else {
                ArrayList<Integer> al = new ArrayList<>();
                al.add(curr.data);
                map.put(hd, al);
            }
            if (curr.left != null) q.add(new Pair(curr.left, hd - 1));
            if (curr.right != null) q.add(new Pair(curr.right, hd + 1));
        }
    }
}
