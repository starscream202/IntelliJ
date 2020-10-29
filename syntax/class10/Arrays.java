package com.syntax.class10;

public class Arrays {

	public static void main(String[] args) {
		double[] grades=new double[5];
		grades[0]=98;
		grades[1]=80;
		grades[2]=89;
		grades[3]=67;
		grades[4]=77;
		double average=(grades[0]+grades[1]+grades[2]+grades[3]+grades[4])/5;
		System.out.println(average);
	}

}
