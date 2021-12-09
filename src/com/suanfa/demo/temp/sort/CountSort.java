package com.suanfa.demo.temp.sort;

import java.util.Arrays;

/**
 * @ClassName CountSort
 * @Description 计数排序
 * 计算排序假设 n 个输入元素都是 0 到 k 区间内的一个整数，其中 k 为某个整数。
 * 创建一个长度为 k+1 的数组 count[]，它的 count[i] 的值对应输入数组中 i 出现的次数。
 * 通过遍历一次输入数组并统计每个元素出现次数，最后遍历 count[] 输出。
 * @Author danie
 * @Date 2021-11-15 11:02
 */
public class CountSort {
    private static void countSort(int[] arr) {
        //获取最大数
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        max++;
        System.out.println("max=" + max);
        int[] arrySort = new int[max];
        int index = 0;
        //insert
        for (int i = 0; i < arr.length; i++) {
            arrySort[arr[i]]++;
        }
        //遍历
        for (int i = 0; i < arrySort.length; i++) {
            for (int j = 0; j < arrySort[i]; j++) {
                arr[index++] = i;
            }
        }
    }

    public static void main(String[] args) {
        // 输入元素均在 [0, 10) 这个区间内
        int[] arr = new int[]{4, 4, 6, 5, 3, 2, 8, 1, 7, 5, 6, 0, 10};
        countSort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
