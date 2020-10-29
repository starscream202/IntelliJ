package com.syntax.class06;

import java.util.Scanner;

public class SwitchExercise {

	public static void main(String[] args) {
		Scanner data=new Scanner(System.in);
		char grade=0;
		String message="null";
		System.out.println("Please enter your grade");
		grade=data.next().charAt(0);
		switch(grade) {
		case'A':
			message="Excellent";
			break;
		case'B':
			message="Good";
			break;
		case'C':
			message="Average";
			break;
		case'D':
			message="Bad";
			break;
		case 'F':
			message="Unacceptable";
			break;
		default:
			message="Invalid grade entry";
			}
		System.out.println("Your grade is "+grade+" that is "+message);
	}

}
