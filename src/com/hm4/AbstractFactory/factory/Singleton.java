package com.hm4.AbstractFactory.factory;

public class Singleton {
    private static Singleton instance;

    private Singleton() {
        // Empty constructor
    }

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
