package com.ww.jvm.day01;

/**
 * 只有静态变量子节码文件中才会出现 clinit方法
 */
public class ClinitDemo1Class {

    private static int a = 10;

    public static void main(String[] args) {
        System.out.println(a);
    }

}
