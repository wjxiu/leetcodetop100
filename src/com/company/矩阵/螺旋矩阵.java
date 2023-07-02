package com.company.矩阵;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xiu
 * @create 2023-06-24 8:44
 */
public class 螺旋矩阵 {
    public List<Integer> spiralOrder(int[][] matrix) {
        if(matrix==null||matrix.length==0) return new ArrayList<>();
        int left=0;
        int right=matrix[0].length-1;
        int top=0;
        int bottom=matrix.length-1;
        int num=matrix.length*matrix[0].length;
        ArrayList<Integer> res = new ArrayList<>();
        while (num>=1){
            for (int i = left; i <= right&&num>=1; i++) {
                res.add(matrix[top][i]);
                num--;
            }
            top++;
            for (int i = top; i <=bottom&&num>=1 ; i++) {
                res.add(matrix[i][right]);
                num--;
            }
            right--;
            for (int i = right; i >=left&&num>=1 ; i--) {
                res.add(matrix[bottom][i]);
                num--;
            }
            bottom--;
            for (int i = bottom; i >=top&&num>=1; i--) {
                res.add(matrix[i][left]);
                num--;
            }
            left++;
        }
        return res;
    }
}
