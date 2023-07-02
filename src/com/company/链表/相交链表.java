package com.company.链表;

import com.company.ListNode;

/**
 * @author xiu
 * @create 2023-06-24 9:39
 */
public class 相交链表 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tempa=headA;
        ListNode tempb=headB;
        while (tempa!=tempb){
            if (tempa==null){
                tempa=headB;
            }else{
                tempa=tempa.next;
            }
            if (tempb==null){
                tempb=headA;
            }else{
                tempb=tempb.next;
            }
        }
        return tempa;
    }
}
