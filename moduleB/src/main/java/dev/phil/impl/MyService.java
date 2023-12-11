package dev.phil.impl;

import dev.phil.MyInterface;

public class MyService implements MyInterface {

    @Override
    public void doSomething() {
        System.out.println("do something here");
    }
}
