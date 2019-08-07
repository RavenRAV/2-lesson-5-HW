package com.company;

import java.util.concurrent.CountDownLatch;


public class Tourist extends Thread  {
    CountDownLatch LATCH;
    private int tuNum;
    public Tourist(int tuNum, CountDownLatch c){
        LATCH = c;
        this.tuNum=tuNum;
    }
    public void run(){
        try {
            System.out.printf("Турист %d подошел к экскурсоводу", tuNum);
            System.out.println();
            LATCH.countDown();
            LATCH.await();

        }catch (InterruptedException e) {
        }
    }
}
