package com.mmendoza.encapsulation;

/* Encapsulation: Hiding or displaying data as needed. Promoting application security */
public class Citizen {
    private String name;
    private String brithDate;
    private int pin;

    //constructor
    public Citizen(String name, String brithDate, int pin) {
        this.name = name;
        this.brithDate = brithDate;
        this.pin = pin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrithDate(int pin) {
        if (pin == this.pin) { //value of the class
            return this.brithDate;
        }
        return "access denied";
    }
}
