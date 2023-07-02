package com.company.树;

import com.company.TreeNode;

/**
 * @author xiu
 * @create 2023-06-28 10:24
 */
public class 二叉搜索树中第K小的元素 {
    int res=-1;
    int count=0;
    public int kthSmallest(TreeNode root, int k) {
        helper(root,k);
        return res;
    }

    void helper(TreeNode root, Integer k) {
        if (root==null) return;

        helper(root.left, k);
        count++;
        if (count==k){
            res=root.val;
        }
         helper(root.right, k);
    }
}
