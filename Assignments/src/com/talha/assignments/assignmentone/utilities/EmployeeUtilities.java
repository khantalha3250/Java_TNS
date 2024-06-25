package com.talha.assignments.assignmentone.utilities;

import com.talha.assignments.assignmentone.employees.Employee;

/**
 * Provides utility methods for employee operations.
 */
public class EmployeeUtilities {

    /**
     * Displays the details of an employee.
     */
    public static void displayEmployeeDetails(Employee employee) {
        System.out.println("Name: " + employee.getName());
        System.out.println("Employee ID: " + employee.getEmployeeid());
        System.out.println("Salary: " + employee.getSalary());
    }

//    Increases the salary of an employee by a given percentage.
     
    public static void increaseSalary(Employee employee, double percentage) {
        double newSalary = employee.getSalary() * (1 + percentage / 100);
        employee.setSalary(newSalary);
    }
}
