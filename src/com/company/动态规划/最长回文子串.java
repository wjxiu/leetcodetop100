package com.company.动态规划;

/**
 * @author xiu
 * @create 2023-07-08 9:26
 */
public class 最长回文子串 {
    public static void main(String[] args) {
        System.out.println(new 最长回文子串().longestPalindrome("bb"));
    }
    public String longestPalindrome(String s) {
        int left = 0;
        int right = 0;
//        dp[i][j]：表示区间范围[i,j] （注意是左闭右闭）的子串是否是回文子串
        boolean[][] dp=new boolean[s.length()][s.length()];
        char[] chars = s.toCharArray();
        // 这里是从下到上，从左到右遍历
        // 因为要根据dp[i][j]是根据dp[i+1][j-1]的来的
        for (int i = s.length()-1; i >=0; i--) {
            for (int j = i; j <s.length(); j++) {
                if (chars[i]==chars[j]){
                    if (j-i<=1){
                        dp[i][j]=true;
                    }else{
                        if (dp[i+1][j-1])
                            dp[i][j]=true;
                    }
                }
//                记录结果的左右下标
                if (dp[i][j]&&j-i>right-left){
                    left=i;
                    right=j;
                }
            }
        }
        return s.substring(left,right+1);
    }
}
