package com.company.栈;

import java.util.Arrays;
import java.util.Stack;

/**
 * @author xiu
 * @create 2023-07-06 17:00
 */
public class 每日温度 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new 每日温度().dailyTemperatures(new int[]{73, 74, 75, 71, 69, 72, 76, 73})));
    }
    public int[] dailyTemperatures(int[] temperatures) {
//        单调递增栈,大到小
        Stack<Integer> stack = new Stack<>();
        int[] res = new int[temperatures.length];
        for (int i = 0; i < temperatures.length; i++) {
            if (stack.isEmpty()){
                stack.push(i);
            }else{
//                和栈顶比较，如果比栈顶大，弹出栈顶元素，记录下标差，并保存到结果数组
                while (!stack.isEmpty()&&temperatures[i]>temperatures[stack.peek()]){
                    Integer top=stack.pop();
                    res[top]=i-top;
                }
                stack.push(i);
            }
        }
        return res;
    }
}
