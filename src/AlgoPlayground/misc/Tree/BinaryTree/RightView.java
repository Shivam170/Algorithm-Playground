package AlgoPlayground.misc.Tree.BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class RightView {

    void rightView(TreeNode root, ArrayList<Integer> list){
        if (root == null)
            return;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        boolean isFirst = true;
        while (!q.isEmpty()) {
            root = q.poll();

            if (root==null){
                if(q.size()==0){
                    return;
                }
                q.add(null);
                isFirst=true;
                continue;
            }else{
                if (isFirst){
                    list.add(root.data);
                    isFirst=false;
                }
            }
            if (root.right != null) {
                q.add(root.right);
            }
            if (root.left != null) {
                q.add(root.left);
            }

        }
    }
}
