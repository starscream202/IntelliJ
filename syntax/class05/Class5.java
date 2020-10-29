package com.syntax.class05;

import java.util.Scanner;

public class Class5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner;
		scanner=new Scanner(System.in);
		System.out.println("Please enter sentence");
		String sentence=scanner.nextLine();
		System.out.println("Place sentence "+sentence);
		System.out.println("please enter number");
		int number=scanner.nextInt();
		System.out.println("Number"+number);
		System.out.println("please enter single character");
		char singleCharacter=scanner.next().charAt(0);
	}
}
