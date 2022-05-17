package com.suanfa.demo.temp.leetcode.leetcodebook.primary.orderandsearch;

/**
 * @ClassName Test01
 * @Description 合并两个有序数组
 * 输入：nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
 * 输出：[1,2,2,3,5,6]
 * 解释：需要合并 [1,2,3] 和 [2,5,6] 。
 * 合并结果是 [1,2,2,3,5,6] ，其中斜体加粗标注的为 nums1 中的元素。
 * @Author danie
 * @Date 2022-05-15 16:05
 */
public class Test01 {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int end = m + n - 1;
        while (j >= 0) {
            nums1[end--] = (i >= 0 && nums1[i] > nums2[j]) ? nums1[i--] : nums2[j--];
        }
    }

    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 0, 0, 0};
        int[] array2 = new int[]{2, 5, 6};
        merge(array, 3, array2, 3);
        System.out.println("array merged=" + array);
    }
}
