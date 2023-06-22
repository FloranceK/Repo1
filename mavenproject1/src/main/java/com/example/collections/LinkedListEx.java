package com.example.collections;

import java.util.*;

public class LinkedListEx {

	public static void main(String[] args) {
		LinkedList<String> obj = new LinkedList<String>();
		obj.add("Florance");
		obj.add("Chinchu");
		obj.add("Tijo");
		obj.add("Nisha");
		obj.add("Chithra");
		
		
		
//		obj.add(2);
//		obj.add(3);
		
//		System.out.println(obj);
		
		/*   Using Iterator  */
//		Iterator it = obj.iterator();
//
//		while (it.hasNext()) {
//			System.out.println(it.next());
//
//		}
		
		System.out.println("Returning element "+ obj.get(0));
		obj.set(1, "NewValue");
		System.out.println("Value at 1 position: "+ obj.get(1));
		
//		Using foreach
		for (String str : obj) {
			System.out.println(str);
		}
	}

}
