package com.syntax.class04;

public class Nestedif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score=92;
		boolean assignment=true;
		if(assignment) { 
			if(score>90) {
				System.out.println("You did great!");
			}else if(score>80) {
				System.out.println("You did good.");
			}else if(score>70) {
				System.out.println("You need to study more.");
			}else {
				System.out.println("Do better.");
			}
			
		}else {
			System.out.println("you should always complete.");
		}
	}

}
