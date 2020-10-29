package com.syntax.class08;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter what item you're buying and price.");
		String item=scan.nextLine();
		double price=scan.nextDouble();
		System.out.println("Please enter how much you will pay.");
		double payment=scan.nextDouble();
		double balance=price-payment;
		for (double a=payment; a<=price; a--) {
			if(payment!=price) {
				System.out.println("You owe "+balance);
				break;
		}else if(payment==price){
			System.out.println("Enjoy your "+item);
			break;
		}	
		}
	}
}
