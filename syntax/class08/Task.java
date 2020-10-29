package com.syntax.class08;

public class Task {

	public static void main(String[] args) {
		int sum=0,sum2=0;
		for (int a=1; a<=50; a++) {
			if(a%2==0) {
				sum= a+sum;
			}else {
				sum2+=a;
			}
	}System.out.println(sum);
	System.out.println(sum2);
}
}