package com.suanfa.demo.thread;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executors;

/**
 CountDownLatch 是一个线程等待其他线程， CyclicBarrier 是多个线程互相等待。
 CountDownLatch 的计数是减 1 直到 0，CyclicBarrier 是加 1，直到指定值。
 CountDownLatch 是一次性的， CyclicBarrier  可以循环利用。
 CyclicBarrier 可以在最后一个线程达到屏障之前，选择先执行一个操作。
 Semaphore ，需要拿到许可才能执行，并可以选择公平和非公平模式。

 countDownLatch 主要有await和countDown方法
 当一个线程调用await方法时，就会阻塞当前线程。每当有线程调用一次 countDown 方法时，
 计数就会减 1。当 count 的值等于 0 的时候，被阻塞的线程才会继续运行。

 */
public class CountDownLatchDemo {
    static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch latch = new CountDownLatch(2);
        Worker w1 = new Worker("张三", 2000, latch);
        Worker w2 = new Worker("李四", 3000, latch);
        w1.start();
        w2.start();

        long startTime = System.currentTimeMillis();
        latch.await();
        System.out.println("bug全部解决，领导可以给客户交差了，任务总耗时："+ (System.currentTimeMillis() - startTime));
    }

    static class Worker extends Thread{
        String name;
        int workTime;
        CountDownLatch latch;

        public Worker(String name, int workTime, CountDownLatch latch) {
            this.name = name;
            this.workTime = workTime;
            this.latch = latch;
        }

        @Override
        public void run() {
            System.out.println(name+"开始修复bug，当前时间："+sdf.format(new Date()));
            doWork();
            System.out.println(name+"结束修复bug，当前时间："+sdf.format(new Date()));
            latch.countDown();
        }

        private void doWork() {
            try {
                //模拟工作耗时
                Thread.sleep(workTime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
