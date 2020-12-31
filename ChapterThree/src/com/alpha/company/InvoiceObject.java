package com.alpha.company;

public class InvoiceObject {

    public static void main(String[] args) {
        //class declaration
        Invoice invoice = new Invoice(8, 200);

        //outputs
        invoice.setNumber("22");
        System.out.printf("item number: %s%n", invoice.getNumber());

        invoice.setDescription("grey samsung wireless speaker");
        System.out.printf("item description: %s%n", invoice.getDescription());

        invoice.setQuantityOfPurchasedItem(2);
        System.out.printf("item quantity: %d%n", invoice.getQuantityOfPurchasedItem());

        invoice.setPricePerItem(700);
        System.out.printf("price per item: $%.2f%n", invoice.getPricePerItem());

        System.out.printf("invoice amount: $%.2f", invoice.getInvoiceAmount());
    }

}
