package com.mmendoza.inheritance;

import com.mmendoza.encapsulation.Citizen;

public class NaturalizedCitizen extends Citizen {

    private String countryOrigin;

    //constructor inheritance
    public NaturalizedCitizen(String name, String brithDate, int pin, String countryOrigin) {
        super(name, brithDate, pin);
        this.countryOrigin = countryOrigin;
    }

    public String getCountryOrigin() {
        return countryOrigin;
    }

    public void setCountryOrigin(String countryOrigin) {
        this.countryOrigin = countryOrigin;
    }
}
