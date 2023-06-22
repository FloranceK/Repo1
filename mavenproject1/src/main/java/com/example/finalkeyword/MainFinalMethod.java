package com.example.finalkeyword;

public class MainFinalMethod extends SampleFinalMethod{
	// can not change method as same parent class method declared as final
//	void show() {
//		System.out.println("Child method of final main method");
//	}

	public static void main(String[] args) {
		MainFinalMethod obj = new MainFinalMethod();
		obj.show();
	}

}
