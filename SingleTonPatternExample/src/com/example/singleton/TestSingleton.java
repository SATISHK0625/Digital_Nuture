package com.example.singleton;

public class TestSingleton {
    public static void main(String[] args) {

        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.log("First message");
        logger2.log("Second message");

        System.out.println("Are both references same? " + (logger1 == logger2));
        System.out.println("Hash Code of logger1: " + logger1.hashCode());
        System.out.println("Hash Code of logger2: " + logger2.hashCode());
    }
}