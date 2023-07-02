package com.company.哈希;

import java.util.HashSet;

/**
 * @author xiu
 * @create 2023-06-22 12:39
 */
public class 最长连续序列 {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        int count=0;
        for(int num:nums){
            int currnum=num;
            int currcount=1;
            if (!set.contains(num-1)){
                while (set.contains(currnum+1)){
                    currcount++;
                    currnum++;
                }
            }
            count=Math.max(currcount,count);
        }
        return count;
    }
}
