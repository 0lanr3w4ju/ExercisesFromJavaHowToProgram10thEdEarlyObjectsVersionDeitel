package com.alpha.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    public void testForSetMonthlySalary() {
        Employee employee = new Employee();
        employee.setMonthlySalary(-3);
        assertEquals(0.0, employee.getMonthlySalary());
    }

}