package com.example.collections;

import java.util.*;

public class LinkedListEx1 {

	public static void main(String[] args) {
//		LinkedList<Integer> obj = new LinkedList<Integer>();
		LinkedList obj = new LinkedList();
		
		obj.add(2);
		obj.add(3);
		obj.add(2);
		obj.add(5);
		obj.add(1);
		obj.add("Java");
		
		
//		Collections.sort(obj);
//		for (Integer val : obj) {
//			System.out.println(val);
//		}
		obj.addFirst("First");
		obj.addLast(2023);
		System.out.println("Index of value 5 is: " + obj.indexOf(5));
		System.out.println("Checking if it contains value: Java: " + obj.contains("Java"));
		System.out.println("Checking if it contains value: java: " + obj.contains("java"));
		System.out.println(obj.peekLast());   // get the last element
		System.out.println(obj.peekFirst());
		System.out.println(obj);
	}

}
