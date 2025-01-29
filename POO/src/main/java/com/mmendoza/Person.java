package com.mmendoza;

public class Person {
    private String name;


    //get and set
    public void setName(String name) {
        this.name = name;
    }

    //methods
    public void introduce() {
        System.out.println("Hello , i am " + this.name);
    }
}
