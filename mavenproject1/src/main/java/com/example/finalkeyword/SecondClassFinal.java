package com.example.finalkeyword;

public class SecondClassFinal extends FirstclassFinal{
	
	void displayFromChild() {
		System.out.println("Child class");
	}
	public static void main(String[] args) {
		
		SecondClassFinal obj = new SecondClassFinal();
		obj.displayFromChild();
		obj.display();
	}

}
