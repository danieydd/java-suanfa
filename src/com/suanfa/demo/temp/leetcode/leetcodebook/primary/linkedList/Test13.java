package com.suanfa.demo.temp.leetcode.leetcodebook.primary.linkedList;

/**
 * @ClassName Test13
 * @Description TODO
 * @Author danie
 * @Date 2022-05-12 18:10
 * tips:快慢指针
 */
public class Test13 {

    public static boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && slow != null || fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        ListNode node2 = new ListNode(2);
        node.setNext(node2);
        ListNode node3 = new ListNode(3);
        node2.setNext(node3);
        ListNode node4 = new ListNode(2);
        node3.setNext(node4);
        ListNode node5 = new ListNode(1);
        node4.setNext(node2);
        System.out.println(hasCycle(node));

    }
}
