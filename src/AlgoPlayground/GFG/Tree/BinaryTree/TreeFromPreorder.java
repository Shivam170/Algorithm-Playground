package AlgoPlayground.GFG.Tree.BinaryTree;

public class TreeFromPreorder {
    int start = 0;

    public TreeNode buildTree(int[] pre, int[] in, int inStart, int inEnd) {
        if (inStart > inEnd)
            return null;
        TreeNode root = new TreeNode(pre[this.start]);
        int mid = search(in, inStart, inEnd, pre[this.start]);
        this.start++;
        root.left = buildTree(pre, in, inStart, mid - 1);
        root.right = buildTree(pre, in, mid + 1, inEnd);
        return root;
    }

    public int search(int[] in, int s, int e, int el) {
        for (int i = s; i <= e; i++) {
            if (in[i] == el) return i;
        }
        return -1;
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        TreeNode root = buildTree(preorder, inorder, 0, inorder.length - 1);
        return root;
    }

    int preIndex = 0;

    TreeNode constructTree(int[] in, int[] pre, int inStart, int inEnd) {
        if (inStart > inEnd) return null;
        TreeNode root = new TreeNode(pre[preIndex++]);
        int inIndex = 0;
        for (int i = inStart; i <= inEnd; i++) {
            if (in[i] == root.data) {
                inIndex = i;
                break;
            }
        }
        root.left = constructTree(in, pre, inStart, inIndex - 1);
        root.right = constructTree(in, pre, inIndex + 1, inEnd);
        return root;
    }
}
