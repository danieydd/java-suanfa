package com.suanfa.demo.temp.sort;

/**
 * @ClassName heapSort
 * @Description TODO
 * @Author danie
 * @Date 2021-11-03 13:27
 */
public class HeapSort {

    public static void main(String[] args) {
        int[] arr = new int[] { 16, 4, 10, 14, 7, 9, 3, 2, 8, 1 };
        heapSort(arr);
        printArray(arr);
    }

    public static void heapSort(int[] arr) {
        buildHeap(arr); // 首先建立堆
        int heapSize = arr.length;
        for (int i = arr.length - 1; i > 0; i--) {
            // 取出最大值放在数组末端。由于堆的特性最大值总是在 a[0] 处
            int max = arr[0];
            arr[0] = arr[i];
            arr[i] = max;
            // 重新调整堆
            maxHeapify(arr, 0, --heapSize);
        }
    }

    public static void buildHeap(int[] arr) {
        // 堆的最后一个分支结点索引为 arr.length / 2 - 1
        for (int i = arr.length / 2 - 1; i >= 0; i--) {
            maxHeapify(arr, i, arr.length);
        }
    }

    public static void maxHeapify(int[] arr, int index, int heapSize) {
        int leftIndex = index * 2 + 1; // 左子节点对应数组中的索引
        int rightIndex = index * 2 + 2; // 右子节点对应数组中的索引
        int maxIndex = index;
        // 如果左子结点较大，则将最大值索引设为左子节点
        if (leftIndex < heapSize && arr[leftIndex] > arr[index]) {
            maxIndex = leftIndex;
        }
        // 如果右子结点比 max(this, left)还大，则将最大值索引设为右子节点
        if (rightIndex < heapSize && arr[rightIndex] > arr[maxIndex]) {
            maxIndex = rightIndex;
        }
        // 如果当前结点的值不是最大的，则需要交换最大值，并继续遍历交换后的子结点
        if (maxIndex != index) {
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[index];
            arr[index] = temp;
            maxHeapify(arr, maxIndex, heapSize); // 继续递归调整交换后的子结点
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
