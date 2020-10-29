package com.syntax.class11;

public class Task4 {

	public static void main(String[] args) {
		
		String[][] food= {
				{"Burger","HotDog","Steak"},
				{"Pizza","Pasta","Canoli"},
				{"Sushi","Fried rice","dumpling","ramen"},
				{"Kebab","Manto"},
				{"beriyani","masala","curry","Tandori chicken"}
				
		};
		for(String[] dishes:food) {
			for (String dish:dishes) {
				System.out.print(dish+"        ");
			}System.out.println();
		}
		System.out.println("_________________________________________");
			for(int i=0; i<food.length; i++) {
				
				for (int j=0; j<food[i].length; j++) {
					
					System.out.print(food[i][j]+"         ");
				}System.out.println();
			}
	}

}
