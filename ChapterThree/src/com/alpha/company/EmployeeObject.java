package com.alpha.company;

public class EmployeeObject {

    public static void main(String[] args) {
        //class variables
        double yearlySalary1;
        double yearlySalary2;
        double yearlySalary1AfterRaise;
        double yearlySalary2AfterRaise;

        //class declaration
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();

        //employee1 yearly salary
        employee1.setFirstName("olanrewaju");
        employee1.setLastName("alawode");
        employee1.setMonthlySalary(500_000);
        yearlySalary1 = employee1.getMonthlySalary() * 12;
        System.out.printf("%s %s yearly salary: $%.2f%n", employee1.getFirstName(), employee1.getLastName(), yearlySalary1);

        //employee2 yearly salary
        employee2.setFirstName("samuel");
        employee2.setLastName("emmanuel");
        employee2.setMonthlySalary(200_000);
        yearlySalary2 = employee2.getMonthlySalary() * 12;
        System.out.printf("%s %s yearly salary: $%.2f%n", employee2.getFirstName(), employee2.getLastName(), yearlySalary2);

        System.out.println("######################################################");

        //employee1 yearly salary after 10% raise
        yearlySalary1AfterRaise = (((employee1.getMonthlySalary() * 0.1) + employee1.getMonthlySalary()) * 12);
        System.out.printf("%s %s yearly salary after raise: $%.2f%n", employee1.getFirstName(), employee1.getLastName(), yearlySalary1AfterRaise);

        //employee2 yearly salary after 10% raise
        yearlySalary2AfterRaise = (((employee2.getMonthlySalary() * 0.1) + employee2.getMonthlySalary()) * 12);
        System.out.printf("%s %s yearly salary after raise: $%.2f%n", employee2.getFirstName(), employee2.getLastName(), yearlySalary2AfterRaise);
    }

}
