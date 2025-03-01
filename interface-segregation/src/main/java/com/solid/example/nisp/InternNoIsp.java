package com.solid.example.nisp;

public class InternNoIsp implements TaskNoIsp {
    @Override
    public void generateReport() {
        System.out.println("Generating report of Intern");
    }

    @Override
    public void calculatePayment() {
        System.out.println("No payment"); //No es necesario en esta clase pero de igual forma hay que implementarlo
    }
}
