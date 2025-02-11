package com.mmendoza.simpleResponsability.example.srp;

public class Reports { //other class
    public void generateReport(EmployeeSrp employee) {
        System.out.println("generate report of: " + employee.getRole() + " " + employee.getName());
    }
}
