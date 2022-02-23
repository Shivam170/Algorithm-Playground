package AlgoPlayground.GFG.Tree.BinarySearchTree;

public class DeleteBST {
    TreeNode getSucc(TreeNode root) {
        TreeNode curr = root.right;
        while (curr != null && curr.left != null) {
            curr = curr.left;
        }
        return curr;
    }

    TreeNode deleteNode(TreeNode root, int x) {
        if (root == null) {
            return null;
        }
        if (root.data > x) {
            root.left = deleteNode(root.left, x);
        } else if (root.data < x) {
            root.right = deleteNode(root.right, x);
        } else {
            if (root.left == null) return root.right;
            else if (root.right == null) return root.left;
            else {
                TreeNode succ = getSucc(root);
                root.data = succ.data;
                root.right = deleteNode(root.right,succ.data);
            }
        }
        return root;
    }
}
