package Pekan4;
import java.util.Scanner;
public class tugasAlproPekan4_2511533002 {
	 public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        double biayaDasar = 0;
	        double biayaJarak = 0;
	        double subtotal = 0;
	        double biayaLayanan = 0;
	        double biayaJenisPaket = 0;
	        double totalSebelumDiskon = 0;
	        double diskon = 0;
	        double totalBiaya = 0;
	        String namaLayanan = "";
	        String namaPaket = "";
	        int persenLayanan = 0;
	        
	        System.out.println("===== PROGRAM PERHITUNGAN BIAYA PENGIRIMAN PAKET =====");
	        System.out.print("Masukkan Nama Pengirim        : ");
	        String namaPengirim = input.nextLine();
	        System.out.print("Masukkan Berat Paket (kg)     : ");
	        double beratPaket = input.nextDouble();
	        System.out.print("Masukkan Jarak Pengiriman (km): ");
	        int jarakPengiriman = input.nextInt();
	        System.out.println("Pilih Jenis Layanan:");
	        System.out.println("1. Reguler");
	        System.out.println("2. Express");
	        System.out.println("3. Same Day");
	        System.out.print("Pilihan Anda (1/2/3)          : ");
	        int pilihanLayanan = input.nextInt();
	        System.out.println("Pilih Jenis Paket:");
	        System.out.println("1. Dokumen");
	        System.out.println("2. Barang Biasa");
	        System.out.println("3. Barang Elektronik");
	        System.out.print("Pilihan Anda (1/2/3)          : ");
	        int pilihanPaket = input.nextInt();
	        input.close();

	        biayaDasar = 5000 + (beratPaket * 5000);
	        biayaJarak = jarakPengiriman * 600;
	        subtotal = biayaDasar + biayaJarak;

	        switch (pilihanLayanan) {
	            case 1:
	                namaLayanan = "Reguler";
	                biayaLayanan = 0;
	                persenLayanan = 0;
	                break;
	            case 2:
	                namaLayanan = "Express";
	                biayaLayanan = subtotal * 0.50;
	                persenLayanan = 50;
	                break;
	            case 3:
	                namaLayanan = "Same Day";
	                biayaLayanan = subtotal * 1.0;
	                persenLayanan = 100;
	                break;
	            default:
	                namaLayanan = "Tidak Valid";
	                break;
	        }

	        switch (pilihanPaket) {
	            case 1:
	                namaPaket = "Dokumen";
	                biayaJenisPaket = 0;
	                break;
	            case 2:
	                namaPaket = "Barang Biasa";
	                biayaJenisPaket = 5000;
	                break;
	            case 3:
	                namaPaket = "Barang Elektronik";
	                biayaJenisPaket = 15000;
	                break;
	            default:
	                namaPaket = "Tidak Valid";
	                break;
	        }

	        totalSebelumDiskon = subtotal + biayaLayanan + biayaJenisPaket;

	        if (totalSebelumDiskon > 100000) {
	            diskon = totalSebelumDiskon * 0.05;
	        }

	        totalBiaya = totalSebelumDiskon - diskon;

	        System.out.println("\n===== BIAYA PENGIRIMAN PAKET =====");
	        System.out.printf("%-20s : %s\n", "Nama Pengirim", namaPengirim);
	        System.out.printf("%-20s : %.1f kg\n", "Berat Paket", beratPaket);
	        System.out.printf("%-20s : %d km\n", "Jarak Pengiriman", jarakPengiriman);
	        System.out.printf("%-20s : %s\n", "Jenis Layanan", namaLayanan);
	        System.out.printf("%-20s : %s\n", "Jenis Paket", namaPaket);
	        System.out.println("--------------------------------------");
	        System.out.printf("%-20s : Rp %.0f\n", "Biaya Dasar", biayaDasar);
	        System.out.printf("%-20s : Rp %.0f\n", "Biaya Jarak", biayaJarak);
	        System.out.printf("%-20s : Rp %.0f\n", "Subtotal", subtotal);
	        System.out.printf("%-20s : Rp %.0f\n", "Biaya Layanan (" + persenLayanan + "%)", biayaLayanan);
	        System.out.printf("%-20s : Rp %.0f\n", "Biaya Jenis Paket", biayaJenisPaket);
	        System.out.printf("%-20s : Rp %.0f\n", "Total Sebelum Disc.", totalSebelumDiskon);
	        System.out.printf("%-20s : Rp %.0f\n", "Diskon", diskon);
	        System.out.println("--------------------------------------");
	        System.out.printf("%-20s : Rp %.0f\n", "TOTAL BIAYA", totalBiaya);
	    }
	}