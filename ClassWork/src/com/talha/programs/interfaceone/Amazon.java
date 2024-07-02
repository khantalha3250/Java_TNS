package com.talha.programs.interfaceone;

public interface Amazon {
	void welcome();
	void thankyou();
	
	default void serviceCharges() {
		int amt=100;
		System.out.println("The service charge is"+amt);
	}
	static void aboutUs() {
		System.out.println("Its a ecommerse website");
	}
}
