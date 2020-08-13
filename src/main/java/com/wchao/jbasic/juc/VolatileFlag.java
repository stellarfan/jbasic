package com.wchao.jbasic.juc;

import java.util.concurrent.TimeUnit;

public class VolatileFlag {
    static volatile boolean flag = false;
    static int i;
    public static void main(String[] args) {
        new Thread(() -> {
            System.out.println("t1 start");
            while (!flag){
//                System.out.println("doing something");
//                i++;
            }
        },"t1").start();

        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        flag = true;
    }
}
