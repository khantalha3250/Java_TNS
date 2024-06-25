package com.talha.assignments.assginmenttwo;

import java.util.Scanner;

public class Commission {
	//Data Members.
	String name, address, phone;
	int salesAmount,commission;
	
	//Create a scanner class object.
	Scanner sc  = new Scanner(System.in);
	//Method to accept the details.
	public void acceptDetails() {
		System.out.println("Enter your name:");
		name=sc.nextLine();
		System.out.println("Enter your address:");
		address=sc.nextLine();
		System.out.println("Enter your phone number");
		phone=sc.nextLine();
		System.out.println("Enter your sales amount:");
		salesAmount=sc.nextInt();
	}
	public void displayDetails() {
		System.out.println("Name:"+name+"\n"+"Address:"+address+"\n"+"Phone Number:"+phone);
	}
	
	//Calculate the commission.
	public void calculateCommission() {
		if (salesAmount>=100000)
			commission= salesAmount*10/100;
		else if(salesAmount>=50000)
			commission= salesAmount*5/100;
		else if(salesAmount>=30000)
			commission= salesAmount*3/100;
		else
			commission=0;
		System.out.println("The total commision on you sales amount is:"+commission);
	}
	
	//Main methods.
	public static void main(String[] args) {
		Student obj=new Student();
		Commission object=new Commission();
		object.acceptDetails();
		object.calculateCommission();
	}
}
