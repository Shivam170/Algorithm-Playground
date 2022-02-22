package AlgoPlayground.GFG.Tree.BinaryTree;

public class CheckBalance {
    public int height(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        if (Math.abs(leftHeight - rightHeight) >= 1) this.isBalanced = false;
        return Math.max(leftHeight, rightHeight) + 1;
    }

    boolean isBalanced = true;

    public int isBalanced(TreeNode root) {
        if (root == null) return 0;
        int lh = isBalanced(root.left);
        if (lh == -1) return -1;
        int rh = isBalanced(root.right);
        if (rh == -1) return -1;
        if (Math.abs(lh - rh) > 1) return -1;
        else return Math.max(lh, rh) + 1;
    }
}
