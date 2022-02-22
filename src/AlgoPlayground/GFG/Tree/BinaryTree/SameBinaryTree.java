package AlgoPlayground.GFG.Tree.BinaryTree;

public class SameBinaryTree {
    public boolean sameTree(TreeNode r1,TreeNode r2){
        if(r1==null && r2==null){
            return true;
        }
        if(r1==null || r2==null){
            return false;
        }
        return r1.data == r2.data && sameTree(r1.left,r2.left) && sameTree(r1.right,r2.right);
    }

    public static void main(String[] args) {
        SameBinaryTree st = new SameBinaryTree();
        BinaryTree tree = new BinaryTree();
        TreeNode root = tree.root;
        root = tree.insert(root,45);
        root = tree.insert(root,12);
        root = tree.insert(root,13);

        BinaryTree tree2 = new BinaryTree();
        TreeNode root2 = tree2.root;
        root2 = tree2.insert(root2,45);
        root2 = tree2.insert(root2,12);
        root2 = tree2.insert(root2,13);
        System.out.println(st.sameTree(root,root2));
    }
}
