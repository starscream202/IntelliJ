package com.syntax.class04;

public class Mortgagerate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int price = 200000;
		double rate = 3.3;
		if (rate > 4.5) {
			System.out.println("You will not buy house.");
		} else {
			System.out.println("You can buy house.");
		}
		if (price > 200000) {
			System.out.println("You can take out loan.");
		} else {
			System.out.println("You can pay cash.");
		}
	}

}
