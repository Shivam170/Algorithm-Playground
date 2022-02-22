package AlgoPlayground.GFG.Tree.BinaryTree;

import java.util.ArrayList;

public class BoundaryTraversal {
    ArrayList<Integer> list = new ArrayList<>();

    void leftBoundary(TreeNode root){
        if(root==null) return;
        if(!(root.left==null && root.right==null)){
            list.add(root.data);
        }
        if(root.left!=null)
            leftBoundary(root.left);
        else if(root.right!=null)
            leftBoundary(root.right);
    }

    void leafNode(TreeNode root){
        if(root == null) return;
        leafNode(root.left);
        if(root.left==null && root.right==null){
            list.add(root.data);
        }
        leafNode(root.right);
    }

    void rightBoundary(TreeNode root){
        if(root == null ) return;
        if(root.right!=null)
            rightBoundary(root.right);
        else if(root.left!=null)
            rightBoundary(root.left);

        if(!(root.left==null && root.right==null)){
            list.add(root.data);
        }
    }
    ArrayList <Integer> printBoundary(TreeNode node)
    {
        if(node.left!=null){
            leftBoundary(node);
        }else{
            this.list.add(node.data);
        }
        leafNode(node);
        if(node.right!=null){
            rightBoundary(node);
        }
        if(node.right!=null){
            this.list.remove(list.size()-1);
        }
        return this.list;
    }
}
