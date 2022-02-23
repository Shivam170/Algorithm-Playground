package AlgoPlayground.GFG.Tree.BinarySearchTree;

public class InsertBST {
    //Recursive
    TreeNode insert(TreeNode root, int x) {
        if (root == null) {
            return new TreeNode(x);
        }
        if (root.data > x) {
            root.left = insert(root.left, x);
        } else if (root.data < x) {
            root.right = insert(root.right, x);
        }
        return root;
    }

    //Iterative
    TreeNode insertIterative(TreeNode root, int x) {
        TreeNode temp = new TreeNode(x);
        TreeNode parent = null, curr = root;
        while (curr != null) {
            parent = curr;
            if (curr.data > x) {
                curr = curr.left;
            } else if (curr.data < x) {
                curr = curr.right;
            } else
                return root;
        }
        if (parent == null) {
            return temp;
        }
        if (parent.data > x) {
            parent.left = temp;
        } else {
            parent.right = temp;
        }
        return root;
    }
}
