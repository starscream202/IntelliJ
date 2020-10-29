package com.syntax.class06;

import java.util.Scanner;

public class Class6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner data = new Scanner(System.in);
		int num1, num2, num3;
		int biggest = 0 ;
		num1 = data.nextInt();
		num2 = data.nextInt();
		num3 = data.nextInt();

		if (num1 > num2) {
			if (num1 > num3) {
				biggest = num1;
		} else {
			if (num2 > num3) {
				biggest = num2;
			} else {
				biggest = num3;
			}
			
		}

	}
		
		System.out.println(biggest);
	}
}
