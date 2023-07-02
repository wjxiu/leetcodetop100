package com.company.双指针;

import java.util.Arrays;

/**
 * @author xiu
 * @create 2023-06-22 13:11
 */
public class 盛最多水的容器 {
//    只移动短板，如果移动长板不会变得更长，因为移动后的最小要么是前短板，要么是长板移动后的的短板，面积要么不变，要么变小
    public int maxArea(int[] height) {
        int max=Integer.MIN_VALUE;
        int i=0;int j=height.length-1;
        while (i<j){
            if (height[i]<height[j]){
                int min =(i-j)* Math.min(height[i], height[j]);
                max=Math.max(max,min);
                i++;
            }else{
                int min =(i-j)* Math.min(height[i], height[j]);
                max=Math.max(max,min);
                j--;
            }
        }
        return max;
    }
}
