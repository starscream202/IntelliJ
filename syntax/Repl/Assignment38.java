package Repl;

import java.util.Scanner;

public class Assignment38 {
	 public static void main (String[] args){
		    System.out.println("Please enter your favorite car make");
		    Scanner data=new Scanner(System.in);
		    String make="null";
		    String carOrigin="null";
		    switch (make=data.nextLine()){
		      case "BMW":
		    	  carOrigin="german car";
		    	  break;
		      case "Toyota":
		    	  carOrigin="japanese car";
		    	  break;
		      case "Maserati":
		    	  carOrigin="italian car";
		    	  break;
		    	  default:
		    		  carOrigin="unknown";
		    }System.out.println("Your favorite car is "+carOrigin);
		  }

		}