package com.suanfa.demo.temp.leetcode.leetcodebook.primary.linkedList;

/**
 * @ClassName Tes07
 * @Description 合并两个有序链表
 * 将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 * 输入：l1 = [1,2,4], l2 = [1,3,4]
 * 输出：[1,1,2,3,4,4]
 * 两个链表的节点数目范围是 [0, 50]
 * -100 <= Node.val <= 100
 * l1 和 l2 均按 非递减顺序 排列
 * tips:
 * 递归
 * @Author danie
 * @Date 2022-03-30 11:21
 */
public class Tes09 {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null || list2 == null) {
            return list1 == null ? list2 : list1;
        }
        ListNode first = list1.val <= list2.val ? list1 : list2;
        first.next = mergeTwoLists(first.next, first == list1 ? list2 : list1);
        return first;

    }

    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        ListNode node2 = new ListNode(2);
        node.setNext(node2);
        ListNode node3 = new ListNode(4);
        node2.setNext(node3);

        ListNode nnode = new ListNode(1);
        ListNode nnode2 = new ListNode(3);
        nnode.setNext(nnode2);
        ListNode nnode3 = new ListNode(4);
        nnode2.setNext(nnode3);
        ListNode listNode = mergeTwoLists(node, nnode);
        System.out.println(listNode);
    }
}
