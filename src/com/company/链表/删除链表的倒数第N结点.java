package com.company.链表;

import com.company.ListNode;

import java.util.List;

/**
 * @author xiu
 * @create 2023-06-25 9:01
 */
public class 删除链表的倒数第N结点 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1, head);
        ListNode fast=head;
        ListNode slow=dummy;
        while (n>0){
            fast=fast.next;
            n--;
        }
        while (fast!=null){
            fast=fast.next;
            slow=slow.next;
        }
        slow.next=slow.next.next;
        return dummy.next;
    }
}
