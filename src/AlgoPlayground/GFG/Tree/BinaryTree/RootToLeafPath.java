package AlgoPlayground.GFG.Tree.BinaryTree;

public class RootToLeafPath {
    void rootToLeafPath(TreeNode root, String ans){
        if(root==null) return;
        ans = ans + root.data+" ";
        if(root.left==null && root.right==null){
            System.out.println(ans);
        }
        rootToLeafPath(root.left,ans);
        rootToLeafPath(root.right,ans);
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
        RootToLeafPath r = new RootToLeafPath();
        r.rootToLeafPath(head,"");
    }
}
