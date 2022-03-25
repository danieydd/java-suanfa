package com.suanfa.demo.temp.leetcode.leetcodebook.primary.linkedList;

import java.util.Objects;
import java.util.Stack;

/**
 * @ClassName Test04
 * @Description TODO
 * @Author danie
 * @Date 2022-03-25 17:11
 */
public class Test04 {
    public static ListNode reverseList(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        while (Objects.nonNull(head)) {
            stack.push(head.val);
            head = head.next;
        }
        ListNode node = null;
        ListNode listNode = setNewNode(stack, node);
        return listNode;
    }

    public static ListNode setNewNode(Stack<Integer> stack, ListNode node) {
        while (!stack.isEmpty()) {
            Integer ele = stack.pop();
            ListNode n = new ListNode();
            n.setVal(ele);
            setNewNode(stack, n);
            if (node == null) {
                return n;
            } else {
                node.setNext(n);
            }
        }
        return null;

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