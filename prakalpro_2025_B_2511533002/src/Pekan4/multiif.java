package Pekan4;

import java.util.Scanner;

public class multiif {

	public static void main(String[] args) {
		int umur;
		char sim;
		Scanner a= new Scanner(System.in);
		System.out.println("Input Umur Anda : ");
		umur=a.nextInt();
		System.out.println("Apakah Anda Sudah Punya Sim C : ");
		sim=a.next().charAt(0);
		a.close();
		if((umur >= 17)&&(sim=='y')) {
			System.out.println("Anda Sudah Dewasa Dan Boleh Bawa Motor");
	    }
		if ((umur >= 17)&&(sim!='y')) {
			System.out.println("Anda Sudah Dewasa Tetapi Tidak Boleh Bawa Motor");
		}
		if ((umur < 17)&&(sim!='y')) {
			System.out.println("Anda Belum Cukup Umur Bawa Motor");
		}
		if((umur < 17)&&(sim=='y')) {
			System.out.println("Anda Belum Cukup Umur Punya Sim");//
		}
	}
}
