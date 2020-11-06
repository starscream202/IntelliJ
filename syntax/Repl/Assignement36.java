package Repl;

import java.util.Scanner;

public class Assignement36 {
	public static void main(String[] args){
	    Scanner data=new Scanner(System.in);
	    System.out.println("Are you thirsty?");
	    boolean thirsty=data.nextBoolean();
	    System.out.println("Are you sleepy?");
	    boolean sleepy=data.nextBoolean();
	    String answer="null";
	    if(thirsty && !sleepy){
	      answer="Water";
	      }else if(thirsty && sleepy){
	        answer="Coffe";
	      }else{
	        answer="Tea";
	      }
	      System.out.println("Looks like you need to drink "+answer);
	  }
	}

