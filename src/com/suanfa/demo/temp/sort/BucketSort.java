package com.suanfa.demo.temp.sort;

import java.util.*;

/**
 * @ClassName BucketSort
 * @Description 桶排序也是时间复杂度仅为 O(n) 的一种排序方法，它假设输入数据服从均匀分布，我们将数据分别放入到 n 个桶内，
 * 先对桶内数据进行排序，然后遍历桶依次取出桶中的元素即可完成排序。
 *
 * 和计数排序类似，桶排序也对输入数据作了某种假设，因此它的速度也很快。具体来说，计数排序假设了输入数据都属于一个小区间内的整数，
 * 而桶排序则假设输入数据是均匀分布的，即落入每个桶中的元素数量理论也是差不多的，不会出现很多数落入同一个桶内的情况。

 * 原文链接：https://blog.csdn.net/afei__/article/details/82965834
 * @Author danie
 * @Date 2021-11-03 13:26
 */
public class BucketSort {
    public static void main(String[] args) {
        // 输入元素均在 [0, 10) 这个区间内
        float[] arr = new float[] { 0.12f, 2.2f, 8.8f, 7.6f, 7.2f, 6.3f, 9.0f, 1.6f, 5.6f, 2.4f };
        bucketSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void bucketSort(float[] arr) {
        float[] floats = new float[arr.length];
        // 新建一个桶的集合
        ArrayList<LinkedList<Float>> buckets = new ArrayList<LinkedList<Float>>();
        for (int i = 0; i < 10; i++) {
            // 新建一个桶，并将其添加到桶的集合中去。
            // 由于桶内元素会频繁的插入，所以选择 LinkedList 作为桶的数据结构
            buckets.add(new LinkedList<Float>());
        }
        // 将输入数据全部放入桶中并完成排序
        for (float data : arr) {
            int index = getBucketIndex(data);
            insertSort(buckets.get(index), data);
        }
        // 将桶中元素全部取出来并放入 arr 中输出
        int index = 0;
        for (LinkedList<Float> bucket : buckets)
            for (Float data : bucket) {
                floats[index++] = data;
            }
    }

    /**
     * 计算得到输入元素应该放到哪个桶内
     */
    public static int getBucketIndex(float data) {
        // 这里例子写的比较简单，仅使用浮点数的整数部分作为其桶的索引值
        // 实际开发中需要根据场景具体设计
        return (int) data;
    }

    /**
     * 我们选择插入排序作为桶内元素排序的方法 每当有一个新元素到来时，我们都调用该方法将其插入到恰当的位置
     */
    public static void insertSort(List<Float> bucket, float data) {
        ListIterator<Float> it = bucket.listIterator();
        boolean insertFlag = true;
        while (it.hasNext()) {
            if (data <= it.next()) {
                it.previous(); // 把迭代器的位置偏移回上一个位置
                it.add(data); // 把数据插入到迭代器的当前位置
                insertFlag = false;
                break;
            }
        }
        if (insertFlag) {
            bucket.add(data); // 否则把数据插入到链表末端
        }
    }
}
