package com.talha.programs.interfaceone;

public class Main {
public static void main(String[] args) {
	Amazon ob=new PrimeAccount();
	Amazon obtwo=new NonPrimeAccount();
	Amazon.aboutUs();
	ob.welcome();
	ob.thankyou();
	obtwo.welcome();
	obtwo.thankyou();
	obtwo.serviceCharges();
}
}
