package com.ww.jvm.day02;

/**
 * 栈溢出测试
 */
public class StackDemo {


    public static void main(String[] args) {
//        method1();
    }

    public static void method1() {
        System.out.println("method1......");
        method2();
    }

    public static void method2() {
        System.out.println("method2......");
    }

}

class StackDemo2 {

    public static int count;

    public static void main(String[] args) {
        try {
            m1();
        } catch (Throwable e) {
            e.printStackTrace();
            System.out.println(count);// 16570 2080  851
        }
    }

    public static void m1() {
        count++;
        m1();
    }


}