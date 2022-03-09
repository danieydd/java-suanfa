package com.suanfa.demo.temp.leetcode.leetcodebook.primary.string;

/**
 * @ClassName Test01
 * @Description 给你一个 32 位的有符号整数 x ，返回将 x 中的数字部分反转后的结果。
 * <p>
 * 如果反转后整数超过 32 位的有符号整数的范围 [−231,  231 − 1] ，就返回 0。
 * <p>
 * 假设环境不允许存储 64 位整数（有符号或无符号）。
 * 输入：x = 123
 * 输出：321
 * tips:注意反转后的数字超出Integer或者int的范围
 * @Author danie
 * @Date 2022-03-09 09:48
 */
public class Test02 {
    public static int reverse(int x) {
        long res = 0;
        while (x != 0) {
            res = res * 10 + x % 10;
            x = x / 10;
        }
        return (int) res == res ? (int) res : 0;

    }

    public static void main(String[] args) {
        int reverse = reverse(-123);
        System.out.println("reverse=" + reverse);

    }
}
