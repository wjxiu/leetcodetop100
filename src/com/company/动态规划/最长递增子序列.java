package com.company.动态规划;

import java.util.Arrays;

/**
 * @author xiu
 * @create 2023-07-07 10:29
 */
public class 最长递增子序列 {
    public static void main(String[] args) {
        System.out.println(new 最长递增子序列().lengthOfLIS(new int[]{1}));
    }
//    没有完全符合动态规划的套路，有些变形
//    返回的结果不一定是最后一个res数组的最后一个，因为题目要求最长的长度，根据dp数组的定义，最后一个不一定是最大的
    public int lengthOfLIS(int[] nums) {
//        res[i] 的值代表 nums 以 nums[i]结尾的最长子序列长度。
        int[] res=new int[nums.length];
        Arrays.fill(res,1);
        int ans=-1;
        for (int i = 0; i <nums.length; i++) {
            for (int j = 0; j <i ; j++) {
                if (nums[i]>nums[j]){
                    res[i]=Math.max(res[i],res[j]+1);
                }
            }
            ans=Math.max(ans,res[i]);
        }
        return ans;
    }
}
