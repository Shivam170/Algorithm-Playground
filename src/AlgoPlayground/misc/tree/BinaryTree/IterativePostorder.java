package AlgoPlayground.misc.tree.BinaryTree;

import java.util.Stack;

public class IterativePostorder {
    public static void iterativePostorder(TreeNode root){
        if(root==null) return;
        Stack<TreeNode> s1 = new Stack<>();
        Stack<TreeNode> s2 = new Stack<>();

        s1.push(root);
        while(!s1.isEmpty()){
            root = s1.pop();
            s2.push(root);
            if(root.left!=null){
                s1.push(root.left);
            }
            if(root.right!=null){
                s1.push(root.right);
            }
        }
        while(!s2.isEmpty()){
            root = s2.pop();
            System.out.println(root.data);
        }
    }
}
