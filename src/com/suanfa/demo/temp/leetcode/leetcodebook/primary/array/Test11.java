package com.suanfa.demo.temp.leetcode.leetcodebook.primary.array;

/**
 * @ClassName Test11
 * @Description 旋转图像
 * 给定一个 n × n 的二维矩阵 matrix 表示一个图像。请你将图像顺时针旋转 90 度。
 *
 * 你必须在 原地 旋转图像，这意味着你需要直接修改输入的二维矩阵。请不要 使用另一个矩阵来旋转图像。
 * 输入：matrix = [[1,2,3],[4,5,6],[7,8,9]]
 * 输出：[[7,4,1],[8,5,2],[9,6,3]]
 *
 * @Author danie
 * @Date 2022-03-07 15:58
 */
public class Test11 {
    public static void rotate(int[][] matrix) {
        int length = matrix.length;
        System.out.println("length="+length);
        //因为是对称的，只需要计算循环前半行即可
        for (int i = 0; i < length / 2; i++)
            for (int j = i; j < length - i - 1; j++) {
                int temp = matrix[i][j];
                int m = length - j - 1;
                int n = length - i - 1;
                matrix[i][j] = matrix[m][i];
                matrix[m][i] = matrix[n][m];
                matrix[n][m] = matrix[j][n];
                matrix[j][n] = temp;
            }

    }

    public static void main(String[] args) {
        int[][] matrix = {{5, 1, 9, 11}, {2, 4, 8, 10}, {13, 3, 6, 7}, {15, 14, 12, 16}};
        rotate(matrix);
    }
}

