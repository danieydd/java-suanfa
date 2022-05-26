package com.suanfa.demo.temp.leetcode.leetcodebook.primary.math;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName Test04
 * @Description 罗马数字转整数
 * 罗马数字包含以下七种字符: I， V， X， L，C，D 和 M。
 * 字符          数值
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 * @Author danie
 * @Date 2022-05-26 17:42
 */
public class Test04 {
    public static int romanToInt(String s) {
        int res = 0;
        Map<String, Integer> map = new HashMap<>();
        map.put("I", 1);
        map.put("IV", 4);
        map.put("V", 5);
        map.put("IX", 9);
        map.put("X", 10);
        map.put("XL", 40);
        map.put("L", 50);
        map.put("XC", 90);
        map.put("C", 100);
        map.put("CD", 400);
        map.put("D", 500);
        map.put("CM", 900);
        map.put("M", 1000);
        for (int i = 0; i < s.length(); i++) {
            if (i + 1 < s.length() && map.keySet().contains(s.substring(i, i + 2))) {
                res += map.get(s.substring(i, i + 2));
                i++;
            } else {
                res += map.get(s.substring(i, i + 1));
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int res = romanToInt("MCMXCIV");
        System.out.println("MCMXCIV is " + res);
    }
}
