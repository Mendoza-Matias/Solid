package com.mmendoza.openClosed.example.nocp;

//not extension - modification bass code
public class NotificationService {
    private NotifierEmailNoOcp notifierEmailNoOcp;

    private NotifierSmsNoOcp notifierSmsNoOcp;//add new provider


    public void setNotificationNoOcp(NotifierEmailNoOcp notifierEmailNoOcp) {
        this.notifierEmailNoOcp = notifierEmailNoOcp;
    }

    public void setNotificationSmsNoOcp(NotifierSmsNoOcp notificationSmsNoOcp) {
        this.notifierSmsNoOcp = notificationSmsNoOcp;
    }

    public void send(String message) {
        notifierEmailNoOcp.send(message);
    }

    public void sendSms(String message) {
        notifierSmsNoOcp.send(message);
    }
}
