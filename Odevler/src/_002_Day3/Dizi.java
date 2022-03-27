package _002_Day3;

import java.util.Scanner;

public class Dizi {

	public static void main(String[] args) {

		Scanner degerler = new Scanner(System.in);

		int[] dizi = new int[3];

		for (int i = 0; i < dizi.length; i++) {
			System.out.print("Dizinin " + (i + 1) + ". elemanýný girin:");
			dizi[i] = degerler.nextInt();
		}
		degerler.close();

		for (int i = dizi.length - 1; i >= 0; i--) {
			System.out.println(i + ". :" + dizi[i]);
		}

	}

}
