package AlgoPlayground.GFG.Tree.BinarySearchTree;

public class SearchBST {
    //Recursive
    boolean search(TreeNode root, int x) {
        if (root == null) {
            return false;
        } else if (x == root.data) {
            return true;
        } else if (root.data < x) {
            return search(root.right, x);
        } else {
            return search(root.left, x);
        }
    }

    boolean searchIterative(TreeNode root, int x) {
        while (root != null) {
            if (root.data == x) {
                return true;
            } else if (root.data < x) {
                root = root.right;
            } else root = root.left;
        }
        return false;
    }
}
