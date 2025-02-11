package com.mmendoza.simpleResponsability;

import com.mmendoza.simpleResponsability.example.nsrp.EmployeeNoSrp;
import com.mmendoza.simpleResponsability.example.srp.EmployeeSrp;
import com.mmendoza.simpleResponsability.example.srp.Reports;
import com.mmendoza.utils.Utils;

public class SRP extends Utils {
    public static void main(String[] args) {
        msg("No SRP");

        EmployeeNoSrp noSrp = new EmployeeNoSrp("Matias", "Buss");
        noSrp.generateReport();

        msg("With SRP");
        EmployeeSrp srp = new EmployeeSrp("Matias", "Buss");
        Reports reports = new Reports();
        reports.generateReport(srp);
    }
}
