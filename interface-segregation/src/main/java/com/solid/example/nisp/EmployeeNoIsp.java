package com.solid.example.nisp;

public class EmployeeNoIsp implements TaskNoIsp{
    @Override
    public void generateReport() {
        System.out.println("Generated report of employees");
    }

    @Override
    public void calculatePayment() {
        System.out.println("Calculating payment of employees");
    }
}
