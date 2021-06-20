package AlgoPlayground.misc.Tree.BinaryTree;

public class BinaryTreeToDLL {
    TreeNode prev = null;
    TreeNode head = null;
    void convert(TreeNode root){
        if(root==null) return;
        convert(root.left);
        if(this.prev==null){
            this.head = root;
        }else{
            root.left = prev;
            this.prev.right = root;
        }
        this.prev = root;
        convert(root.right);
    }
    //Function to convert binary tree to doubly linked list and return it.
    TreeNode bToDLL(TreeNode root)
    {
        convert(root);
        return this.head;
    }
}
