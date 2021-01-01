package com.alpha.company;

public class DateObject {
    /* hello! the year begins from 1995, because no one has been able
    * to say for sure when anyone started keeping count of the years.
    * so if you enter a year lower than 1995, it would throw an error
    * and use the default year set. */

    public static void main(String[] args) {
        //class declaration
        Date date = new Date();

        //method call
        date.setMonth(12);
        date.setDay(31);
        date.setYear(1995);

        //class outputs
        System.out.println("date:\n" +
                ""+ date.displayDate() +"\n" +
                "month/day/year");
    }

}
