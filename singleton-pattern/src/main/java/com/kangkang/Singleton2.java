package com.kangkang;

/**
 * 饿汉式，在类刚开始加载的时候就初始化实例，基于classloder机制。
 */
public class Singleton2 {
    private static Singleton2 instance = new Singleton2();

    private Singleton2 () {}

    public static Singleton2 getInstance () {
        return instance;
    }
}
