package com.javaTernaryOperators;

public class Example4 {

	public static void main(String[] args) {
		
		
		int a = 400, b = 300, c = 600;
		
		int result = (a > b ? (a > c ? a : c) : (b > c ? b : c));
		
		System.out.println(result);
		
	}

}
