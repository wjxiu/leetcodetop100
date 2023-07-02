package com.company.链表;

import com.company.ListNode;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author xiu
 * @create 2023-06-24 21:44
 */
public class 环形链表2 {
    public ListNode detectCycle(ListNode head) {
        ListNode low=head;
        HashSet<ListNode> set = new HashSet<>();
        while (low!=null){
            if (!set.add(low)) return low;
            low=low.next;
        }
       return null;
    }
}
