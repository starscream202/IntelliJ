package Repl;

import java.util.Scanner;

public class Assign79 {
	public static void main (String [] args){
	     
	 Scanner scan=new Scanner(System.in);
	 int size;
	 String[] day;
	 size=7;
	 int a=1;
	 day=new String[size];
	 for (int i=0; i<size; i++) {
		 System.out.println("Please enter day "+a+" of the week");
		 day[i]=scan.next();
		 a++;
	 }
	 for (int j=0; j<day.length; j++) {
		 System.out.println(day[j]);
	 }
	    
	  }
	  
	    

	 
	}

