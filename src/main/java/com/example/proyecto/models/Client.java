package com.example.proyecto.models;

public class Client{
    private String name;
    private int Age;

    public Client(String name, int age) {
        this.name = name;
        this.Age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }
}
