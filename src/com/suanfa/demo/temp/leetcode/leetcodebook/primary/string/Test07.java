package com.suanfa.demo.temp.leetcode.leetcodebook.primary.string;

/**
 * @ClassName Test07
 * @Description 验证回文串
 * 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
 * <p>
 * 说明：本题中，我们将空字符串定义为有效的回文串。
 * 输入: "A man, a plan, a canal: Panama"
 * 输出: true
 * 解释："amanaplanacanalpanama" 是回文串
 * @Author danie
 * @Date 2022-03-10 10:39
 */
public class Test07 {
    public static boolean isPalindrome(String s) {
        if (s.equals("")) return true;
        int i = 0;
        int j = s.length()-1;
        while (i < j) {
            while (i < j && !Character.isLetterOrDigit(s.charAt(i))) {
                i++;
            }
            while (i < j && !Character.isLetterOrDigit(s.charAt(j))) {
                j--;
            }
            if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) return false;
            i++;
            j--;

        }

        return true;
    }

    public static void main(String[] args) {
        boolean palindrome = isPalindrome("A man, a plan, a canal: Panama");
        System.out.println("palindrome= " + palindrome);

    }
}
