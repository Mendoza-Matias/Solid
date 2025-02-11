package com.mmendoza.abstraction;

public abstract class Phone {

    public abstract void dial(); //override in other class

    public void call() {
        System.out.println("call a..");
    }
}
