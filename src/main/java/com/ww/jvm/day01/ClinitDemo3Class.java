package com.ww.jvm.day01;

/**
 * clinit 方法在多线程下，同步初始化的时候加锁， 且静态成员有且只会初始化一次
 */
public class ClinitDemo3Class {
    public static void main(String[] args) {
        Runnable r = () -> {
            System.out.println(Thread.currentThread().getName() + "start...");
            DeadThread deadThread = new DeadThread();
            System.out.println(Thread.currentThread().getName() + "stop...");
        };

        Thread t1 = new Thread(r, "线程1");
        Thread t2 = new Thread(r, "线程2");

        t1.start();
        t2.start();
    }

    static class DeadThread {
        static {
            if (true) {
                System.out.println(Thread.currentThread().getName() + "初始化当前类...");
                while (true) {
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    break;
                }
            }
        }
    }

}
