package com.company.链表;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author xiu
 * @create 2023-06-27 18:23
 */
public class LRUCache {
    public static void main(String[] args) {
        LRUCache lruCache = new LRUCache(2);
        lruCache.put(1,0);
        lruCache.put(2,2);
        lruCache.get(1);
        lruCache.put(3,3);
        lruCache.get(2);
        lruCache.put(4,4);
        lruCache.get(1);
        lruCache.get(3);
        lruCache.get(4);
    }

    public LRUCache() {
    }

    class DlinkNode {
        public int key;
        public int val;
        public DlinkNode pre;
        public DlinkNode next;

        public DlinkNode() {
        }

        public DlinkNode(int key, int val) {
            this.val = val;
            this.key = key;
        }
    }

    HashMap<Integer, DlinkNode> map = new HashMap<>();
    int capacity;
    int size;
    DlinkNode dummyhead, dummytail;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.dummyhead = new DlinkNode();
        this.dummytail = new DlinkNode();
        this.dummyhead.next = this.dummytail;
    }

    public int get(int key) {
        DlinkNode dlinkNode = map.get(key);
        if (dlinkNode != null) {
            movetohead(dlinkNode);
        } else {
            return -1;
        }
        return dlinkNode.val;
    }


    private void removeNode(DlinkNode node) {
        node.pre.next=node.next;
        node.next.pre=node.pre;
    }

    private void movetohead(DlinkNode dlinkNode) {
        removeNode(dlinkNode);
        addToHead(dlinkNode);
    }

    private void addToHead(DlinkNode node) {
        node.pre = dummyhead;
        node.next = dummyhead.next;
        dummyhead.next.pre = node;
        dummyhead.next = node;
    }

    public void put(int key, int value) {
        DlinkNode dlinkNode = map.get(key);
        if(dlinkNode==null){
            dlinkNode=new DlinkNode(key,value);
            map.put(key,dlinkNode);
            addToHead(dlinkNode);
            size++;
            if (size > capacity) {
                DlinkNode removetail = removetail();
                map.remove(removetail.key);
                size--;
            }
        }else{
            dlinkNode.val=value;
            movetohead(dlinkNode);
        }

    }
    private DlinkNode removetail() {
        DlinkNode temp=dummytail.pre;
        removeNode(dummytail.pre);
        return temp;
    }
}
