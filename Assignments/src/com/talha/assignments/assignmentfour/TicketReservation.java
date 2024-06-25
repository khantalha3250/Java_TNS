package com.talha.assignments.assignmentfour;

import java.util.Scanner;

public class TicketReservation {
	static int numOfTicktes=100;
	String name;
	int age;
	Scanner sc = new Scanner(System.in);
	
	public static int calcTickets() {
		return numOfTicktes--;
	}
	
	public void acceptDetails() {
		System.out.println("Enter your name:");
		name=sc.nextLine();
		System.out.println("Enter your age:");
		age =sc.nextInt();
		sc.nextLine();
	}
	
	@Override
	public String toString() {
		return "Ticket reserved for:\nName:"+name+"\nAge:"+age;
	}
	
	
}
