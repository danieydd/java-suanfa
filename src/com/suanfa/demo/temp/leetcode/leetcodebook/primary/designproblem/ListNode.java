package com.suanfa.demo.temp.leetcode.leetcodebook.primary.designproblem;

/**
 * @ClassName ListNode
 * @Description 最小栈-链表实现
 * @Author danie
 * @Date 2022-05-25 07:36
 */
public class ListNode {
    public int val;
    public ListNode next;
    public int min;

    public ListNode(int val, ListNode next, int min) {
        this.val = val;
        this.next = next;
        this.min = min;
    }
}
