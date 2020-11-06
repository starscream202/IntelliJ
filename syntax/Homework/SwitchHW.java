package Homework;

import java.util.Scanner;

public class SwitchHW {

	public static void main(String[] args) {
		Scanner data = new Scanner(System.in);
		System.out.println("Hello, I'm Ash, What country are you from?");

		String country = "Null";

		String language = "null";

		switch (country = data.nextLine().toUpperCase()) {

		case "USA":
			language = "Do you speak English?";
			break;
		case "France":
			language = "Do you speak French?";
			break;
		case "RUSSIA":
			language = "Do you speak Russian";
			break;
		case "ENGLAND":
			language = "Do you speak English, mate?";
			break;
		case "JAPAN":
			language = "Do you speak Japanese?";
			break;
		case "CHINA":
			language = "Do you speak Chinese?";
			break;
		case "INDIA":
			language = "Do you speak Hindi?";
			break;
		default:
			language = "Error: Could not determine language.";
		

		}
		System.out.println(language);
	}
}
