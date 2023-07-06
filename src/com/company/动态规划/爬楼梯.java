package com.company.动态规划;

/**
 * @author xiu
 * @create 2023-07-06 20:51
 */
public class 爬楼梯 {
    public static void main(String[] args) {
        System.out.println(new 爬楼梯().climbStairs(4));
    }

    public int climbStairs(int n) {
        int x = 0;
        int y = 0;
        int z = 1;
        for (int i = 0; i < n; i++) {
            x = y;
            y = z;
            z = x + y;
        }
        return z;
    }
}
