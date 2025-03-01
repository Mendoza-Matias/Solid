package com.solid;

import com.solid.example.nocp.NotificationService;
import com.solid.example.nocp.NotifierEmail;
import com.solid.example.nocp.NotifierSms;
import com.solid.example.ocp.Notifier;
import com.solid.example.ocp.NotifierEmailOcp;
import com.solid.example.ocp.NotifierInstagramOcp;
import com.solid.example.ocp.NotifierServiceOcp;

public class Main {
    public static void main(String[] args) {

        /* Ejemplos */

        NotificationService service = new NotificationService();
        NotifierEmail email = new NotifierEmail();
        NotifierSms sms = new NotifierSms();

        service.setNotifierEmail(email);
        service.setNotifierSms(sms);

        service.send("Hello World");
        service.sendSms("Hello World Sms");

        /* ---- */
        NotifierServiceOcp serviceOcp = new NotifierServiceOcp();
        Notifier emailOcp = new NotifierEmailOcp();
        Notifier instagramOcp = new NotifierInstagramOcp();

        serviceOcp.setNotifier(emailOcp);
        serviceOcp.send("Hello World");
        serviceOcp.setNotifier(instagramOcp);
        serviceOcp.send("Hello World instagram");
    }
}
