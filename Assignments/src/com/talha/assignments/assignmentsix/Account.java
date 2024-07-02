package com.talha.assignments.assignmentsix;

import java.util.HashMap;
import java.util.Scanner;

public abstract class Account {
	private String accountNo;
	private String password;
	private String accountType;
	
	public Account(String accountNo, String password, String accountType) {
		super();
		this.accountNo = accountNo;
		this.password = password;
		this.accountType = accountType;
	}
	
	HashMap<String, UserDetail> accounts = new HashMap<>();
	Scanner sc = new Scanner(System.in);
	
	accounts.put("User1",UserDetail("Alax","Jam","12345678","987654321","saving",5000));
	public void acceptCredentials() {
		System.out.println("Enter your account Number:");
		this.accountNo=sc.nextLine();
		System.out.println("Enter your Password ");
		this.password=sc.nextLine();
		System.out.println("Please Enter the account type:Saving or Checking");
		this.accountType=sc.nextLine();
	}
	
	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public abstract void deposit();
	public abstract void withdraw();
	public abstract void getBalance();
	
}
