package day41_exceptions;

import java.util.Scanner;

public class C02_Exceptions02 {

	public static void main(String[] args) {

		// kullanicidan alacagini iki tam sayinin bolumunu yazdiriniz

		Scanner scan = new Scanner(System.in);
		int count = 1;
		while (count <= 34) {

			System.out.print("bolunen sayiyi giriniz : ");
			int sayi1 = scan.nextInt();

			System.out.print("bolen sayiyi giriniz :");
			int sayi2 = scan.nextInt();
			try {
				System.out.println("bolum : " + sayi1 / sayi2);
			} catch (ArithmeticException e) { // try bodysinden muhtemel hata AritmeticException olarak catch bodya sart
												// olarak yazildi
				System.out.println("bolme isleminde bolen sifir olamazz!!");//manuel handle
                System.out.println(e.getMessage());/// by zero --> handle edilecek veri
			    e.printStackTrace();
			
			}
			count++;
		}
		 System.out.println("dewamkeee yazisini okuduysan kod bu satira kadar sorunsuz run olmustur...");
	}
}
