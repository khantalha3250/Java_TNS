package com.talha.assignments.assignmentfive;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Kaif's salary: ");
        double kaifSalary = scanner.nextDouble();
        TaxPayer kaif = new Kaif(kaifSalary);
        
        System.out.print("Enter Aazen's salary: ");
        double aazenSalary = scanner.nextDouble();
        TaxPayer aazen = new Aazen(aazenSalary);

        System.out.println("Payable tax for Kaif:");
        kaif.totalTax();

        System.out.println("Payable tax for Aazen:");
        aazen.totalTax();

        scanner.close();
    }
}