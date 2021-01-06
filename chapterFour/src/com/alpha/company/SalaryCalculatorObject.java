package com.alpha.company;

import javax.swing.*;

public class SalaryCalculatorObject {

    public static void main(String[] args) {
        //class variables
        String name;
        String hoursWorked;
        String hourlyRate;
        int convertedHoursWorked;
        int convertedHourlyRate;
        int calculationCounter = 0;
        double employeeGrossPay;

        //class declaration
        SalaryCalculator salaryCalculator = new SalaryCalculator();

        //prompts
        while(calculationCounter < 3) {
            name = JOptionPane.showInputDialog("enter name of employee: ");
            salaryCalculator.setEmployeeName(name);

            hoursWorked = JOptionPane.showInputDialog("enter hours worked by employee: ");
            convertedHoursWorked = Integer.parseInt(hoursWorked);
            salaryCalculator.setHoursWorked(convertedHoursWorked);

            hourlyRate = JOptionPane.showInputDialog("enter rate per hour: ");
            convertedHourlyRate = Integer.parseInt(hourlyRate);
            salaryCalculator.setHourlyRate(convertedHourlyRate);

            employeeGrossPay = salaryCalculator.employeeGrossPay();

            calculationCounter++;

            //outputs
            System.out.printf("employee name: %s%n", salaryCalculator.getEmployeeName());
            System.out.printf("hours worked: %d%n", salaryCalculator.getHoursWorked());
            System.out.printf("rate per hour: $%d%n", salaryCalculator.getHourlyRate());
            System.out.printf("employee's gross pay: $%.3f%n", employeeGrossPay);
            System.out.println("#####################################");
        }
    }

}
