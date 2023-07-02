package com.company.树;

import com.company.TreeNode;

/**
 * @author xiu
 * @create 2023-07-02 20:19
 */
public class 路径总和III {
    public static void main(String[] args) {
//        new 路径总和III().
    }

    public int pathSum(TreeNode root, int targetSum) {
        if (root == null) return 0;
        int res = 0;
        res += rootpath(root, targetSum);
        res += pathSum(root.left, targetSum);
        res += pathSum(root.right, targetSum);
        return res;
    }

    public int rootpath(TreeNode root, int target) {
        int res = 0;
        if (root == null) return 0;
        if (root.val == target) {
            res += 1;
        }
        res += rootpath(root.left, target - res);
        res += rootpath(root.right, target - res);
        return res;
    }

}
