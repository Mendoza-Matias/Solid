package com.solid.example.dip;

public class DataService {
    private Repository repository; //No depende del modulo

    public DataService(Repository repository) {
        this.repository = repository;
    }

    public void saveData(String data) {
        repository.save(data);
    }
}
