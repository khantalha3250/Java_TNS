package com.talha.assignments.assignmentfive;

public abstract class TaxPayer {
    protected double salary;

    public TaxPayer(double salary) {
        this.salary = salary;
    }

    public abstract double calTax();

    public void totalTax() {
        System.out.println("The tax to be paid is: " + calTax());
    }
}