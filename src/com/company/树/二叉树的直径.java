package com.company.树;

import com.company.TreeNode;

import java.util.LinkedList;

/**
 * @author xiu
 * @create 2023-06-27 20:46
 */
public class 二叉树的直径 {
    int max=-1;
//    当前节点的直径等于左右子树深度相加
    public int diameterOfBinaryTree(TreeNode root) {
        depth(root);
        return max;
    }
    int depth(TreeNode root){
        if (root==null) return 0;
        TreeNode left = root.left;
        TreeNode right = root.right;
        int i = depth(left) + depth(right);
        max=Math.max(max,i);
       return i;
    }
}
