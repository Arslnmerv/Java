package day43_exceptions;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) throws C03_InvalidEmailIdCheckedException {

		Scanner scan= new Scanner(System.in);
		System.out.println("e mail giriniz : ");
		
		String email=scan.nextLine();
		
		if (email.contains("@gmail.com") || email.contains("@ebikgabik.com")) {
			System.out.println("basarili");
		}else {
			throw new C03_InvalidEmailIdCheckedException("neyin kafasi bu, ne ictiysen bana da...");
		}
	}

}
