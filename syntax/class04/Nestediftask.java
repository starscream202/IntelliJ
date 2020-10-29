package com.syntax.class04;

public class Nestediftask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean diploma = true;
		double gpa = 3.7;
		if (diploma) {
			System.out.println("Nice work on graduating.");
			if (gpa >= 3.5) {
				System.out.println("You are elligible for scholarship.");
			} else
				System.out.println("Sorry you don't qualify for scholarship.");
		} else
			System.out.println("You should get diploma.");
	}

}
