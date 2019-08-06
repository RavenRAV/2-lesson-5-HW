package com.company;

import java.util.concurrent.CountDownLatch;


public class Tourist extends Thread  {
    private static CountDownLatch LATCH;
    private int tuNum;
    public Tourist(int tuNum){
        this.tuNum=tuNum;
    }
    public void run(){
        try {
            System.out.printf("Турист %d подошел к экскурсоводу", tuNum);
            LATCH.countDown();
            LATCH.await();
            Thread.sleep(100);

        }catch (InterruptedException e) {
        }
    }
}
