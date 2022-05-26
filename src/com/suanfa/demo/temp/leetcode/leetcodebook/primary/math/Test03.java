package com.suanfa.demo.temp.leetcode.leetcodebook.primary.math;

/**
 * @ClassName Test03
 * @Description 3的幂
 * 给定一个整数，写一个函数来判断它是否是 3 的幂次方。如果是，返回 true ；否则，返回 false 。
 *
 * 整数 n 是 3 的幂次方需满足：存在整数 x 使得 n == 3x
 * 进阶：你能不使用循环或者递归来完成本题吗？
 * @Author danie
 * @Date 2022-05-26 15:52
 */
public class Test03 {
    public static boolean isPowerOfThree(int n) {
        return (n > 0 && 1162261467 % n == 0);
    }
    public static void main(String[] args){
        System.out.println(isPowerOfThree(27));
    }
}
