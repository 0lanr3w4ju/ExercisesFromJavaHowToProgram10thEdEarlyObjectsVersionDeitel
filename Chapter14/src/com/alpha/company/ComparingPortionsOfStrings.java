package com.alpha.company;

import java.util.Scanner;

public class ComparingPortionsOfStrings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstStringValue, secondStringValue;
        System.out.print("Enter First String Value: ");
        firstStringValue = scan.nextLine();
        System.out.print("Enter Second String Value: ");
        secondStringValue = scan.nextLine();
        boolean report = firstStringValue.regionMatches(true, 0, secondStringValue, 0, 5);
        System.out.printf("equal? %s", report);
    }
}
