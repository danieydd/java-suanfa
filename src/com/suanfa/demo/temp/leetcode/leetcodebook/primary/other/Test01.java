package com.suanfa.demo.temp.leetcode.leetcodebook.primary.other;

/**
 * @ClassName Test01
 * @Description 位1的个数
 * 编写一个函数，输入是一个无符号整数（以二进制串的形式），返回其二进制表达式中数字位数为 '1' 的个数（也被称为汉明重量）。
 * 输入：00000000000000000000000000001011
 * 输出：3
 * 解释：输入的二进制串 00000000000000000000000000001011 中，共有三位为 '1'。
 * @Author danie
 * @Date 2022-06-01 08:52
 */
public class Test01 {
    // you need to treat n as an unsigned value
    public static int hammingWeight(int n) {
//        int count = 0;
//        for (int i = 0; i < 32; i++) {
//            if ((n >> i & 1) == 1) {
//                count++;
//            }
//        }
//        return count;
      return   Integer.bitCount(n);
    }

    public static void main(String[] args) {
        int i = hammingWeight(00000000000000000000000000001011);
        System.out.println("hammingWeight "+i);
    }
}
