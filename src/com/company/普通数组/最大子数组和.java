package com.company.普通数组;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * @author xiu
 * @create 2023-06-23 15:28
 */
public class 最大子数组和 {
//    动态规划
    public int maxSubArray(int[] nums) {
//     dp数组定义：以nums[i]为结尾的连续子数组和的最大值
        int[] dp=new int[nums.length];
        dp[0]=nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (dp[i-1]<0){
                dp[i]=nums[i];
            }else{
                dp[i]=dp[i-1]+nums[i];
            }
        }
        Arrays.sort(dp);
        return dp[nums.length-1];
    }
}
