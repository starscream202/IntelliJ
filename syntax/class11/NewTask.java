package com.syntax.class11;

public class NewTask {

	public static void main(String[] args) {
		
		int[] array= {10,1000,20,8,-1,77,56};
		int max=array[0];
		
		for (int i=0; i<array.length; i++) {
			
			if(max<array[i]) {
				max=array[i];
			}
		}
		System.out.println("The largest number is "+max);

	}

}
