package com.example.exceptions;

public class NullPointerClass1 {
	public void display() {
		try {
			String str = null;
			System.out.println(str.length());
		} catch (NullPointerException e) {
			System.out.println(e);
			System.out.println("Null Pointer Exceptrion handled");
			
		}
		
	}
	public static void main(String[] args) {
		NullPointerClass1 obj = new NullPointerClass1();
		obj.display();
	}

}
