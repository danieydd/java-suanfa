package com.suanfa.demo.temp.leetcode.leetcodebook.primary.string;

/**
 * @ClassName Test14
 * @Description 最长公共前缀
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 * <p>
 * 如果不存在公共前缀，返回空字符串 ""。
 * 输入：strs = ["flower","flow","flight"]
 * 输出："fl"
 * 提示：
 * <p>
 * 1 <= strs.length <= 200
 * 0 <= strs[i].length <= 200
 * strs[i] 仅由小写英文字母组成
 * @Author danie
 * @Date 2022-03-14 11:49
 */
public class Test14 {
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 1) return strs[0];
        char[] charArray = strs[0].toCharArray();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < charArray.length; i++) {
            boolean isSame = decideIfContains(strs, charArray[i], i);
            if (isSame) {
                sb.append(charArray[i]);
            } else {
                return sb.toString();
            }
        }
        return sb.toString();
    }

    public static boolean decideIfContains(String[] strs, char cha, int i) {
        boolean flag = false;
        for (int j = 1; j < strs.length; j++) {
            if (i > strs[j].length()-1) return false;
            if (strs[j].charAt(i) == cha) {
                flag = true;
            } else {
                return false;
            }
        }
        return flag;

    }

    public static void main(String[] args) {
        String[] strs = {"ab", "a"};
        String prefixStr = longestCommonPrefix(strs);
        System.out.println("prefixStr= " + prefixStr);
    }
}
