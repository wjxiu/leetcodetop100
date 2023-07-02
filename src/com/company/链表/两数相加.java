package com.company.链表;

import com.company.ListNode;

/**
 * @author xiu
 * @create 2023-06-24 22:13
 */
public class 两数相加 {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(9);
        ListNode listNode1 = new ListNode(9);
        ListNode listNode2 = new ListNode(9);
        ListNode listNode3 = new ListNode(9);
        ListNode listNode4 = new ListNode(9);
        ListNode listNode5 = new ListNode(9);
        ListNode listNode6 = new ListNode(9);
        ListNode listNode7 = new ListNode(9);
        listNode.next = listNode1;
        listNode1.next = listNode2;
        listNode3.next = listNode4;
        listNode4.next = listNode5;
        listNode5.next = listNode6;
        listNode6.next = listNode7;
        System.out.println(new 两数相加().addTwoNumbers(listNode, listNode3));
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(-1);
        ListNode temp = head;
        ListNode t1 = l1;
        ListNode t2 = l2;
//        保存进位
        int next = 0;
        while (t1!=null||t2!=null) {
            int v1 = t1 == null ? 0 : t1.val;
            int v2 = t2 == null ? 0 : t2.val;
            int sum = v1 + v2 + next;
            next = sum/10;
            temp.next = new ListNode(sum %10);
            temp = temp.next;
            if (t1 != null) t1 = t1.next;
            if (t2 != null) t2 = t2.next;
        }
        if(next==1) temp.next = new ListNode(next);
        return head.next;
    }
}
