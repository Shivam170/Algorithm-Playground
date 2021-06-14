package AlgoPlayground.leetcode;

public class KthSmallestBST {
    int v;
    int j;
    public int kthSmallest(TreeNode root, int k) {
        if(root!=null){
            this.j=k;
            inorder(root);
            return this.v;
        }
        return Integer.MIN_VALUE;
    }

    public void inorder(TreeNode root){
        if(root==null) return;
        inorder(root.left);
        this.j--;
        if(this.j==0) {
            this.v = root.val;
            return;
        }
        inorder(root.right);
    }

    public static void main(String[] args) {
        KthSmallestBST k = new KthSmallestBST();

        TreeNode root= new TreeNode(3,new TreeNode(1,null,new TreeNode(2)),new TreeNode(4));
        System.out.println(k.kthSmallest(root,1));
    }

}
