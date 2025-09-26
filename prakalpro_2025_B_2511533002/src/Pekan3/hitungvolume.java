package Pekan3;

import java.util.Scanner;

public class hitungvolume {

	public static void main(String[] args) {
		//Deklarasi Variabel
		double r, t, v;
		double pi = 3.14;
		Scanner keyboard = new Scanner(System.in);
		//Meminta input
		System.out.println("Masukkan Jari Jari : ");
		r = keyboard.nextDouble();
		System.out.println("Masukkan Tinggi    : ");
		t = keyboard.nextDouble();
		keyboard.close();
		//Proses Perhitungan
		v = pi * r * r * t;
		System.out.println("Volume Tabung : " + v);
	}

}
