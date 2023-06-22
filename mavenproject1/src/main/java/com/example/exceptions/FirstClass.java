package com.example.exceptions;

public class FirstClass {
	public void display() {
		try {
			int a = 45/0;
		}
		catch(ArithmeticException e){
			System.out.println(e);
		}
		System.out.println("Exception handled");
	}

}
