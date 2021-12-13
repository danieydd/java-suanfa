package com.suanfa.demo.temp.basic.queuestack.xiaohui;

import java.util.Arrays;

/**
 * @ClassName RemoveDigits
 * @Description 删去k个数字后的最小值
 * 对于一组数,要想知道删除一个数之后的最小值,或者删除N个数之后的最小值,
 * 需要将数组从左到右遍历,找到左边比右边大的数,然后删掉左边的数字
 * @Author danie
 * @Date 2021-12-09 17:18
 */
public class RemoveDigits {
    private static int[] removeDigits(int[] arr, int k) {
        if (arr == null || arr.length == 0) return arr;
        System.out.println("old Array=" + Arrays.toString(arr));
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                //删除左边值大的那一位,获取新数组
                int[] copy = Arrays.copyOfRange(arr, 0, i);
                int[] copy2 = Arrays.copyOfRange(arr, i + 1, arr.length);
                int[] array = concat(copy, copy2);
                //删除最高位为0
                if (array[0] == 0) array = Arrays.copyOfRange(array, 1, array.length);
                System.out.println("new Array=" + Arrays.toString(array));
                return array;
            }
        }
        return arr;
    }

    private static int[] concat(int[] copy, int[] copy2) {
        int[] array = new int[copy.length + copy2.length];
        System.arraycopy(copy, 0, array, 0, copy.length);
        System.arraycopy(copy2, 0, array, copy.length, copy2.length);
        return array;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{5, 4, 1, 2, 7, 0, 9, 6, 3};
        for (int i = arr.length - 1; i > 0; i--) {
            arr = removeDigits(arr, 1);
        }
    }
}
