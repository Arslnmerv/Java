package day41_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C03_Exceptions03 {

	public static void main(String[] args) {// inner try catch parent child try catch

		try {// file yerini kontrol ediyor
			FileInputStream fis = new FileInputStream(
					"C:\\Users\\Administrator\\Documents\\java2021SummerTr\\src\\day41_exceptions\\file");
			int i = 0;
			try {// file icerigini okuma yazdirma islemini handle etti
				while ((i = fis.read()) != -1) {// int degeri fis obj read metodu ile atandiginda -1e esit degilse while
												// bodye gir
					System.out.print((char) (i));
				}
			} catch (IOException e) {// I:Input O:Output
				System.out.println(e.getMessage());
//e.printStackTrace();//daha cok kullanilir cunku hatanin tum verisini verir handle kolayligi saglar

			}

		} catch (FileNotFoundException e) {

			// e.printStackTrace();
			System.out.println(e.getMessage());

		}

		System.out.println("aradigin file yerinde");

		System.out.println("dewamkeee yazisini okuduysan kod bu satira kadar sorunsuz run olmustur...");

	}
}
