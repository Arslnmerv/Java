package day35_encapsulation;

import java.util.Scanner;

public class C02_BookMain {

	public static void main(String[] args) {

		C02_Book kitap = new C02_Book();

		Scanner scan = new Scanner(System.in);
		System.out.println("son okudugunuz kitabi giriniz : ");
		String kitap2 = scan.next();
		kitap.setBookname("calikusu");
		kitap.setAuthorName(kitap2);
		System.out.println("1.kitabim : " + kitap.getBookname() + " 2.kitabim : " + kitap.getAuthorName());

		scan.close();
	}

}
