package com.suanfa.demo.temp.basic.queuestack;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * @ClassName QueueDemo
 * @Description 用双向链表实现队列
 * @Author danie
 * @Date 2021-10-22 11:26
 */
public class QueueDemo {
    private LinkedList<String> queueList = new LinkedList<>();

    //入队
    public void push(String str) {
        queueList.add(str);
    }

    //出队
    public String pop() {
        return queueList.removeFirst();
    }

    //获取队列元素的个数
    public int getQueueSize() {
        return queueList.size();
    }

    //判断队列是否为空
    public boolean empty() {
        return queueList.isEmpty();
    }

    //打印队列内所有的元素
    public void printQueue() {
        Iterator<String> iterator = queueList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        QueueDemo queueDemo = new QueueDemo();
        queueDemo.push("a");
        queueDemo.push("b");
        queueDemo.push("c");
        System.out.println(queueDemo.empty());
        System.out.println(queueDemo.getQueueSize());
        queueDemo.printQueue();
        queueDemo.pop();
        queueDemo.printQueue();
        System.out.println(queueDemo.getQueueSize());
    }
}
