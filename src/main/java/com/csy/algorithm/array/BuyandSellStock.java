package com.csy.algorithm.array;

/**
 * Created by Administrator on 2016/12/19.
 * 给一组代表当天股票价格的数据，找出最大收益的买卖点。注意：股票必须先买后卖
 * 算法思路：遍历一遍，遍历过程中记录股票最小值，用当前值减去最小值，遍历完成后得出的最大数就是最大收益
 */
public class BuyandSellStock {

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7, 2, 3, 6, 2, 9,1}));
    }

    public static int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2) {
            return 0;
        }
        //记录当前遍历遇到的最小值
        int lowest = Integer.MAX_VALUE;
        //最差的情况是当次买，当次卖，收益为0
        int maxProfit = 0;
        for (int price : prices) {
            lowest = Math.min(lowest, price);
            //计算本次卖出所得收益
            maxProfit = Math.max(maxProfit, price - lowest);
        }
        return maxProfit;
    }
}
