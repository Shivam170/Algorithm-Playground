package AlgoPlayground.misc.tree.BinaryTree;

import java.util.Stack;

public class IterativePreorder {
    public static void iterativePreorder(TreeNode root) {
        if (root == null) return;
        Stack<TreeNode> s = new Stack<>();
        s.add(root);
        while (!s.isEmpty()) {
            root = s.pop();
            System.out.println(root.data);
            if (root.right != null) {
                s.push(root.right);
            }
            if (root.left != null) {
                s.push(root.left);
            }
        }
    }



}
