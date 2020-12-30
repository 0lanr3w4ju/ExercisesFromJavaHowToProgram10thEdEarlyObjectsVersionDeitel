package com.alpha.company;

import java.util.Scanner;

public class DiameterCircumferenceAndAreaOfACircle {
//    an application that inputs from the user the radius of a circle
//    as an integer and prints the circle’s diameter, circumference and area.

    //class variable
    int integer;

    //class methods
    public int diameter(int integer) {
        return 2 * integer;
    }

    public float circumference(int integer) {
        return (float) (2 * Math.PI * integer);
    }


    public float area(int integer) {
        return (float) (Math.PI * (integer * integer));
    }

    //class object
    public static void main(String[] args) {
        DiameterCircumferenceAndAreaOfACircle diameterCircumferenceAndAreaOfACircle = new DiameterCircumferenceAndAreaOfACircle();
        Scanner scan = new Scanner(System.in);

        //prompt
        System.out.print("enter integer: ");
        diameterCircumferenceAndAreaOfACircle.integer = scan.nextInt();

        //diameter output
        System.out.println("circle diameter = "+ diameterCircumferenceAndAreaOfACircle.diameter(diameterCircumferenceAndAreaOfACircle.integer));

        //circumference output
        System.out.println("circle circumference = "+ diameterCircumferenceAndAreaOfACircle.circumference(diameterCircumferenceAndAreaOfACircle.integer));

        //area output
        System.out.println("circle area = "+ diameterCircumferenceAndAreaOfACircle.area(diameterCircumferenceAndAreaOfACircle.integer));
    }

}
