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
        int end=1;
        int start=0;
        while (end< nums.length-1){
            int max_dis=0;
            for (int i = start; i < end; i++) {
                max_dis=Math.max(max_dis,nums[i]+i);
            }
            start=end;
            end=max_dis;
            step++;
        }

        return step;
    }
}
