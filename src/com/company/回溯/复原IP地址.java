package com.company.回溯;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author xiu
 * @create 2023-07-04 11:38
 */
public class 复原IP地址 {
    public static void main(String[] args) {
        System.out.println(new 复原IP地址().restoreIpAddresses("101023"));
    }
    public List<String> restoreIpAddresses(String s) {
        List<String> res = new ArrayList<>();
        LinkedList<String> path = new LinkedList<>();
        dfs(res, s, path, 0);
        return res;
    }

    private void dfs(List<String> res, String s, LinkedList<String> path, int start) {
        if (path.size() >= 4&&start==s.length()) {
            res.add(String.join(".", path));
            return;
        }
        for (int i = start; i < s.length(); i++) {
            if (path.size()>=4){
                break;
            }
            if (isValid(s, start, i)) {
                path.addLast(s.substring(start,i+1));
                dfs(res, s, path, i+1);
                path.removeLast();
            }
        }
    }

    boolean isValid(String s, int start, int end) {
        int length = end - start + 1;
        if (length < 0 || length > 3) {
            return false;
        }
        if (length == 1) {
            return true;
        }
        if (s.charAt(start) == '0') {
            return false;
        }
        if (length <= 2) {
            return true;
        }
        int i = Integer.parseInt(s.substring(start, end+1));
        if (i > 255) {
            return false;
        }
        return true;
    }
}
