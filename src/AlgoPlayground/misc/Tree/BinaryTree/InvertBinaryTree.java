package AlgoPlayground.misc.Tree.BinaryTree;

public class InvertBinaryTree {
    public void invert(TreeNode root){
        if(root==null) return;
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        invert(root.left);
        invert(root.right);
    }
    public TreeNode invertTree(TreeNode root) {
        if(root!=null){
            invert(root);
            return root;
        }else{
            return null;
        }
    }
}
