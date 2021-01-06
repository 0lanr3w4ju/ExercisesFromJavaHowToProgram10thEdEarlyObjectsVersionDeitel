package com.alpha.company;

public class SalaryCalculator {
/*
    Java application that determines the gross pay for each of
    three employees.
*/

    //class variables
    private String employeeName;
    private int hoursWorked;
    private int hourlyRate;

    //class methods
    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double employeeGrossPay() {
        int overTime;
        if (hoursWorked > 40) {
            overTime = hourlyRate - 40;
            return 40 * 1.5 * overTime;
        }
        return hoursWorked * hourlyRate;
    }
}
