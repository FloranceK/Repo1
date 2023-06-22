package com.example.encapsulation;

public class Employee {

	public static void main(String[] args) {
		FirstClass obj = new FirstClass();
		obj.setName("Mark");
		obj.setSalary(10000);
		System.out.println("Name is : "+ obj.getName());
		System.out.println("Salary is: "+ obj.getSalary());
	}

}
