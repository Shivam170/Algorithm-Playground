package AlgoPlayground.misc.Tree.BinaryTree;

public class BinaryTree<T> {
    TreeNode root;
    public TreeNode insert(TreeNode root, int data){
        if(root == null){
            root = new TreeNode(data);
        }else if(data <= root.data){
            root.left = insert(root.left,data);
        }else{
            root.right = insert(root.right,data);
        }
        return root;
    }
    public static int size(TreeNode root){
        if(root==null){
            return 0;
        }
        int leftSize = size(root.left);
        int rightSize = size(root.right);
        return leftSize + rightSize + 1;
    }

    public static int height(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }
}
