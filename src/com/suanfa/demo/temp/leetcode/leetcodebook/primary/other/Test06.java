package com.suanfa.demo.temp.leetcode.leetcodebook.primary.other;

/**
 * @ClassName Test06
 * @Description 缺失数字
 * 给定一个包含 [0, n] 中 n 个数的数组 nums ，找出 [0, n] 这个范围内没有出现在数组中的那个数。
 * @Author danie
 * @Date 2022-06-02 10:35
 */
public class Test06 {
    public static int missingNumber(int[] nums) {
        int len = nums.length;
        int sum = (0 + len) * (len + 1) / 2;
        for (int i = 0; i < nums.length; i++) {
            sum -= nums[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] array = new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1};
        int number = missingNumber(array);
        System.out.println("number= " + number);
    }
}
