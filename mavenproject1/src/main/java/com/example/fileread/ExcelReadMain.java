package com.example.fileread;

import java.io.IOException;

public class ExcelReadMain {

	public static void main(String[] args) throws IOException {
		try {
			String a = ExcelRead.getStringData(1, 1);
			System.out.println(a);
		} catch (Exception e) {
			System.out.println("Error here " + e.getMessage());
		}
		try {
			String b = ExcelRead.getIntergerData(1, 1);
			System.out.println(b);
		} catch (Exception e) {
			System.out.println("Error in getting Integer data: " + e.getMessage());
		}
	}

}
