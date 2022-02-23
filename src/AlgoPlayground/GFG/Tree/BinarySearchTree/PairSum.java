package AlgoPlayground.GFG.Tree.BinarySearchTree;

import java.util.HashSet;

public class PairSum {
    //Hashing

    boolean isPairSum(TreeNode root, int sum, HashSet<Integer> s) {
        if (root == null) return false;
        if (isPairSum(root.left, sum, s))
            return true;
        if (s.contains(sum - root.data))
            return true;
        else s.add(root.data);
        return isPairSum(root.right, sum, s);
    }
}
