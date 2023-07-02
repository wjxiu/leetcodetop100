package com.company.子串;

import java.util.PriorityQueue;

/**
 * @author xiu
 * @create 2023-06-23 14:20
 */
public class 和为K的子数组 {
//    暴力
    public int subarraySum(int[] nums, int k) {
        int count=0;
        for (int i = 0; i < nums.length; i++) {
            int sum=0;
            for (int j = i; j < nums.length; j++) {
                sum+=nums[j];
                if (sum==k){
                    count++;
                }
            }
        }
        PriorityQueue<Integer> integers = new PriorityQueue<>();
        return count;
    }
//    todo 前缀和+哈希表解法
}
