package com.talha.assignments.assignmentfive;

public class Kaif extends TaxPayer {

    public Kaif(double salary) {
        super(salary);
    }

    public double calTax() {
        return salary * 0.2;
    }
}