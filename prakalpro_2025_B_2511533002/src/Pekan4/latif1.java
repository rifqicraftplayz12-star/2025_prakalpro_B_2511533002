package Pekan4;

import java.util.Scanner;

public class latif1 {

	public static void main(String[] args) {
		double ipk;
		Scanner input=new Scanner(System.in);
		System.out.println("Input IPK Anda : ");
		ipk=input.nextDouble();
		input.close();
		if (ipk>2.75) {
			System.out.println("Anda Lulus Sangat Memuaskan dengan IPK " + ipk);
		}else {
			System.out.println("Anda Tidak Lulus");//
		}
	}

}
