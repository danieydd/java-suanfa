package com.suanfa.demo.temp.basic.queuestack;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * @ClassName StackDemo
 * @Description 栈
 * 用LinkedList双向链表来实现链式栈
 * @Author danie
 * @Date 2021-10-22 10:58
 */
public class StackDemo {
    private LinkedList<String> stackList = new LinkedList<String>();

    //入栈
    public void push(String str) {
        stackList.addFirst(str);
    }

    //出栈
    public String pop() {
        return stackList.removeFirst();
    }

    //判断栈是否为空
    public boolean empty() {
        return stackList.isEmpty();
    }

    //打印栈内所有的元素
    public void printStack() {
        Iterator<String> iterator = stackList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        StackDemo stackDemo = new StackDemo();
        System.out.println(stackDemo.empty());
        stackDemo.printStack();
        stackDemo.push("a");
        stackDemo.push("b");
        stackDemo.push("c");
        System.out.println(stackDemo.empty());
        stackDemo.printStack();
        stackDemo.pop();
        stackDemo.printStack();
    }
}
