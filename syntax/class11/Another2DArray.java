package com.syntax.class11;

public class Another2DArray {

	public static void main(String[] args) {
		int[][] array= {
				{10,20,30},
				{1,2,3},
				{100,200}
		};
		for (int i=0; i<array.length; i++) {
			for (int j=0; j<array[i].length; j++) {
				System.out.print(array[i][j]+" ");
			}
		}
		
		

	}

}
