package com.syntax.class05;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int date=7;
		if (date>=1 && date<=5) {
			System.out.println("It is a weekday");
		}else if(date==6 || date==7) {
			System.out.println("It is a weekend");
		}else {
			System.out.println("Invalid entry, please enter numbers 1-7");
		}
	}

}
