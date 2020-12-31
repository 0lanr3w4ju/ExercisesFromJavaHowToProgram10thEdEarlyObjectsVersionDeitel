package com.alpha.company;

public class Employee {
    /* an Employee class that includes three instance variables: a
    first name (type String), a last name (type String) and a monthly
    salary (type double). a constructor that initializes the three instance
    variables. a set and a get method for each instance variable.
    If the monthly salary is not positive, value is not set. */

    //class variables
    private String firstName;
    private String lastName;
    private double monthlySalary;

    //class constructor
    public Employee() {
        this.firstName = "defaultFirstName";
        this.lastName = "defaultLastName";
        this.monthlySalary = 0.0;
    }

    //class methods
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        if (monthlySalary > 0.0) {
            this.monthlySalary = monthlySalary;
        }
    }

}
