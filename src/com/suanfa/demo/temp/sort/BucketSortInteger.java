package com.suanfa.demo.temp.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassName BucketSortInteger
 * @Description 整数的桶排序
 * 每个桶存放指定大小的元素 桶集合存放所有的元素 根据下标可以获取指定下标大小的元素
 * 适合于指定范围区间的元素排序 元素分布比较均匀
 * @Author danie
 * @Date 2021-11-15 10:21
 */
public class BucketSortInteger {
    private static void bucketSort(int[] arr) {
        int max = 0;
        //获取最大数
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        max++;
        System.out.println("max=" + max);
        //创建桶
        ArrayList<List<Integer>> arrayList = new ArrayList<>();
        //初始化桶集合
        for (int i = 0; i < max; i++) {
            arrayList.add(new ArrayList<Integer>());
        }
        //insert
        for (int e : arr) {
            arrayList.get(e).add(e);
        }
        int i = 0;
        //数组排序
        for (List<Integer> bucket : arrayList) {
            for (Integer j : bucket) {
                arr[i++] = j;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{4, 4, 6, 5, 3, 2, 8, 1, 7, 5, 6, 0, 10};
        bucketSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
