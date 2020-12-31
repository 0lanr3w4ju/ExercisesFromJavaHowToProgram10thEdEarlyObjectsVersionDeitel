package com.alpha.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceTest {

    @Test
    public void testForGetInvoiceAmount() {
        Invoice invoice = new Invoice(8, 200);
        assertEquals(1600, invoice.getInvoiceAmount());
    }

}