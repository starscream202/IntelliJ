package com.syntax.class04;

public class Ifelsetask {
	public static void main(String[] args) {
		int m1=25/5;
		
		if(m1<0) {
			System.out.println("The date is past due.");
		}else if(m1==1) {
			System.out.println("Assignment due in January.");
		}else if(m1==2) {
			System.out.println("Assignment due in February.");
		}else if(m1==3) {
			System.out.println("Assignment due in March.");
		}else if (m1==4) {
			System.out.println("Assignment due in April.");
		}else if (m1==5) {
			System.out.println("Assignment due in May.");
		}else if (m1==6) {
			System.out.println("Assignment due in June.");
		}else {
			System.out.println("Assignment past due");
		}
	}

}
