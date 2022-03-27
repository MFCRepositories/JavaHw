package _001_Day2;

import java.util.Scanner;

public class PiramidYildiz {

	public static void main(String[] args) {

		Scanner klavye = new Scanner(System.in);
		System.out.print("Satir sayisini giriniz:");
		int satirSayisi = klavye.nextInt();

		for (int satir = 0; satir < satirSayisi; satir++) {
			for (int bosluk = 0; bosluk < satirSayisi - satir; bosluk++) {
				System.out.print(" ");
			}
			for (int yildiz = 0; yildiz < 1 + (satir * 2); yildiz++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
