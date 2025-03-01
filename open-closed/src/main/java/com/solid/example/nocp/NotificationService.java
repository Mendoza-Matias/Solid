package com.solid.example.nocp;

public class NotificationService {

    /*
     * El código actual no sigue el Principio de Abierto/Cerrado de SOLID.
     * Por cada nuevo tipo de notificador,
     * es necesario modificar esta clase, lo que viola el principio.
     * La clase debería estar abierta para su extensión, pero cerrada para su modificación.
     */

    private NotifierEmail notifierEmail;  // Notificador de tipo Email

    private NotifierSms notifierSms;

    // Método para establecer el notificador de tipo Email
    public void setNotifierEmail(NotifierEmail notifierEmail) {
        this.notifierEmail = notifierEmail;
    }

    // Método para enviar el mensaje usando el notificador configurado
    public void send(String message) {
        notifierEmail.send(message);  // Envia el mensaje usando el notificador de Email
    }

    public void setNotifierSms(NotifierSms notifierSms) {
        this.notifierSms = notifierSms;
    }

    public void sendSms(String message) {
        notifierSms.send(message);
    }
}
