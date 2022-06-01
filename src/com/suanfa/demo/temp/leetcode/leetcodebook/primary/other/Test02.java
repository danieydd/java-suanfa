package com.suanfa.demo.temp.leetcode.leetcodebook.primary.other;

/**
 * @ClassName Test02
 * @Description 汉明距离
 * 两个整数之间的 汉明距离 指的是这两个数字对应二进制位不同的位置的数目。
 *输入：x = 1, y = 4
 * 输出：2
 * 解释：
 * 1   (0 0 0 1)
 * 4   (0 1 0 0)
 *        ↑   ↑
 * 上面的箭头指出了对应二进制位不同的位置。
 *
 * 给你两个整数 x 和 y，计算并返回它们之间的汉明距离。
 * @Author danie
 * @Date 2022-06-01 09:15
 */
public class Test02 {
    public static int hammingDistance(int x, int y) {
       return Integer.bitCount(x^y);
    }
    public static void main(String[] args){
        int d = hammingDistance(1, 4);
        System.out.println("hammingDistance = "+d);
    }
}
