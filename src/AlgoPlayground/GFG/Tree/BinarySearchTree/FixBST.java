package AlgoPlayground.GFG.Tree.BinarySearchTree;

public class FixBST {
    TreeNode prev = null, first = null, second = null;

    void fixBST(TreeNode root) {
        if (root == null) return;
        fixBST(root.left);
        if (prev != null && root.data < prev.data) {
            if (first == null)
                first = prev;
            second = root;
        }
        prev = root;
        fixBST(root.right);
    }
}
