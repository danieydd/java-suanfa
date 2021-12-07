package com.suanfa.demo.temp.sort;

/**
 * @ClassName BubbleSort
 * @Description 冒泡排序
 * @Author danie
 * @Date 2021-10-22 14:15
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] numbers = new int[]{19, 2, 4, 1, 3, 5};
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - 1 - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        System.out.println("从小到大排序的结果是: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i] + " ");
        }
    }
}
