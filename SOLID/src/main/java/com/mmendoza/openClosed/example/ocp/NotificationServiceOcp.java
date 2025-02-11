package com.mmendoza.openClosed.example.ocp;

//create interface --> not modification code
public class NotificationServiceOcp {

    private Notifier notifier; //other class implements the interface notifier

    public void setNotifier(Notifier notifier) {
        this.notifier = notifier;
    }

    public void send(String message) {
        notifier.send(message);
    }
}
