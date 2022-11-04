package com.suanfa.suixianglu.huisu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @ClassName Test47
 * @Description 47.全排列 II
 * 力扣题目链接(opens new window)
 * <p>
 * 给定一个可包含重复数字的序列 nums ，按任意顺序 返回所有不重复的全排列。
 * <p>
 * 示例 1：
 * <p>
 * 输入：nums = [1,1,2]
 * 输出： [[1,1,2], [1,2,1], [2,1,1]]
 * 示例 2：
 * <p>
 * 输入：nums = [1,2,3]
 * 输出：[[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
 * 提示：
 * <p>
 * 1 <= nums.length <= 8
 * -10 <= nums[i] <= 10
 * @Author danie
 * @Date 2022-11-04 14:39
 */
public class Test47 {
    private static List<List<Integer>> res = new ArrayList<>();
    private static LinkedList<Integer> path = new LinkedList<>();
    private static boolean[] used;

    public static List<List<Integer>> permuteUnique(int[] nums) {
        if (nums == null || nums.length == 0) return null;
        used = new boolean[nums.length];
        Arrays.sort(nums);
        permuteUniqueHelper(nums);
        return res;
    }

    public static void permuteUniqueHelper(int[] nums) {
        if (path.size() == nums.length) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i - 1] == nums[i] && !used[i - 1]) continue;
            if (used[i] == false) {
                path.add(nums[i]);
                used[i] = true;
                permuteUniqueHelper(nums);
                path.removeLast();
                used[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 1, 2};
        List<List<Integer>> res = permuteUnique(nums);
        System.out.println("res=" + res);
    }

}
