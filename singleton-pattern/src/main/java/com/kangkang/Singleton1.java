package com.kangkang;

/**
 * 懒汉式，用synchronized修饰，线程安全
 * @author benkang.chen
 */
public class Singleton1 {
    private static Singleton1 instance;

    private Singleton1() {}

    public static synchronized Singleton1 getInstance () {
        if (instance == null) {
            instance = new Singleton1();
        }
        return instance;
    }
}
