package com.alpha.company;

import javax.swing.*;

public class HealthProfileObject {
/*
    an app that prompts for a person’s information, instantiates an object of
    class HealthProfile for the person and prints the information from that
    object—including the person’s first name, last name, gender, date of birth,
    height and weight—then calculates and prints the person’s age in years,
    BMI, maximum heart rate and target-heart-rate range. It should also display
    the BMI values chart
*/

public static void main(String[] args) {
    //class variables
    String firstName, lastName, gender, yearOfBirth, monthOfBirth, dayOfBirth, height, remainder, weight;
    int convertedYearOfBirth, convertedMonthOfBirth, convertedDayOfBirth, convertedHeight, convertedRemainder, convertedWeight;

    //prompts
    firstName = JOptionPane.showInputDialog("enter first name: ");
    lastName = JOptionPane.showInputDialog("enter last name: ");
    gender = JOptionPane.showInputDialog("enter gender: ");
    yearOfBirth = JOptionPane.showInputDialog("enter year of birth: ");
    convertedYearOfBirth = Integer.parseInt(yearOfBirth);
    monthOfBirth = JOptionPane.showInputDialog("enter month of birth: ");
    convertedMonthOfBirth = Integer.parseInt(monthOfBirth);
    dayOfBirth = JOptionPane.showInputDialog("enter day of birth: ");
    convertedDayOfBirth = Integer.parseInt(dayOfBirth);
    height = JOptionPane.showInputDialog("enter height: ");
    convertedHeight = Integer.parseInt(height);
    remainder = JOptionPane.showInputDialog("enter height remainder: ");
    convertedRemainder = Integer.parseInt(remainder);
    weight = JOptionPane.showInputDialog("enter weight: ");
    convertedWeight = Integer.parseInt(weight);

    //class declarations
    HealthProfile healthProfile = new HealthProfile(firstName, lastName, gender, convertedYearOfBirth, convertedMonthOfBirth, convertedDayOfBirth, convertedHeight, convertedRemainder, convertedWeight);
    HeartRates heartRates = new HeartRates(convertedYearOfBirth, convertedMonthOfBirth, convertedDayOfBirth);

    //outputs
    System.out.println("health profile \n" +
            "first name: "+ healthProfile.getFirstName() +"\n" +
            "last name: "+ healthProfile.getLastName() +"\n" +
            "gender: "+ healthProfile.getGender() +"\n" +
            "date of birth: "+ healthProfile.getDateOfBirth() +"\n" +
            "height: "+ healthProfile.getHeight() +" inch(es)" +"\n" +
            "weight: "+ healthProfile.getWeight() +" lbs" +"\n" +
            "age: "+ heartRates.calculateAgeInYears() +" year(s)" +"\n" +
            "body mass index: "+ healthProfile.bodyMassIndexCalculator(healthProfile.getWeight(), healthProfile.getHeight()) +"\n" +
            "maximum heart rate: "+ heartRates.calculateMaximumHeartRate() +"\n" +
            "target heart rate range: "+ heartRates.calculateTargetHeartRange1() +" - "+ heartRates.calculateTargetHeartRange2());

    System.out.println("########################################");

    System.out.println("""
                BMI VALUES
                Underweight: less than 18.5
                Normal:      between 18.5 and 24.9
                Overweight:  between 25 and 29.9
                Obese:       30 or greater""");
    }

}
