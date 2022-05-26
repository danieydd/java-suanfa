package com.suanfa.demo.temp.leetcode.leetcodebook.primary.math;

import java.util.List;

/**
 * @ClassName Test02
 * @Description 计数质数
 * 给定整数 n ，返回 所有小于非负整数 n 的质数的数量 。
 * 输入：n = 10
 * 输出：4
 * 解释：小于 10 的质数一共有 4 个, 它们是 2, 3, 5, 7 。
 * @Author danie
 * @Date 2022-05-26 11:50
 */
public class Test02 {
    public static int countPrimes(int n) {
        if (n <= 2) return 0;
        int count = 0;
        boolean[] array = new boolean[n];
        for (int i = 2; i < n; i++) {
            if (!array[i]) {
                //质数+1
                count++;
            }else{
                //合数跳出
                continue;
            }
            //将质数的倍数全部标记为true
            for (int j = i; j < n; j += i) {
                array[j] = true;
            }
        }
        return count;

    }

    public static void main(String[] args) {
        int n = countPrimes(12);
        System.out.println("质数有" + n);
    }
}
