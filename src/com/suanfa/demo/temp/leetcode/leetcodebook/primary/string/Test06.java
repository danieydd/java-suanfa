package com.suanfa.demo.temp.leetcode.leetcodebook.primary.string;

import java.util.Arrays;

/**
 * @ClassName Test05
 * @Description 有效的字母异位词
 * 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。
 * <p>
 * 注意：若 s 和 t 中每个字符出现的次数都相同，则称 s 和 t 互为字母异位词。
 * <p>
 * 输入: s = "anagram", t = "nagaram"
 * 输出: true
 * tips:
 * 使用Arrays自带的方法
 * 排序
 * equals
 * @Author danie
 * @Date 2022-03-09 17:00
 */
public class Test06 {
    public static boolean isAnagram(String s, String t) {
        char[] charArray = s.toCharArray();
        char[] charArray2 = t.toCharArray();
        Arrays.sort(charArray);
        Arrays.sort(charArray2);
        return Arrays.equals(charArray, charArray2);


    }

    public static void main(String[] args) {
        String s1 = "ba";
        String s2 = "aqb";
        boolean isAnagram = isAnagram(s1, s2);
        System.out.println("isAnagram=" + isAnagram);

    }
}
