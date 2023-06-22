package com.example.collections;

import java.util.*;

public class ArrayListEx1 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("hi");
		list.add("hello");
		list.add("java");

		System.out.println(list); // output: [hi, hello, java]

		// using Iterator

		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());

		}
		
		list.remove(0); 
		System.out.println("After removing 1st string");
		for (String string : list) {
			System.out.println(string);
		}
		
		int size = list.size();   // to get the size of ArrayList
		System.out.println(size);
		
		list.add(1, "world");
		System.out.println(list);    // output: [hello, World, java]
		
		System.out.println(list.contains("java"));
		System.out.println(list.contains("Java"));
		System.out.println("returning 2nd element: "+ list.get(1));
		System.out.println(list);
		System.out.println("Changed value: "+list.set(2, "newValue"));
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println(list);
		
	}

}
