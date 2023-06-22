package com.example.finalkeyword;

public class Sample {
	final int a = 20;
	void display() {
//		a = 25;
		System.out.println(a);
	}

	public static void main(String[] args) {
		
		Sample obj = new Sample();
		obj.display();
		
	}

}
