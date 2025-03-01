package com.solid.example.ocp;

public class NotifierInstagramOcp implements Notifier {
    @Override
    public void send(String message) {
        System.out.println("Sending message of instagram: " + message);
    }
}
