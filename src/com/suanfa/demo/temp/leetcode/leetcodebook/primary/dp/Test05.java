package com.suanfa.demo.temp.leetcode.leetcodebook.primary.dp;

/**
 * @ClassName Test04
 * @Description 买卖股票的最佳时机
 * 输入：[7,1,5,3,6,4]
 * 输出：5
 * 解释：在第 2 天（股票价格 = 1）的时候买入，在第 5 天（股票价格 = 6）的时候卖出，最大利润 = 6-1 = 5 。
 * 注意利润不能是 7-1 = 6, 因为卖出价格需要大于买入价格；同时，你不能在买入前卖出股票。
 * tips：
 * 动态规划
 * @Author danie
 * @Date 2022-05-17 16:48
 */
public class Test05 {
    public static int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0)
            return 0;
        int[][] dp = new int[prices.length][2];
        dp[0][0] = 0;
        dp[0][1] = -prices[0];
        for (int i = 1; i < prices.length; i++) {
            //不持有
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] + prices[i]);
            //持有
            dp[i][1] = Math.max(dp[i - 1][1], -prices[i]);
        }


        return dp[prices.length - 1][0];


    }

    public static void main(String[] args) {
        int[] prices = new int[]{7, 1};
        System.out.println("最大利润=" + maxProfit(prices));
    }
}
