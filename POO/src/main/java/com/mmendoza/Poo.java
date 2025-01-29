package com.mmendoza;

import com.mmendoza.encapsulation.Citizen;

public class Poo {
    public static void main(String[] args) {

        Person person = new Person(); //Class : Person
        person.setName("Matias"); //Object : person - instance of a class
        person.introduce(); //use method


        /* -- Encapsulation --*/
        Citizen citizen = new Citizen("Leonardo", "18/10/1972", 805729);
        System.out.println(citizen.getName());
        System.out.println(citizen.getBrithDate(805729));
    }
}