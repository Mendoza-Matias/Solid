package com.mmendoza.openClosed;

import com.mmendoza.openClosed.example.nocp.NotifierEmailNoOcp;
import com.mmendoza.openClosed.example.nocp.NotificationService;
import com.mmendoza.openClosed.example.nocp.NotifierSmsNoOcp;
import com.mmendoza.openClosed.example.ocp.*;
import com.mmendoza.utils.Utils;

public class OCP extends Utils {
    public static void main(String[] args) {
        msg("Not OCP");

        NotifierEmailNoOcp no = new NotifierEmailNoOcp();
        NotificationService service = new NotificationService();

        service.setNotificationNoOcp(no);
        service.send("Hello World");

        NotifierSmsNoOcp sms = new NotifierSmsNoOcp();
        sms.send("Hello World");
        service.setNotificationSmsNoOcp(sms);

        System.out.println(/* ---------------- */);

        msg("OCP");

        NotificationServiceOcp serviceOcp = new NotificationServiceOcp();
        Notifier emailOcp = new NotifierEmailOcp(); /* implement Notifier */

        serviceOcp.setNotifier(emailOcp);

        serviceOcp.send("Hello");

        Notifier smsOcp = new NotifierSmsOcp();

        serviceOcp.setNotifier(smsOcp);

        serviceOcp.send("Bye");

        //new provider
        Notifier facebookOcp = new NotificationFacebookOcp();
        serviceOcp.setNotifier(facebookOcp);

        serviceOcp.send("Good Bye");
    }
}
