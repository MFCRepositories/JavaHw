package _003_Day5;

import java.util.Random;
import java.util.Scanner;

public class Tahmin {

	public static void main(String[] args) {

//		int deger=(int) Math.round(Math.random()*99+1);
		Random rnd = new Random();
		int deger = rnd.nextInt(100);
		sayiBul(deger);

	}

	private static void sayiBul(int deger) {
//		System.out.println("Deger : " + deger);//test
		Scanner scn = new Scanner(System.in);
		int sayi, sayac = 0;
		System.out.println("0-100 aralığında bir sayi giriniz :  ");

		String sonuc;
		do {
			sayi = scn.nextInt();
			sayac++;
			sonuc = (sayi > 99 || sayi < 1) ? "0-100 aralıgında bir sayi girmelisiniz. "
					: (sayi > deger) ? "Degeri kücült : ↓↓↓ "
							: (sayi < deger) ? "Deger büyült : ↑↑↑ "
									: "Tebrikler ☻ ☻ ☻  " + sayac + ". denemede bildiniz. ";
			System.out.println(sonuc);
		} while (deger != sayi);
		scn.close();
	}

}
