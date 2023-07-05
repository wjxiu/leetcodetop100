package com.company.二分查找;

/**
 * @author xiu
 * @create 2023-07-05 13:50
 */
public class 搜索旋转排序数组 {
    public static void main(String[] args) {
        System.out.println(new 搜索旋转排序数组().search(new int[]{4,5,6,7,0,1,2}, 2));
    }
    public int search(int[] nums, int target) {
        int n = nums.length - 1;
        if (nums.length==0) return -1;
        if (nums.length==1)return target==nums[0]?0:-1;
        int l=0;int r= n;
        while (l<=r){
            int mid=(l+r)/2;
            int midnum=nums[mid];
            if (midnum==target){
                return mid;
            }
//            左边有序
            if (nums[0]<=midnum){
                if (target>=nums[0]&&target<midnum){
                    r=mid-1;
                }else{
                    l=mid+1;
                }
            }else{
//            右边有序
                if (target<=nums[n]&&target>midnum){
                    l=mid+1;
                }else{
                    r=mid-1;
                }
            }
        }
        return -1;
    }
}
