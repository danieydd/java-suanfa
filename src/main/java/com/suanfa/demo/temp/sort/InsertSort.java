package com.suanfa.demo.temp.sort;

/**
 * @ClassName InsertSort 插入排序
 * @Description 一、原理简介
 * 插入排序的原理即是，从第二个元素开始，找到合适的位置，将元素插入到之前已排好序的元素中去，依次下去最终完成排序。
 * 就类似打扑克牌，每次抓到一张新的牌时，都将其插入到手中已排好序的牌组中。
 *
 * 插入排序适用于少量数据的排序，特别是将一个新的元素插入到已有的排好序的数组中，插入排序是一种稳定的排序方法。
 *
 *
 *
 * 二、时间复杂度
 * 插入排序的时间复杂度为 O(n^2)。
 *
 * 由于每次插入一个新的元素，都需要遍历之前的元素，这种遍历方式的时间复杂度为 O(n)，
 * 排序相当于需要插入 n 个元素，即综合时间复杂度为 O(n^2)。

 * 原文链接：https://blog.csdn.net/afei__/article/details/82949003
 * @Author danie
 * @Date 2021-11-03 13:23
 */
public class InsertSort {
    public static void main(String[] args) {
        int[] arr = new int[]{2, -3, 23, 3, -12, -1, 2, 34, -30, 12, 2};
        insertSort(arr);
        printArray(arr);
    }

    public static void insertSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            // 依次遍历索引 i 之前的元素，直到找到合适的插入位置
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                } else {
                    break;
                }
            }
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
