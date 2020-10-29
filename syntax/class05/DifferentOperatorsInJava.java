package com.syntax.class05;

import java.util.Scanner;

public class DifferentOperatorsInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// asignment operator (=)
		// arithmetic operators(*,+,-,/)
		// relational (<,><=,>=,==,!=)
		// logical (&&=and, or=||)
		//! means to reverse conditions
		Scanner data = new Scanner(System.in);

		//System.out.println("Please enter any number");
		

		/*
		 * if (num > 0 && num <= 10) { System.out.println("Number is small"); } else if
		 * (num >= 11 && num <= 100) { System.out.println("Number is a medium number");
		 * } else if (num >= 101 && num <= 1000) {
		 * System.out.println("Number is large"); }
		 */
		/*String day="Saturday";
		if (day.equals("Saturday")|| day.equals("Sunday")) {
			System.out.println("I have java class");*/
		System.out.println("Please enter day using numbers only");
		int num = data.nextInt();
		if (num==1 || num==5) {
			System.out.println("im off");
		}else if(num==2 || num==3) {
			System.out.println("I have GIT classes");
		}else if (num==4) {
			System.out.println("I have review class");
		}else if(num==6 || num==7) {
			System.out.println("I have java class");
		}else {
			System.out.println("Invalid entry, please enter numbers 1-7");
		}
		//&& both conditions must be true to execute
		//|| only one condition must be true to execute
		
		//everything is about storing into variable and perform manipulation
	}
	

}
