package com.suanfa.demo.temp.leetcode.leetcodebook.primary.linkedList;

import java.util.Objects;
import java.util.Stack;

/**
 * @ClassName Test03
 * @Description 反转链表
 * @Author yemao
 * 输入：head = [1,2,3,4,5]
 * 输出：[5,4,3,2,1]
 * 链表可以选用迭代或递归方式完成反转。你能否用两种方法解决这道题？
 * @Date 2022-03-24 16:41
 */
public class Test03 {
    public static ListNode reverseList(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        while (Objects.nonNull(head)) {
            stack.push(head.val);
            head = head.next;
        }
        ListNode listNode = setNewNode(stack, null);
        return listNode;
    }

    public static ListNode setNewNode(Stack<Integer> stack1, ListNode node) {
        //ListNode returnNode = new ListNode();
        while (!stack1.isEmpty()) {
            Integer ele = stack1.pop();
            ListNode n = new ListNode();
            n.setVal(ele);
            if(node==null){
                node=n;
                //return n;
            }
            else{
                node.setNext(n);
                setNewNode(stack1, node.next);
            }
        }
        return node;
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
