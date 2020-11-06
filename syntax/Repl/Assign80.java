package Repl;

import java.util.Scanner;

public class Assign80 {
	 public static void main (String [] args){
		    Scanner scan= new Scanner (System.in);
		    int[] num;
		    int size=5;
		    num=new int[size];
		    for (int i=0; i<size; i++){
		      num[i]=scan.nextInt();
		    }
		    for (int j=4;j<=num.length-1; j-- ) {
		    	System.out.println(num[j]);
		    }
		  }
		  
		}

