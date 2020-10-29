package com.syntax.class08;

public class BreakandContinue {

	public static void main(String[] args) {
		//break will break loop
		//continue skips 1 iteraction
		//these are usually used in if statements
		for (int a=1; a<=10; a++) {
			if (a==3 || a==7) {
				continue;
			}
			System.out.println(a);
		}

	}

}
