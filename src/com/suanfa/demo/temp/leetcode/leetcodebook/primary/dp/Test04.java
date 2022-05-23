package com.suanfa.demo.temp.leetcode.leetcodebook.primary.dp;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Test04
 * @Description 买卖股票的最佳时机
 * 输入：[7,1,5,3,6,4]
 * 输出：5
 * 解释：在第 2 天（股票价格 = 1）的时候买入，在第 5 天（股票价格 = 6）的时候卖出，最大利润 = 6-1 = 5 。
 * 注意利润不能是 7-1 = 6, 因为卖出价格需要大于买入价格；同时，你不能在买入前卖出股票。
 * tips：
 * 超时
 * @Author danie
 * @Date 2022-05-17 16:48
 */
public class Test04 {
    public static int maxProfit(int[] prices) {
        int max = 0;
        int max2 = 0;

        for (int i = 0; i < prices.length; i++) {
            if (max2 < maxProfit(i, max, prices)) {
                max2 = maxProfit(i, max, prices);
            }

        }
        return max2;
    }

    public static int maxProfit(int i, int max, int[] prices) {
        for (int j = i + 1; j < prices.length; j++) {
            int gap = prices[j] - prices[i];
            if (gap > max) {
                max = gap;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] prices = new int[]{7, 1, 5, 3, 6, 4};
        System.out.println("最大利润=" + maxProfit(prices));
    }
}
