package com.suanfa.demo.temp.leetcode.leetcodebook.primary.linkedList;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName Test13
 * @Description TODO
 * @Author danie
 * @Date 2022-05-12 18:10
 * tips:存放到集合中
 */
public class Test14 {

    public static boolean hasCycle(ListNode head) {
        Set<ListNode> nodeSet = new HashSet<>();
        while (head != null) {
            if (!nodeSet.add(head)) return true;
            head = head.next;
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
//        node4.setNext(node2);
        System.out.println(hasCycle(node));

    }
}
