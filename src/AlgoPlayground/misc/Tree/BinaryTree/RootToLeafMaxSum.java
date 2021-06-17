package AlgoPlayground.misc.Tree.BinaryTree;

public class RootToLeafMaxSum {
    int maxSum = Integer.MIN_VALUE;

    void rootToLeafMaxSum(TreeNode root, int sum){
        if(root==null){
            return;
        }
        sum=sum+root.data;
        if(root.left==null && root.right==null){
            if(sum>maxSum){
                maxSum = sum;
            }
        }
        rootToLeafMaxSum(root.left,sum);
        rootToLeafMaxSum(root.right,sum);
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
        RootToLeafMaxSum r = new RootToLeafMaxSum();
        r.rootToLeafMaxSum(head,0);
        System.out.println(r.maxSum);
    }
}
