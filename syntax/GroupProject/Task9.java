package GroupProject;

public class Task9 {

	public static void main(String[] args) {
		int sum=0;
		String[][]country= {
				{"Mexico","America","Canada"},
				{"Brazil","Argentina","Peru","Chile"},
				{"Britain","France","Germany","Spain"},
				{"Chad","Nigeria","Egypt","South Africa"},
				{"India","Russia","China","Pakistan"}
		};
			for(int i=0; i<country.length; i++) {
				for(int j=0; j<country[i].length;j++) {
					System.out.print(country[i][j]+"   ");
					sum++;
				}System.out.println();
			}
			System.out.println("the number of countries inputed is "+sum);
			
	}

}
