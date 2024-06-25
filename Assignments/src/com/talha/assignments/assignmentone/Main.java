package com.talha.assignments.assignmentone;

import com.talha.assignments.assignmentone.employees.Developer;
import com.talha.assignments.assignmentone.employees.Manager;
import com.talha.assignments.assignmentone.utilities.EmployeeUtilities;

public class Main {
    public static void main(String[] args) {
        // Create Manager and Developer instances
        Manager manager = new Manager();
        Developer developer = new Developer();
        manager.setName("Talha");
        manager.setDepartment("IT");
        manager.setSalary(32000);
        manager.setEmployeeid("M#10OUM");
        
        developer.setName("Alex");
        developer.setSalary(44000);
        developer.setEmployeeid("M#23MUM");
        developer.setProgrammingLanguage("JAVA");

        // Display details using EmployeeUtilities
        System.out.println("Manager Details:");
        EmployeeUtilities.displayEmployeeDetails(manager);
        System.out.println("\nDeveloper Details:");
        EmployeeUtilities.displayEmployeeDetails(developer);

        // Increase salary
        System.out.println("\nIncreasing salaries...");
        EmployeeUtilities.increaseSalary(manager, 10);  // 10% increase
        EmployeeUtilities.increaseSalary(developer, 15);  // 15% increase

        // Display updated details
        System.out.println("\nUpdated Manager Details:");
        EmployeeUtilities.displayEmployeeDetails(manager);
        System.out.println("\nUpdated Developer Details:");
        EmployeeUtilities.displayEmployeeDetails(developer);
    }
}
