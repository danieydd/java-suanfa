package com.suanfa.demo.temp.weiruan;

import com.google.gson.Gson;
import org.junit.Test;

/**
 * @ClassName Array48
 * @Description 给定一个 n × n 的二维矩阵 matrix 表示一个图像。请你将图像顺时针旋转 90 度。
 * <p>
 * 你必须在 原地 旋转图像，这意味着你需要直接修改输入的二维矩阵。请不要 使用另一个矩阵来旋转图像。
 * <p>
 * 输入：matrix = [[1,2,3],[4,5,6],[7,8,9]]
 * 输出：[[7,4,1],[8,5,2],[9,6,3]]
 * @Author danie
 * @Date 2021-10-28 10:20
 */
public class Array48 {
    public void rotate(int[][] matrix) {
        // 转置接镜像对称
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n - 1 - j];
                matrix[i][n - 1 - j] = temp;
            }


        }
    }

        @Test
        public void test() {
            int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
            rotate(array);
            System.out.println(new Gson().toJson(array));
        }
    }


