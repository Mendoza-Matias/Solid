package com.solid.example.dip;

public class RepositoryFirebase implements Repository {
    @Override
    public void save(String data) {
        System.out.println("Save data in database firebase " + data);
    }
}
