package AlgoPlayground.GFG.Tree.BinaryTree;

public class TreeNode {
    TreeNode left, right;
    int data;
    TreeNode(){

    }
    TreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    TreeNode(int data, TreeNode left, TreeNode right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

}