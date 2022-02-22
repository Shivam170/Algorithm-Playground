package AlgoPlayground.GFG.Tree.BinaryTree;

import java.util.ArrayList;

public class LinkedListToBinaryTree {
    class Node {
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    }
    public static TreeNode convert(Node head, TreeNode node) {
        Node temp = head;
        ArrayList<TreeNode> list = new ArrayList<>();
        while(temp!=null){
            TreeNode treeNode = new TreeNode(temp.data);
            list.add(treeNode);
            temp=temp.next;
        }

        int i = 0;
        int n = list.size();
        while(i<n/2){
            TreeNode r = list.get(i);
            if(2*i + 1  < n){
                r.left = list.get(2*i +1);
            }
            if(2*i+2 < n){
                r.right = list.get(2*i + 2);
            }
            i++;
        }
        node = list.get(0);
        return node;
    }
}
