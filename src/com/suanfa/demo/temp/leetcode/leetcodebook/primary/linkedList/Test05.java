package com.suanfa.demo.temp.leetcode.leetcodebook.primary.linkedList;

/**
 * @ClassName Test03
 * @Description 反转链表
 * @Author danie
 * 输入：head = [1,2,3,4,5]
 * 输出：[5,4,3,2,1]
 * 链表可以选用迭代或递归方式完成反转。你能否用两种方法解决这道题？
 * Tips:
 * 双链表
 * @Date 2022-03-24 16:41
 */
public class Test05 {
    public static ListNode reverseList(ListNode head) {
        if (head == null) return null;
       ListNode headNode = head;
       ListNode nextNode = head.next;
       while(nextNode !=null){
           //节点反置
           ListNode temp = nextNode.next;
           nextNode.next = headNode;
           //节点移动
           headNode = nextNode;
           nextNode = temp;
       }
        return headNode;

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