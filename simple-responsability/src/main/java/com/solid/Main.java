package com.solid;

import com.solid.example.dip.EmployeeNoSrp;
import com.solid.example.ndip.Employee;
import com.solid.example.ndip.GenerateReports;

public class Main {
    public static void main(String[] args) {
        // Ejemplos

        EmployeeNoSrp employeeNoSrp = new EmployeeNoSrp("Juan", "Administrador");
        employeeNoSrp.generateReport();

        // Dividido por proposito
        GenerateReports generateReports = new GenerateReports();
        Employee employee = new Employee("Jose", "Empleado");
        generateReports.generateReport(employee);

    }
}