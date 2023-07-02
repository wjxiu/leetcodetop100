package com.company.链表;

import com.company.ListNode;

/**
 * @author xiu
 * @create 2023-06-24 21:56
 */
public class 合并两个有序链表 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode(-1);
        ListNode temp = head;
//双指针
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                temp.next = new ListNode(list1.val);
                list1 = list1.next;
            } else {
                temp.next = new ListNode(list2.val);
                list2 = list2.next;
            }
            temp = temp.next;
        }
        temp.next=list1==null?list2:list1;
        return head.next;
    }

    //    递归
    public ListNode mergeTwoLists1(ListNode list1, ListNode list2) {
        if (list1==null){
            return list2;
        }
        else if (list2==null){
            return list1;
        }else{
            if (list1.val< list2.val){
                list1.next=mergeTwoLists1(list1.next,list2);
                return list1;
            }else{
                list2.next=mergeTwoLists1(list1,list2.next);
                return list2;
            }
        }
    }
}
