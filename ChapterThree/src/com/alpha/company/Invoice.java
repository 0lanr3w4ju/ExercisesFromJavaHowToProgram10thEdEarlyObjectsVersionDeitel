package com.alpha.company;

public class Invoice {
/*
    a class called Invoice that a hardware store might use to represent
    an invoice for an item sold at the store. Invoice include four pieces of information
    as instance variables: number (type String), description (type String),
    quantity of purchased item (type int) and price per item (double).
*/
    //class variables
    private String number;
    private String description;
    private int quantityOfPurchasedItem;
    private double pricePerItem;

    //class constructor
    public Invoice(int quantityOfPurchasedItem, double pricePerItem) {
        this.number = "null";
        this.description = "default description";
        this.quantityOfPurchasedItem = quantityOfPurchasedItem;
        this.pricePerItem = pricePerItem;
    }

    //class methods
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantityOfPurchasedItem() {
        return quantityOfPurchasedItem;
    }

    public void setQuantityOfPurchasedItem(int quantityOfPurchasedItem) {
        this.quantityOfPurchasedItem = quantityOfPurchasedItem;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public void setPricePerItem(double pricePerItem) {
        this.pricePerItem = pricePerItem;
    }

    public double getInvoiceAmount() {
        if (quantityOfPurchasedItem < 0) {
            quantityOfPurchasedItem = 0;
        }
        if (pricePerItem < 0.0) {
            pricePerItem = 0.0;
        }
        return quantityOfPurchasedItem * pricePerItem;
    }

}
