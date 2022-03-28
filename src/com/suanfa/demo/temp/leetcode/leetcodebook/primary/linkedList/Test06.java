package com.suanfa.demo.temp.leetcode.leetcodebook.primary.linkedList;

/**
 * @ClassName Test03
 * @Description 反转链表
 * @Author danie
 * 输入：head = [1,2,3,4,5]
 * 输出：[5,4,3,2,1]
 * 链表可以选用迭代或递归方式完成反转。你能否用两种方法解决这道题？
 * Tips:
 * 递归
 * @Date 2022-03-24 16:41
 */
public class Test06 {
    public static ListNode reverseList(ListNode head) {
        //退出条件
        if (head == null || head.next == null) return head;
        //逻辑
        ListNode next = head.next;
        //递归
        ListNode reverse = reverseList(next);
        //逻辑
        next.next = head;
        head.next = null;
        return reverse;
    }

    public static void main(String[] args) {
        ListNode node = new ListNode(4);
        ListNode node2 = new ListNode(5);
        node.setNext(node2);
        ListNode node3 = new ListNode(1);
        node2.setNext(node3);
        ListNode node4 = new ListNode(9);
        node3.setNext(node4);
        ListNode listNode = reverseList(node);
        System.out.println(listNode);

    }
}