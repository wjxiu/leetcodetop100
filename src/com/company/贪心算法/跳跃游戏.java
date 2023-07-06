package com.company.贪心算法;

/**
 * @author xiu
 * @create 2023-07-06 18:48
 */
public class 跳跃游戏 {
    public boolean canJump(int[] nums) {
//        可以跳到的最大步数
        int distance=0;
        for (int i = 0; i < nums.length; i++) {
//            如果上一次不能跳到i，结束
            if (i>distance) return false;
//            选取最大的步数
            distance=Math.max(distance,i+nums[i]);
        }
        return true;
    }
}
