package com.syntax.class10;

import java.util.Scanner;

public class ArrayScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner data=new Scanner(System.in);
		int size;
		String[] name;
		
		System.out.println("How many names would u like to enter?");
		size=data.nextInt();
		name=new String[size];
		for (int a=0; a<size; a++) {
			System.out.println("Enter Name");
			name[a]=data.next();//store inside array
		}
		for (int b=0; b<name.length; b++) {//retrieving data we stored
			System.out.print(name[b]+" ");
		}
		
	}

}
