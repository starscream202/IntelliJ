package com.syntax.class05;

import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner data=new Scanner(System.in);
		System.out.println("Please enter your birth month");
		String month=data.nextLine();
		if (month.equalsIgnoreCase("June")||month.equalsIgnoreCase("July")|| month.equalsIgnoreCase("August")) {
			
			System.out.println("You were born in summer");
		}else if(month.equalsIgnoreCase("September") ||month.equalsIgnoreCase("October")||month.equalsIgnoreCase("November")){
			System.out.println("You were born in fall");
		}
	}

}
