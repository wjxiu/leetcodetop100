package com.company.链表;

import com.company.ListNode;
import org.omg.PortableInterceptor.INACTIVE;

import java.util.List;
import java.util.Stack;

/**
 * @author xiu
 * @create 2023-06-24 10:11
 */
public class 回文链表 {

//    栈
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        ListNode temp=head;
        while (temp!=null){
            stack.push(temp.val);
            temp=temp.next;
        }
         temp=head;
        while (temp!=null){
            Integer pop = stack.pop();
            if (temp.val!=pop){
                return false;
            }
            temp=temp.next;
        }
        return true;
    }
}
