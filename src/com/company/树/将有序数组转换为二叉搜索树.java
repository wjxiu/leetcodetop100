package com.company.树;

import com.company.TreeNode;

/**
 * @author xiu
 * @create 2023-06-27 21:56
 */
public class 将有序数组转换为二叉搜索树 {
    public TreeNode sortedArrayToBST(int[] nums) {
        return  helper(nums,0,nums.length-1);
    }

    TreeNode helper(int[] nums,int left,int right){
        if(left>right){
            return null;
        }
        int mid=(left+right)/2;
        TreeNode root= new TreeNode(nums[mid]);
        root.left=helper(nums,left,mid-1);
        root.right=helper(nums,mid+1,right);
        return root;
    }
}
