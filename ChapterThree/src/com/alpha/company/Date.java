package com.alpha.company;

public class Date {
    /* class includes three instance variables: a month (type int), a day (type int)
    * and a year (type int). with a constructor that initializes the three instance
    * variables. a set and a get method for each instance variable. a method displayDate
    * that displays the month, day and year separated by forward slashes ( / ). */

    //class variables
    private int month;
    private int day;
    private int year;

    //class constructor
    public Date() {
        this.month = 1;
        this.day = 1;
        this.year = 2021;
    }

    //class methods
    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if ((month > 0) && (month <= 12)) {
            this.month = month;
        } else System.out.println("###invalid month!");
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if ((month == 2) && (day > 0 && day <= 28)) {
            this.day = day;
        } else if ((month == 4 || month == 6 || month == 9 || month == 11) && (day > 0 && day <= 30)) {
            this.day = day;
        } else if ((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) && (day > 0 && day <= 31)) {
            this.day = day;
        } else System.out.println("###invalid day!");
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year >= 1995) {
            this.year = year;
        } else System.out.println("###invalid year!");
    }

    public String displayDate() {
        return getMonth() +"/"+ getDay() +"/"+ getYear();
    }

}
