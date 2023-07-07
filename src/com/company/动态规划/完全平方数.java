package com.company.动态规划;

import java.util.Arrays;

/**
 * @author xiu
 * @create 2023-07-07 8:54
 */
public class 完全平方数 {
    public int numSquares(int n) {
//        dp数组含义，dp[n]为表示最小的完全平方数和
        int[] res=new int[n+1];
        Arrays.fill(res,Integer.MAX_VALUE);
        res[0]=0;
//        可以认为是找零钱的改版，零钱变成了[1平方-n平方]
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j*j <= i; j++) {
                res[i]=Math.min(res[i],res[i-j*j]+1);
            }
        }
        return res[res.length-1];
    }

}
