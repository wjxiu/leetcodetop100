package com.company.子串;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author xiu
 * @create 2023-06-23 14:55
 */
public class 滑动窗口最大值 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new 滑动窗口最大值().maxSlidingWindow(new int[]{1, 3, 71, -3, 5, 3, 6, 7}, 3)));
    }
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        // 1. 优先队列存放的是二元组(num,index) : 大顶堆（元素大小不同按元素大小排列，元素大小相同按下标进行排列）
        // num :   是为了比较元素大小
        // index : 是为了判断窗口的大小是否超出范围
        PriorityQueue<int[]> pq = new PriorityQueue<int[]>((i1,i2)->{
            if (i1[0]!=i2[0]){
                return i2[0]-i1[0];
            }else{
                return i2[1]-i1[1];
            }
        });

        // 2. 优选队列初始化 : k个元素的堆
        for(int i = 0;i < k;i++){
            pq.offer(new int[]{nums[i],i});
        }
        int count=1;
        // 3. 处理堆逻辑
        int[] res = new int[n - k + 1];         // 初始化结果数组长度 ：一共有 n - k + 1个窗口
        res[0] = pq.peek()[0];                  // 初始化res[0] ： 拿出目前堆顶的元素
        for (int i = k; i < n; i++) {
            pq.offer(new int[]{nums[i],i});
            while (pq.peek()[1]<i-k){
                pq.poll();
            }
            res[count]=pq.peek()[0];
            count++;
        }
        return res;
    }
}
