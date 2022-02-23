package AlgoPlayground.GFG.Tree.BinarySearchTree;

public class FloorBST {
    TreeNode floor(TreeNode root, int x) {
        TreeNode res = null;
        while (root != null) {
            if (root.data == x) {
                return root;
            } else if (root.data > x) {
                root = root.left;
            } else {
                res = root;
                root = root.right;
            }
        }
        return res;
    }
}
