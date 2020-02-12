package test;

import java.text.SimpleDateFormat;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;

public class Tortoise extends Animal {

    public Tortoise(String name, int speed,  ExecutorService executor, CyclicBarrier barrier) {
        super(name, speed, executor, barrier);
    }

    public Tortoise(String name, int speed,  ExecutorService executor) {
        super(name, speed, executor);
    }

    @Override
    public void run() {
        try{
            Thread.sleep(2000);
            barrier.await();
        }catch(Exception e){
            e.printStackTrace();
        }
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("比赛开始时间："+sdf.format(System.currentTimeMillis()));

        while(!FINISH){
            try{
                System.out.println(this.name+"速度"+this.speed+"我跑了"+this.now);
                now+=speed;
                finish();
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}
