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
//    双指针遍历
    public void sortColors(int[] nums) {
        int p0=0;
        int p1=0;
        for (int i = 0; i <nums.length; i++) {
            if (nums[i]==1){
                int temp=nums[p1];
                nums[p1]=nums[i];
                nums[i]=temp;
                p1++;
            }else if(nums[i]==0){
                int temp=nums[p0];
                nums[p0]=nums[i];
                nums[i]=temp;
//                防止p0指针移动到   数字1的位置
//                把交换后的nums[i]的换到p1，
                if (p1>p0){
                     temp=nums[p1];
                    nums[p1]=nums[i];
                    nums[i]=temp;
                }
                p1++;
                p0++;
            }
        }

    }
}
