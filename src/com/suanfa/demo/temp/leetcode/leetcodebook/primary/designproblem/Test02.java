package com.suanfa.demo.temp.leetcode.leetcodebook.primary.designproblem;


/**
 * @ClassName Test02
 * @Description 最小栈
 * 设计一个支持 push ，pop ，top 操作，并能在常数时间内检索到最小元素的栈。
 * <p>
 * 实现 MinStack 类:
 * <p>
 * MinStack() 初始化堆栈对象。
 * void push(int val) 将元素val推入堆栈。
 * void pop() 删除堆栈顶部的元素。
 * int top() 获取堆栈顶部的元素。
 * int getMin() 获取堆栈中的最小元素。
 * 输入：
 * ["MinStack","push","push","push","getMin","pop","top","getMin"]
 * [[],[-2],[0],[-3],[],[],[],[]]
 * <p>
 * 输出：
 * [null,null,null,null,-3,null,0,-2]
 * tips:使用链表解决
 * @Author danie
 * @Date 2022-05-25 07:02
 */
public class Test02 {
    private ListNode head;

    public Test02() {
    }

    public void push(int val) {
        if (head == null) {
            head = new ListNode(val, null, val);
            return;
        }
        int min;
        if (val < head.min) {
            min = val;
        } else {
            min = head.min;
        }
        ListNode temp = head;
        head = new ListNode(val, temp, min);
    }

    public void pop() {
        if (head == null) return;
        head = head.next;
    }

    public int top() {
        return head.val;
    }

    public int getMin() {
        return head.min;
    }

    public static void main(String[] args) {
        Test02 test02 = new Test02();
        test02.push(-2);
        test02.push(0);
        test02.push(-1);
        int min = test02.getMin();
        test02.pop();
        int top = test02.top();
        int min1 = test02.getMin();
        System.out.println();

    }
}
