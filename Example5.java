package com.javaTernaryOperators;

public class Example5 {

	public static void main(String[] args) {
		
		
		int a = 36, b = 67, c = 29, d = 54;
		
		//int result = (a > b ? (a > c ? a : c) : (b > c ? b : c));
		int result = (a<b)?(a<c)?(a<d)?a:d:(c<d)?c:d:(b<c)?(b<d)?b:d:(c<d)?c:d;
		
		
		System.out.println(result);
		
	}

}
