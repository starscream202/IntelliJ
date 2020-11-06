package Repl;

import java.util.Scanner;

public class Repl105 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
	    System.out.print("In:");
	    String word = inp.nextLine();
	    //write your code below
	    for(int whatsat = 0; whatsat < word.length(); whatsat++){
	      char c = Character.toLowerCase(word.charAt(whatsat));
	      if (c == 'a' || c == 'e'|| c == 'i' || c == 'o' || c == 'u'){
	        System.out.print(word.charAt(whatsat));
	      }

	  }
	}
	
	}

