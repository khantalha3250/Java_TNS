package com.talha.assignments.assignmentfive;

public class Aazen extends TaxPayer {

    public Aazen(double salary) {
        super(salary);
    }

    public double calTax() {
        if (salary <= 50000) {
            return salary * 0.05;
        } else {
            return salary * 0.10;
        }
    }
}