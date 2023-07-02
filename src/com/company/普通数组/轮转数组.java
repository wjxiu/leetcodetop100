package com.company.普通数组;

import java.util.Arrays;

/**
 * @author xiu
 * @create 2023-06-23 23:03
 */
public class 轮转数组 {
    public static void main(String[] args) {
        int[] ints = {1, 2, 3, 4, 5};
        new 轮转数组().swap(ints,1,4);
        System.out.println(Arrays.toString(ints));
    }
    public void rotate(int[] nums, int k) {
        k%= nums.length;
//        反转全部
        swap(nums,0, nums.length-1);
        swap(nums,0,k);
        swap(nums,k, nums.length-1);

    }
//    反转num的[left,right]部分
    public void swap(int[] nums,int left,int right){
        int l=left;
        int r=right;
        while (l<=r){
            int temp=nums[l];
            nums[l]=nums[r];
            nums[r]=temp;
            l++;
            r--;
        }
    }
}
