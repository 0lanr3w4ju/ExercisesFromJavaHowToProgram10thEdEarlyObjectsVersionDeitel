package com.alpha.company;

import java.time.LocalDate;
import java.time.Period;

public class HeartRates {
    /*
        a class called HeartRates. The class attributes include person’s first name,
        last name and date of birth (consisting of separate attributes for the month,
        day and year of birth). class have a constructor that receives this data as
        parameters. each attribute has set and get method. The class also includes a
        method that calculates and returns a person’s age (in years), a method that
        calculates and returns a person’s maximum heart rate and a method that calculates
        and returns a person’s target heart rate.
*/

    //class variables
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;

    //variables for dateOfBirth variable
    private int yearOfBirth;
    private int monthOfBirth;
    private int dayOfBirth;

    //class constructor
    public HeartRates(String firstName, String lastName, int yearOfBirth, int monthOfBirth, int dayOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
    }

    //class methods
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(int yearOfBirth, int monthOfBirth, int dayOfBirth) {
        this.dateOfBirth = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
    }

    public int calculateAgeInYears() {
        Period period = Period.between(dateOfBirth, LocalDate.now());
        return period.getYears();
    }

    public int calculateMaximumHeartRate() {
        return 220 - calculateAgeInYears();
    }

    public double calculateTargetHeartRange1() {
        return 0.5 * calculateMaximumHeartRate();
    }

    public double calculateTargetHeartRange2() {
        return 0.85 * calculateMaximumHeartRate();
    }

}
