package com.suanfa.suixianglu.huisu;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @ClassName Test46
 * @Description 46.全排列
 * <p>
 * 给定一个 没有重复 数字的序列，返回其所有可能的全排列。
 * <p>
 * 示例:
 * <p>
 * 输入: [1,2,3]
 * 输出: [ [1,2,3], [1,3,2], [2,1,3], [2,3,1], [3,1,2], [3,2,1] ]
 * @Author danie
 * @Date 2022-11-04 09:41
 */
public class Test46 {
    private static List<List<Integer>> res = new ArrayList<>();
    private static LinkedList<Integer> path = new LinkedList<>();
    static boolean[] used ;

    public static List<List<Integer>> permute(int[] nums) {
        if (nums == null || nums.length == 0) return null;
        used = new boolean[nums.length];
        permuteHelper(nums);
        return res;
    }

    public static void permuteHelper(int[] nums) {
        if (path.size() == nums.length) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (used[i]) continue;
            path.add(nums[i]);
            used[i] = true;
            permuteHelper(nums);
            path.removeLast();
            used[i] = false;

        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3};
        List<List<Integer>> res = permute(nums);
        System.out.println("res= " + res);

    }
}
