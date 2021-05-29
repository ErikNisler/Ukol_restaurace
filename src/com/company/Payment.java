package com.company;

public enum Payment {
    CASH("Hotově"),
    CARD("Kartou");

    private String description;

    private Payment(String description){
        this.description = description;
    }
}
