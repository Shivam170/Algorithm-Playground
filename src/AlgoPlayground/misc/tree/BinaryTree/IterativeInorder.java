package AlgoPlayground.misc.tree.BinaryTree;

import java.util.Stack;

public class IterativeInorder {
    public static void iterativeInorder(TreeNode root){
        if(root == null) return;
        Stack<TreeNode> s = new Stack<TreeNode>();
        while(true){
            if(root!=null){
                s.push(root);
                root=root.left;
            }else{
                if(s.isEmpty()) break;
                root = s.pop();
                System.out.println(root.data);
                root=root.right;
            }
        }
    }
}
