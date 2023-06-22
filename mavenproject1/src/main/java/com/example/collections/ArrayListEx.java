package com.example.collections;

import java.util.*;

public class ArrayListEx {

	public static void main(String[] args) {
		ArrayList obj = new ArrayList();
//		ArrayList<String> obj = new ArrayList<String>();  // declaring a string ArrayList
		obj.add("Florance");
		obj.add("Chinchu");
		obj.add("Tijo");
		obj.add("Nisha");
		obj.add("Chithra");
		obj.add(2);
		obj.add(3);
		
		Iterator itr = obj.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
			
		} 

	}

}
