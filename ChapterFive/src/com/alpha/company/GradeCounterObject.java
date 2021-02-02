package com.alpha.company;

import java.util.Scanner;

public class GradeCounterObject {

    // author: Olanrewaju Alawode

    public static void main(String[] args) {
        GradeCounter gradeCounter = new GradeCounter();
        Scanner scan = new Scanner(System.in);

        System.out.println("enter grade: ");

        int grade;

        while (scan.hasNext()){
            try {
                grade = scan.nextInt();
            }catch (Exception error){
                System.err.println("incorrect value!");
                break;
            }

            if (grade > 0 && grade < 101){
                gradeCounter.gradeCounterMethod(grade);
            }else {
                System.out.println("incorrect value!");
            }
        }
        if (gradeCounter.gradeCounter > 0){
            gradeCounter.report();
        }
    }

}
