package AlgoPlayground.misc.Tree.BinaryTree;



public class LCS {
    public TreeNode lowestCommonAncestor(int i, int j, TreeNode root){
        if(root==null) return null;
        if(root.data==i || root.data==j){
            return root;
        }
        TreeNode l = lowestCommonAncestor(i,j,root.left);
        TreeNode r = lowestCommonAncestor(i,j,root.right);

        if(l!=null && r!=null) return root;
        if(l==null && r==null) return null;
        return l!=null?l:r;
    }
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        TreeNode head = null;
        head = bt.insert(head,10);
        head = bt.insert(head,15);
        head = bt.insert(head,5);
        head = bt.insert(head,7);
        head = bt.insert(head,19);
        head = bt.insert(head,20);
        head = bt.insert(head,4);
        head = bt.insert(head,3);
        LCS lcs = new LCS();
        System.out.println(lcs.lowestCommonAncestor(5,20,head).data);

    }
}
