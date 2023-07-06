package com.company.贪心算法;

/**
 * @author xiu
 * @create 2023-07-06 19:10
 */
public class 跳跃游戏2 {
    public static void main(String[] args) {
        System.out.println(new 跳跃游戏2().jump(new int[]{2, 3, 1, 1, 4}));
    }
    public int jump(int[] nums) {
//
        int step=0;
//        能跳到的范围
        int distance=0;
//        跳跃的边界
        int end=0;
        int start=0;
//        不太理解为什么要-1
        for (int i = 0; i < nums.length-1; i++) {
            distance=Math.max(distance,i+nums[i]);
//            不得不跳，才跳，更新能跳到的最远距离
            if (i==end){
                step++;
//                更新边界为之前找到的最远距离
                end=distance;
            }
        }
        return step;
    }
}
