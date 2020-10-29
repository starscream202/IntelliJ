
package com.syntax.class04;

import java.util.Scanner;

public class Morescannerclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);//scanner is already class in jre this is how u write it and then import
		System.out.println("Please enter boolean value for rain.");
		
		boolean rain=input.nextBoolean();
		if(rain) {
			System.out.println("please take umbrella");
		}else {
			System.out.println("it is nice outside");
		}
		int age=input.nextInt();
	}

}
