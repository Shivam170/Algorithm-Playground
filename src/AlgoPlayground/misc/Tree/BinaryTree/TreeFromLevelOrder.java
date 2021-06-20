package AlgoPlayground.misc.Tree.BinaryTree;

import java.util.ArrayList;

public class TreeFromLevelOrder {
    TreeNode build(ArrayList<Integer> in, ArrayList<Integer> lo){
        if(in.size()==0) return null;
        TreeNode root = new TreeNode(lo.get(0));
        int mid = in.indexOf(lo.get(0));

//        ArrayList<Integer> left = find(in,lo,0,mid-1);
//        ArrayList<Integer> right = find(in,lo,mid+1,in.size()-1);
        ArrayList<Integer> inl = new ArrayList<>();
        ArrayList<Integer> inr = new ArrayList<>();


//        root.left = build(inl,left);
//        root.right = build(inr,right);
        return root;
    }
//    ArrayList<Integer> find(ArrayList<Integer> in, ArrayList<Integer> lo, int s, int e){
//
//    }

    TreeNode buildTree(int inord[], int level[])
    {
        ArrayList<Integer> in = new ArrayList<>();
        for(int i = 0;i<inord.length;i++){
            in.add(inord[i]);
        }
        ArrayList<Integer> lo = new ArrayList<>();
        for(int i=0;i<level.length;i++){
            lo.add(level[i]);
        }
        return null;
    }
}
