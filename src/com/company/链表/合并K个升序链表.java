package com.company.链表;

import com.company.ListNode;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author xiu
 * @create 2023-06-27 17:23
 */
public class 合并K个升序链表 {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> listNodes = new PriorityQueue<>(Comparator.comparingInt(i -> i.val));
        for (ListNode list : lists) {
            listNodes.add(list);
        }
        ListNode temp=new ListNode(0);
        ListNode listNode = temp;
        while (!listNodes.isEmpty()){
            ListNode remove = listNodes.poll();
            if (remove!=null){
                listNodes.add(remove.next);
            }
            listNode.next=remove;
            listNode=listNode.next;
        }
        return temp.next;
    }
}
