package com.example.exceptions;

public class ExampleExceptionHandling {

	public static void main(String[] args) {
		try {
			int a= 10/0;
			System.out.println("rest of the code");
		} catch (ArithmeticException e) {
			System.out.println(e);
			System.out.println("Arithmetic Exception handled");
		}

}
}