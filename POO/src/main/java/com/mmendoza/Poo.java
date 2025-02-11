package com.mmendoza;

import com.mmendoza.abstraction.BasicPhone;
import com.mmendoza.abstraction.Phone;
import com.mmendoza.abstraction.SonPhone;
import com.mmendoza.encapsulation.Citizen;
import com.mmendoza.inheritance.NaturalizedCitizen;
import com.mmendoza.polymorphism.Smartphone;

public class Poo {
    public static void main(String[] args) {

        // Creating a Person object and using its methods
        Person person = new Person(); // Class: Person
        person.setName("Matias"); // Object: person - instance of a class
        person.introduce(); // Using method

        // -- Encapsulation --
        Citizen citizen = new Citizen("Leonardo", "18/10/1972", 805729);
        System.out.println(citizen.getName());
        System.out.println(citizen.getBrithDate(805729));

        // -- Inheritance --
        NaturalizedCitizen alberto = new NaturalizedCitizen("Alberto", "19/12/2002", 9090, "Argentina");
        System.out.println(alberto.getCountryOrigin());

        // -- Abstraction --
        BasicPhone basicPhone = new BasicPhone();
        basicPhone.dial();
        basicPhone.callMom();

        // Instance of interface - implementation of interface
        SonPhone sonPhone = new BasicPhone();
        sonPhone.callMom();

        // -- Polymorphism --
        callPhone(basicPhone);
        Smartphone smartphone = new Smartphone();
        smartphone.dial();
        callPhone(smartphone); // Inheritance of Phone
    }

    private static void callPhone(Phone phone) {
        phone.call();
    }
}
