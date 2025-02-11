package com.mmendoza.polymorphism;

import com.mmendoza.abstraction.Phone;

public class Smartphone extends Phone {
    @Override
    public void dial() {
        System.out.println("dial voice command");
    }

    @Override
    public void call() {
        System.out.println("call for whatsapp");
        ;
    }
}
