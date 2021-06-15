package AlgoPlayground.misc.Tree.BinaryTree;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeMap;

public class TopView {
    class Pair{
        TreeNode node;
        int hd;
        Pair(TreeNode node, int hd){
            this.node = node;
            this.hd = hd;
        }
    }
    void topView(TreeNode root,TreeMap<Integer,Integer> hm){
        if(root == null )return;
        Queue<Pair> q = new LinkedList<>();
        Pair pair = new Pair(root,0);
        q.add(pair);
        while(!q.isEmpty()){
            pair = q.poll();
            if(!hm.containsKey(pair.hd)){
                hm.put(pair.hd,pair.node.data);
            }
            if(pair.node.left!=null) q.add(new Pair(pair.node.left,pair.hd-1));
            if(pair.node.right!=null) q.add(new Pair(pair.node.right,pair.hd+1));
        }
    }

    public static void main(String[] args) {
        TopView t = new TopView();
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
        TreeMap<Integer,Integer> hm = new TreeMap<>();
        t.topView(head,hm);
        hm.forEach((k,v)->{
            System.out.print(v+" ");
        });
    }
}
