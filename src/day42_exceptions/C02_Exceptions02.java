package day42_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C02_Exceptions02 {

	public static void main(String[] args) {
		/*
		 
		Eger handle edilecek exceptions' lar arasinda parent-child iliskisi varsa parent class
		exceptions' u creat edilip child class excepsion' u olmadan da kod calisir ancak;
		Olumlu durum : Tek catch body ile tum exceptions handle edilebilir
	 	Olumsuz durum : Bir hata durumunda hatanin turu vd verileri vs. ulasilamayacagi icin handle
	 	edilme imkanı olmaz.*/
	
			try {
				
				FileInputStream fis = new FileInputStream("C:\\Users\\Ömer\\eclipse-workspace\\java2021SummerTr\\src\\day41_exception\\file");
					
				fis.close(); // fis objesi close edildi
				
				int i = 0;
									
				while (( i = fis.read()) != -1 ) {						
					
				System.out.print((char)(i));
						
				}
						
			}
								
				
				 catch (IOException e) { // I : input, O : output
				
						// e.printStackTrace(); // daha cok kullanilir, cunku hatanin tum verisini verir,
						// handle kolayligi saglar
				
						System.out.println(e.getMessage()); // hata mesajini yazdirir
				
				}
					
			System.out.println();
			
			System.out.println("Devamkeee yazisini okuduysan kod bu satira kadar sorunsuz run olmustur...");
					
		}

}
