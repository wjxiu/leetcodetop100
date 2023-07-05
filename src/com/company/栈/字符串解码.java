package com.company.栈;

import java.util.Stack;

/**
 * @author xiu
 * @create 2023-07-05 15:04
 */
public class 字符串解码 {
//    输入：s = "3[a]2[bc]"
//输出："aaabcbc"
public static void main(String[] args) {
    System.out.println(new 字符串解码().decodeString("100[leetcode]"));
}
//这道题我不太会写
    public String decodeString(String s) {
        StringBuilder res = new StringBuilder();
        Integer muitl=0;
//        倍数栈
        Stack<Integer> mutilStack = new Stack<>();
//        临时结果栈
        Stack<String> resStack = new Stack<>();
        for(Character c:s.toCharArray()){
            if (c=='['){
                mutilStack.push(muitl);
                muitl=0;
                resStack.push(res.toString());
                res = new StringBuilder();
            }else if(c==']'){
                StringBuilder stringBuilder = new StringBuilder();
                String pop = resStack.pop();
                Integer mutil1=mutilStack.pop();
                for (int i = 0; i < mutil1; i++) stringBuilder.append(res);
                res=new StringBuilder(pop+stringBuilder);

            }else if(Character.isDigit(c)){
//                出现一位数的数字，正确记录
                muitl=muitl*10+Integer.parseInt(c+"");
            }else{
//                字母
                res.append(c+"");
            }
        }
        return res.toString();

    }



}
