package com.solid.example.ocp;

public class NotifierEmailOcp implements Notifier {
    @Override
    public void send(String message) {
        System.out.println("Sending email: " + message);
    }
}
