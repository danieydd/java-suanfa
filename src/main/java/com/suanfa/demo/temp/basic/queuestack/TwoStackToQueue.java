package com.suanfa.demo.temp.basic.queuestack;

/**
 * @ClassName TwoStackToQueue
 * @Description 两个栈实现队列
 * @Author danie
 * @Date 2021-10-22 10:56
 */
public class TwoStackToQueue {
    private StackDemo stackDemo1 = new StackDemo();
    private StackDemo stackDemo2 = new StackDemo();

    //入队列
    public void push(String str) {
        stackDemo1.push(str);
    }

    //出队列
    public String pop() {
        if (stackDemo2.empty()) {
            while (!stackDemo1.empty()) {
                stackDemo2.push(stackDemo1.pop());
            }
        }
        return stackDemo2.pop();
    }

    //判断是否为空
    public boolean empty() {
        if (stackDemo1.empty() && stackDemo2.empty()) {
            return true;
        }else{
            return false;
        }
    }
    //打印队列
    public void printQueue(){
        System.out.println("栈1中: ");
        stackDemo1.printStack();
        System.out.println("栈2中: ");
        stackDemo2.printStack();
    }

    public static void main(String[] args) {
        TwoStackToQueue queue = new TwoStackToQueue();
        queue.push("a");
        queue.push("b");
        queue.push("c");
        queue.printQueue();
        queue.pop();
        queue.printQueue();

    }
}
