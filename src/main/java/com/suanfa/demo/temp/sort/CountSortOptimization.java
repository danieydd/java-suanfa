package com.suanfa.demo.temp.sort;

import java.util.Arrays;

/**
 * @ClassName CountSortOptimization
 * @Description 前面我们看到，计数排序的前提是输入元素都是在 [0, k] 这样的一个区间内。
 * 那么假如我们存在负数的输入，或者我们也不确定输入元素的具体范围是多少，又该怎么变通呢？
 *
 * 其实，以上情况也不难解决。我们只需要多遍历一次数组，找到元素的最大值 max 和最小值 min，然后依旧创建一个长度为 max - min + 1 长度的数组，其中 min 是可能为负数的。
 * 然后我们引入一个变量 offset 来修正数值 i 在计数数组 count[] 中的正确位置。

 * @Author danie
 * @Date 2021-11-15 12:27
 */
public class CountSortOptimization {
    private static void countSort(int[] arr) {
        //获取最大数
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[i]);
        }
        //偏移量
        int offset = 0 - min;
        int count[] = new int[max - min + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i] + offset]++;
        }
        int index = 0;
        //遍历
        for (int i = 0; i < count.length; i++) {
            for (int j = 0; j < count[i]; j++) {
                arr[index++] = i-offset;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{95,94,91,98,99,90,99,93,91,92};
        countSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
