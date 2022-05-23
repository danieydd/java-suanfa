package com.suanfa.demo.temp.leetcode.leetcodebook.primary.dp;

/**
 * @ClassName Test06
 * @Description 最大子序和
 * 给你一个整数数组 nums ，请你找出一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 * <p>
 * 子数组 是数组中的一个连续部分。
 * 输入：nums = [-2,1,-3,4,-1,2,1,-5,4]
 * 输出：6
 * 解释：连续子数组 [4,-1,2,1] 的和最大，为 6 。
 * 动态规划
 *
 * @Author danie
 * @Date 2022-05-17 19:15
 */
public class Test08 {
    public static int maxSubArray(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        int res = nums[0];
        for (int i = 1; i < nums.length; i++) {
            dp[i] = Math.max(dp[i - 1] + nums[i], nums[i]);
            res = Math.max(dp[i], res);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2};
        int res = maxSubArray(nums);
        System.out.println("res=" + res);
    }
}
