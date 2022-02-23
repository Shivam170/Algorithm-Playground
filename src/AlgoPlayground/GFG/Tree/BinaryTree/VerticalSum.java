package AlgoPlayground.GFG.Tree.BinaryTree;


import java.util.TreeMap;

public class VerticalSum {
    void verticalSum(TreeNode root, TreeMap<Integer, Integer> map, int hd) {
        if (root == null) return;
        verticalSum(root.left, map, hd - 1);
        int psum = map.get(hd) == null ? 0 : map.get(hd);
        map.put(hd, psum + root.data);
        verticalSum(root.right, map, hd + 1);
    }
}
