package com.abhishek.database;

public class Contact {
    int id;
    String name;
    String contactNumber;

    public Contact(){}

    public Contact(String name, String contactNumber) {
        this.name = name;
        this.contactNumber = contactNumber;
    }

    public Contact(int id, String name, String contactNumber) {
        this.id = id;
        this.name = name;
        this.contactNumber = contactNumber;
    }
}
