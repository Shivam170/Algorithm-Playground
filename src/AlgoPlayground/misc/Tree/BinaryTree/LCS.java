package AlgoPlayground.misc.Tree.BinaryTree;

import java.util.ArrayList;

public class LCS {
    public int naiveLCA(TreeNode root, int n1, int n2) {
        ArrayList<Integer> path1 = new ArrayList<>();
        ArrayList<Integer> path2 = new ArrayList<>();

        if (!findPath(root, path1, n1) || !findPath(root, path2, n2)) {
            return -1;
        }
        for (int i = 0; i < path1.size() - 1 && i < path2.size() - 1; i++) {
            if (path1.get(i + 1) != path2.get(i + 1)) return path1.get(i);
        }
        return -1;
    }

    boolean findPath(TreeNode root, ArrayList<Integer> p, int n) {
        if (root == null) return false;
        p.add(root.data);
        if (root.data == n) return true;
        if (findPath(root.left, p, n) || findPath(root.right, p, n))
            return true;
        p.remove(p.size() - 1);
        return false;
    }

    public TreeNode lowestCommonAncestor(int i, int j, TreeNode root) {
        if (root == null) return null;
        if (root.data == i || root.data == j) {
            return root;
        }
        TreeNode l = lowestCommonAncestor(i, j, root.left);
        TreeNode r = lowestCommonAncestor(i, j, root.right);

        if (l != null && r != null) return root;
        if (l == null && r == null) return null;
        return l != null ? l : r;
    }

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        TreeNode head = null;
        head = bt.insert(head, 10);
        head = bt.insert(head, 15);
        head = bt.insert(head, 5);
        head = bt.insert(head, 7);
        head = bt.insert(head, 19);
        head = bt.insert(head, 20);
        head = bt.insert(head, 4);
        head = bt.insert(head, 3);
        LCS lcs = new LCS();
        System.out.println(lcs.lowestCommonAncestor(5, 20, head).data);

    }
}
