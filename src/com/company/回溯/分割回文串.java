package com.company.回溯;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xiu
 * @create 2023-07-04 10:45
 */
public class 分割回文串 {
    public static void main(String[] args) {
        System.out.println(new 分割回文串().partition("aab"));
    }
    public List<List<String>> partition(String s) {
        List<List<String>> res=new ArrayList<>();
        List<String> path=new ArrayList<>();
        dfs(res,path,s,0);
        return res;
    }

    void dfs(List<List<String>> res,List<String> path,String s,int start){
        if (start>=s.length()){
            res.add(new ArrayList<String>(path));
        }
        for (int i = start; i <s.length(); i++) {
            if (isPalindrome(s,start,i)){
                path.add(s.substring(start,i+1));
                dfs(res, path, s, i+1);
                path.remove(path.size()-1);
            }
        }
    }


    private boolean isPalindrome(String s,int l,int r){
        while (l<r){
            if (s.charAt(l)!=s.charAt(r)){
                return false;
            }else{
                l++;
                r--;
            }
        }
        return true;
    }
}
