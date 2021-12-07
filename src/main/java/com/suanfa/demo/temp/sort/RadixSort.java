package com.suanfa.demo.temp.sort;

import java.util.ArrayList;

/**
 * @ClassName RadixSort 基数排序
 * @Description 基数排序是这样一种排序算法，我们可以从低位（个位）开始，根据个位数排序一次，然后根据十位数排序，
 * 再根据百位数进行排序……最终完成整个数组的排序。
 *
 * 对于十进制数字而言，每一位只会是 0~9 这十个数字，我们通常使用桶排序（计数排序）来完成每一位数的排序。
 * 桶排序是一种稳定的排序算法，基数排序的正确性依赖一种稳定的排序算法。
 *
 * 基数排序其实是分 LSD(从低位向高位排序) 和 MSD(从高位向低位排序) 两种。

 * 原文链接：https://blog.csdn.net/afei__/article/details/82971310
 * @Author danie
 * @Date 2021-11-03 13:25
 */
public class RadixSort {
    public static void main(String[] args) {
        int[] arr = new int[] { 321, 1234, 543, 324, 24, 960, 540, 672, 783, 1000 };
        radixSort(arr);
        printArray(arr);
    }

    public static void radixSort(int[] arr) {
        int digit = getMaxDigit(arr); // 获取最大的数是多少位
        for (int i = 0; i < digit; i++) {
            bucketSort(arr, i); // 执行 digit 次 bucketSort 排序即可
        }
    }

    public static int getMaxDigit(int[] arr) {
        int digit = 1; // 默认只有一位
        int base = 10; // 十进制每多一位，代表其值大了10倍
        for (int i : arr) {
            while (i > base) {
                digit++;
                base *= 10;
            }
        }
        return digit;
    }

    public static void bucketSort(int[] arr, int digit) {
        //Math.pow(x,n) 以x为底数,以n为指数
        int base = (int) Math.pow(10, digit);
        // init buckets
        ArrayList<ArrayList<Integer>> buckets = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < 10; i++) { // 只有0~9这十个数，所以准备十个桶
            buckets.add(new ArrayList<Integer>());
        }
        // sort
        for (int i : arr) {
            int index = i / base % 10;
            buckets.get(index).add(i);
        }
        // output: copy back to arr
        int index = 0;
        for (ArrayList<Integer> bucket : buckets) {
            for (int i : bucket) {
                arr[index++] = i;
            }
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
