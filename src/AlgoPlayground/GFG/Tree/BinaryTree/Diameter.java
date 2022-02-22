package AlgoPlayground.GFG.Tree.BinaryTree;

public class Diameter {
    public int height(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }

    int diameter(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int lHeight = height(root.left);
        int rHeight = height(root.right);
        int lDiameter = diameter(root.left);
        int rDiameter = diameter(root.right);
        return Math.max(lHeight + rHeight + 1, Math.max(lDiameter, rDiameter));
    }

    int res = 0;

    int heightD(TreeNode root) {
        if (root == null) return 0;
        int lh = heightD(root.left);
        int rh = heightD(root.right);
        res = Math.max(res, 1 + lh + rh);
        return 1 + Math.max(lh, rh);
    }
}
