package com.company;

import java.util.*;

public class Item {

    private String title;
    private double price;
    private int quantity;

    public Item(String title, double price, int quantity){
        this.title = title;
        this.price = price;
        this.quantity = quantity;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getTitle(){
        return title;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public double getPrice(){
        return price;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    public int getQuantity(){
        return quantity;
    }

    public String getDescription(){
        return getTitle()+", "+getPrice()+", "+getQuantity();
    }


}
