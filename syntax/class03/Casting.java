package com.syntax.class03;

public class Casting {
	public static void main(String[] args) {
		//casting in java means converting 1 type to another
		//2 types widening-implicit(auto-matic) small box into big box
		//the other type is narrowing explicit(manual)big box in small box
		double num1=9;//widening
		int i=(int)9.99;//narrowing potential loss of information
		byte b=(byte)130;//need to specify how u want information stored
		System.out.println(b);
		System.out.println(i);
		System.out.println(num1);
		//for int values it wont have decimals
		//for double with int values need to make in double values to use operations
		
	}

}
