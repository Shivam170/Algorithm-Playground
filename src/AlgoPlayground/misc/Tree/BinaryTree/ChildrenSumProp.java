package AlgoPlayground.misc.Tree.BinaryTree;

public class ChildrenSumProp {
    boolean isSum(TreeNode root) {
        if (root == null) return true;
        if (root.left == null && root.right == null) {
            return true;
        }
        int sum = 0;
        if (root.left != null) sum += root.left.data;
        if (root.right != null) sum += root.right.data;
        return sum == root.data && isSum(root.left) && isSum(root.right);
    }
}
