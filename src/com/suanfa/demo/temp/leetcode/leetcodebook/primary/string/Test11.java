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
 * tips:
 * 截取字符串
 * @Author danie
 * @Date 2022-03-11 13:25
 */
public class Test11 {
    public static int strStr(String haystack, String needle) {
        int len1 = haystack.length();
        int len2 = needle.length();
        int size = len1 - len2 + 1;
        for (int i = 0; i < size; i++) {
            String substring = haystack.substring(i, i + needle.length());
            if (substring.equals(needle)) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int index = strStr("mississippi", "issip");
        System.out.println("index=" + index);

    }
}
