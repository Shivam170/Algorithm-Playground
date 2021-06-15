package AlgoPlayground.misc.Tree.BinaryTree;

public class CheckBalance {
    public int height(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        if(Math.abs(leftHeight-rightHeight)>=1) this.isBalanced = false;
        return Math.max(leftHeight, rightHeight) + 1;
    }
    boolean isBalanced = true;
}
