package com.suanfa.suixianglu.array;

/**
 * @ClassName Test01
 * @Description 二分查找
 * 给定一个 n 个元素有序的（升序）整型数组 nums 和一个目标值 target  ，写一个函数搜索 nums 中的 target，如果目标值存在返回下标，否则返回 -1。
 * 输入: nums = [-1,0,3,5,9,12], target = 9
 * 输出: 4
 * 解释: 9 出现在 nums 中并且下标为 4
 * @Author danie
 * @Date 2022-06-02 14:33
 */
public class Test01 {
    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        //循环终止条件判断
        while (left <= right) {
            //mid 计算防止int溢出
            int mid = left + (right - left) / 2;
            if (nums[mid] < target) {
                //目标元素在右边，left右移
                left = mid+1;
            }else if(nums[mid] > target){
                //目标元素在左边，right左移
                right = mid-1;
            }else{
                //找到元素
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = new int[]{-1, 0, 3, 5, 9, 12};
        int res = search(array, 9);
        System.out.println("res= " + res);
    }
}
