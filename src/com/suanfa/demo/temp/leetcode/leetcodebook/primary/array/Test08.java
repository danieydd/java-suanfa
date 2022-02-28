package com.suanfa.demo.temp.leetcode.leetcodebook.primary.array;

import java.util.Arrays;

/**
 * @ClassName Test08
 * @Description 移动零
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 * <p>
 * 请注意 ，必须在不复制数组的情况下原地对数组进行操作。
 * <p>
 * 输入: nums = [0,1,0,3,12]
 * 输出: [1,3,12,0,0]
 * @Author danie
 * @Date 2022-02-28 13:49
 */
public class Test08 {
    public static void moveZeroes(int[] nums) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index++] = nums[i];
            }
        }
        while (index < nums.length) {
            nums[index++] = 0;
        }


    }

    public static void main(String[] args) {
        int[] array = new int[]{0, 1, 0, 3, 12};
        moveZeroes(array);
        System.out.println(Arrays.toString(array));
    }
}
