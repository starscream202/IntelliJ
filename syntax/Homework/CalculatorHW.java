package Homework;

import java.util.Scanner;

public class CalculatorHW {

	public static void main(String[] args) {
		System.out.println("Please enter your first number.");
		Scanner data = new Scanner(System.in);
		double Number1 = data.nextDouble();
		System.out.println("Please enter your second number.");
		double Number2 = data.nextDouble();
		System.out.println("Please enter which operation you will like to perfrom.");
		System.out.println("Please use +,-,*,/");
		char Operation = data.next().charAt(0);
		double Answer=0;
		switch(Operation) {
		case '+':
			Answer=(Number1+Number2);
			break;
		case '-':
			Answer=(Number1-Number2);
			break;
		case '*':
			Answer=(Number1*Number2);
			break;
		case '/':
			Answer=(Number1/Number2);
			break;
			default:
				System.out.println("Error");
		}System.out.println(Answer);
	}

}
