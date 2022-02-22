package AlgoPlayground.GFG.Tree.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class SubtreeInBinaryTree {

    public boolean isSame(TreeNode root1, TreeNode root2){
        if(root1==null && root2==null){
            return true;
        }
        if(root1==null || root2==null){
            return false;
        }
        return root1.data==root2.data && isSame(root1.left,root2.left) && isSame(root1.right,root2.right);
    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root==null && subRoot==null){
            return true;
        }
        if(root==null || subRoot==null){
            return false;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            root = q.remove();
            if(root.data == subRoot.data && isSame(root,subRoot)){
                return true;
            }
            if(root.left!=null){q.add(root.left);}
            if(root.right!=null){q.add(root.right);}
        }
        return false;
    }
}
