package Homework;

import java.util.Scanner;

public class HomeWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myScanner = new Scanner(System.in);
		int loan = myScanner.nextInt();
		System.out.println("The amount I need for a loan is " + loan);
		if (loan <= 200000) {
			System.out.println("We will lend you the money for loan.");
		} else {
			System.out.println("I'm sorry we can not give you a loan. ");

		}
		Scanner driver = new Scanner(System.in);
		int age = driver.nextInt();
		System.out.println("What is your age? " + "My age is " + age);
		if (age < 18) {
			System.out.println("You can only get a learners permit.");
		} else {
			System.out.println("You are old enough to get your liscence.");
		}

	}

}
