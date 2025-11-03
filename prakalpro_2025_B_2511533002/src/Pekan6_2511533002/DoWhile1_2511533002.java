package Pekan6_2511533002;

import java.util.Scanner;

public class DoWhile1_2511533002 {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		String phrase;
		do {
			System.out.print("Inpur password :");
			phrase = console.next();
		} while (!phrase.equals("abcd"));
	}

}
