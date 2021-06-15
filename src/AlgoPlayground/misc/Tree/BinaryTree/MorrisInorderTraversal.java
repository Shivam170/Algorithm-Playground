package AlgoPlayground.misc.Tree.BinaryTree;

import AlgoPlayground.leetcode.InorderTraversal;

public class MorrisInorderTraversal {
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
        MorrisInorderTraversal m = new MorrisInorderTraversal();
        m.morrisTraversal(head);
        System.out.println();
        IterativeInorder.iterativeInorder(head);


    }

    private void morrisTraversal(TreeNode root) {
        TreeNode current = root;
        while(current!=null){
            if(current.left==null){
                System.out.print(current.data + " ");
                current = current.right;
            }else{
                TreeNode predecessor = current.left;
                while(predecessor.right!=current && predecessor.right!=null){
                    predecessor = predecessor.right;
                }

                if (predecessor.right==null){
                    predecessor.right = current;
                    current = current.left;
                }else{
                    predecessor.right =null;
                    System.out.print(current.data+" ");
                    current = current.right;
                }
            }
        }
    }
}
