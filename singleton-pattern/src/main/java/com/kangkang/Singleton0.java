package com.kangkang;

/**
 * 懒汉式，类初始化的时候不创建，什么时候想用什么时候创建，线程不安全
 * @author benkang.chen
 */
public class Singleton0 {
    private static Singleton0 instance;

    private Singleton0 () {}

    public static Singleton0 getInstance() {
        if (instance == null) {
            instance = new Singleton0();
        }
        return instance;
    }
}
