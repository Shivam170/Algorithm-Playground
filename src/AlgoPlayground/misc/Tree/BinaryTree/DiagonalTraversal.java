package AlgoPlayground.misc.Tree.BinaryTree;

import java.util.ArrayList;
import java.util.HashMap;


public class DiagonalTraversal {
    void diagonalTraversal(TreeNode root, int d,HashMap<Integer,ArrayList<Integer>> hm){
        if(root==null){
            return;
        }
        ArrayList<Integer> list;
        if(hm.containsKey(d)){
            list = hm.get(d);
        }else{
            list = new ArrayList<>();
        }
        list.add(root.data);
        hm.put(d,list);
        diagonalTraversal(root.left,d+1,hm);
        diagonalTraversal(root.right,d,hm);
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
        DiagonalTraversal d = new DiagonalTraversal();
        HashMap<Integer, ArrayList<Integer>> hm = new HashMap<>();
        d.diagonalTraversal(head,0,hm);
        hm.forEach((k,v)->{
            System.out.println(v);
        });

    }
}
