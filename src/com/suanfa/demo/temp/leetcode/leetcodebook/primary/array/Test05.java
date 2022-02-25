package com.suanfa.demo.temp.leetcode.leetcodebook.primary.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassName Test05
 * @Description 给你两个整数数组 nums1 和 nums2 ，请你以数组形式返回两数组的交集。返回结果中每个元素出现的次数，应与元素在两个数组中都出现的次数一致（如果出现次数不一致，则考虑取较小值）。可以不考虑输出结果的顺序。
 * <p>
 * 排序+双指针
 * 输入：nums1 = [1,2,2,1], nums2 = [2,2]
 * 输出：[2,2]
 * @Author danie
 * @Date 2022-02-24 18:20
 */
public class Test05 {
    public static int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int length1 = nums1.length;
        int length2 = nums2.length;

        List<Integer> reList = new ArrayList<Integer>();
        int i = 0;
        int j = 0;
        while (i < length1 && j < length2) {
            if (nums1[i] == nums2[j]) {
                reList.add(nums1[i]);
                i++;
                j++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                i++;
            }
        }
        int[] res = new int[reList.size()];
        for (int m = 0; m < reList.size(); m++) {
            res[m] = reList.get(m);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 2, 1};
        int[] array2 = new int[]{2, 2};
        int[] arrayNew = intersect(array, array2);
        System.out.println("数组的交集为= " + Arrays.toString(arrayNew));
    }
}
