package com.shangxuefeng.thread;


public class ThreadLocalTest implements Runnable{
    ThreadLocal<String> tl = new ThreadLocal<>();

    public static void main(String[] args){
        ThreadLocalTest ttl = new ThreadLocalTest();
        Thread t1 = new Thread(ttl);
        Thread t2 = new Thread(ttl);
        Thread t3 = new Thread(ttl);
        t1.start();
        t2.start();
        t3.start();
    }

    @Override
    public void run() {
        Thread th = Thread.currentThread();
        System.out.println("Name:" + th.getName());
        tl.set(th.getName());
        System.out.println(tl.get());
    }
}
