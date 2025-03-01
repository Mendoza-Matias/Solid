package com.solid.example.ndip;

/* Clase encargada de generar los reportes */
public class GenerateReports {
    public void generateReport(Employee employee) {
        System.out.println("Generate report of the employee: "
                + " " + employee.getName()
                + " " + employee.getRole());
    }
}
