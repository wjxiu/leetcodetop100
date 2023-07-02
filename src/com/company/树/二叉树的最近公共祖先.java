package com.company.树;

import com.company.TreeNode;

/**
 * @author xiu
 * @create 2023-07-02 20:42
 */
public class 二叉树的最近公共祖先 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null) return null;
        if(root==p) return p;
        if(root==q) return q;
        TreeNode left= lowestCommonAncestor(root.left,p,q);
        TreeNode right= lowestCommonAncestor(root.right,p,q);
        if(left==null&&right==null) return null;
        if(left!=null&&right==null) return left;
        if(left==null&&right!=null) return right;
        return root;
    }

}
