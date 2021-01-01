package com.alpha.company;

import java.util.Scanner;

public class DateObject {
    /* hello! the year begins from 1995, because no one has been able
    * to say for sure when anyone started keeping count of the years.
    * so if you enter a year lower than 1995, it would throw an error
    * and use the default year set. */

    public static void main(String[] args) {
        //class declarations
        Date date = new Date();
        Scanner scan = new Scanner(System.in);

        //prompts
        System.out.print("enter month: ");
        date.setMonth(scan.nextInt());

        System.out.print("enter day: ");
        date.setDay(scan.nextInt());

        System.out.print("enter year: ");
        date.setYear(scan.nextInt());

        //class outputs
        System.out.println("#################################");
        System.out.println("date:\n" +
                ""+ date.displayDate() +"\n" +
                "month/day/year");
    }

}
