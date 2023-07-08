package com.company.动态规划;

import java.util.Arrays;

/**
 * @author xiu
 * @create 2023-07-08 8:50
 */
public class 不同路径 {
    public static void main(String[] args) {
        System.out.println(new 不同路径().uniquePaths(3, 7));
    }

    int[][] memo;

    public int uniquePaths(int m, int n) {
        memo = new int[m][n];
        for (int[] i : memo) {
            Arrays.fill(i, -1);
        }
        return dp(m - 1, n - 1);
    }

    //    返回0,0 到m,n的路径数
    public int dp(int m, int n) {
        if (m == 0 && n == 0) return 1;
        if (m < 0 || n < 0) return 0;
        if (memo[m][n] == -1) {
            memo[m][n] = dp(m - 1, n) + dp(m, n - 1);
        }
        return memo[m][n];
    }
}
