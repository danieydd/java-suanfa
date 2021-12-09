package com.suanfa.demo.temp.sort;

/**
 * @ClassName QuickSort
 * @Description 快速排序
 * @Author danie
 * @Date 2021-10-22 13:22
 */
public class QuickSort {
    public static void sort(int[] array, int left, int right) {
        if (left > right) {
            return;
        }
        //选取左边为基准数
        int base = array[left];
        //右边的哨兵:寻找大于基准数的值
        int i = left;
        //左边的哨兵:寻找小于基准数的值
        int j = right;
        while (i != j) {
            //左边哨兵 左->右
            while (array[j] >= base && i < j) {
                j--;
            }
            //右边哨兵 右->左
            while (array[i] <= base && i < j) {
                i++;
            }
            //左右哨兵没有相遇,交换
            if (i < j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
            //基准值归位
            array[left] = array[i];
            array[i] = base;
            //分治
            sort(array, left, i - 1);
            sort(array, i + 1, right);
        }
    }

    public static void quickSort(int[] array) {
        int len;
        if (array == null
                || (len = array.length) == 0
                || len == 1) {
            return;
        }
        sort(array, 0, len - 1);
    }

    public static void main(String args[]) {
        int[] array = new int[]{1, 4, 5, 6, 110, 9};
        quickSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");

        }
    }
}
