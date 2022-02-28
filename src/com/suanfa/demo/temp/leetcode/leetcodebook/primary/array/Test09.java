package com.suanfa.demo.temp.leetcode.leetcodebook.primary.array;

import java.util.Arrays;

/**
 * @ClassName Test09
 * @Description 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。
 * <p>
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
 * <p>
 * 你可以按任意顺序返回答案。
 * 输入：nums = [2,7,11,15], target = 9
 * 输出：[0,1]
 * 解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
 * <p>
 *快慢指针
 * @Author danie
 * @Date 2022-02-28 16:37
 */
public class Test09 {
    public static int[] twoSum(int[] nums, int target) {
        int index = 0;
        int[] array = new int[2];
        while (index < nums.length) {
            if(index==3){
                System.out.println("index="+index);
            }
            for (int i = index+1; i < nums.length; i++) {
                if (nums[index] + nums[i] == target) {
                    array[0] = index;
                    array[1] = i;
                    return array;
                }
            }
            index++;
        }
        return null;
    }

    public static void main(String[] args) {
        int[] array = new int[]{2,1,9,4,4,56,90,3};
        int[] twoSum = twoSum(array, 8);
        System.out.println(Arrays.toString(twoSum));
    }
}
