package _001_Day2;

import java.util.Scanner;

public class BosPiramid {

	public static void main(String[] args) {
		int kenarUzunlugu, i, k;

		Scanner deger = new Scanner(System.in);
		System.out.println("Kenar Uzunlu�unu Giriniz : ");
		kenarUzunlugu = deger.nextInt();

		int ortaNokta = kenarUzunlugu - 1;
		int taban = kenarUzunlugu * 2 - 1;

		for (i = 0; i < kenarUzunlugu; i++) {
			for (k = 0; k < taban; k++) {
				if ((i + k == ortaNokta || k - i == ortaNokta)) {
					// ��genin kenarlar� �iziliyor
					System.out.print("*");
				} else if (i == ortaNokta) {
					// Taban�
					System.out.print("*");
				} else {
					// ��genin �izgileri d���ndaki yerler bo� b�rak�l�yor
					System.out.print(" ");
				}
			}
			// Bir sonraki satira ge�mek i�in

			System.out.println("");

		}

	}

}
