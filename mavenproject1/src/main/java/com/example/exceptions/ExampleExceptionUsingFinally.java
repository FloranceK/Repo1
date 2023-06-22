package com.example.exceptions;

public class ExampleExceptionUsingFinally {

	public static void main(String[] args) {

		try {
			int a = 25 / 5;
			System.out.println(a);
		} catch (NullPointerException e) {
			System.out.println(e);

		} finally {
			System.out.println("Finally block executed");
		}
		System.out.println("rest of the code");

	}

}
