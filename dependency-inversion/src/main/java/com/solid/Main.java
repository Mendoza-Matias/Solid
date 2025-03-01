package com.solid;

import com.solid.example.dip.DataService;
import com.solid.example.dip.RepositoryFirebase;
import com.solid.example.dip.RepositorySql;
import com.solid.example.ndip.DataServiceNoDip;
import com.solid.example.ndip.RepositorySqlNoDip;

public class Main {
    public static void main(String[] args) {

        RepositorySqlNoDip repositorySQLNoDIP = new RepositorySqlNoDip(); //module
        //data service depends of modules | high level
        DataServiceNoDip dataServiceNoDIP = new DataServiceNoDip(repositorySQLNoDIP);
        dataServiceNoDIP.saveData("Book");


        RepositorySql repositorySQL = new RepositorySql();
        DataService dataService = new DataService(repositorySQL);
        dataService.saveData("Book");
        RepositoryFirebase repositoryFirebase = new RepositoryFirebase();
        DataService dataService1 = new DataService(repositoryFirebase);
        dataService1.saveData("Book");
    }
}