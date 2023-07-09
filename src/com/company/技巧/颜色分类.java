package com.company.技巧;

import java.util.Arrays;

/**
 * @author xiu
 * @create 2023-07-09 10:35
 */
public class 颜色分类 {
    public static void main(String[] args) {
        int[] ints = {1, 2, 1, 1, 2, 0, 1, 2};
        new 颜色分类().sortColors(ints);
        System.out.println(Arrays.toString(ints));
    }
//    单指针遍历
    public void sortColors(int[] nums) {
        int head=0;
        for (int i = 0; i <nums.length; i++) {
            if (nums[i]==0){
                int temp=nums[head];
                nums[head]=nums[i];
                nums[i]=temp;
                head++;
            }
        }
        for (int i = head; i <nums.length; i++) {
            if (nums[i]==1){
                int temp=nums[head];
                nums[head]=nums[i];
                nums[i]=temp;
                head++;
            }
        }
    }
}
