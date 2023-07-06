package com.company.贪心算法;

/**
 * @author xiu
 * @create 2023-07-06 18:31
 */
public class 买卖股票的最佳时机 {
    public int maxProfit(int[] prices) {
        int min=Integer.MAX_VALUE;
        int res=0;
        for (int i = 0; i < prices.length; i++) {
            int price = prices[i];
            min=Math.min(price,min);
            res= Math.max(res,price-min);
        }
        return res;
    }
}
