package Pekan5;

import java.util.Scanner;

public class PerulanganFor4 {

	public static void main(String[] args) {
		int jumlah = 0;
		int batas;
		Scanner input= new Scanner(System.in);
		System.out.print("Masukkan nilai batas");
		batas= input.nextInt();
		input.close();
		for (int i=1;i<=batas;i++) {
			System.out.println(i);
			jumlah = jumlah+i;
			if (i<batas) {
				System.out.println("  +  ");
			} else {
				System.out.println("  =  ");
			}
		}
		System.out.println(jumlah);
	}

}//
