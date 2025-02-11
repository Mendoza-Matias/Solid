package com.mmendoza.openClosed.example.ocp;

public class NotificationFacebookOcp implements Notifier {
    @Override
    public void send(String message) {
        System.out.println("notification of facebook: " + message);
    }
}
