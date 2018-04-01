package com.shangxuefeng.thread;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.*;

/**
 * @author shangxuefeng @date 2018/3/14
 */
public class ThreadPool implements Runnable{
    @Override
    public void run() {
        System.out.println("Date is:" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
    }

    public ThreadPool(){
        ScheduledExecutorService scheduledExecutorService = new ScheduledThreadPoolExecutor(2);
        //scheduledExecutorService.scheduleAtFixedRate(this, 5, 2, TimeUnit.SECONDS);
        scheduledExecutorService.schedule(() -> {
            System.out.println("Date is:" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
        }, 10,  TimeUnit.SECONDS);
    }

    public static void main(String[] args){
        new ThreadPool();
    }
}
