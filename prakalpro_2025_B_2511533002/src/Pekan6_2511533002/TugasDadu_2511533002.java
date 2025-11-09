package Pekan6_2511533002;
import java.util.*;

public class TugasDadu_2511533002 {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		Random rand = new Random();		
		int tries = 1;
		int sum = 0;
		boolean Lanjut = true;
		
		do{
			int dadu1 = rand.nextInt(6) + 1;
			int dadu2 = rand.nextInt(6) + 1;
			sum = dadu1 + dadu2;
			System.out.println(dadu1 +" + "+dadu2+" = "+sum);
			if(sum == 7) {
				System.out.println("tebakan anda benar setelah " + tries + " kali percobaan");
				Lanjut = false;
			} else {
				System.out.println("tebakan anda salah");
				System.out.println("apakah mau lempar dadu? (ya/tidak)");
				String YoN = console.nextLine();
				if(YoN.equalsIgnoreCase("tidak")) {
					System.out.println("Anda gagal menang");
					Lanjut = false;
				}else {
					tries++;
				}
			}
		}while(Lanjut);
	}
}

