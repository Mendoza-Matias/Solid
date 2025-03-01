package com.solid;

import com.solid.example.dip.Employee;
import com.solid.example.dip.Intern;
import com.solid.example.nisp.EmployeeNoIsp;
import com.solid.example.nisp.InternNoIsp;

public class Main {
    public static void main(String[] args) {

        EmployeeNoIsp emp = new EmployeeNoIsp();
        emp.generateReport();
        emp.calculatePayment();

        InternNoIsp internNoISP = new InternNoIsp();
        internNoISP.generateReport();
        internNoISP.calculatePayment();

        Employee employee = new Employee();
        employee.calculatePayment();
        employee.generateReport();

        //Unico metodo
        Intern intern = new Intern();
        intern.generateReport();
    }
}