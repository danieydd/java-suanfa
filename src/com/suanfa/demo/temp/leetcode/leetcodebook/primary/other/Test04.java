package com.suanfa.demo.temp.leetcode.leetcodebook.primary.other;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Test04
 * @Description 杨辉三角
 * 给定一个非负整数 numRows，生成「杨辉三角」的前 numRows 行。
 * 在「杨辉三角」中，每个数是它左上方和右上方的数的和。
 * 输入: numRows = 5
 * 输出: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
 * tips:
 * 数学类题目需要观察数学规律
 * @Author danie
 * @Date 2022-06-01 10:50
 */
public class Test04 {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> rowList = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    //处理两边数据都为1
                    rowList.add(1);
                } else {
                    //条件是和上边的代码只可以执行一种情况
                    int left = res.get(i - 1).get(j - 1);
                    int right = res.get(i - 1).get(j);
                    //中间的数等于左上方和正上方的数字之和
                    rowList.add(left + right);
                }
            }
            res.add(rowList);
        }
        return res;
    }

    public static void main(String[] args) {
        List<List<Integer>> list = generate(5);
        System.out.println();
    }
}
