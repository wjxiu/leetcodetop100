package com.company.链表;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @author xiu
 * @create 2023-06-25 9:54
 */
public class 复制带随机指针的链表 {
    public Node copyRandomList(Node head) {
        if(head == null){
            return null;
        }
        Node cur = head;
        HashMap<Node, Node> map = new HashMap<>();
        while (cur!=null){
            map.put(cur, new Node(cur.val)) ;
            cur=cur.next;
        }
         cur = head;
        while (cur!=null){
            map.get(cur).next=map.get(cur.next);
            map.get(cur).random=map.get(cur.random);
        }
        return map.get(head);
    }
}
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}