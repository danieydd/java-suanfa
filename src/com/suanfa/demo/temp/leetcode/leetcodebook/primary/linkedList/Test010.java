package com.suanfa.demo.temp.leetcode.leetcodebook.primary.linkedList;

/**
 * @ClassName Test010
 * @Description 回文链表
 * 输入：head = [1,2,2,1]
 * 输出：true
 * <p>
 * 输入：head = [1,2,3,2,1]
 * 输出：false
 * tips：反转后半部分链表
 * @Author danie
 * @Date 2022-04-13 15:55
 */
public class Test010 {
    public static boolean isPalindrome(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        //奇数个节点
        if (fast != null) {
            slow = slow.next;
        }
        ListNode listNode = reverse(slow);
        while (listNode != null) {
            if (head.val != listNode.val) {
                return false;
            }
            listNode = listNode.next;
            head = head.next;
        }
        return true;
    }

    //反转链表--迭代法
    public static ListNode reverse(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode temp = head.next;
            head.next = prev;
            prev = head;
            head = temp;
        }
        return prev;
    }

    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        ListNode node2 = new ListNode(2);
        node.setNext(node2);
        ListNode node3 = new ListNode(3);
        node2.setNext(node3);
        ListNode node4 = new ListNode(2);
        node3.setNext(node4);
//        ListNode node5 = new ListNode(1);
//        node4.setNext(node5);
        boolean res = isPalindrome(node);
        System.out.println(res);
    }
}
