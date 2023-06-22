package com.mavenproject1.example;

public class TestInterface {
	
	static int side = 5;

	public static void main(String[] args) {
		Drawable obj = new Circle();

		obj.draw();

//		Circle obj1 = new Circle();
//		obj1.draw();
		Drawable obj2 = new Rectangle();
		obj2.draw();
		
		Circle circle = new Circle();
		printArea(circle);
		printArea(new Rectangle());
	}

	private static void printArea(Drawable drawable) {
		drawable.area(side);
		drawable.draw();
	}

}
