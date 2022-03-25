package com.suanfa.demo.temp.leetcode.leetcodebook.primary.linkedList;

/***
 * @description: 删除链表的倒数第N个节点
 * 给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。
 * 输入：head = [1,2,3,4,5], n = 2
 * 输出：[1,2,3,5]
 * 非递归解决
 * @author danie
 * @date 2022-03-24 10:41
 * @version 1.0
 */
public class Test01 {
    public static ListNode deleteNode(ListNode head, int n) {
        ListNode pre = head;
        int len = getLength(head);
        System.out.println("len=" + len);
        int last = len - n;
        if (last == 0) {
            return head.next;
        }
        for (int i = 0; i < last-1; i++) {
            pre = pre.next;
        }
        pre.next = pre.next.next;
        return head;
    }

    public static int getLength(ListNode head) {
        int len = 0;
        while (head != null) {
            len++;
            head = head.next;
        }
        return len;
    }

    public static void main(String[] args) {
        ListNode node = new ListNode(4);
//        ListNode node2 = new ListNode(5);
//        node.setNext(node2);
//        ListNode node3 = new ListNode(1);
//        node2.setNext(node3);
//        ListNode node4 = new ListNode(9);
//        node3.setNext(node4);
        ListNode listNode = deleteNode(node, 1);
        System.out.println(listNode);

    }
}
