package test;

import java.text.SimpleDateFormat;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class StartTest {

    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(2);
        CyclicBarrier barrier = new CyclicBarrier(2, new Runnable() {
            @Override
            public void run() {
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                System.out.println("参赛选手开始时间："+sdf.format(System.currentTimeMillis()));
            }
        });

        Rabbit rabbit = new Rabbit("小兔子", 5, es, barrier);
        Rabbit tortoise = new Rabbit("小乌龟", 4, es, barrier);
        es.submit(rabbit);
        es.submit(tortoise);
        es.shutdown();
    }
}
