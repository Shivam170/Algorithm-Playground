package com.company.misc.tree.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class TreeNode<T> {
    TreeNode left, right;
    T data;

    TreeNode(T data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
    TreeNode(T data, TreeNode left, TreeNode right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }
}

public class TreeTraversals {

    public static void preOrder(TreeNode root){
        if(root==null){
            return;
        }
        //Process Node
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void inOrder(TreeNode root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    public static void postoOrder(TreeNode root){
        if(root==null) {
            return;
        }
        postoOrder(root.left);
        postoOrder(root.right);
        System.out.print(root.data + " ");
    }

    public static void levelOrderTraversal(TreeNode root) {
        if (root == null)
            return;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            root = q.poll();
            System.out.print(root.data+" ");
            if (root.left != null) {
                q.add(root.left);
            }
            if (root.right != null) {
                q.add(root.right);
            }


        }
    }

    public static void iterativePreorder(TreeNode root) {
        if (root == null) return;
        Stack<TreeNode> s = new Stack<>();
        s.add(root);
        while (!s.isEmpty()) {
            root = s.pop();
            System.out.println(root.data);
            if (root.right != null) {
                s.push(root.right);
            }
            if (root.left != null) {
                s.push(root.left);
            }
        }
    }

    public static void iterativePostorder(TreeNode root){
        if(root==null) return;
        Stack<TreeNode> s1 = new Stack<>();
        Stack<TreeNode> s2 = new Stack<>();

        s1.push(root);
        while(!s1.isEmpty()){
            root = s1.pop();
            s2.push(root);
            if(root.left!=null){
                s1.push(root.left);
            }
            if(root.right!=null){
                s1.push(root.right);
            }
        }
        while(!s2.isEmpty()){
            root = s2.pop();
            System.out.println(root.data);
        }
    }

    public static void iterativeInorder(TreeNode root){
        if(root == null) return;
        Stack<TreeNode> s = new Stack<TreeNode>();
        while(true){
            if(root!=null){
                s.push(root);
                root=root.left;
            }else{
                if(s.isEmpty()) break;
                root = s.pop();
                System.out.println(root.data);
                root=root.right;
            }
        }
    }

    public static int size(TreeNode root){
        if(root==null){
            return 0;
        }
        int leftSize = size(root.left);
        int rightSize = size(root.right);
        return leftSize + rightSize + 1;
    }

    public static int height(TreeNode root){
        if(root==null){
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return Math.max(leftHeight,rightHeight)+1;
    }

    public static void main(String[] args) {
        TreeNode<Integer> root = new TreeNode<>(1,new TreeNode(4,new TreeNode(6),new TreeNode(7)),new TreeNode(5,new TreeNode(9),new TreeNode(10)));
//        System.out.println("Inorder Traversal");
//        inOrder(root);
//        System.out.println();
        System.out.println("PreOrder Traversal");
        preOrder(root);
        System.out.println();
//        System.out.println("PostOrder Traversal");
//        postoOrder(root);
//        System.out.println("Level Order Traversal");
//        levelOrderTraversal(root);

        System.out.println("Size of the tree " + size(root));
        System.out.println("Height of the tree "+ height(root));
    }
}
