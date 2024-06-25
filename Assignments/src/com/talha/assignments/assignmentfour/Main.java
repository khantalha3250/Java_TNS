package com.talha.assignments.assignmentfour;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
	TicketReservation obj=new TicketReservation();
	Scanner sc = new Scanner(System.in);
	while (true) {
	    System.out.println("Total tickets available is:" + TicketReservation.numOfTicktes + "\nTo book ticket enter the below details:");
	    obj.acceptDetails();
	    System.out.println(obj);
	    TicketReservation.calcTickets();	    System.out.println("Do you want to book more tickets? Enter Yes or No");
	    String answer = sc.nextLine().toLowerCase();

	    if (answer.equals("yes")) {
	        continue;
	    } else if (answer.equals("no")) {
	        break;
	    } else {
	        while (!answer.equals("yes") && !answer.equals("no")) {
	            System.out.println("Please give the correct input (Yes or No)");
	            answer = sc.nextLine().toLowerCase();
	        }
	        if (answer.equals("yes")) {
	            continue;
	        } else {
	            break;
	        }
	    }
	}
}
}
