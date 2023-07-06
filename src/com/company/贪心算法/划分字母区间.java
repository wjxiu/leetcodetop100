package com.company.贪心算法;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author xiu
 * @create 2023-07-06 20:34
 */
public class 划分字母区间 {
    public static void main(String[] args) {
        System.out.println(new 划分字母区间().partitionLabels("ababcbacadefegdehijhklij"));
    }
    public List<Integer> partitionLabels(String s) {
        ArrayList<Integer> res = new ArrayList<>();
//        保存字母最有一次出现的下标
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.toCharArray().length; i++) {
            char c = s.charAt(i);
            map.put(c,i);
        }
//        符合结果的字符串的左侧下标
        int left=0;
//        符合结果的字符串的右侧下标
        int right=0;
        for (int i = 0; i < s.length(); i++) {
//            找到字符串中最远的下表
            right=Math.max(right,map.get(s.charAt(i)));
//            说明小标小于i的最远都没有i大，就可以加入结果
            if (i==right){
                res.add(right-left+1);
                left=right+1;
            }
        }
        return res;
    }
}
