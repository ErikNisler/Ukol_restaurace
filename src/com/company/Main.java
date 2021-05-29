package com.company;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        OrderList orderlist = new OrderList();

        orderlist.addOrder(new Order(2, LocalDate.of(2021, 5, 26), Payment.CARD));
        orderlist.addOrder(new Order(1, LocalDate.of(2021, 5, 25), Payment.CASH));
        orderlist.getOrder(0).addItem(new Item("Hranolky", 3, 2));
        orderlist.getOrder(0).addItem(new Item("Burger", 5, 3));
        orderlist.getOrder(1).addItem(new Item("Hranolky", 124.9, 10));
        orderlist.getOrder(1).addItem(new Item("Sushi", 229.9, 3));

        /**1. Ukažte počet objednávek*/
        System.out.println("Počet objednávek: " + orderlist.sizeOfList());

        /**2. Připravte metodu pro výpočet celkové ceny objednávky.*/
        System.out.println("Cena objednávky stolu: " + orderlist.getOrder(0).getNumOfTable() + ", je: " + orderlist.getOrder(0).getPriceOfOrder());
        System.out.println("Cena objednávky stolu: " + orderlist.getOrder(1).getNumOfTable() + ", je: " + orderlist.getOrder(1).getPriceOfOrder());

        /**3. Na základě názvu položky spočítejte celkový počet kusů dané položky, které jsme prodali.*/
        /**Příklad - Hranolky - 5 ks*/

        System.out.println("Jednotlivé položky: "+orderlist.amountOfItems());

        /**4. Spočítejte celkový obrat (turnover) ze všech objednávek za jednotlivé dny.*/
        System.out.println("Turnover: "+orderlist.turnover().toString());

        /**Připravte metodu, která získá výpis všech názvů položek, které byly objednány. Pokud byla položka objednána vícekrát,
         *ve výpisu bude jen jednou. Položky ve výpisu budou seřazené podle abecedy.*/
        System.out.println(orderlist.getAllItems());

    }
}
