package AlgoPlayground.GFG.Tree.BinaryTree;

public class MaxMin {
    int getMax(TreeNode root) {
        if (root == null) return Integer.MIN_VALUE;
        return Math.max(root.data, Math.max(getMax(root.left), getMax(root.right)));
    }
}
