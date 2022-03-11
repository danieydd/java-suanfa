package com.suanfa.demo.temp.leetcode.leetcodebook.primary.string;

/**
 * @ClassName Test10
 * @Description 实现 strStr()
 * 实现 strStr() 函数。
 * <p>
 * 给你两个字符串 haystack 和 needle ，请你在 haystack 字符串中找出 needle 字符串出现的第一个位置（下标从 0 开始）。如果不存在，则返回  -1 。
 * <p>
 *  
 * <p>
 * 说明：
 * <p>
 * 当 needle 是空字符串时，我们应当返回什么值呢？这是一个在面试中很好的问题。
 * <p>
 * 对于本题而言，当 needle 是空字符串时我们应当返回 0 。这与 C 语言的 strstr() 以及 Java 的 indexOf() 定义相符。
 * <p>
 * 输入：haystack = "hello", needle = "ll"
 * 输出：2
 * @Author danie
 * @Date 2022-03-11 13:25
 */
public class Test10 {
    public static int strStr(String haystack, String needle) {
        //处理特殊的空串情况
        if (needle.length() == 0 && haystack.length() >= 0) return 0;
        //子串索引
        int j = 0;
        //连续匹配子串
        boolean isStr = false;
        //回退匹配
        int pre = -1;
        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(j)) {
                if (isStr == false) pre = i;
                isStr = true;
                if (j == needle.length() - 1 && isStr) return i - j;
                j++;
            } else if (isStr) {
                isStr = false;
                //回退母串i
                i = pre;
                //回退子串j
                j = 0;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int index = strStr("mississippi", "issip");
        System.out.println("index=" + index);

    }
}
