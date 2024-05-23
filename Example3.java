package com.javaTernaryOperators;

public class Example3 {

	public static void main(String[] args) {
		
		
		/**
		 * Ternary operator: ?:
		 */
		
		int studentMarks = 30;//out of 100
		
		/*
		 * boolean condition = (studentMarks >= 40);
		 * 
		 * String pass = "Student is Pass"; String fail = "Student is failed";
		 * 
		 * 
		 * 
		 * System.out.println(condition ? pass : fail);
		 */
		
		if(studentMarks >= 40)
		{
			System.out.println("Student is Pass");
		}
		else
		{
			System.out.println("Student is failed");
		}
		
	}

}
