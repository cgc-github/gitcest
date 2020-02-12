package test;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;

public abstract class Animal implements  Runnable{

    // 动物名称
    protected String name;
    //动物速度
    protected int speed;
    //当前已经跑得路程
    protected int now;

    //线程管理器方便结束线程
    protected ExecutorService executor;

    //线程计时器
    protected CyclicBarrier barrier;

    //是否完成比赛的标记
    public static volatile boolean FINISH = false;

    //比赛的路程
    public static final int SUCCESS = 20;

    public Animal(String name, int speed, ExecutorService executor, CyclicBarrier barrier) {
        this.name = name;
        this.speed = speed;
        this.executor = executor;
        this.barrier = barrier;
    }

    public Animal(String name, int speed,  ExecutorService executor) {
        this.name = name;
        this.speed = speed;
        this.executor = executor;
    }

    @Override
    public abstract  void run();

    public void finish(){
        if(now >= SUCCESS){
            System.out.println(this.name+"跑完了，结束比赛");
            FINISH = true;
            //关闭所有线程
            executor.shutdownNow();
        }
    }
}
