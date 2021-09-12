package day41_exceptions;

import java.util.Scanner;

public class C01_Exceptions01 {
	public static void main(String[] args) {
		
	
//kullanicidan alacagini iki tam sayinin bolumunu yazdiriniz
	
	Scanner scan= new Scanner(System.in);
	System.out.print("bolunen sayiyi giriniz : ");
    int sayi1=scan.nextInt();
    
    System.out.println("bolen sayiyi giriniz :");
    int sayi2=scan.nextInt();
    
    
    try {
        System.out.println("bolum :"+ sayi1/sayi2);

	} catch (ArithmeticException e) { // try bodysinden muhtemel hata AritmeticException olarak catch bodya sart olarak yazildi
		System.out.println("bolme isleminde bolen sifir olamazz!!");/*
		e:AritmeticException classindan data type
		AritmeticException olan bir exception obj
		manual handle yaptik
		*/
		
	}
	
	}
}