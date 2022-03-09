package com.suanfa.demo.temp.leetcode.leetcodebook.primary.string;

/**
 * @ClassName Test03
 * @Description 给定一个字符串 s ，找到 它的第一个不重复的字符，并返回它的索引 。如果不存在，则返回 -1 。
 * 输入: s = "leetcode"
 * 输出: 0
 * @Author danie
 * @Date 2022-03-09 14:33
 */
public class Test03 {
    public static int firstUniqChar(String s) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if (s.lastIndexOf(chars[i]) == s.indexOf(chars[i])) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int index = firstUniqChar("abalbb");
        System.out.println("index=" + index);
    }
}
