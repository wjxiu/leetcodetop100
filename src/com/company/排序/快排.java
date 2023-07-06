package com.company.排序;

/**
 * @author xiu
 * @create 2023-07-06 18:29
 */
public class 快排 {
    void quicksort(int[] nums, int left, int right) {
        if (left < right) {
            int l = left, r = right;
            int p = nums[left];
            while (l < r) {
                while (l < r && nums[r] >= p) {
                    r--;
                }
                if (l < r) {
                    nums[l] = nums[r];
                    l++;
                }
                while (l < r && nums[l] < p) {
                    l++;
                }
                if (l < r) {
                    nums[r] = nums[l];
                    r--;
                }
            }
            nums[l] = p;
            quicksort(nums, left, l - 1);
            quicksort(nums, l + 1, right);
        }
    }
}
