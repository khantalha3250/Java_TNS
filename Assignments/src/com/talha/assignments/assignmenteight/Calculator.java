// Calculator.java
package com.talha.assignments.assignmenteight;

//Program to implement nested try-catch.

import java.util.Scanner;

public class Calculator {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     try {
         System.out.println("Enter the numerator:");
         int numerator = Integer.parseInt(scanner.nextLine());

         System.out.println("Enter the denominator:");
         int denominator = Integer.parseInt(scanner.nextLine());

         try {
             // Inner try block for division
             int result = divide(numerator, denominator);
             System.out.println("Result: " + result);
         } catch (ArithmeticException e) {
             // Handle division by zero
             System.err.println("Error: Cannot divide by zero.");
         }
     } catch (NumberFormatException e) {
         // Handle invalid number format
         System.err.println("Error: Invalid input. Please enter valid integers.");
     } finally {
         // Ensure scanner is closed
         scanner.close();
         System.out.println("Scanner closed.");
     }
 }

 // Method to perform division
 public static int divide(int numerator, int denominator) {
     return numerator / denominator; // May throw ArithmeticException
 }
}

