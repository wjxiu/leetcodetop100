package com.company.动态规划;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author xiu
 * @create 2023-07-06 21:05
 */
public class 杨辉三角 {
    public static void main(String[] args) {
        System.out.println(new 杨辉三角().generate(1));
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 1; i <= numRows; i++) {
            ArrayList<Integer> list = new ArrayList<>();
            for (int j = 0; j < i; j++) {
                if (j==0||j==i-1){
                    list.add(1);
                }else{
                    List<Integer> pre = res.get(res.size()-1);
                    Integer integer = pre.get(j);
                    Integer integer1 = pre.get(j - 1);
                    list.add(integer+integer1);
                }
            }
            res.add(list);
        }
        return res;
    }
}
