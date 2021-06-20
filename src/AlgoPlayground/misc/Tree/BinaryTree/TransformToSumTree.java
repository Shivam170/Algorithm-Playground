package AlgoPlayground.misc.Tree.BinaryTree;

public class TransformToSumTree {
    int transformSumTree(TreeNode root){
        if(root==null) return 0;
        int leftSum = transformSumTree(root.left);
        int rightSum = transformSumTree(root.right);
        int val = root.data + leftSum + rightSum;
        root.data = leftSum + rightSum;
        return val;
    }
    public void toSumTree(TreeNode root){
        transformSumTree(root);
    }
}
