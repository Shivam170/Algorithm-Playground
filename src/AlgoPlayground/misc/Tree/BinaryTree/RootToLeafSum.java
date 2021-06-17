package AlgoPlayground.misc.Tree.BinaryTree;

public class RootToLeafSum {
    boolean hasSum = false;
    void hasPathSum(TreeNode root, int target,int sum){
        if (root==null) return;
        sum = sum + root.data;
        if(root.left==null && root.right==null && sum==target){
            this.hasSum=true;
        }
        hasPathSum(root.left,target,sum);
        hasPathSum(root.right,target,sum);
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
        RootToLeafSum r = new RootToLeafSum();
        r.hasPathSum(head,23,0);
        System.out.println(r.hasSum);
    }
}
