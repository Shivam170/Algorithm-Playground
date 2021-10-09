package AlgoPlayground.misc.Tree.BinaryTree;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

public class Practice {
   static int diameter = Integer.MIN_VALUE;
    static int diameter(TreeNode root){
        if(root==null) {
            return 0;
        }
        return 1;
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

    }
}
