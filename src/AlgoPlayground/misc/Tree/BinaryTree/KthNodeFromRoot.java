package AlgoPlayground.misc.Tree.BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class KthNodeFromRoot {
    void kthNodeFromRoot(TreeNode root,int k, List<Integer> list){
        if(root==null) return;
        if(k==0){
            list.add(root.data);
            return;
        }
        --k;
        kthNodeFromRoot(root.left,k,list);
        kthNodeFromRoot(root.right,k,list);
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
        KthNodeFromRoot k = new KthNodeFromRoot();
        ArrayList<Integer> list = new ArrayList<>();
        k.kthNodeFromRoot(head,5,list);
        System.out.println(list);

    }
}
