package com.syntax.class08;

import java.util.Scanner;

public class Tasks2 {

	public static void main(String[] args) {
		Scanner data=new Scanner(System.in);
		double num1,num2,sum=0,sum2=0;
		System.out.println("Please enter your starting point");
		num1=data.nextDouble();
		System.out.println("Please enter your ending point");
		num2=data.nextDouble();
		for (double a=num1; a<num2; a++ ) {
			if(a%2==0) {
				sum+=a;
			}else {
				sum2+=a;
			}
			System.out.println("Even "+sum);
			System.out.println("Odd "+sum2);
		}

	}

}
