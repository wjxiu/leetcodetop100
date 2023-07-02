package com.company.滑动窗口;

import java.util.HashSet;

/**
 * @author xiu
 * @create 2023-06-22 13:56
 */
//输入: s = "abcabcbb"
//输出: 3
//解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
public class 无重复字符的最长子串 {
    public static void main(String[] args) {
        System.out.println(new 无重复字符的最长子串().lengthOfLongestSubstring("au"));
    }
    public int lengthOfLongestSubstring(String s) {
        if (s.length()==0) return 0;
        HashSet<Character> set = new HashSet<>();
        Integer res=-1;
        int j=-1;
        for (int i = 0; i < s.length(); i++) {
            if (i!=0){
                set.remove(s.charAt(i-1));
            }
            while (j+1<s.length()&&!set.contains(s.charAt(j+1))){
                set.add(s.charAt(j+1));
                j++;
            }
            res=Math.max(res,j-i+1);
        }
        return res;
    }
}
