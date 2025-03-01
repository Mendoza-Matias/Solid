package com.solid.example.dip;

public class EmployeeNoSrp {
    private String name;
    private String role;

    public EmployeeNoSrp(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRole(String role) {
        this.role = role;
    }

    /*
     * Metodo para generar reporte
     * La clase no cumple una unica función
     */
    public void generateReport() {
        System.out.println("Generate report of the employee: "
                + " " + name
                + " " + role);
    }
}
