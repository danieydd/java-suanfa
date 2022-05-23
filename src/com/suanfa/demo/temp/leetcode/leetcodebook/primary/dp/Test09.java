package com.suanfa.demo.temp.leetcode.leetcodebook.primary.dp;

/**
 * @ClassName Test09
 * @Description 打家劫舍
 * 你是一个专业的小偷，计划偷窃沿街的房屋。每间房内都藏有一定的现金，影响你偷窃的唯一制约因素就是相邻的房屋装有相互连通的防盗系统，如果两间相邻的房屋在同一晚上被小偷闯入，系统会自动报警。
 * <p>
 * 给定一个代表每个房屋存放金额的非负整数数组，计算你 不触动警报装置的情况下 ，一夜之内能够偷窃到的最高金额。
 * 输入：[2,7,9,3,1]
 * 输出：12
 * 解释：偷窃 1 号房屋 (金额 = 2), 偷窃 3 号房屋 (金额 = 9)，接着偷窃 5 号房屋 (金额 = 1)。
 *      偷窃到的最高金额 = 2 + 9 + 1 = 12 。
 * Tips：动态规划
 * @Author danie
 * @Date 2022-05-23 14:19
 */
public class Test09 {
    public static int rob(int[] nums) {
        int[][] dp = new int[nums.length][2];
        //初始值
        //没偷
        dp[0][1] = 0;
        //偷
        dp[0][0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            //没有偷 则前一家可偷可不偷
            dp[i][1] = Math.max(dp[i - 1][0], dp[i - 1][1]);
            //偷
            dp[i][0] = dp[i - 1][1] + nums[i];
        }
        return Math.max(dp[nums.length-1][1],dp[nums.length-1][0]);
    }

    public static void main(String[] args) {
        int[] array = new int[]{2, 1, 1, 2};
        int rob = rob(array);
        System.out.println("rob=" + rob);
    }
}
