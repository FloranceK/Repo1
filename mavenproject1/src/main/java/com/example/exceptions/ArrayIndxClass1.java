package com.example.exceptions;

public class ArrayIndxClass1 {

	public void display() {
//		try {
//			int arr[] = new int[5];
//			arr[8] = 20;
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println(e);
//			System.out.println("ArrayOutOfBoundException handled");
//		}
		try {
			int arr[] = new int[5];
			arr[8] = 20;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
