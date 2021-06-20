package AlgoPlayground.misc.Tree.BinaryTree;

public class CheckForSumTree {
    boolean isSum = true;
    int sumTree(TreeNode root){
        if(root==null) return 0;
        if(root.left==null && root.right==null) return root.data;
        int leftSum = sumTree(root.left);
        int rightSum = sumTree(root.right);
        if(root.data != (leftSum+rightSum)){
            this.isSum = false;
        }
        return root.data + leftSum + rightSum;
    }
    boolean isSumTree(TreeNode root)
    {
        if(root==null){
            return false;
        }
        sumTree(root);
        return this.isSum;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3,new TreeNode(1),new TreeNode(2));
        CheckForSumTree c = new CheckForSumTree();
        c.isSumTree(root);
        System.out.println(c.isSum);
    }

}
