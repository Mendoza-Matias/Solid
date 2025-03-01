package com.solid.example.dip;

public class Employee implements Report, Payment {
    @Override
    public void generateReport() {
        System.out.println("Generated report of employees");
    }

    @Override
    public void calculatePayment() {
        System.out.println("Calculating payment of employees");
    }
}
