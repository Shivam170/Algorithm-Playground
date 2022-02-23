package AlgoPlayground.GFG.Tree.BinarySearchTree;

public class CheckBST {
    boolean isBST(TreeNode root, int min, int max) {
        if (root == null)
            return true;
        return root.data > min && root.data < max
                && isBST(root.left, min, root.data)
                && isBST(root.right, root.data, max);
    }

    int prev = Integer.MIN_VALUE;

    boolean checkBST(TreeNode root) {
        if (root == null) return true;
        if (!checkBST(root.left)) return false;
        if (root.data <= prev) return false;
        prev = root.data;
        return checkBST(root.right);
    }
}
