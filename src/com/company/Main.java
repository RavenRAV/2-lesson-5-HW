package com.company;

import java.util.concurrent.CountDownLatch;

public class Main {
    private static final int TOURIST_COUNT = 15;


    public static void main(String[] args) throws InterruptedException {//почему?
        CountDownLatch c = new CountDownLatch(TOURIST_COUNT + 1);
        for (int i = 1; i <= TOURIST_COUNT; i++) {
            Tourist tourist = new Tourist(i,c);
            tourist.start();
        }
        System.out.println("Экскурсия начинается");
        c.countDown();
    }
}
