package com.suanfa.demo.temp.leetcode.leetcodebook.primary.designproblem;

import java.util.Arrays;
import java.util.Random;

/**
 * @ClassName Test01
 * @Description 打乱数组
 * 给你一个整数数组 nums ，设计算法来打乱一个没有重复元素的数组。打乱后，数组的所有排列应该是 等可能 的。
 * <p>
 * 实现 Solution class:
 * <p>
 * Solution(int[] nums) 使用整数数组 nums 初始化对象
 * int[] reset() 重设数组到它的初始状态并返回
 * int[] shuffle() 返回数组随机打乱后的结果
 * 输入
 * ["Solution", "shuffle", "reset", "shuffle"]
 * [[[1, 2, 3]], [], [], []]
 * 输出
 * [null, [3, 1, 2], [1, 2, 3], [1, 3, 2]]
 * <p>
 * 解释
 * Solution solution = new Solution([1, 2, 3]);
 * solution.shuffle();    // 打乱数组 [1,2,3] 并返回结果。任何 [1,2,3]的排列返回的概率应该相同。例如，返回 [3, 1, 2]
 * solution.reset();      // 重设数组到它的初始状态 [1, 2, 3] 。返回 [1, 2, 3]
 * solution.shuffle();    // 随机返回数组 [1, 2, 3] 打乱后的结果。例如，返回 [1, 3, 2]
 * @Author danie
 * @Date 2022-05-24 15:12
 */
public class Test01 {
    private int[] nums;
    private int[] shuffle;
    private Random random;


    public Test01(int[] nums) {
        this.nums = nums;
        random = new Random();
    }

    public int[] reset() {
        return nums;
    }

    public int[] shuffle() {
        if (nums == null) return null;
        shuffle = nums.clone();
        for (int i = shuffle.length - 1; i >= 0; i--) {
            int j = random.nextInt(i + 1);
            int temp = shuffle[i];
            shuffle[i] = shuffle[j];
            shuffle[j] = temp;
        }
        return shuffle;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3,4};
        System.out.println("nums" + Arrays.toString(nums));
        Test01 obj = new Test01(nums);
        int[] param_0 = obj.shuffle();
        System.out.println("param_0" + Arrays.toString(param_0));
        int[] param_1 = obj.reset();
        System.out.println("param_1" + Arrays.toString(param_1));
        int[] param_2 = obj.shuffle();
        System.out.println("param_2" + Arrays.toString(param_2));
    }
}
