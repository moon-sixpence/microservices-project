package com.lq.microservicesproject;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import  java.util.List;
/**
 * @description:
 * @date: 2020/11/12
 * @author: liuqiang
 * @email mosixpence@gmail.com
 */
public class FutureBlockingDataLoader extends DataLoader {

    protected void doLoad() {

        ExecutorService executorService = Executors.newFixedThreadPool(3); // 创建线程池

        Future<?> submit1 = executorService.submit(super::loadConfigurations);//  耗时 >= 1s
        Future<?> sub2 = executorService.submit(super::loadUsers);           //  耗时 >= 2s
        Future<?> sub3 = executorService.submit(super::loadOrders);          //  耗时 >= 3s

        /*runCompletely(submit1);
        runCompletely(sub2);
        runCompletely(sub3);*/

        executorService.shutdown();
    } // 总耗时 sum(>= 1s, >= 2s, >= 3s)  >= 6s

    private void runCompletely(Future<?> future) {
        try {
            future.get(); // 阻塞等待结果执行
        } catch (Exception e) {
        }
    }

    public static void main(String[] args) {
        new FutureBlockingDataLoader().load();
    }

}
