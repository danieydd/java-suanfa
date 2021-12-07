package com.suanfa.demo.temp.basic.queuestack.xiaohui;

import java.util.Arrays;

/**
 * @ClassName NearestNumber
 * @Description 获取全排列的下一个数
 * 一组数 顺序排列最大 逆序排列最小
 * 找到该数需要三步
 * 1)数字边界:数组从后向前看,找到逆序区域的前一位,这个位置就是数字交换的边界
 * 2)边界交换:将数字边界和逆序区域中仅大于边界的数作交换
 * 3)逆序区域最小化:将逆序区域转换为顺序状态
 * @Author danie
 * @Date 2021-12-07 11:25
 */
public class NearestNumber {
    public static int[] findNearestNumber(int[] numbers) {
        //1)数字边界:数组从后向前看,找到逆序区域的前一位,这个位置就是数字交换的边界
        //边界:逆序第一位
        int index = findTransferPoint(numbers);
        System.out.println("index=" + index);
        if (index == 0) return null;
        //2)边界交换:将数字边界index和逆序区域中仅大于边界的数作交换
        int[] numbersCopy = Arrays.copyOf(numbers, numbers.length);
        System.out.println("numbersCopy=" + Arrays.toString(numbersCopy));
        exchangeHead(numbersCopy, index);
        System.out.println("exchangeHead=" + Arrays.toString(numbersCopy));
        //3)逆序区域最小化:将逆序区域转换为顺序状态
        reverse(numbersCopy, index);
        return numbersCopy;
    }

    public static int findTransferPoint(int[] numbers) {
        for (int i = numbers.length - 1; i > 0; i--) {
            if (numbers[i - 1] < numbers[i]) {
                return i;
            }
        }
        //如果置换的边界已经逆序,说明整个数组已经逆序,无法得到更大的相同数
        return 0;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        for (int i = 0; i < 10; i++) {
            nums = findNearestNumber(nums);
        }
    }

    private static void reverse(int[] numbersCopy, int index) {
        for (int i = numbersCopy.length - 1, j = index; i > j; i--, j++) {
            if (numbersCopy[i] < numbersCopy[j]) {
                int temp = numbersCopy[i];
                numbersCopy[i] = numbersCopy[j];
                numbersCopy[j] = temp;
            }
        }
        System.out.print("reverse=" + Arrays.toString(numbersCopy));
    }

    private static void exchangeHead(int[] numbersCopy, int index) {
        System.out.print("numberCopy=" + Arrays.toString(numbersCopy) + "  index=" + index);
        System.out.println();
        int head = numbersCopy[index - 1];
        for (int i = numbersCopy.length - 1; i > 0; i--) {
            if (numbersCopy[i] > head) {
                numbersCopy[index - 1] = numbersCopy[i];
                numbersCopy[i] = head;
                break;
            }
        }
    }

}
