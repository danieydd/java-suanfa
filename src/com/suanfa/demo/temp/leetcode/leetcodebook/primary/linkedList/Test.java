package com.suanfa.demo.temp.leetcode.leetcodebook.primary.linkedList;

/**
 * @ClassName Test01
 * @Description 删除链表中的节点
 * 请编写一个函数，用于 删除单链表中某个特定节点 。在设计函数时需要注意，你无法访问链表的头节点 head ，只能直接访问 要被删除的节点 。
 * <p>
 * 题目数据保证需要删除的节点 不是末尾节点 。
 * <p>
 * 输入：head = [4,5,1,9], node = 5
 * 输出：[4,1,9]
 * 解释：指定链表中值为 5 的第二个节点，那么在调用了你的函数之后，该链表应变为 4 -> 1 -> 9
 * tips：因为无法获取被删除节点的前一个节点，所以直接用后一个节点代替前一个节点
 * @Author danie
 * @Date 2022-03-15 14:22
 */
public class Test {
    public static void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;

    }
    public static void main(String[] args) {
        ListNode node = new ListNode(4);
        ListNode node2 = new ListNode(5);
        node.setNext(node2);
        ListNode node3 = new ListNode(1);
        node2.setNext(node3);
        ListNode node4 = new ListNode(9);
        node3.setNext(node4);
        deleteNode(node2);
        System.out.println(node);

    }
}
