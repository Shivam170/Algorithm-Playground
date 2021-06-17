package AlgoPlayground.misc.Tree.BinaryTree;


import java.util.*;

public class KthNodeFromNode {
    void parent(TreeNode root,TreeNode parent, HashMap<TreeNode,TreeNode> map){
        if (root == null){
            return;
        }
        map.put(root,parent);
        parent(root.left,root,map);
        parent(root.right,root,map);
    }
    TreeNode inorder(TreeNode root, int n){
        if (root==null){
            return null;
        }
        if(root.data==n){
            return root;
        }
        TreeNode left = inorder(root.left,n);
        TreeNode right =  inorder(root.right,n);
        if (left!=null){
            return left;
        }
        if(right!=null){
            return right;
        }
        return null;
    }
    void kthNode(TreeNode node, int k, HashMap<TreeNode,TreeNode> map, ArrayList<Integer> list){
        Queue<TreeNode> q = new LinkedList<>();
        q.add(node);
        q.add(null);
        HashSet<TreeNode> set = new HashSet();
        set.add(node);
        int count=0;
        while(count!=k){
            node = q.remove();
            if(q.isEmpty()){
                break;
            }
            if(node==null){
                count++;
                q.add(null);
                continue;
            }
            if(node.left!=null && !set.contains(node.left)){
                q.add(node.left);
                set.add(node.left);
            }
            if(node.right!=null && !set.contains(node.right)){
                q.add(node.right);
                set.add(node.right);
            }
            if(map.containsKey(node) && !set.contains(map.get(node))){
                if(map.get(node)!=null){
                    q.add(map.get(node));
                    set.add(map.get(node));
                }
            }
        }
        while(!q.isEmpty()){
            TreeNode n = q.remove();
            if(n!=null){
                list.add(n.data);
            }
        }
    }

    public static void main(String[] args) {
//        BinaryTree bt = new BinaryTree();
//        TreeNode head = null;
//        head = bt.insert(head,10);
//        head = bt.insert(head,15);
//        head = bt.insert(head,5);
//        head = bt.insert(head,7);
//        head = bt.insert(head,19);
//        head = bt.insert(head,20);
//        head = bt.insert(head,4);
//        head = bt.insert(head,3);
//        TreeNode head = new TreeNode(20,new TreeNode(8,new TreeNode(4),new TreeNode(12,new TreeNode(10),new TreeNode(14))),new TreeNode(22));
//        TreeNode head = new TreeNode(1);
        TreeNode head = new TreeNode(1,new TreeNode(2,new TreeNode(4),new TreeNode(5)),new TreeNode(3,null,new TreeNode(6)));
        HashMap<TreeNode,TreeNode> map = new HashMap<>();
        KthNodeFromNode n = new KthNodeFromNode();
        n.parent(head,null,map);
        TreeNode node = n.inorder(head,6);
        ArrayList<Integer> list = new ArrayList<>();
        n.kthNode(node,4,map,list);
        System.out.println(list);
    }
}
