package com.company.回溯;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xiu
 * @create 2023-07-03 11:29
 */
public class 组合总和 {
    public static void main(String[] args) {
        new 组合总和().combinationSum(new int[]{2,3,6,7},7);
    }
    List<List<Integer>>  result = new ArrayList<>();// 存放符合条件结果的集合
    List<Integer>  path=new ArrayList<Integer>();// 用来存放符合条件结果
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        dfs(candidates,target,0,0);
        System.out.println(result);
        return result;
    }
    void dfs(int[] candidates,int target,int startindex,int sum){
        if (sum==target){
            result.add(new ArrayList<>(path));
            return;
        }
        if (sum>target) return ;
        for (int i = startindex; i < candidates.length; i++) {
            path.add(candidates[i]);
            sum+=candidates[i];
            dfs(candidates,target,i,sum);
            sum-=candidates[i];
            path.remove(path.size()-1);
        }
    }
}
