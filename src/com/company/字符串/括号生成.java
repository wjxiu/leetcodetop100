package com.company.字符串;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xiu
 * @create 2023-07-04 0:38
 */
public class 括号生成 {
    public static void main(String[] args) {
        System.out.println(new 括号生成().generateParenthesis(3).size());
    }
    List<String> res=new ArrayList<>();
    StringBuffer path=new StringBuffer();
    public List<String> generateParenthesis(int n) {
        dfs(n,0,0);
        System.out.println(res);
        return res;
    }
//左括号数目：open 右括号数目：close
    private void dfs(int n,int open,int close) {
//        右括号数目>左括号数目 ,结果不符合
        if (close>open) return;
//        右括号开始
        if (path.length()>0&&path.charAt(0)==')')return;
//        过长
        if (path.length()>2*n) return ;
//        左右括号数目相等并且长度刚好是n的两倍
        if (path.length()==2*n&&open==close){
            res.add(path.toString());
            return;
        }
        path.append("(");
        dfs(n,open+1,close);
//        剪枝
        path.deleteCharAt(path.length()-1);
        path.append(")");
        dfs(n,open,close+1);
//        剪枝
        path.deleteCharAt(path.length()-1);
    }

}
