package com.company.二分查找;

/**
 * @author xiu
 * @create 2023-07-05 11:33
 */
public class 搜索二维矩阵 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=matrix.length;
        int column=matrix[0].length;
//        将二维数组转为一纬
        int left=0,right= matrix[0].length*matrix.length-1;
        while (left<=right){
            int mid=(left+right)/2;
            int i=mid/column;
            int j=mid%column;
            if (matrix[i][j]==target){
                return true;
            }
            if (matrix[i][j]>target){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return false;
    }

}
