package AlgoPlayground.misc.Tree.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {
    public static void levelOrderTraversal(TreeNode root) {
        if (root == null)
            return;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            root = q.poll();
            System.out.print(root.data + " ");
            if (root.left != null) {
                q.add(root.left);
            }
            if (root.right != null) {
                q.add(root.right);
            }
        }
    }

    public void levelBylevel(TreeNode root) {
        if (root == null) return;
        Queue<TreeNode> q1 = new LinkedList<>();
        Queue<TreeNode> q2 = new LinkedList<>();
        q1.add(root);
        while (!q1.isEmpty() || !q2.isEmpty()) {
            while (!q1.isEmpty()) {
                root = q1.poll();
                System.out.print(root.data + " ");
                if (root.left != null) q2.add(root.left);
                if (root.right != null) q2.add(root.right);
            }
            System.out.println();
            while (!q2.isEmpty()) {
                root = q2.poll();
                System.out.print(root.data + " ");
                if (root.left != null) q1.add(root.left);
                if (root.right != null) q1.add(root.right);
            }
            System.out.println();
        }
    }

    public void levelOrderLineByLine(TreeNode root) {
        if (root == null) return;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while (q.size() > 1) {
            TreeNode curr = q.poll();
            if (curr == null) {
                System.out.println();
                q.add(null);
                continue;
            }
            System.out.print(curr.data + " ");
            if (curr.left != null) q.add(curr.left);
            if (curr.right != null) q.add(curr.right);
        }
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
        LevelOrderTraversal l = new LevelOrderTraversal();
        l.levelBylevel(head);
    }
}
