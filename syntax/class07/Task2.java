package com.syntax.class07;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean workday=true;
		int day=1;
		while (workday) {
			if(day<6) {
			System.out.println("I need day off!!!");
			day++;
			}else {
			System.out.println("I do not need day off anymore");
			break;
		}
		}
	}

}
