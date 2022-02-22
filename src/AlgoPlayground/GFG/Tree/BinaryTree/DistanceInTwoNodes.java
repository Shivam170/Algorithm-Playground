package AlgoPlayground.GFG.Tree.BinaryTree;

public class DistanceInTwoNodes {

    TreeNode LCA(TreeNode root, int a,int b){
        if(root==null) return null;
        if(root.data==a || root.data==b){
            return root;
        }
        TreeNode left = LCA(root.left,a,b);
        TreeNode right = LCA(root.right,a,b);
        if(left!=null && right!=null){
            return root;
        }
        if(left==null && right==null){
            return null;
        }
        return left==null?right:left;

    }
    int distance(TreeNode root,int a,int dis){
        if(root==null){
            return 0;
        }
        if(root.data==a){
            return dis;
        }
        int l = distance(root.left,a,dis+1);
        int r = distance(root.right,a,dis+1);

        return Math.max(l,r);

    }
    int findDist(TreeNode root, int a, int b) {
        if(root==null){
            return -1;
        }
        TreeNode lca = LCA(root,a,b);
        int dist = distance(lca,a,0)+distance(lca,b,0);
        return dist;
    }
}
