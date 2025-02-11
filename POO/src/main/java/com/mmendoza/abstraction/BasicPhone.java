package com.mmendoza.abstraction;

public class BasicPhone extends Phone implements SonPhone {
    @Override
    public void dial() {
        System.out.println("dial with button a..");
    }

    @Override
    public void callMom() {
        super.call();
        System.out.println("Mom");
    }
}
