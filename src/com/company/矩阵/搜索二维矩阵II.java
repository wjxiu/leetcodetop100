package com.company.矩阵;

/**
 * @author xiu
 * @create 2023-06-24 9:27
 */
public class 搜索二维矩阵II {
    public boolean searchMatrix(int[][] matrix, int target) {
        boolean res=false;
        for (int i = 0; i < matrix.length; i++) {
            int search = search(matrix[i], target);
            if (search>=0) {
                res=true;
                break;
            }
        }
        return res;
    }
    public int search(int[] arr,int target){
        int l=0;
        int r=arr.length-1;

        while (l<=r){
            int mid=(l+r)/2;
            if (arr[mid]<target){
                l=mid+1;
            }else if(arr[mid]>target){
                r=mid-1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
