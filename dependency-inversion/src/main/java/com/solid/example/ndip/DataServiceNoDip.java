package com.solid.example.ndip;

public class DataServiceNoDip {
    //Depende del modulo - clase concreta
    private RepositorySqlNoDip repositorySQLNoDIP;

    public DataServiceNoDip(RepositorySqlNoDip repositorySQLNoDIP) {
        this.repositorySQLNoDIP = repositorySQLNoDIP;
    }

    public void saveData(String data) {
        repositorySQLNoDIP.save(data);
    }
}
