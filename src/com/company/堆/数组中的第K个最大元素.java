package com.company.堆;

import java.util.PriorityQueue;

/**
 * @author xiu
 * @create 2023-07-06 17:41
 */
public class 数组中的第K个最大元素 {

    //    优先级队列
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>((i,i1)->{return i1-i;});
        for(int i:nums){
            queue.add(i);
        }
        for (int i = 0; i < k-1; i++) {
            Integer poll = queue.poll();
        }
        return queue.poll();
    }
}
