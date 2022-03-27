package _001_Day2;

import java.util.Scanner;

public class AsalSayi {

	public static void main(String[] args) {
		Scanner sayi = new Scanner(System.in);
		System.out.println("Deger giriniz");
		int deger;
		do {
			System.out.println("Dikkat ! Deger negatif olamaz");
			deger = sayi.nextInt();

		} while (deger < 0);

		String sonuc = (control(deger)) ? "Sayi asal deðildir" : "Sayi asaldýr";
		System.out.println(sonuc);

	}

	static boolean control(int deger) {
		if (deger == 0 || deger == 1)
			return true;

		for (int i = 2; i < deger; i++)
			if (deger % i == 0) {
				return true;
			}
		return false;

	}

}
