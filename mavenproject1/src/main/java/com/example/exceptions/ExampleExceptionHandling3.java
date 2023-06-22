package com.example.exceptions;

public class ExampleExceptionHandling3 {

	public static void main(String[] args) {
		try {
			int arr[] = new int[5];
//			arr[10] = 20;
			arr[5] = 30 / 0;
			System.out.println(arr[5]);
		} catch (ArithmeticException e) {
			System.out.println(e);
			System.out.println("Arithmetic exception handled");

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			System.out.println("ArrayIndex OutOfBoundsException handled");
		}
		System.out.println("rest of the code");
	}

}
