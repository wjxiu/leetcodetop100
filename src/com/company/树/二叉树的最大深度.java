package com.company.树;

import com.company.TreeNode;

import java.util.Stack;

/**
 * @author xiu
 * @create 2023-06-27 20:07
 */
public class 二叉树的最大深度 {
//    动态规划
    public int maxDepth(TreeNode root) {
        if(root==null) return 0;
        int left=maxDepth(root.left);
        int right=maxDepth(root.right);
        return Math.max(left,right)+1;
    }

}
