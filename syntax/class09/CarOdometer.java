package com.syntax.class09;

public class CarOdometer {

	public static void main(String[] args) {
		int a,b,c,d,e;
		a=0;
		b=0;
		c=0;
		d=0;
		e=0;
		for (a = 0; a <= 9; a++) {
			
			for (b = 0; b <= 9; b++) {
				
				for (c = 0; c <= 9; c++) {
					
					for (d = 0; d <= 9; d++) {
					
						for ( e = 0; e <= 9; e++) {
							System.out.println(a+""+b+""+c+""+d+""+e);
						}
					}
				}

			}

		}
	}
}
