package com.company.链表;

import com.company.ListNode;

import java.util.List;

/**
 * @author xiu
 * @create 2023-06-24 21:27
 */
public class 环形链表 {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        ListNode listNode1 = new ListNode(2);
        ListNode listNode2 = new ListNode(3);
        ListNode listNode3 = new ListNode(4);
        listNode.next=listNode1;
        listNode1.next=listNode2;
        listNode2.next=listNode3;
        listNode3.next=listNode1;
        new 环形链表().hasCycle(listNode);
    }
//    快慢指针
    public boolean hasCycle(ListNode head) {
        ListNode fast=head;
        ListNode low=head;
        while (fast==null&&fast.next==null){
            fast=fast.next.next;
            low=low.next;
            if (fast==low){
                return true;
            }
        }
        return true;
    }
}
