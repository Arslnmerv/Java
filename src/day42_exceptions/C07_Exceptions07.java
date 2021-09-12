package day42_exceptions;

import java.util.Scanner;

public class C07_Exceptions07 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		/*
		 * Kullanicidan yasini girmesini isteyin. Kodunuzu kullanici sifirdan kucuk bir
		 * sayi girerse Exception verecek sekilde yazin.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.print("Lutfen yasinizi giriniz");
		int yas = scan.nextInt();

		// 1.yol try catch kullanmadan
//		 if (yas>=0) {
//			System.out.println("yasiniz ; " +yas);
//		}else {
//			throw new IllegalArgumentException();
//		}

		try {
			if (yas >= 0) {
				System.out.println("yasiniz ; " + yas);
			} else {
				throw new IllegalArgumentException();//exceptions firlatip code kirilmaz cunku try body devam eder
				//catch calisir
				//31.satirda javadan rica ediyoruz hatrim icin hata kabul edip catchi calistirir misin

			}
		} catch (IllegalArgumentException e) {

			e.printStackTrace();
		}

		System.out.println();
		System.out.println("buraya kadar geldiysen devamkee");

		scan.close();
	}

}
