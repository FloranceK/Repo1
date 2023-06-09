package com.mavenproject1.example;

public class ExampleInterface implements Printable{
	public void print() {
		System.out.println("Hello");
	}

	public static void main(String[] args) {
		
		ExampleInterface obj = new ExampleInterface();
		obj.print();
	}

}
