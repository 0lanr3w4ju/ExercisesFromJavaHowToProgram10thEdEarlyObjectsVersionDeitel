package com.alpha.company;

public class EmployeeObj {
    public static void main(String[] args) {
        Date birthDate = new Date(7, 24, 1949);
        Date hireDate = new Date(3, 12, 1988);
        Employee employee = new Employee("Bob", "Manuel", birthDate, hireDate);

        System.out.println(employee);
    }
}