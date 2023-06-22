package com.example.exceptions;

public class ExampleExceptionHandling4 {

	public static void validate(int age) {
		if (age < 18) {
			throw new ArithmeticException("The person is not eligible to vote");
		} else {
			System.out.println("Person is eligible to vote");
		}

	}

	public static void main(String[] args) {
		try {
			validate(10);
		} catch (Exception e) {
			System.out.println("Exception caught here");
		}
		System.out.println("rest of the code");
	}

}
