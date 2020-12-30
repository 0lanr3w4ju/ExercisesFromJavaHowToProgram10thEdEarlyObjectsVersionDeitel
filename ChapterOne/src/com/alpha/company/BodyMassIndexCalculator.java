package com.alpha.company;

import java.util.Scanner;

public class BodyMassIndexCalculator {
//    a BMI calculator that reads the user’s weight in pounds and height in inches
//    then calculates and displays the user’s body mass index.
//    Also, display the following information from the Department of Health and
//    Human Services/National Institutes of Health so the user can evaluate his/her BMI:

//    BMI VALUES
//    Underweight: less than 18.5
//    Normal:      between 18.5 and 24.9
//    Overweight:  between 25 and 29.9
//    Obese:       30 or greater

    //class variables
    double convertedWeight;
    int convertedHeight;
    double bodyMassIndex;
    int height;
    int remainder;

    //class methods
    public double weightInPounds(int weight) {
        convertedWeight = weight * 2.205;
        return convertedWeight;
    }

    public int heightInInches(int height, int remainder) {
        convertedHeight = (height * 12) + remainder;
        return convertedHeight;
    }

    public double bodyMassIndexCalculator(double convertedWeight, int convertedHeight) {
        bodyMassIndex = (convertedWeight * 703) / (convertedHeight * convertedHeight);
        return bodyMassIndex;
    }


    //class object
    public static void main(String[] args) {
        BodyMassIndexCalculator bodyMassIndexCalculator = new BodyMassIndexCalculator();
        Scanner scan = new Scanner(System.in);

        //prompts
        System.out.print("enter weight: ");
        bodyMassIndexCalculator.weightInPounds(scan.nextInt());

        System.out.print("enter height: ");
        bodyMassIndexCalculator.height = scan.nextInt();
        System.out.print("enter height remainder: ");
        bodyMassIndexCalculator.remainder = scan.nextInt();
        bodyMassIndexCalculator.heightInInches(bodyMassIndexCalculator.height, bodyMassIndexCalculator.remainder);

        //output
        System.out.println("body mass index (BMI) = "+ bodyMassIndexCalculator.bodyMassIndexCalculator(bodyMassIndexCalculator.convertedWeight, bodyMassIndexCalculator.convertedHeight));
        System.out.println("########################################");
        System.out.println("""
                BMI VALUES
                Underweight: less than 18.5
                Normal:      between 18.5 and 24.9
                Overweight:  between 25 and 29.9
                Obese:       30 or greater""");
    }

}
