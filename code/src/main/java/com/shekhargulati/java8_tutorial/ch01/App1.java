package com.shekhargulati.java8_tutorial.ch01;

public class App1 implements A {
    @Override
    public void doSth() {
        System.out.println("inside App1");
    }
// this is a test
    
    public static void main(String[] args) {
        new App1().doSth();
    }
}

interface A {
    default void doSth() {
        System.out.println("inside A");
    }
}
