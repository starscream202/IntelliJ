package Homework;

import java.util.Scanner;

public class HW1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner data=new Scanner(System.in);
		System.out.println("Please enter your sales number");
		double sale=data.nextDouble();
		if (sale>=10 && sale<=100) {
			System.out.println("Your sales commission is 10%");
		}else if(sale>=101 && sale<=200) {
			System.out.println("Your sales commission is 20%");
		}else if(sale >=201 && sale<=500) {
			System.out.println("Your sales commission is 30%");
		}else if(sale>=501) {
			System.out.println("Your sales commission is 50%");
		}else {
			System.out.println("Sorry make more sales");
		}
	}

}
