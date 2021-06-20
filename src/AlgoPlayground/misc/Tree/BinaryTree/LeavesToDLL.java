package AlgoPlayground.misc.Tree.BinaryTree;

public class LeavesToDLL {
    TreeNode head = null;
    TreeNode prev = null;
    public TreeNode convert(TreeNode root){
        if(root==null) return null;

        if(root.left == null && root.right == null){
            if(this.prev==null){
                this.head = root;
            }else{
                root.left = prev;
                this.prev.right = root;
            }
            this.prev = root;
            return null;
        }
        root.left = convert(root.left);
        root.right = convert(root.right);
        return root;

    }
    public TreeNode convertToDLL(TreeNode root)
    {
        convert(root);
        return this.head;
    }
}
