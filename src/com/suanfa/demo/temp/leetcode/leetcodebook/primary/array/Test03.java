package com.suanfa.demo.temp.leetcode.leetcodebook.primary.array;

/**
 * @ClassName Test03
 * @Description 买卖股票的最佳时机 II
 * 贪心算法-买涨不买跌
 * 给定一个数组 prices ，其中 prices[i] 表示股票第 i 天的价格。
 * <p>
 * 在每一天，你可能会决定购买和/或出售股票。你在任何时候 最多 只能持有 一股 股票。你也可以购买它，然后在 同一天 出售。
 * 返回 你能获得的 最大 利润 。
 * @Author danie
 * @Date 2022-02-18 14:48
 */
public class Test03 {
    public static int maxProfit(int[] prices) {
        int s = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                s += prices[i] - prices[i - 1];
            }
        }
        return s;

    }

    public static void main(String[] args) {
        int[] prices = new int[]{7, 1, 5, 3, 6, 4};
        int s = maxProfit(prices);
        System.out.println("利润为： " + s);
    }
}
