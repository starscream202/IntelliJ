package Repl;

import java.util.Scanner;

public class Assignment35 {
	public static void main (String[] args){
	    Scanner data= new Scanner(System.in);
	    System.out.println("Do you need a loan? Please enter true or false.");
	    boolean Answer=data.nextBoolean();
	    System.out.println("What is your credit score?");
	    int score=data.nextInt();
	    if(Answer){
	      if(score<600){
	        System.out.println("Not eligible");
	      }else if(score>=600 && score < 700){
	        System.out.println("Maybe elligible");
	      }else if (score>=700 && score <800){
	        System.out.println("Elligible");
	      }else{
	        System.out.println("Definitely Elligible");
	      }
	    }else{
	      System.out.println("I dont need loan.");
	    }
	  }
}
