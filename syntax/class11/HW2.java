package com.syntax.class11;

import java.util.Scanner;

public class HW2 {

	public static void main(String[] args) {
		
		Scanner scan;
		double[] num;
		double sum = 0;
		int size;
		scan = new Scanner(System.in);
		System.out.println("How many numbers would you like to add up?");
		size = scan.nextInt();
		num = new double[size];
		for (int i = 0; i < size; i++) {
		System.out.println("Please enter double numbers");
		num[i] = scan.nextDouble();
		}
		for (int i = 0; i < num.length; i++) {
			sum = sum + num[i];
		}
		System.out.println(sum);

	}

}
