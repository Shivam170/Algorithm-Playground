package AlgoPlayground.misc.Tree.BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LeftView {
    int maxLevel = 0;

    void leftViewRecursive(TreeNode root, int level) {
        if (root == null) return;
        if (maxLevel < level) {
            System.out.println(root.data);
            maxLevel = level;
        }
        leftViewRecursive(root.left, level + 1);
        leftViewRecursive(root.right, level + 1);
    }

    void leftViewIterative(TreeNode root) {
        if (root == null) return;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            int count = q.size();
            for (int i = 0; i < count; i++) {
                TreeNode curr = q.poll();
                if (i == 0) {
                    System.out.print(curr.data + " ");
                }
                if (curr.left != null) {
                    q.add(curr.left);
                }
                if (curr.right != null) {
                    q.add(curr.right);
                }
            }
        }
    }

    void leftView(TreeNode root, ArrayList<Integer> list) {
        if (root == null)
            return;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        boolean isFirst = true;
        while (!q.isEmpty()) {
            root = q.poll();

            if (root == null) {
                if (q.size() == 0) return;
                q.add(null);
                isFirst = true;
                continue;
            } else {
                if (isFirst) {
                    list.add(root.data);
                    isFirst = false;
                }
            }

            if (root.left != null) {
                q.add(root.left);
            }
            if (root.right != null) {
                q.add(root.right);
            }
        }
    }
}
