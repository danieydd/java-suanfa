package com.suanfa.demo.temp.sort;

/**
 * @ClassName SortDemo 选择排序
 * @Description 原理简介
 *         选择排序原理即是，遍历元素找到一个最小（或最大）的元素，把它放在第一个位置，然后再在剩余元素中找到最小（或最大）的元素，
 *         把它放在第二个位置，依次下去，完成排序。
 *
 * 时间复杂度
 *         选择排序的时间复杂度为 O(n^2)。
 *
 *         第一次需要检查n个元素，但随后检查的元素数依次为n - 1, n – 2, …, 2和1。平均每次检查的元素数为1/2 * n，
 *         因此运行时间为 n * 1/2 * n，简单地写作 O(n^2)。

 * 原文链接：https://blog.csdn.net/afei__/article/details/80159343
 * @Author danie
 * @Date 2021-11-03 13:22
 */
public class SortDemo {


    public static void main(String[] args) {
        int[] arr = new int[]{5, 3, 6, 2, 10, 2, 1};
        selectSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void selectSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i; // 用来记录最小值的索引位置，默认值为i
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j; // 遍历 i+1~length 的值，找到其中最小值的位置
                }
            }
            // 交换当前索引 i 和最小值索引 minIndex 两处的值
            if (i != minIndex) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
            // 执行完一次循环，当前索引 i 处的值为最小值，直到循环结束即可完成排序
        }
    }
}
