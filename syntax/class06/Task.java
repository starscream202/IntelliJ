package com.syntax.class06;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner data=new Scanner(System.in);
		boolean sale =data.nextBoolean();
		double price=0;
		double discount = 0;

		if (!sale) {
			System.out.println("We can go shopping");
			price =data.nextDouble();
			if (price >= 10 && price <= 50) {
				discount = price * .1;
				
			} else if (price >= 51 && price <= 100) {
				discount = price * .2;
				
			} else if (price >= 101 && price <= 500) {
				discount = price * .4;
			
			} else if (price >= 501) {
				discount = price * .5;
			}System.out.println((price-discount)+" is the final price");
		} else {
			System.out.println("We will not go shopping");
		}
	}

}
