package AlgoPlayground.misc.tree.BinaryTree;

public class RecursiveTraversals {
    public static void preOrder(TreeNode root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void inOrder(TreeNode root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    public static void postoOrder(TreeNode root){
        if(root==null) {
            return;
        }
        postoOrder(root.left);
        postoOrder(root.right);
        System.out.print(root.data + " ");
    }



}
