package com.syntax.class10;

public class Exercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[]car=new String[4];
		car[0]="Mercedes";
		car[1]="BMW";
		car[2]="Lexus";
		car[3]="Lamborghini";
		for (int i=0; i<car.length;i++) {
			System.out.println(car[i]);
		}
		for(String x:car) {//enhanced for loop
			System.out.println(x);
		}
	}

}
