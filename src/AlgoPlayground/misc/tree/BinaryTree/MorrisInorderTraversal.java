package AlgoPlayground.misc.tree.BinaryTree;

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
    }

    private void morrisTraversal(TreeNode root) {

    }
}
