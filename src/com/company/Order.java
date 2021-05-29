package com.company;

import java.time.LocalDate;
import java.util.*;

public class Order {
    private static int sequence = 0;
    private int id;

    private int numOfTable;
    private LocalDate dateOfOrder;
    private Payment payment;
    private ArrayList<Item> listOfItems = new ArrayList<Item>();

    public Order(int numOfTable, LocalDate dateOfOrder, Payment payment) {
        this.id = ++sequence;
        this.numOfTable = numOfTable;
        this.dateOfOrder = dateOfOrder;
        this.payment = payment;
    }

    public int getNumOfTable() {
        return numOfTable;
    }

    public void setNumOfTable(int numOfTable) {
        this.numOfTable = numOfTable;
    }

    public LocalDate getDateOfOrder() {
        return dateOfOrder;
    }

    public void setDateOfOrder(LocalDate dateOfOrder) {
        this.dateOfOrder = dateOfOrder;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public ArrayList<Item> getListOfItems() {
        return (ArrayList<Item>) listOfItems.clone();
    }

    public void addItem(Item item){
        listOfItems.add(item);
    }

    public double getPriceOfOrder(){
        double result = 0;
        for (Item i: listOfItems) {
            result += i.getPrice();
        }
        return result;
    }

    public String getDescription(){
        return ("ID: "+this.id+", číslo stolu: "+getNumOfTable()+", datum objednávky: "+getDateOfOrder()+", typ platby: "+getPayment());
    }

}
