package Repl;

import java.util.Scanner;

public class Empty {
	  
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in); 
	    System.out.println("Enter the browser name to proceed further with execution");
	    String browser = sc.nextLine(); 
	    if(browser.equalsIgnoreCase("CHROME")){
	      System.out.println("Proceed with Chrome browser");
	    }
	  }
	}