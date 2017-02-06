package com.csy.algorithm.array;


/**
 * Created by Administrator on 2016/12/19.
 * 股票允许买卖多次,在买入前必须卖掉原来的。
 * 分析：因为买入前必须卖掉，所以只要有利润就卖是最优解
 */
public class BuyandSellStock2 {

    public static void main(String[] args) {
        System.out.println(maxProfit2(new int[]{10, 1, 3, 2, 4, 8, 1, 7}));
    }

    public static int maxProfit2(int[] prices) {
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i - 1] < prices[i]) {
                profit += prices[i] - prices[i - 1];
            }
        }
        return profit;
    }
}
