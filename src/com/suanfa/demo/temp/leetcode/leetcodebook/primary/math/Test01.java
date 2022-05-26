package com.suanfa.demo.temp.leetcode.leetcodebook.primary.math;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Test01
 * @Description Fizz Buzz
 * 给你一个整数 n ，找出从 1 到 n 各个整数的 Fizz Buzz 表示，并用字符串数组 answer（下标从 1 开始）返回结果，其中：
 * <p>
 * answer[i] == "FizzBuzz" 如果 i 同时是 3 和 5 的倍数。
 * answer[i] == "Fizz" 如果 i 是 3 的倍数。
 * answer[i] == "Buzz" 如果 i 是 5 的倍数。
 * answer[i] == i （以字符串形式）如果上述条件全不满足。
 * 输入：n = 3
 * 输出：["1","2","Fizz"]
 * @Author danie
 * @Date 2022-05-26 11:14
 */
public class Test01 {
    public static List<String> fizzBuzz(int n) {
        List<String> res = new ArrayList<>();
        if (n <= 0) return res;
        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0) {
                res.add("FizzBuzz");
            } else if (i % 3 == 0) {
                res.add("Fizz");
            } else if (i % 5 == 0) {
                res.add("Buzz");
            } else {
                res.add(i + "");
            }
        }
        return res;
    }

    public static void main(String[] args) {
        List<String> res = fizzBuzz(15);
        System.out.println(res);
    }
}
