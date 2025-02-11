package com.mmendoza.simpleResponsability.example.srp;

public class EmployeeSrp {

    private String name;
    private String role;

    public EmployeeSrp(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
