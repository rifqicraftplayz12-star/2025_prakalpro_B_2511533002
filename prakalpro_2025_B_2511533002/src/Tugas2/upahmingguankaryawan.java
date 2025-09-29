package Tugas2;

import java.util.Scanner;

public class upahmingguankaryawan {

	public static void main(String[] args) {
        String nama;
        char golongan;
        double jamKerja;
        double upahPerJam = 0;
        double totalGaji = 0;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Nama Karyawan : ");
        nama = keyboard.nextLine();

        System.out.print("Golongan (A/B/C/D) : ");
        golongan = keyboard.next().toUpperCase().charAt(0);

        System.out.print("Total Jam kerja : ");
        
        jamKerja = keyboard.nextDouble(); 
        if (golongan == 'A') {
            upahPerJam = 1000;
        } else if (golongan == 'B') {
            upahPerJam = 2000;
        } else if (golongan == 'C') {
            upahPerJam = 3000;
        } else if (golongan == 'D') {
            upahPerJam = 4000;
        } else {
            System.out.println("Golongan Tidak Terdaftar");
        }

        if (upahPerJam > 0) {
            if (jamKerja > 60) {
                double jamLembur = jamKerja - 60;
                totalGaji = (60 * upahPerJam) + (jamLembur * 5000);
            } else {
                totalGaji = jamKerja * upahPerJam;
            }

            System.out.println("Nama Karyawan : " + nama);
            System.out.println("Gaji Mingguan : Rp " + totalGaji);
        }

        keyboard.close();
	}
}
