package com.company.回溯;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author xiu
 * @create 2023-07-03 10:50
 */
public class 子集 {
    List<List<Integer>> result = new ArrayList<>();// 存放符合条件结果的集合
    LinkedList<Integer> path = new LinkedList<>();// 用来存放符合条件结果
    public List<List<Integer>> subsets(int[] nums) {
        dfs(0,nums);
        return result;
    }
    public void dfs(int cur, int[] nums) {
        result.add(new ArrayList(path));
        for(int i=cur;i<nums.length;i++){
            path.add(nums[i]);
            dfs(i+1,nums);
            path.removeLast();
        }
    }

    public static void main(String[] args) {
        new 子集().subsets(new int[]{1,2,3});
    }
}
