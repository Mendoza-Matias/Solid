package com.mmendoza.openClosed.example.ocp;

//implements interface
public class NotifierEmailOcp implements Notifier {
    public void send(String message) {
        System.out.println("send with email: " + message);
    }
}
