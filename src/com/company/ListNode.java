package com.company;

/**
 * @author xiu
 * @create 2023-06-24 9:40
 */
public class ListNode {
    public  int val;
    public  ListNode next;
    public  ListNode(int x) {
         val = x;
         next = null;
     }
    public ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
