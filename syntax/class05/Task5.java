package com.syntax.class05;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner data=new Scanner(System.in);
		double mid,quiz,Final;
		mid=data.nextDouble();
		quiz=data.nextDouble();
		Final=data.nextDouble();
		if((mid+Final+quiz)/3 >=90) {
			System.out.println("grade = A");
		}else if((mid+Final+quiz)/3 >=70 && (mid+Final+quiz)/3 <=90) {
			System.out.println("grade = B");
		}else if((mid+Final+quiz)/3 >=50 && (mid+Final+quiz)/3 <=70) {
			System.out.println("grade = C");
		}else if ((mid+Final+quiz)/3<50) {
			System.out.println("grade = F");
		}else {
			
		}
	
	}

}
