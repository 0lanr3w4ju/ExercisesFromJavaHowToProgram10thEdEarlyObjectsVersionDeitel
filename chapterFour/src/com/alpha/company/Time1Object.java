package com.alpha.company;

import java.util.Scanner;

public class Time1Object {

    public static void main(String[] args) {
        Time1 time1 = new Time1();
        Scanner scan = new Scanner(System.in);

        displayMessage("default time", time1);

        System.out.println("-----------------");

        System.out.print("hour: ");
        int setHour = scan.nextInt();

        System.out.print("mins: ");
        int setMins = scan.nextInt();

        System.out.print("secs: ");
        int setSecs = scan.nextInt();

        time1.setTime(setHour, setMins, setSecs);

        System.out.println("-----------------");

        displayMessage("time after using set method", time1);

        System.out.println("-----------------");

        try {
            time1.setTime(setHour, setMins, setSecs);
        } catch (IllegalArgumentException error) {
            System.out.printf("exception: %s%n", error.getMessage());
        }

        System.out.println("-----------------");

        displayMessage("time after passing invalid range numbers", time1);
    }

    private static void displayMessage(String headerMessage, Time1 time) {
        System.out.printf("%s%n universalTimeFormat: %s%n standardTimeFormat: %s%n", headerMessage, time.universalTimeString(), time.standardTimeFormat());
    }

}
