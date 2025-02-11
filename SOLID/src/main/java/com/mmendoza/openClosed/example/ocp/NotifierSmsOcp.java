package com.mmendoza.openClosed.example.ocp;

public class NotifierSmsOcp implements Notifier {
    public void send(String message) {
        System.out.println("Sending notification sms :" + message);
    }
}
