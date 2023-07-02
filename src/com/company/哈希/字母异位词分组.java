package com.company.哈希;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * @author xiu
 * @create 2023-06-22 12:29
 */
public class 字母异位词分组 {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(String str:strs){
            char[] chars = str.toCharArray();
            String s1=new String(chars);
            Arrays.sort(chars);
            List<String> orDefault = map.getOrDefault(s1, new ArrayList<>());
            map.put(s1,orDefault);
            orDefault.add(str);

        }
        return new ArrayList<>(map.values());
    }
}
