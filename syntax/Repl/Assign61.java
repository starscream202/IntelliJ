package Repl;

import java.util.Scanner;

public class Assign61 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] arr = new String[5];
		//leave above alone!  write your code below
		for (int i=0; i<arr.length; i++){
			arr[i]=input.next();
			System.out.println(arr[i].substring(0,4));
		}
		
	}
}