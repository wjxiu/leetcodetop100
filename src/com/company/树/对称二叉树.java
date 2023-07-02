package com.company.树;

import com.company.TreeNode;

/**
 * @author xiu
 * @create 2023-06-27 20:24
 */
public class 对称二叉树 {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return help(root.left, root.right);
    }
    public boolean help(TreeNode left, TreeNode right) {
//        1和2条件不能调换
        if (left == null && right == null) return true;
        if (left == null || right == null) return false;
        if (left.val != right.val) return false;
        return help(left.right, right.left) && help(right.right, left.left);
    }
}
