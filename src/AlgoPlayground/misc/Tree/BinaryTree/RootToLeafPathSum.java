package AlgoPlayground.misc.Tree.BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class RootToLeafPathSum {
    boolean rootToLeafPathSum(TreeNode root, int sum, List<Integer> result){
        if (root == null ){
            return false;
        }
        if(root.left==null && root.right==null){
            if(root.data == sum ){
                result.add(root.data);
                return true;
            }else{
                return false;
            }
        }
        if (rootToLeafPathSum(root.left,sum-root.data,result)){
            result.add(root.data);
            return true;
        }
        if(rootToLeafPathSum(root.right,sum-root.data,result)){
            result.add(root.data);
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        RootToLeafPathSum rtl = new RootToLeafPathSum();
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
        List<Integer> result = new ArrayList<>();
        boolean r = rtl.rootToLeafPathSum(head, 22, result);
        if(r){
            System.out.println(result);
        }else{
            System.out.println("No path for sum " + 22);
        }
    }
}
