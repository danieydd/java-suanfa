package com.suanfa.demo.temp.leetcode.leetcodebook.primary.array;

import java.util.*;

/**
 * @ClassName Test06
 * @Description 给你两个整数数组 nums1 和 nums2 ，请你以数组形式返回两数组的交集。返回结果中每个元素出现的次数，应与元素在两个数组中都出现的次数一致（如果出现次数不一致，则考虑取较小值）。可以不考虑输出结果的顺序。
 * <p>
 * map集合
 * getOrDefault(Object key, V defaultValue) 获取指定key的value，如果没有key则设置为默认的值 defaultValue
 * 可以有效解决 map.get(key)返回null的问题
 * 输入：nums1 = [1,2,2,1], nums2 = [2,2]
 * 输出：[2,2]
 * @Author danie
 * @Date 2022-02-24 18:20
 */
public class Test06 {
    public static int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        List<Integer> res = new ArrayList<Integer>();
        for (int i = 0; i < nums1.length; i++) {
            map.put(nums1[i], map.getOrDefault(nums1[i], 0) + 1);
        }
        for (int j = 0; j < nums2.length; j++) {
            if (map.getOrDefault(nums2[j], 0) > 0) {
                res.add(nums2[j]);
                map.put(nums2[j], map.get(nums2[j]) - 1);
            }
        }
        int[] resArray = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            resArray[i] = res.get(i);
        }
        return resArray;
    }

    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 2, 1};
        int[] array2 = new int[]{2, 2};
        int[] arrayNew = intersect(array, array2);
        System.out.println("数组的交集为= " + Arrays.toString(arrayNew));
    }
}
