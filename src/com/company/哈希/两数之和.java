package com.company.哈希;

import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * @author xiu
 * @create 2023-06-22 12:09
 */
public class 两数之和 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new 两数之和().twoSum(new int[]{3, 2, 4}, 6)));
    }
    public int[] twoSum(int[] nums, int target) {
        int[] arr=new int[2];
        HashMap<Integer,Integer> h=  new HashMap<Integer,Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (h.containsKey(target-nums[i])){
                arr[0]=h.get(target-nums[i]);
                arr[1]=i;
            }
           h.put(nums[i],i);
        }
        return arr;
    }
}
