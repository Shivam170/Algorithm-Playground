package AlgoPlayground.GFG.Tree.BinaryTree;

public class CountNodeCompleteBT {
    int naive(TreeNode root) {
        if (root == null)
            return 0;
        else
            return 1 + naive(root.left) + naive(root.right);
    }

    int countNodes(TreeNode root) {
        if (root == null) return 0;
        int lh = 0, rh = 0;
        TreeNode curr = root;
        while (curr != null) {
            lh++;
            curr = curr.left;
        }
        curr = root;
        while (curr != null) {
            rh++;
            curr = curr.right;
        }
        if (lh == rh) {
            return (int) (Math.pow(2, lh) - 1);
        } else
            return 1 + countNodes(root.left) + countNodes(root.right);
    }
}
