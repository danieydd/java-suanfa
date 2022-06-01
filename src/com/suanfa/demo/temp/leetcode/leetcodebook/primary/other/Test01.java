package com.suanfa.demo.temp.leetcode.leetcodebook.primary.other;

/**
 * @ClassName Test01
 * @Description 位1的个数
 * 编写一个函数，输入是一个无符号整数（以二进制串的形式），返回其二进制表达式中数字位数为 '1' 的个数（也被称为汉明重量）。
 * 输入：00000000000000000000000000001011
 * 输出：3
 * 解释：输入的二进制串 00000000000000000000000000001011 中，共有三位为 '1'。
 *
 * tips:
 * n&1：与操作，判断 n 二进制最右(后）一位是否为 1 。
 * n>>1：移位操作，删除n二进制的最右一位
 * @Author danie
 * @Date 2022-06-01 08:52
 */
public class Test01 {
    // you need to treat n as an unsigned value
    public static int hammingWeight(int n) {
        int count = 0;
        for (int i = 0; i < 32; i++) {
            int n2 = n >> i;
            if ((n2 & 1) == 1) {
                count++;
            }
        }
        return count;
     // return   Integer.bitCount(n);
    }

    public static void main(String[] args) {
        String s = "00000000000000000000000000000101";
        System.out.println("s length = "+s.length());
        int i = hammingWeight(000000000000000000000000000000101);
        System.out.println("hammingWeight "+i);
    }
}
