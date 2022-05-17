package com.suanfa.demo.temp.leetcode.leetcodebook.primary.dp;

/**
 * @ClassName Test01
 * @Description 爬楼梯
 * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 * <p>
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 * 输入：n = 2
 * 输出：2
 * 解释：有两种方法可以爬到楼顶。
 * 1. 1 阶 + 1 阶
 * 2. 2 阶
 * tips:f(n)=f(n-1)+f(n-2)
 * 非递归
 * @Author danie
 * @Date 2022-05-17 15:00
 */
public class Test02 {
    public static int climbStairs(int n) {
        if(n==1)return 1;
        if(n==2)return 2;

        int[] dp = new int[n+1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i < n+1; i++) {
            dp[i] = dp[i - 1] + dp[i-2];
        }
        return dp[n];
    }

    public static void main(String[] args) {
        int n = climbStairs(1);
        System.out.println("climbStairs=" + n);
    }
}
