package com.syntax.class05;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner data;
		int years, salary;
		data = new Scanner(System.in);
		System.out.println("Please enter how many years you've worked at your company");
		years = data.nextInt();
		System.out.println("Please enter your annual salary");
		salary = data.nextInt();
		if (years >= 5) {
			System.out.println("You are elligible for a bonus");
			if (salary > 50000) {
				System.out.println("You are elligible for $5000 bonus");
			} else {
				System.out.println("You are elligible for $3000 bonus");
			}
		} else {
			System.out.println("You are not elligible for bonus");
		}

	}

}
