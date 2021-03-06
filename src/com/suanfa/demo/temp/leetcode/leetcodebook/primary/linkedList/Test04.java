package com.suanfa.demo.temp.leetcode.leetcodebook.primary.linkedList;

import java.util.Objects;
import java.util.Stack;

/**
 * @ClassName Test03
 * @Description 反转链表
 * @Author danie
 * 输入：head = [1,2,3,4,5]
 * 输出：[5,4,3,2,1]
 * 链表可以选用迭代或递归方式完成反转。你能否用两种方法解决这道题？
 * tips：
 * 利用栈
 * @Date 2022-03-24 16:41
 */
public class Test04 {
    public static ListNode reverseList(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        while (Objects.nonNull(head)) {
            stack.push(new ListNode(head.val));
            head = head.next;
        }
        ListNode listNode = setNewNode(stack);
        return listNode;
    }

    public static ListNode setNewNode(Stack<ListNode> stack) {
        if (stack.isEmpty())
            return null;
        ListNode node = stack.pop();
        ListNode dummy = node;
        while (!stack.isEmpty()) {
            ListNode tempNode = stack.pop();
            node.next = tempNode;
            node = node.next;
        }
//        node.next = null;
        return dummy;

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