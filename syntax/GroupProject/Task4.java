package GroupProject;

public class Task4 {

	public static void main(String[] args) {
		int[] array= {70,79,98,9};
		int max = array[0];
		int min = array[0];
		
		
		for (int i = 1; i < array.length; i++) {
			//Max
			if (array[i] > max) {
				max = array[i];
			}
			System.out.println(max);
			
		}
		
		for (int i = 1; i < array.length; i++) {
			//Min
			if (array[i] < min) {
				min = array[i];
			}
		}System.out.println(min);
			}
		

	}


