package com.company.链表;

import com.company.ListNode;

/**
 * @author xiu
 * @create 2023-06-24 9:45
 */
public class 反转链表 {
    public ListNode reverseList(ListNode head) {
        ListNode newhead = null;
        while (head!=null){
            ListNode listNode = new ListNode(head.val);
            ListNode temp=newhead;
            newhead=listNode;
            newhead.next=temp;
            head=head.next;
        }
        return newhead;
    }
}
