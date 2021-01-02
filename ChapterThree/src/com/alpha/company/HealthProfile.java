package com.alpha.company;

import java.time.LocalDate;

public class HealthProfile {
/*
    class attributes include the person’s first name, last name,
    gender, date of birth (consisting of separate attributes for
    the month, day and year of birth), height (in inches) and weight
    (in pounds). class has a constructor that receives this data. each
    attribute, has a set and get methods. The class also include methods
    that calculate and return the user’s age in years, maximum heart rate
    and target-heart-rate range, and body mass index.
*/

    //class variables
    private String firstName;
    private String lastName;
    private String gender;
    private LocalDate dateOfBirth;
    private int height;
    private double weight;

    //class constructor
    public HealthProfile(String firstName, String lastName, String gender, int yearOfBirth, int monthOfBirth, int dayOfBirth, int height, int heightRemainder, int weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.dateOfBirth = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
        this.height = (height * 12) + heightRemainder;
        this.weight = weight * 2.205;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(int yearOfBirth, int monthOfBirth, int dayOfBirth) {
        this.dateOfBirth = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height, int heightRemainder) {
        this.height = (height * 12) + heightRemainder;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight * 2.205;
    }

    public double bodyMassIndexCalculator(double weight, int height) {
        return (weight * 703) / (height * height);
    }

}
