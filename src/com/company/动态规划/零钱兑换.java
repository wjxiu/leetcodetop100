package com.company.动态规划;

import java.util.Arrays;

/**
 * @author xiu
 * @create 2023-07-07 9:43
 */
public class 零钱兑换 {
    public int coinChange(int[] coins, int amount){
//        保存金额为i凑成总金额所需的最少的硬币个数
        int[] res=new int[amount+1];
        Arrays.fill(res,amount+1);
        res[0]=0;
        for (int i = 1; i < res.length; i++) {
            for (int j = 0; j < coins.length; j++) {
//                这种写法是错误的，没有遍历全部硬币数组
//            for (int j = 0; j < coins.length&&i>=coins[j]; j++) {
                if(i>=coins[j]){
                    res[i]=Math.min(res[i],res[i-coins[j]]+1);
                }
            }
        }
//        加入没有发生变化res[amount]没有变化，证明所有硬币面值大于amount
        return res[amount]>amount?-1:res[amount];
    }
}
