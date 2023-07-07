package com.company.动态规划;


/**
 * @author xiu
 * @create 2023-07-06 21:25
 */
public class 打家劫舍 {

    public static void main(String[] args) {
        System.out.println(new 打家劫舍().rob(new int[]{2, 7, 9, 3, 1}));
    }

    public int rob(int[] nums) {
        if (nums.length == 1) return nums[0];
        int[] res = new int[nums.length];
//        只有一家，肯定偷
        res[0] = nums[0];
//        两家偷价值高的
        res[1] = Math.max(nums[0], nums[1]);

        for (int i = 2; i < nums.length; i++) {
            //    	偷	k=	res[k-2]	   add 	house k
            //	不偷	k=	res[k-1]
            res[i] = Math.max(res[i - 2] + nums[i], res[i - 1]);
        }
        return res[res.length - 1];
    }
}