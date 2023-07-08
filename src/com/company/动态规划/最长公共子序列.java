package com.company.动态规划;

/**
 * @author xiu
 * @create 2023-07-08 10:16
 */
public class 最长公共子序列 {
    public int longestCommonSubsequence(String text1, String text2) {
        char[] t1chars = text1.toCharArray();
        char[] t2chars = text2.toCharArray();
        // 含义dp[i][j]表示text1[0,i) 和text2[0,j)的最长公共子序列的长度
        int[][]dp=new int[t1chars.length+1][t2chars.length+1];
        for (int i = 1; i <= t1chars.length; i++) {
            for (int j = 1; j <=t2chars.length ; j++) {
                // 这里比较i-1和 j-1，因为dp(i,j)保存的是0,i-1最长公共子序列的长度
                if (t1chars[i-1]==t2chars[j-1]){
                    dp[i][j]=dp[i-1][j-1]+1;
                }else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[t1chars.length][t2chars.length];
    }
}
