package com.hujianbest.tutorials.concurrent;

import java.util.concurrent.*;

/**
 * @author hujian
 */
public class ExecutorDemo {
    public static void main(String[] args) {
        Executor exec = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

        ExecutorService execService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

        ThreadPoolExecutor threadPool = new ThreadPoolExecutor(Runtime.getRuntime().availableProcessors(),
                60, 1000, TimeUnit.SECONDS, new LinkedBlockingQueue<>(),
                task -> new Thread(null, task, "tutorials", 0), new ThreadPoolExecutor.AbortPolicy());
    }
}
