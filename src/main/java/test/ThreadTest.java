package test;
/*
*  总路程100m, 乌龟每秒5m , 兔子每秒8m, 每十米记录一次，70m时，兔子休息两秒
* */

public class ThreadTest {

    public static void main(String[] args) {

        Tortoise();
    }

    private static void Tortoise() {

        Thread  t1 = new Thread("乌龟"){
            public void run(){
                int count  = 0 ;
                while(count<100){
                    try{
                        Thread.sleep(1000);
                    }catch(Exception e){
                        e.printStackTrace();
                    }
                    count+=5;
                    if(count%10==0){
                        System.out.println("乌龟走了"+count+"米");
                    }

                }
            }
        };

        Thread  t2 = new Thread("兔子"){
            public void run(){
                int count  = 0 ;
                while(count<100){
                    try{
                        Thread.sleep(1000);
                    }catch(Exception e){
                        e.printStackTrace();
                    }
                    count+=10;
                    if(count%10==0){
                        System.out.println("兔子走了"+count+"米");
                    }

                    if(count==70){
                        try{
                            Thread.sleep(2000);
                        }catch(Exception e){
                            e.printStackTrace();
                        }
                    }

                }
            }
        };
        t1.start();
        t2.start();
    }
}
