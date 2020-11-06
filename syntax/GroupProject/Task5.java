package GroupProject;

public class Task5 {

	public static void main(String[] args) {
		
int temp;
		
		int[] array = {10, 0, 20, 8, -1, 77, 56};
		
		
		
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				
				if (array[i] > array [j]) {
					//first iteration compares the 1st two elements
					//2nd iteration compares 2nd and 3rd and if 2 is greated than 3, then they swap
					//10 is greater than 0, so they swap
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
					
				
			}
			
			}
			
			
		}
		
		System.out.println("Second largest number is " + array[array.length - 2]);
		
		
		
	}
}
