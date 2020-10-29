package com.syntax.class11;

public class Task3 {

	public static void main(String[] args) {
		
		String[][]car= {
				{"Jeep","Ford","Dodge"},
				{"Audi","Porsche","BMW"},
				{"Kia","Hyundai","Sonata"},
				{"Ferrari","Maserati","Lambo"},	
		};
				for (int i=0; i<car.length; i++) {
					for (int j=0;j<car[i].length; j++) {
						String cars=car[i][j];
						System.out.print(cars+" ");
						
					}System.out.println();
					System.out.println("________________________");
				}
				for (String[] carArray:car) {
					for(String cars:carArray) {
						System.out.println((cars+"   "));
					}
				}
				System.out.println("______________");
	}

}
