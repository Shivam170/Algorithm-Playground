package AlgoPlayground.misc.Tree.BinaryTree;

import java.util.Stack;

public class ZigZagTraversal {
    void zigZagTraversal(TreeNode root){
        if(root == null) return;

        Stack<TreeNode> s1 = new Stack<>();
        Stack<TreeNode> s2 = new Stack<>();
        s1.push(root);
        while(!s1.isEmpty()||!s2.isEmpty()){
            while(!s1.isEmpty()){
                root = s1.pop();
                System.out.print(root.data+" ");
                if(root.left!=null) s2.push(root.left);
                if(root.right!=null) s2.push(root.right);
            }
            while (!s2.isEmpty()){
                root = s2.pop();
                System.out.print(root.data+" ");
                if(root.right!=null) s1.push(root.right);
                if(root.left!=null) s1.push(root.left);
            }
        }
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
        ZigZagTraversal z = new ZigZagTraversal();
        z.zigZagTraversal(head);
    }
}
