package com.syntax.class07;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		/*
		 * Scanner data; String name; data=new Scanner(System.in);
		 * 
		 * 
		 * int num=1; while(num<=5) { System.out.println("Please tell me your name.");
		 * name=data.nextLine(); System.out.println("Nice to meet you "+ name); num++; }
		 * System.out.println("_____________________________________");
		 */
		
		Scanner scan;
		int num;
		
		int lucky=7;
		
		scan=new Scanner(System.in);
		
		do {//repetitive action is in do
			System.out.println("Enter number for chance to win. use numbers from 1-100");
			num=scan.nextInt();
		}while (num!=lucky);
		System.out.println("You win!");
		
	}

}
