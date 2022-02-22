package AlgoPlayground.GFG.Tree.BinaryTree;

import java.util.ArrayList;

public class SerializeDeserialize {
    void serialize(TreeNode root, ArrayList<Integer> arr) {
        if (root == null) {
            arr.add(-1);
            return;
        }
        arr.add(root.data);
        serialize(root.left, arr);
        serialize(root.right, arr);
    }

    int index = 0;

    TreeNode deserialize(ArrayList<Integer> arr) {
        if (index == arr.size()) return null;
        int val = arr.get(index++);
        if (val == -1) {
            return null;
        }
        TreeNode root = new TreeNode(val);
        root.left = deserialize(arr);
        root.right = deserialize(arr);
        return root;
    }
}
