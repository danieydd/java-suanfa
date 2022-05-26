package com.suanfa.demo.temp.leetcode.leetcodebook.primary.designproblem;

import java.util.EmptyStackException;
import java.util.Stack;

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
 * tips:
 * 使用自带的栈解决
 * @Author danie
 * @Date 2022-05-25 07:02
 */
public class Test03 {
    private Stack<Integer> minStack = new Stack<>();
    private Stack<Integer> stack = new Stack<>();

    public Test03() {
    }

    public void push(int val) {
        stack.push(val);
        if (minStack.empty()) {
            minStack.push(val);
            return;
        }
        if (val < minStack.peek()) {
            minStack.push(val);
        } else {
            minStack.push(minStack.peek());
        }
    }

    public void pop() {
        if (stack.empty()) return;
        stack.pop();
        minStack.pop();
    }

    public int top() {
        if (stack.empty()) {
            throw new IllegalStateException("栈为空...");
        }
        return stack.peek();
    }

    public int getMin() {
        if (stack.empty()) {
            throw new IllegalStateException("栈为空...");
        }
        return minStack.peek();
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
