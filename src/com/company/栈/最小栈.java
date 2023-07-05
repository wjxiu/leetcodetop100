package com.company.栈;

import java.util.LinkedList;

/**
 * 设计一个支持 push ，pop ，top 操作，并能在常数时间内检索到最小元素的栈。
 *
 * 实现 MinStack 类:
 *
 * MinStack() 初始化堆栈对象。
 * void push(int val) 将元素val推入堆栈。
 * void pop() 删除堆栈顶部的元素。
 * int top() 获取堆栈顶部的元素。
 * int getMin() 获取堆栈中的最小元素。
 *
 */
//辅助栈解法辅助栈解法
class MinStack {
    LinkedList<Integer> stack;
    LinkedList<Integer> help;
    public MinStack() {
        stack=new LinkedList<>();
        help=new LinkedList<>();
        help.push(Integer.MAX_VALUE);
    }

    public void push(int val) {
        stack.push(val);
        help.push(Math.min(val,help.peek()));
    }

    public void pop() {
        stack.pop();
        help.pop();
    }

    public int top() {
        return  stack.peek();
    }

    public int getMin() {
        return  help.peek();
    }
}
public class 最小栈 {
}
