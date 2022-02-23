package AlgoPlayground.GFG.Tree.BinarySearchTree;

public class CeilBST {
    TreeNode ceil(TreeNode root, int x) {
        TreeNode res = null;
        while (root != null) {
            if (root.data == x) {
                return root;
            } else if (root.data > x) {
                root = root.right;
            } else {
                res = root;
                root = root.left;
            }
        }
        return res;
    }
}
