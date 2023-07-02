package com.company.树;

import com.company.Main;
import com.company.TreeNode;

/**
 * @author xiu
 * @create 2023-06-28 9:52
 */
public class 验证二叉搜索树 {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(2);
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(3);
        treeNode.left=treeNode1;
        treeNode.right=treeNode2;
        new 验证二叉搜索树().isValidBST1(treeNode);
    }
//    递归
    public boolean isValidBST(TreeNode root) {
      return  helper(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
    boolean helper(TreeNode root,long left, long right){
        if (root==null) return true;
        if (root.val<=left||root.val>=right) return false;
      return   helper(root.left,left,root.val )&&
        helper(root.right,root.val,right);
    }
//    中序遍历
    public boolean isValidBST1(TreeNode root) {
        return helper1(root);
    }
    long pre=Long.MIN_VALUE;
    boolean helper1(TreeNode root){
        if (root==null) return true;
        boolean l = helper1(root.left);
        if (root.val<=pre) return false;
        pre=root.val;
        boolean r = helper1(root.right);
        return l&&r;
    }
}
