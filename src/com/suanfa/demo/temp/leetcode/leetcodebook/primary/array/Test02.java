package com.suanfa.demo.temp.leetcode.leetcodebook.primary.array;

/**
 * @ClassName Test02
 * @Description 买卖股票的最佳时机 II
 * 给定一个数组 prices ，其中 prices[i] 表示股票第 i 天的价格。
 * <p>
 * 在每一天，你可能会决定购买和/或出售股票。你在任何时候 最多 只能持有 一股 股票。你也可以购买它，然后在 同一天 出售。
 * 返回 你能获得的 最大 利润 。
 * @Author danie
 * @Date 2022-02-18 13:08
 */
public class Test02 {
    public static int maxProfit(int[] prices) {
        if(prices==null || prices.length<2){
            return 0;
        }
        int[][] dpArray = new int[prices.length][2];
        //第一天没有买入
        dpArray[0][0] = 0;
        //第一天买入
        dpArray[0][1] = -prices[0];
        for(int i = 1;i<prices.length;i++){
            //手里没有股票 1)昨天也没股票 2)昨天手里有股,今天卖出
            dpArray[i][0]=Math.max(dpArray[i-1][0],dpArray[i-1][1]+prices[i]);
            //手里有股票 1)昨天手里有股票 2)昨天手里没有股票，今天买入
            dpArray[i][1] =Math.max(dpArray[i-1][1],dpArray[i-1][0]-prices[i]);
        }
        return dpArray[prices.length-1][0];

    }
    public static void main(String[] args) {
        int[] prices = new int[]{7, 1, 5, 3, 6, 4};
        int s = maxProfit(prices);
        System.out.println("利润为： "+s);
    }
}
