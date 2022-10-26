package com.example.proyecto.models;

public class Employee extends Person{
    private Double cash;

    public Employee(String document, String cellPhone, String email, Double cash) {
        super(document, cellPhone, email);
        this.cash = cash;
    }

    public Double getCash() {
        return cash;
    }

    public void setCash(Double cash) {
        this.cash = cash;
    }
}
