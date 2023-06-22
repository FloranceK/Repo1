package com.example.collections;

import java.util.*;

public class LinkedlistEx2 {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add("Hi");
		list.add(2023);
		list.add("Florance");
		list.add(20);
		list.add("Chinchu");

		System.out.println(list);

		list.addFirst("First");
		System.out.println(list);
		
		list.addLast(100);
		System.out.println(list);
		
		System.out.println("Index of Florance: "+ list.indexOf("Florance"));
		System.out.println("Checking 2023 value : "+ list.contains(2023));
		System.out.println(list.peekLast()); // print last element
		System.out.println(list.peekFirst()); // get first element
		System.out.println(list.pollFirst()); // show first element and delete
		System.out.println(list);
		System.out.println(list.pollLast()); // show last element and delete
		System.out.println(list);
	}

}
