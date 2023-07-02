package com.company.链表;

import com.company.ListNode;
import com.company.Main;

/**
 * @author xiu
 * @create 2023-06-27 16:56
 */
public class 排序链表 {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(4);
        ListNode listNode1 = new ListNode(2);
        ListNode listNode2 = new ListNode(1);
        ListNode listNode3 = new ListNode(3);
        listNode.next=listNode1;
        listNode1.next=listNode2;
        listNode2.next=listNode3;
        System.out.println(new 排序链表().sortList(listNode));
    }
    public ListNode sortList(ListNode head) {
        if(head==null||head.next==null) return head;
        ListNode fast=head.next;
        ListNode slow=head;
        while (fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
//        找到中间 节点
        ListNode temp=slow.next;
        slow.next=null;
        ListNode left = sortList(head);
        ListNode right = sortList(temp);
        ListNode newhead = new ListNode(-1);
        ListNode temp1 = newhead;
        while (left!=null&&right!=null){
            if (left.val<=right.val){
                temp1.next=left;
                left=left.next;
            }else{
                temp1.next=right;
                right=right.next;
            }
            temp1 = temp1.next;
        }
        temp1.next=left==null?right:left;
        return newhead.next;
    }
}
