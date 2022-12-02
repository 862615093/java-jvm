package com.ww.jvm.day01;

/**
 * clinit方法会先加载父类中的静态成员，在加载子类静态成员
 */
public class ClinitDemo2Class {
    static class Father {
        public static int a = 10;
        static {
            a = 20;
        }
    }

    static class Son extends Father{
        public static int b = a;
    }

    public static void main(String[] args) {
        System.out.println(Son.b);
    }
}
