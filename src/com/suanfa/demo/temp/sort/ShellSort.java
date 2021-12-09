package com.suanfa.demo.temp.sort;

/**
 * @ClassName ShellSort
 * @Description 希尔排序名称源于它的发明者 Donald Shell，又称缩小增量排序。本质上讲，希尔排序是直接插入排序的一种改进，
 * 减少了复制次数，提升了速度。
 * 其原理为选定一个增量 ，使得数组中间隔为 step 的元素放在一个子序列中，对每个子序列进行插入排序。
 * 然后逐渐缩小 step，重复上述划分和排序，直至 step 缩小到 1 时完成排序。
 * <p>
 * 原文链接：https://blog.csdn.net/afei__/article/details/83244678
 * @Author danie
 * @Date 2021-11-03 13:28
 */
public class ShellSort {

    public static void main(String[] args) {
        int[] arr = new int[]{81, 94, 11, 96, 12, 35, 17, 95, 28, 58, 41, 75, 15};
        shellSort(arr);
        printArray(arr);
    }

    public static void shellSort(int[] arr) {
        for (int step = arr.length / 2; step > 0; step /= 2) {
            for (int i = step; i < arr.length; i++) {
                int j = i;
                int temp = arr[j];
                while (j - step > 0 && arr[j - step] > temp) {
                    arr[j] = arr[j - step];
                    j = j - step;
                    System.out.println("step=" + step + "j=" + j);
                    printArray(arr);
                }
                arr[j] = temp;
                System.out.println("temp=" + temp);
            }
        }

    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
