package com.solid.example.dip;

//presenta su implementacion
public class RepositorySql implements Repository {
    @Override
    public void save(String data) {
        System.out.println("Save data in database firebase " + data);
    }
}
