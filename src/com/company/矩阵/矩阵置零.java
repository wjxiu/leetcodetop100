package com.company.矩阵;

/**
 * @author xiu
 * @create 2023-06-23 23:48
 */
public class 矩阵置零 {
    public void setZeroes(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        boolean[] row = new boolean[m];
        boolean[] col = new boolean[n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j]==0){
                    row[i]=true;
                    col[j]=true;
                }
            }
        }
        for (int i = 0; i < m; i++) {
            if (row[i]){
                for (int j = 0; j < n; j++) {
                    matrix[i][j]=0;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            if (col[i]){
                for (int j = 0; j < m; j++) {
                    matrix[j][i]=0;
                }
            }
        }

    }
}
