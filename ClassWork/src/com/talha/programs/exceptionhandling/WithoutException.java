package com.talha.programs.exceptionhandling;

class WithoutException {
	public static void main(String args[]) {
		int d= 0;
		try {
		int a=42/d;
		String s="Talha";
		System.out.println(s);
		
		}
		catch(ArithmeticException e){
			System.out.println("Exception caught"+e);
			System.exit(0);
		}
		finally {
			System.out.println("Fklsd");
		}
		System.out.println("Will be printed");
} }
