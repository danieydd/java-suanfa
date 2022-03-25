package com.suanfa.demo.temp.leetcode.leetcodebook.primary.linkedList;

/**
 * @ClassName ListNode
 * @Description TODO
 * @Author danie
 * @Date 2022-03-15 14:26
 */
public class ListNode {
    int val;
     ListNode next;
     ListNode(int x) { val = x; }
    ListNode() { }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }
}
