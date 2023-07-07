package com.company.动态规划;

/**
 * @author xiu
 * @create 2023-07-07 13:39
 */
public class 乘积最大子数组 {
    public static void main(String[] args) {
        System.out.println(new 乘积最大子数组().maxProduct(new int[]{2, 3, -2, 4}));
    }
    public int maxProduct(int[] nums) {
        int length = nums.length;
        int maxres[] = new int[length];
        int minres[] = new int[length];
        maxres[0]=nums[0];
        minres[0]=nums[0];
        for (int i = 1; i < length; i++) {
            int num = nums[i];
            int max = Math.max(Math.max(maxres[i - 1] * num, minres[i - 1] * num), num);
            maxres[i] = max;
            int min = Math.min(Math.min(maxres[i - 1] * num, minres[i - 1] * num), num);
            minres[i] = min;
        }
        int ans = maxres[0];
        for (int i = 1; i < maxres.length; i++) {
            ans = Math.max(maxres[i], ans);
        }
        return ans;
    }
}
