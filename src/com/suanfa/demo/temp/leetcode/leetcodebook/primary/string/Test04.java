package com.suanfa.demo.temp.leetcode.leetcodebook.primary.string;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName Test034
 * 字符串中的第一个唯一字符
 * @Description 给定一个字符串 s ，找到 它的第一个不重复的字符，并返回它的索引 。如果不存在，则返回 -1 。
 * 输入: s = "leetcode"
 * 输出: 0
 * @Author danie
 * @Date 2022-03-09 14:33
 */
public class Test04 {
    public static int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();
        char[] charArray = s.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            map.put(charArray[i], map.getOrDefault(charArray[i], 0) + 1);
        }
        for (int i = 0; i < charArray.length; i++) {
            if (map.get(charArray[i]) == 1) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int index = firstUniqChar("abalbb");
        System.out.println("index=" + index);
    }
}
