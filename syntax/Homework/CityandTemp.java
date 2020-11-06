package Homework;

import java.util.Scanner;

public class CityandTemp {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		String city = myScanner.nextLine();
		System.out.println("I live in " + city);
		Scanner scan2 = new Scanner(System.in);
		int weather = scan2.nextInt();
		System.out.println("The temperature is " + weather + " degrees Fahrenheit.");
		float celsius = (weather - 32) * .55556f;
		System.out.println("The temperature in " + city + " is " + celsius + " degrees Celsius");
	}

}
