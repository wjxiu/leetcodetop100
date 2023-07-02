package com.company.双指针;

/**
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 *
 * 请注意 ，必须在不复制数组的情况下原地对数组进行操作。
 * @author xiu
 * @create 2023-06-22 12:56
 */
public class 移动零 {
//    输入: nums = [0,1,0,3,12]
//输出: [1,3,12,0,0]
    public void moveZeroes(int[] nums) {
        if (nums==null||nums.length==0) return;
        int j=0;
        for (int k = 0; k < nums.length; k++) {
            if (nums[j]!=0){
               nums[k]=nums[j];
               j++;
            }
        }
        for (int i = j; i < nums.length; i++) {
            nums[i]=0;
        }
    }
}
