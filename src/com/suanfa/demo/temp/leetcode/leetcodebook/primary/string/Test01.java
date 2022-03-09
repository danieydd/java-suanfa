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
 * @Author danie
 * @Date 2022-03-09 09:48
 */
public class Test01 {
    public static int reverse(int x) {
        String str = x + "";
        char[] chars = str.toCharArray();
        StringBuffer sb = new StringBuffer();
        boolean fushu = false;
        for (int i = chars.length - 1; i >= 0; i--) {
            if (chars[i] == '-') {
                fushu = true;
                continue;
            }
            sb.append(chars[i]);
        }
        if (fushu) sb.insert(0, '-');
        int res = 0;
        try {
            res = Integer.valueOf(sb.toString());
        } catch (NumberFormatException e) {
            return 0;
        }
        return res;
    }

    public static void main(String[] args) {
        int reverse = reverse(1534236469);
        System.out.println("reverse=" + reverse);

    }
}
