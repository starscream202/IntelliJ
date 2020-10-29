package com.syntax.class05;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner data = new Scanner(System.in);
		boolean answer;
		double balance;
		System.out.println("Do you have a credit card? Enter true or false");
		answer = data.nextBoolean();
		if (answer) {//to compare 2 strings use .equals() for best results
			System.out.println("What is the balance?");
			balance = data.nextDouble();
			if (balance > 1000) {
				System.out.println("Please pay off balance?");
			} else {
				System.out.println("You can spend more");
			}
		} else
			System.out.println("Would you like to have credit card?");
	}
}
