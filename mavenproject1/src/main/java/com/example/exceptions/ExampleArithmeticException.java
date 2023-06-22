package com.example.exceptions;

public class ExampleArithmeticException {

	public static void main(String[] args) {
		
		try {
			int num = 21/0;
		} catch (ArithmeticException e) {
			System.out.println(e);
			System.out.println("Arithmetic Exception handled");
		}
	}

}
