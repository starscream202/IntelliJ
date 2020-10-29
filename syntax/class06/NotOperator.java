package com.syntax.class06;

public class NotOperator {
	public static void main(String[] args) {
		
		/*
		 * boolean b=true; //! is a not operator, it will reverse situation boolean
		 * isCold=false; if(!isCold) { System.out.println("i am going to the beach"); }
		 * System.out.println(!isCold);
		 */
		boolean isJava=false;
		if(!isJava) {
			System.out.println("Please try to spend more time with Java.");
		}
		
		String day="Saturday";
		if(!(day.equals("Sunday") || day.equals("Saturday"))){ 
			System.out.println("I have to work");
			
		}
	}
}
