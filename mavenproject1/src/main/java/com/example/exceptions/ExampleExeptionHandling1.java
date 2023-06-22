package com.example.exceptions;

public class ExampleExeptionHandling1 {

	public static void main(String[] args) {

		try {
			int arr[] = new int[5];
			System.out.println(arr[10]);
		} catch (ArithmeticException e) {
			System.out.println(e);
			System.out.println("Arithmetic Exception handled");
		}

		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			System.out.println("Array Index Out of bound Exception handled");
		}

		System.out.println("rest of the code");

	}

}
