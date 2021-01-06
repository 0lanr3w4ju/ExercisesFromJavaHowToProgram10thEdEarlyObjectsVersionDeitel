package com.alpha.company;

import javax.swing.*;

public class sentinel {

    public static void main(String[] args) {
        int gradeCounter = 0;
        String grade;
        int convertedGrade;
        int gradeTotal = 0;
        double averageOfTotal;

        grade = JOptionPane.showInputDialog("enter grade:");
        convertedGrade = Integer.parseInt(grade);

        while (convertedGrade != -1) {
            gradeTotal += convertedGrade;
            gradeCounter++;

            grade = JOptionPane.showInputDialog("enter grade:");
            convertedGrade = Integer.parseInt(grade);
        }

        averageOfTotal = (double) gradeTotal / gradeCounter;

        if (gradeTotal > 0) {
            System.out.println("total of "+ gradeCounter +" grade(s) = "+ gradeTotal);
            System.out.printf("class grade average = %.2f%n", averageOfTotal);
        }
    }

}
