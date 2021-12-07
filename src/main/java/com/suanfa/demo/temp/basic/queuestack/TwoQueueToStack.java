package com.suanfa.demo.temp.basic.queuestack;

/**
 * @ClassName TwoQueueToStack
 * @Description 两个队列实现栈
 * @Author danie
 * @Date 2021-10-22 12:07
 */
public class TwoQueueToStack {
    private QueueDemo queueDemo1 = new QueueDemo();
    private QueueDemo queueDemo2 = new QueueDemo();
    //入栈
    public void push(String str){
        if(queueDemo1.empty() && queueDemo2.empty()){
            queueDemo1.push(str);
        }else{
            if(!queueDemo1.empty()){
                queueDemo1.push(str);
            }else if(!queueDemo2.empty()){
                queueDemo2.push(str);
            }
        }
    }
    //出栈
    public String pop(){
        if(!queueDemo1.empty() && queueDemo2.empty()){
            int size = queueDemo1.getQueueSize();
            while(size>1){
                queueDemo2.push(queueDemo1.pop());
                size = queueDemo1.getQueueSize();
            }
            return queueDemo1.pop();
        }else if(queueDemo1.empty() && !queueDemo2.empty()){
            int size = queueDemo2.getQueueSize();
            while(size>1){
                queueDemo1.push(queueDemo2.pop());
                size = queueDemo2.getQueueSize();
            }
            return queueDemo2.pop();
        }else{
            return "error";
        }
    }
    //判断栈是否为空
    public boolean empty(){
        if(queueDemo1.empty() && queueDemo2.empty()){
            return true;
        }else{
            return false;
        }
    }
    //输出栈内所有的元素
    public void printStack(){
        System.out.println("队列1: ");
        queueDemo1.printQueue();
        System.out.println("队列2: ");
        queueDemo2.printQueue();
    }
    public static void main(String[] args){
        TwoStackToQueue stack = new TwoStackToQueue();
        stack.push("a");
        stack.push("b");
        stack.push("c");
        stack.printQueue();
        stack.pop();
        stack.printQueue();
        stack.push("d");
        stack.printQueue();
    }
}
