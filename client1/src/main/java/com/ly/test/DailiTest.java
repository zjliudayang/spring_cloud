package com.ly.test;

import java.lang.reflect.Proxy;

public class DailiTest {
    public static void main(String[] args) {
        Dog dog = new Dog();
        AnimalProxyHandler handler = new AnimalProxyHandler(dog);
        Animal proxy = (Animal) Proxy.newProxyInstance(Animal.class.getClassLoader(), new Class<?>[]{Animal.class}, handler);
        proxy.run();
        AnimalSleepProxyHandler handler1 = new AnimalSleepProxyHandler(dog);
        Animal proxy2 = (Animal) Proxy.newProxyInstance(Animal.class.getClassLoader(), new Class<?>[]{Animal.class}, handler1);
        proxy2.sleep();
    }
}
