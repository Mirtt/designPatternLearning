package com.mirt.design.singleton.practice1;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 客户端 调用多个TicketMaker来生成票务number，验证是否属于同一个实例
 *
 * @author Zhang Yuqi
 * @date 2018/7/13
 */
public class Client {

    public static void main(String[] args) throws InterruptedException {
        TicketMaker tm1 = TicketMaker.getInstance();
        TicketMaker tm2 = TicketMaker.getInstance();

        CountDownLatch latch = new CountDownLatch(20);

        //设置核心池大小
        int corePoolSize = 5;

        //设置线程池最大能接受多少线程
        int maximumPoolSize = 100;

        //当前线程数大于corePoolSize、小于maximumPoolSize时，超出corePoolSize的线程数的生命周期
        long keepActiveTime = 200;

        //设置时间单位，秒
        TimeUnit timeUnit = TimeUnit.SECONDS;

        //设置线程池缓存队列的排队策略为FIFO，并且指定缓存队列大小为5
        BlockingQueue<Runnable> workQueue = new ArrayBlockingQueue<>(100);

        //创建ThreadPoolExecutor线程池对象，并初始化该对象的各种参数
        ThreadPoolExecutor executor = new ThreadPoolExecutor(corePoolSize, maximumPoolSize, keepActiveTime, timeUnit, workQueue);

        List<Integer> rs = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            executor.execute(() -> {
                rs.add(tm1.getNextTicketNumber());
                latch.countDown();
            });
            executor.execute(() -> {
                rs.add(tm2.getNextTicketNumber());
                latch.countDown();
            });
        }
        executor.shutdown();
        latch.await();
        System.out.println(rs);
        System.out.println(rs.size());
    }

}
