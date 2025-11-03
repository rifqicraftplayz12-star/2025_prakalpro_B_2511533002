package Pekan6_2511533002;

import java.util.Random;
import java.util.Scanner;

public class GamePenjumlahan_2511533002 {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		Random rand = new Random();
		//play util user get 3 wrong
		int point = 0;
		int wrong = 0;
		while (wrong < 3) {
			int result = play(console, rand);  //play one game
			if(result > 0) {
				point++;
			} else {
				wrong++;
			}
		}
		System.out.println("You earned "+point+" total points.");
	}
	//membuat soal penjumlahan dan ditampilkan ke user
	public static int play(Scanner console, Random rand) {
		//print the operands being added, and sum then
		int operands = rand.nextInt(4) + 2;
		int sum = rand.nextInt(10) + 1;
		System.out.print(sum);
		
		for (int i = 2; i <= operands; i++) {
			int n = rand.nextInt(10) + 1;
			sum += n;
			System.out.print(" + " + n);
		}
		System.out.print(" = ");
		
		//read user guess and report whether it was correct
		int guess = console.nextInt();
		if (guess == sum ) {
			return 1;
		} else {
			System.out.println("wrong! the answer was "+ sum);
			return 0;
		}
	}

}
