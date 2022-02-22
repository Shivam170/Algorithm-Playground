package AlgoPlayground.GFG.Tree.BinaryTree;

public class TreeFromPostorder {
    int start;
    public TreeNode buildTree(int[] post, int[] in, int inStart,int inEnd){
        if(inStart > inEnd )
            return null;
        TreeNode root = new TreeNode(post[this.start]);
        int mid = search(in,inStart,inEnd,post[this.start]);
        this.start--;
        root.right = buildTree(post,in,mid+1,inEnd);
        root.left = buildTree(post,in,inStart,mid-1);
        return root;
    }
    public int search(int[] in, int s,int e, int el){
        for(int i =s;i<=e;i++){
            if(in[i]==el) return i;
        }
        return -1;
    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        this.start = postorder.length-1;
        TreeNode root = buildTree(postorder,inorder,0,inorder.length-1);
        return root;
    }
}
