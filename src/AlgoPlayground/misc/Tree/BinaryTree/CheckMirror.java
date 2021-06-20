package AlgoPlayground.misc.Tree.BinaryTree;

public class CheckMirror {
    //Same as symmetric

    boolean checkMirror(TreeNode root1, TreeNode root2){
        if(root1==null && root2==null){
            return true;
        }
        if(root1==null || root2==null){
            return false;
        }
        return root1.data==root2.data && checkMirror(root1.left,root2.right) && checkMirror(root1.right,root2.left);
    }

    public static void main(String[] args) {

    }
}

