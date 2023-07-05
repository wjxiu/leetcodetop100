package com.company.回溯;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * @author xiu
 * @create 2023-07-03 11:09
 */
public class 电话号码的字母组合 {
    HashMap<Integer,String> map= new HashMap<Integer,String>();
    List<String> result = new ArrayList<>();// 存放符合条件结果的集合
    StringBuilder  path=new StringBuilder();// 用来存放符合条件结果
    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.length() == 0) {
            return result;
        }
        map.put(0,"");map.put(1,"");map.put(2,"abc");map.put(3,"def");map.put(4,"ghi");map.put(5,"jkl");map.put(6,"mno");map.put(7,"pqrs");map.put(8,"pqrs");map.put(9,"wxyz");
        int index=0;
        dfs(digits,index);
        return result;
    }

    private void dfs(String digits, int index) {

        if (index==digits.length()){
            result.add(new String(path));
            return;
        }
        int i1 = digits.charAt(index) - '0';
        String letters = map.get(i1);
        for (int i = 0; i <letters.length(); i++) {
            path.append(letters.charAt(i));
            dfs(digits,index+1);
            path.deleteCharAt(path.length()-1);
        }
    }

}
