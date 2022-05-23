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
 * 分治-使用递归的思想
 * tips：比较麻烦
 * @Author danie
 * @Date 2022-05-17 19:15
 */
public class Test07 {
    public static int maxSubArray(int[] nums) {
        return getMax(nums, 0, nums.length - 1);
    }

    private static int getMax(int[] nums, int left, int right) {
        if (left == right) return nums[left];
        int mid = (left + right) / 2;
        int leftMax = getMax(nums, left, mid);
        int rightMax = getMax(nums, mid + 1, right);
        int crossMax = getCrossMax(nums, left, right);
        return Math.max(Math.max(leftMax,rightMax),crossMax);
    }

    private static int getCrossMax(int[] nums, int left, int right) {
        int mid = (left + right) / 2;
        int leftSum = nums[mid];
        int leftMax = leftSum;
        for (int i = mid - 1; i >= left; i--) {
            leftSum += nums[i];
            leftMax = Math.max(leftMax, leftSum);
        }
        int rightSum = nums[mid+1];
        int rightMax = rightSum;
        for (int i = mid + 2; i <= right; i++) {
            rightSum += nums[i];
            rightMax = Math.max(rightMax, rightSum);
        }
        return leftMax + rightMax;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,2};
        int res = maxSubArray(nums);
        System.out.println("res=" + res);
    }
}
