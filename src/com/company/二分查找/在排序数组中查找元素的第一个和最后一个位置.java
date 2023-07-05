package com.company.二分查找;

import java.util.Arrays;

/**
 * @author xiu
 * @create 2023-07-05 11:45
 */
public class 在排序数组中查找元素的第一个和最后一个位置 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new 在排序数组中查找元素的第一个和最后一个位置().searchRange(new int[]{5,7,7,8,8,10}, 8)));
    }

    public int[] searchRange(int[] nums, int target) {
        int left = searchLeft(nums, target);
        int right = searchRight(nums, target);
        return new int[]{left, right};
    }

    int searchLeft(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int first = -1;
        while (left <= right) {
            int mid = (left + (right)) / 2;
            if (nums[mid] == target) {
                first = mid;
                right = mid - 1;
            }
            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return first;
    }

    int searchRight(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int end = -1;
        while (left <= right) {
            int mid = (left + (right)) / 2;
            if (nums[mid] == target) {
                end = mid;
                left = mid + 1;
            }
            if (nums[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return end;
    }
}
