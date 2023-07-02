package com.company.树;

import com.company.TreeNode;

/**
 * @author xiu
 * @create 2023-06-27 20:24
 */
public class 翻转二叉树 {
    public TreeNode invertTree(TreeNode root) {
        if(root==null) return null;
        TreeNode left=root.left;
        TreeNode right=root.right;
        root.left=invertTree(right);
        root.right=invertTree(left);
        return root;
    }
}
