package com.company.栈;

import java.util.Stack;

/**
 * @author xiu
 * @create 2023-07-05 14:31
 */
public class 有效的括号 {
    public static void main(String[] args) {
        System.out.println(new 有效的括号().isValid("({[)"));
    }
    public boolean isValid(String s) {
        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i <chars.length; i++) {
            char c=chars[i];
            if (stack.isEmpty()){
                stack.push(c);
            }else{
                Character peek = stack.peek();
                if (isMatch(peek,c)){
                    stack.pop();
                }else{
                    stack.push(c);
                }
            }
        }
        return stack.size()==0;
    }
    boolean isMatch(char c,char c1) {
        if (c == '(' && c1 == ')') {
            return true;
        } else if (c == '[' && c1 == ']') {
            return true;
        } else if (c == '{' && c1 == '}') {
            return true;
        }
        return false;
    }
}
