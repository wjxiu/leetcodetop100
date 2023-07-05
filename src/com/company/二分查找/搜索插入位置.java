package com.company.二分查找;

/**
 * @author xiu
 * @create 2023-07-05 11:07
 */
public class 搜索插入位置 {
    public static void main(String[] args) {
        System.out.println(new 搜索插入位置().searchInsert(new int[]{1}, 2));
    }
    public int searchInsert(int[] nums, int target) {
        int left=0,right= nums.length-1;
        while (left<=right){
            int mid=(left+(right))/2;
            if (nums[mid]==target){
                return mid;
            }
            if (nums[mid]<target){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return left;
    }
}
