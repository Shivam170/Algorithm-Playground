package AlgoPlayground.GFG.Tree.BinaryTree;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseLevelOrder {

    //Trick is to reverse the opposite Level order traversal

    void reverseLevelOrder(TreeNode root){
        if(root == null ) return;
        Queue<TreeNode> q = new LinkedList<>();
        Stack<TreeNode> s = new Stack<>();
        q.add(root);
        while(!q.isEmpty()){
            root = q.poll();
            s.add(root);
            if(root.right!=null) q.add(root.right);
            if(root.left!=null) q.add(root.left);
        }
        while(!s.isEmpty()){
            System.out.print(s.pop().data+" ");
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
        ReverseLevelOrder r = new ReverseLevelOrder();
        r.reverseLevelOrder(head);
    }
}
