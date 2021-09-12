package day33_stringBuilder;

import java.util.Scanner;

public class C02_StringBuilder02 {

	public static void main(String[] args) {
/*
 * Bir cümleyi parametre olarak kabul eden, StringBuilder kullanarak cümleyi ters çeviren ve cümlenin palindrom
       olup olmadığını kontrol eden (büyük/küçük harf duyarlılığı olmadan) bir Java programı yazın.
    (without case sensitivity)
    Eg : input : I love Java
    Output: "Reversed sentence : avaJ evol I .
       It is not a palindrome"
 */
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		StringBuilder sb=new StringBuilder();
		sb.append(str);
		String tersString=sb.reverse().toString();
		
		if (str.equalsIgnoreCase(tersString)) {
			
			System.out.println("girdiginiz ifade polindrome'dir : "+tersString);
		} else {
			System.out.println("girdiginiz ifade Polindrome degildir.");
		}
		
		scan.close();
	}

}
