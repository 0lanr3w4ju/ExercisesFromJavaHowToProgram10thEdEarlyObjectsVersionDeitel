package com.alpha.company;

import java.util.Scanner;

public class AnalysisOfExaminationResultsObject {

    public static void main(String[] args) {
        AnalysisOfExaminationResults analysisOfExaminationResults = new AnalysisOfExaminationResults();
        Scanner scan = new Scanner(System.in);

        int counter = 0;

        while (counter < 10 ) {
            try {
                System.out.print("enter student result \n" +
                        "> ");
                analysisOfExaminationResults.resultInput(scan.nextInt());
                counter++;
            } catch (IllegalArgumentException error) {
                System.out.printf("exception: %s%n", error.getMessage());
            }
        }

        System.out.println("***************************");
        System.out.printf("passed: %d%nfailed: %d%n", analysisOfExaminationResults.getPass(), analysisOfExaminationResults.getFail());
        if (analysisOfExaminationResults.getPass() > 8) {
            System.out.println("(bonus to instructors!)");
        }
    }

}
