package Pekan2;

public class DeklarasiVariabel {

		/*program java
		 * latihan
		 * tentang pendeklarasian variabel
		 */
		static int umur=25; /*variable dapat langsung diinisiasi*/
		public static void main(String[] args) {
			int kode;
			boolean isDibawahUmur; /* Perhatikan penulisan nama variabel*/
			kode = 1234; /* Pengisi variabel (assignment)*/
			double gaji; /* Deklarasi variabel dapat dimana saja */
			gaji = 5500000.23;
			isDibawahUmur = true;
			System.out.println("Status: "+isDibawahUmur);
			System.out.println("Kode:"+kode);
			System.out.println("Umur:"+umur);
			System.out.println("Gaji:"+gaji);
	}
}

