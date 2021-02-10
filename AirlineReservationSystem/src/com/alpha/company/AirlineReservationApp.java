package com.alpha.company;
import java.util.HashMap;

public class AirlineReservationApp {

    public final Object[][] seating_chart = new Object[10][4];

    HashMap<String, Object> passenger = new HashMap<>();

    public void welcome() {
        System.out.print("___welcome to TRAFFIC TRAVELS!___\n" +
                "__what would you like to do__ ?");

        System.out.println();

        System.out.print
                ("""
                    1 : add a passenger on onboard
                    2 : request passengers name
                    3 : display available seats
                    4 : choose seat
                    5 : add passenger to the waiting list
                    
                    > """);

    }

    public void add_passenger_detail(String key, Object value) {
        passenger.put(key, value);
    }
}
