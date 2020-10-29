package com.syntax.class04;

import java.util.Scanner;

public class Scannerclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=80;
		String str="I am a string";
		
		Scanner scan=new Scanner(System.in);//inables input to console
		String value=scan.nextLine();//waits for you to put input-->when input is done hit enter
		System.out.println("i captured value ="+value);
		String name=scan.nextLine();
		System.out.println("nice to meet you "+name);
		
	}

}
