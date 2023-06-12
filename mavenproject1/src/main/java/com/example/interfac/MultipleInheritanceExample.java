package com.example.interfac;

public class MultipleInheritanceExample {
	public void print() {
		System.out.println("Hello");
	}
	public void show() {
		System.out.println("Welcome");
	}
	public static void main(String[] args) {
		
		MultipleInheritanceExample obj = new MultipleInheritanceExample();
		obj.print();
		obj.show();
	}

}
