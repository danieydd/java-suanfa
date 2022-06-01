package com.suanfa.demo.temp.leetcode.leetcodebook.primary.other;

/**
 * @ClassName Test03
 * @Description 颠倒二进制位
 * 颠倒给定的 32 位无符号整数的二进制位。输入：n = 00000010100101000001111010011100
 * 输出：964176192 (00111001011110000010100101000000)
 * 解释：输入的二进制串 00000010100101000001111010011100 表示无符号整数 43261596，
 * 因此返回 964176192，其二进制表示形式为 00111001011110000010100101000000。
 * @Author danie
 * @Date 2022-06-01 09:56
 */
public class Test03 {
    // you need treat n as an unsigned value
    public static int reverseBits(int n) {
        int res = 0;
        for (int i = 0; i < 32; i++) {
            //res先左移一位，把最后一个位置空出来
            //res空出来一位存放n最后一位
            res = res << 1;
            res |= n & 1;
            n = n >> 1;
        }
        return res;
    }

    public static void main(String[] args) {
        int res = reverseBits(000000000000000000000000000000101);
        System.out.println("reverseBits=" +res);
    }
}
