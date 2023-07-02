package com.company;

import java.util.concurrent.*;

/**
 * @author xiu
 * @create 2023-06-29 15:31
 */
public class threadtest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 30, 5, TimeUnit.SECONDS, new LinkedBlockingQueue<>(50),
                Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());
       CompletableFuture.runAsync(()->{
           System.out.println(10/2);
       },threadPoolExecutor);
        CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return 4.53;
        }, threadPoolExecutor).whenComplete((res,e)->{
            System.out.println("任务完成");
            System.out.println(res);
        }).exceptionally(e->{
            return 9.977;
        }).thenAcceptAsync((res)->{
            System.out.println("accept");
            System.out.println(res);
            System.out.println(res);
            System.out.println(res);
            System.out.println(res);
        },threadPoolExecutor);
    }
}
