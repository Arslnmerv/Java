package day35_encapsulation;

import java.util.Scanner;

public class C03_EmployesMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("adinizi giriniz : ");
		String name = scan.nextLine();

		System.out.print("dogum tarihinizi MM/dd/yyy giriniz : ");
		String dob = scan.nextLine();

		System.out.print("talep ettiginiz maas giriniz : ");
		int salary = scan.nextInt();

		C03_Employes calisan = new C03_Employes();

		calisan.setName(name);
		calisan.setDob(dob);
		calisan.setSalary(salary);
		int calisanYas = calisan.yasHesapla(dob);

		if (calisanYas > 18) {

			System.out.println("Welcome to our company " + name + " your salary is :" + salary);

		} else if (calisanYas < 18) {
			System.out.println("come back when you are 18 years old.");

		} else if (calisanYas == 18) {
			System.out.println("we can have inter with you after that you can have a " + salary + "salary");
		}
		scan.close();
	}

}
