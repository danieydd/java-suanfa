package com.suanfa.demo.temp.leetcode.leetcodebook.primary.string;

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
 *
 * @Author danie
 * @Date 2022-03-09 17:00
 */
public class Test05 {
    public static boolean isAnagram(String s, String t) {
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            count[t.charAt(i) - 'a']--;
        }
        for (int i = 0; i < count.length; i++) {
            if (count[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s1 = "a";
        String s2 = "ab";
        boolean isAnagram = isAnagram(s1, s2);
        System.out.println("isAnagram= " + isAnagram);
        System.out.println("s1.charAt(0) "+s1.charAt(0));
        System.out.println("a "+('a'+0));//97
        System.out.println("0 "+('0'+0));//48
        System.out.println("A "+('A'+0));//65


    }
}
