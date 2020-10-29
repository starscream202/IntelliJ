package com.syntax.class08;

public class Loops {

	public static void main(String[] args) {
		//for loop are best when you know how many times u wanna loop
		//for(initialize variable; checking condition; increment/decrement){}
		for (int i=20; i>0; i--) {
			if(i%2==0)
				System.out.println(i);
		}
		System.out.println("___________________________________________");
		for (int a=20; a<50; a++) {
			if(a%2!=0) {
				System.out.println(a);
			}
				
		}
		
	}

}
