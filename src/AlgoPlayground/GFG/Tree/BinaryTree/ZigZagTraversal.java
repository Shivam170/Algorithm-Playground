package AlgoPlayground.GFG.Tree.BinaryTree;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ZigZagTraversal {
    void spiralQueueStack(TreeNode root) {
        if (root == null) return;
        Queue<TreeNode> q = new LinkedList<>();
        ArrayDeque<Integer> s = new ArrayDeque<>();
        boolean reverse = false;
        q.add(root);
        while (!q.isEmpty()) {
            int count = q.size();
            for (int i = 0; i < count; i++) {
                TreeNode curr = q.poll();
                if (reverse) {
                    s.push(curr.data);
                } else System.out.print(curr.data + " ");
                if (curr.left != null) q.add(curr.left);
                if (curr.right != null) q.add(curr.right);
            }
            if (reverse) {
                while (!s.isEmpty()) {
                    System.out.print(s.pop() + " ");
                }
            }
            reverse = !reverse;
            System.out.println();
        }
    }

    void zigZagTraversal(TreeNode root) {
        if (root == null) return;

        Stack<TreeNode> s1 = new Stack<>();
        Stack<TreeNode> s2 = new Stack<>();
        s1.push(root);
        while (!s1.isEmpty() || !s2.isEmpty()) {
            while (!s1.isEmpty()) {
                root = s1.pop();
                System.out.print(root.data + " ");
                if (root.left != null) s2.push(root.left);
                if (root.right != null) s2.push(root.right);
            }
            while (!s2.isEmpty()) {
                root = s2.pop();
                System.out.print(root.data + " ");
                if (root.right != null) s1.push(root.right);
                if (root.left != null) s1.push(root.left);
            }
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
        ZigZagTraversal z = new ZigZagTraversal();
        z.zigZagTraversal(head);
    }
}
