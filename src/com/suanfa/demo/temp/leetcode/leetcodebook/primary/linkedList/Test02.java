package com.suanfa.demo.temp.leetcode.leetcodebook.primary.linkedList;

/***
 * @description: 删除链表的倒数第N个节点
 * 给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。
 * 输入：head = [1,2,3,4,5], n = 2
 * 输出：[1,2,3,5]
 * 快慢指针
 * @author danie
 * @date 2022-03-24 10:41
 * @version 1.0
 */
public class Test02 {
    public static ListNode deleteNode(ListNode head, int n) {
        ListNode fast = head;
        ListNode slow = head;
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }
        if (fast == null) {
            return head.next;
        }
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }


    public static void main(String[] args) {
        ListNode node = new ListNode(4);
        ListNode node2 = new ListNode(5);
        node.setNext(node2);
        ListNode node3 = new ListNode(1);
        node2.setNext(node3);
        ListNode node4 = new ListNode(9);
        node3.setNext(node4);
        ListNode listNode = deleteNode(node, 4);
        System.out.println(listNode);

    }
}
