package com.syntax.class06;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//in switch case you can not use relational operators & logical
		Scanner data = new Scanner(System.in);
		String browser;
		String message;
		System.out.println("Please enter browser");
		browser = data.nextLine();
		switch (browser.toLowerCase()) {
		
		case "safari":
			message="Your code will be executed in safari browser.";
			break;
		case "chrome":
			message="Your code will be executed in Chrome browser.";
			break;
		case "firefox":
			message="Your code will be executed in Firefox browser.";
			break;
		default:
			message="Invalid entry";
		
		}System.out.println(message);
	}

}
