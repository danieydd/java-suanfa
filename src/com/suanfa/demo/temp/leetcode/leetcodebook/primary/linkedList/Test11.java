package com.suanfa.demo.temp.leetcode.leetcodebook.primary.linkedList;

import java.util.Stack;

/**
 * @ClassName Test010
 * @Description 回文链表
 * 输入：head = [1,2,2,1]
 * 输出：true
 * <p>
 * 输入：head = [1,2,3,2,1]
 * 输出：false
 * tips：利用栈
 * @Author danie
 * @Date 2022-04-13 15:55
 */
public class Test11 {
    public static boolean isPalindrome(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        ListNode dump = head;
        while(dump != null){
            stack.push(dump.val);
            dump = dump.next;
        }
        while(head != null){
            Integer val = stack.pop();
            if(val != head.val){
                return false;
            }
            head = head.next;
        }
        return true;
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
        boolean res = isPalindrome(node);
        System.out.println(res);
    }
}
