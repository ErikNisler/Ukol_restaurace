package com.company;

import javax.swing.plaf.basic.BasicSplitPaneUI;
import java.time.LocalDate;
import java.util.*;

public class OrderList {
    private ArrayList<Order> listOfOrders = new ArrayList<>();
    private ArrayList<Item> listOfItems = new ArrayList<>();

    public void addOrder(Order order){
        listOfOrders.add(order);
    }

    public int sizeOfList(){
        return listOfOrders.size();
    }

    public Order getOrder(int position){
        return listOfOrders.get(position);
    }


    public Map<String,Integer> amountOfItems() {
        int sum = 0;
        HashMap<String, Integer> pieces = new HashMap<>();
        for (Order o : listOfOrders) {
            for (Item i : o.getListOfItems()) {
                String piece = i.getTitle();
                if (pieces.containsKey(piece)) {
                    sum = pieces.get(piece);
                }
                pieces.put(piece,sum + i.getQuantity());
            }
        }
        return pieces;
    }

    public List<String> getAllItems() {
        HashSet<String> itemsSet = new HashSet<>();
        for (Order o: listOfOrders) {
            for (Item i : o.getListOfItems()) {
                String item = i.getTitle();
                itemsSet.add(item);
            }
        }
        ArrayList<String> items = new ArrayList<>(itemsSet);
        Collections.sort(items);
        return items;
    }

    public HashMap<LocalDate,Double> turnover(){
        int sum = 0;
        HashMap<LocalDate,Double> turnover = new HashMap<>();
        for (Order o: listOfOrders) {
            turnover.put(o.getDateOfOrder(),sum + o.getPriceOfOrder());
        }
        return turnover;
    }
}