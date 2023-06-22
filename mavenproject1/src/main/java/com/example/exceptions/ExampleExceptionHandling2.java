package com.example.exceptions;

public class ExampleExceptionHandling2 {

	public static void main(String[] args) {
		try {
			int a = 5 / 0;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			System.out.println("ArrayIndex OutOfBoundsException handled");
		} catch (ArithmeticException e) {
			System.out.println(e);
			System.out.println("Arithmetic Exception handled");
		}
		System.out.println("rest of the code");
	}

}
