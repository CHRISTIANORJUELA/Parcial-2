package com.example.proyecto.models;

public class Person {
    private String document;
    private String cellPhone;
    private String email;

    public Person(String document, String cellPhone, String email) {
        this.document = document;
        this.cellPhone = cellPhone;
        this.email = email;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
