package com.suanfa.demo.temp.leetcode.leetcodebook.primary.array;

import java.util.Arrays;

/**
 * @ClassName Test04
 * @Description 给你一个数组，将数组中的元素向右轮转 k 个位置，其中 k 是非负数。
 * 输入: nums = [1,2,3,4,5,6,7], k = 3
 * 输出: [5,6,7,1,2,3,4]
 * 解释:
 * 向右轮转 1 步: [7,1,2,3,4,5,6]
 * 向右轮转 2 步: [6,7,1,2,3,4,5]
 * 向右轮转 3 步: [5,6,7,1,2,3,4]
 * @Author danie
 * @Date 2022-02-21 15:31
 */
public class Test04 {
    public static int[] shiftArray(int[] nums, int k) {
        int length = nums.length;
        int temp[] = new int[length];
        //把原数组值放到一个临时数组中，
        for (int i = 0; i < length; i++) {
            temp[i] = nums[i];
        }
        //然后在把临时数组的值重新放到原数组，并且往右移动k位
        for (int i = 0; i < length; i++) {
            nums[(i + k) % length] = temp[i];
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7};
        int[] arrayNew = shiftArray(array, 3);
        System.out.println("移动后的数组= " + Arrays.toString(arrayNew));
    }
}
