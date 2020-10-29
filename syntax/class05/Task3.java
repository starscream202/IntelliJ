package com.syntax.class05;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner data=new Scanner(System.in);
		double height=data.nextDouble();
		System.out.println("Please enter your height in inches");
		if(height<60 && height>0) {
			System.out.println("You are short");
		}else if(height>60 && height<72) {
			System.out.println("You are medium sized");
		}else if (height>72) {
			System.out.println("You are tall");
		}else {
			System.out.println("Number you have entered is not valid please enter height in Inches");
		}
	}

}
