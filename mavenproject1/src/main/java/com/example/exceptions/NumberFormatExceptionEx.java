package com.example.exceptions;

public class NumberFormatExceptionEx {
	public void display() {
		
		try {
			String str = "hello";
			int num = Integer.parseInt(str);
		} 
		catch(NumberFormatException e) {
			System.out.println(e);
			System.out.println("Number format exception handled.");
	}
	}

	public static void main(String[] args) {
		NumberFormatExceptionEx obj = new NumberFormatExceptionEx();
		obj.display();
	}

}
