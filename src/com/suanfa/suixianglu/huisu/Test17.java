package com.suanfa.suixianglu.huisu;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Test17
 * @Description TODO
 * @Author danie
 * @Date 2022-09-20 14:46
 */
public class Test17 {
    static String[] numString = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    //存放最终结果
    static List<String> res = new ArrayList<>();
    //存放子节点
    static StringBuilder temp = new StringBuilder();


    public static List<String> letterCombinations(String digits) {
        if (digits == null || digits.length() == 0) return res;
        backTracking(digits, numString, 0);
        return res;
    }

    private static void backTracking(String digits, String[] numString, int index) {
        if (index == digits.length()) {
            res.add(temp.toString());
            return;
        }
            String str = numString[digits.charAt(index)-'0'];
        for (int i = 0; i < str.length(); i++) {
            temp.append(str.charAt(i));
            backTracking(digits,numString,index+1);
            temp.deleteCharAt(temp.length()-1);
        }
    }
    public static void main(String[] args){
        List<String> res = letterCombinations("23");
        System.out.println(res);
    }
}
