package com.mavenproject1.example;

public class TestInterface {

	public static void main(String[] args) {
		Drawable obj = new Circle();

		obj.draw();

//		Circle obj1 = new Circle();
//		obj1.draw();
		Drawable obj2 = new Rectangle();
		obj2.draw();
	}

}
