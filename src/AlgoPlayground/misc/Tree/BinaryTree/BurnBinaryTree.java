package AlgoPlayground.misc.Tree.BinaryTree;

class Distance {
    int val;

    Distance(int d) {
        val = d;
    }
}

public class BurnBinaryTree {
    int res = 0;

    int burnTree(TreeNode root, int leaf, Distance dist) {
        if (root == null) return 0;
        if (root.data == leaf) {
            dist.val = 0;
            return 1;
        }
        Distance lDist, rDist;
        lDist = new Distance(-1);
        rDist = new Distance(-1);
        int lh = burnTree(root.left, leaf, lDist);
        int rh = burnTree(root.right, leaf, rDist);
        if (lDist.val != -1) {
            dist.val = lDist.val + 1;
            res = Math.max(res, rh + dist.val);
        } else if (rDist.val != -1) {
            dist.val = rDist.val + 1;
            res = Math.max(res, dist.val + lh);
        }
        return Math.max(lh, rh) + 1;
    }
}
