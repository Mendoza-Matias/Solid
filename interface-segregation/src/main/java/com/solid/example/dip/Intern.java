package com.solid.example.dip;

public class Intern implements Report {
    @Override
    public void generateReport() {
        System.out.println("Generating report of Intern");
    }
}
