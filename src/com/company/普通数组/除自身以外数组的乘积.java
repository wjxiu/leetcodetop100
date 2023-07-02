package com.company.普通数组;

import com.company.Main;

import java.util.Arrays;

/**
 * @author xiu
 * @create 2023-06-23 23:18
 */
public class 除自身以外数组的乘积 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new 除自身以外数组的乘积().productExceptSelf(new int[]{-1,1,0,-3,3})));
    }
    public int[] productExceptSelf(int[] nums) {
//        计算上三角
        int temp=1;
        int[] res = new int[nums.length];
        res[0]=1;
        for (int i = 1; i < nums.length; i++) {
            temp*=nums[i-1];
            res[i]=temp;
        }
        temp=1;
//        计算下三角
        for (int j = nums.length-2; j >=0 ; j--) {
            temp*=nums[j+1];
            res[j]*=temp;
        }
        return res;
    }
}
