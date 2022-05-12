package com.suanfa.demo.temp.leetcode.leetcodebook.primary.linkedList;

/**
 * @ClassName Test010
 * @Description 回文链表
 * 输入：head = [1,2,2,1]
 * 输出：true
 * <p>
 * 输入：head = [1,2,3,2,1]
 * 输出：false
 * tips：递归
 * @Author danie
 * @Date 2022-04-13 15:55
 */
public class Test12 {
    private static ListNode temp;

    public static boolean isPalindrome(ListNode head) {
        temp = head;
        boolean res = checkListNode(head);
        return res;
    }

    public static void printListNode(ListNode head) {
        if (head == null) return;
        printListNode(head.next);
        System.out.println(head.val);
    }

    public static boolean checkListNode(ListNode head) {
        if (head == null) return true;
        boolean res = checkListNode(head.next) && (head.val == temp.val);
        temp = temp.next;
        return res;

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
        node4.setNext(node5);
//        boolean res = isPalindrome(node);
//        System.out.println(res);
        boolean res = isPalindrome(node);
        System.out.println(res);
    }
}
