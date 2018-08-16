package com.ly.test;

/**
 *
 */
public class Dog implements Animal{

    @Override
    public void run() {
        System.out.println("dogs run fast");
    }

    @Override
    public void sleep() {
        System.out.println("dog sleep");
    }
}
