package com.company;

import java.util.concurrent.CountDownLatch;

public class Main {
    private static final int TOURIST_COUNT = 15;
    private static CountDownLatch LATCH;


    public static void main(String[] args) throws InterruptedException {//почему?
        LATCH = new CountDownLatch(TOURIST_COUNT + 1);
        for (int i = 1; i <= TOURIST_COUNT; i++) {
            Tourist tourist = new Tourist(i);
            tourist.start();
            Thread.sleep(1000);
        }
        System.out.println("Экскурсия начинается");
        LATCH.countDown();
    }
}
