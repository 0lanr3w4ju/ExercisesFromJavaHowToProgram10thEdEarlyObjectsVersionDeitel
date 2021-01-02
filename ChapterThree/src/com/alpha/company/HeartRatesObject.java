package com.alpha.company;

import javax.swing.*;

public class HeartRatesObject {
    /*
        a Java app that prompts for a person’s information, instantiates an object of
        class HeartRates and prints the information from that object—including the person’s
        first name, last name and date of birth—then calculates and prints the person’s age
        in (years), maximum heart rate and target-heart-rate range.
*/

    public static void main(String[] args) {
        //class variables
        String firstName;
        String lastName;
        String yearOfBirth;
        String monthOfBirth;
        String dayOfBirth;
        int convertedYearOfBirth, convertedMonthOfBirth, convertedDayOfBirth;

        //prompts
        firstName = JOptionPane.showInputDialog("enter first name: ");
        lastName = JOptionPane.showInputDialog("enter last name: ");
        yearOfBirth = JOptionPane.showInputDialog("enter year of birth: ");
        convertedYearOfBirth = Integer.parseInt(yearOfBirth);
        monthOfBirth = JOptionPane.showInputDialog("enter month of birth: ");
        convertedMonthOfBirth = Integer.parseInt(monthOfBirth);
        dayOfBirth = JOptionPane.showInputDialog("enter day of birth: ");
        convertedDayOfBirth = Integer.parseInt(dayOfBirth);

        //class declaration
        HeartRates heartRates = new HeartRates(firstName, lastName, convertedYearOfBirth, convertedMonthOfBirth, convertedDayOfBirth);

        //output
        JOptionPane.showMessageDialog(null, "first name: "+ heartRates.getFirstName() +"\n" +
                "last name: "+ heartRates.getLastName() +"\n" +
                "date of birth: "+ heartRates.getDateOfBirth() +"\n" +
                "age: "+ heartRates.calculateAgeInYears() +" year(s)\n" +
                "maximum heart rate(mhi): "+ heartRates.calculateMaximumHeartRate() +"\n" +
                "target heart rate range: "+ heartRates.calculateTargetHeartRange1() +" - "+ heartRates.calculateTargetHeartRange2());
    }

}
