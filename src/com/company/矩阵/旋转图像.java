package com.company.矩阵;

/**
 * @author xiu
 * @create 2023-06-24 9:13
 */
public class 旋转图像 {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
//          水平反转
        for (int i = 0; i < matrix.length/2; i++) {
            for (int j = 0; j < n; j++) {
                int temp=matrix[i][j];
                matrix[i][j]=matrix[n-i-1][j];
                matrix[n-i-1][j]=temp;
            }
        }
//        主对角线反转
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;

            }
        }
    }
}
