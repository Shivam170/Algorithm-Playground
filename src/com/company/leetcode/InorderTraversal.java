package com.company.leetcode;


import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}


public class InorderTraversal {
    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        inorder(root,list);
        return list;
    }
    public static void inorder(TreeNode root , List<Integer> list){
        if(root==null){
            return;
        }
        inorder(root.left,list);
        list.add(root.val);
        inorder(root.right,list);
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1,new TreeNode(2,new TreeNode(3),null),new TreeNode(4,new TreeNode(5),new TreeNode(6)));
        List<Integer> list = inorderTraversal(root);
        System.out.println(list);

    }
}